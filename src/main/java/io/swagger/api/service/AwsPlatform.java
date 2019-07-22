package io.swagger.api.service;

import org.springframework.core.io.ResourceLoader;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.CreateSubnetRequest;
import com.amazonaws.services.ec2.model.CreateSubnetResult;
import com.amazonaws.services.ec2.model.CreateTagsRequest;
import com.amazonaws.services.ec2.model.CreateTagsResult;
import com.amazonaws.services.ec2.model.CreateVpcRequest;
import com.amazonaws.services.ec2.model.CreateVpcResult;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult;
import com.amazonaws.services.ec2.model.DescribeVpcsRequest;
import com.amazonaws.services.ec2.model.DescribeVpcsResult;
import com.amazonaws.services.ec2.model.Filter;
import com.amazonaws.services.ec2.model.InstanceNetworkInterfaceSpecification;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.ec2.model.Tag;
import com.amazonaws.services.ec2.model.Vpc;

import io.swagger.model.Platform;

public class AwsPlatform implements IPlatform {

	private static final AWSCredentials AWS_CREDENTIALS;

	private ResourceLoader resourceLoader;

	static {
		// Your accesskey and secretkey
		AWS_CREDENTIALS = new BasicAWSCredentials("AKIARAEOS5J45Q53KXP4", "lFD9PKwvEZJ/Apm4ZZLOiz+uvMRPXgTCb2hA6VUg");
	}

	@Override
	public Platform createPlatform(Platform p) {
		// TODO refactor this!

		InstanceNetworkInterfaceSpecification networkInterfaces = new InstanceNetworkInterfaceSpecification();
		AmazonEC2 ec2Client = AmazonEC2ClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(AWS_CREDENTIALS)).withRegion(Regions.US_EAST_1)
				.build();

		System.out.println("Getting VPCs..");
		DescribeVpcsRequest vpcRequest = new DescribeVpcsRequest();
		DescribeVpcsResult vpcResponse = ec2Client.describeVpcs(vpcRequest);
		System.out.println("EXISTING VPCs: \n" + vpcResponse.toString());

		// get default vpc
		String vpcId = vpcResponse.getVpcs().get(0).getVpcId();
		String cidrBlock = vpcResponse.getVpcs().get(0).getCidrBlock();

		if("n".equalsIgnoreCase(p.getDefaultVpc())) {
			System.out.println("Creating a VPC");
			CreateVpcRequest newVPC = new CreateVpcRequest("In");
			newVPC.setCidrBlock(p.getCidr());
			CreateVpcResult res = ec2Client.createVpc(newVPC);
			Vpc vp = res.getVpc();
			vpcId = vp.getVpcId();
			cidrBlock = vp.getCidrBlock();
			System.out.println("Created VPC " + vpcId);

			System.out.println("==========VPCs: \n" + ec2Client.describeVpcs(new DescribeVpcsRequest()).toString());
	
			// create subnet
			CreateSubnetRequest request = new CreateSubnetRequest().withCidrBlock(cidrBlock).withVpcId(vpcId);
			CreateSubnetResult subnetResponse = ec2Client.createSubnet(request);

			networkInterfaces.setDeviceIndex(0);
			networkInterfaces.setSubnetId(subnetResponse.getSubnet().getSubnetId());
		}
		
		DescribeSecurityGroupsRequest sgRequest = new DescribeSecurityGroupsRequest().withFilters(new Filter().withName("vpc-id").withValues(vpcId));
		DescribeSecurityGroupsResult sgResponse = ec2Client.describeSecurityGroups(sgRequest);
		

		System.out.println(sgResponse.toString());
		
		System.out.println("Creating instance..." + sgResponse.getSecurityGroups().get(0).getGroupId());

		String ami_id = p.getInstance().getAmiTypeId();
		
		
		RunInstancesRequest runInstanceRequest = new RunInstancesRequest().withImageId(ami_id)
				.withInstanceType(p.getInstance().getInstanceType()).withMaxCount(1).withMinCount(1)
				.withNetworkInterfaces(networkInterfaces);
		runInstanceRequest.setKeyName("theous-creo");

		RunInstancesResult runInterfaceResponse = ec2Client.runInstances(runInstanceRequest);

		String reservationId = runInterfaceResponse.getReservation().getInstances().get(0).getInstanceId();

        Tag tag = new Tag().withKey("Name").withValue(p.getInstance().getInstanceName());
        CreateTagsRequest tagRequest = new CreateTagsRequest().withResources(reservationId).withTags(tag);
        CreateTagsResult tagResponse = ec2Client.createTags(tagRequest);

		System.out.printf("Successfully started EC2 instance %s based on AMI %s", reservationId, ami_id);

		return null;
	}

}
