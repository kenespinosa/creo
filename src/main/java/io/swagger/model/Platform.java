package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Instance;
import io.swagger.model.Technology;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Platform
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-18T01:16:57.525Z")

public class Platform   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("platformName")
  private String platformName = null;

  @JsonProperty("defaultVpc")
  private String defaultVpc = null;

  @JsonProperty("defaultSubnet")
  private String defaultSubnet = null;

  @JsonProperty("cidr")
  private String cidr = null;

  @JsonProperty("serverName")
  private String serverName = null;

  @JsonProperty("platformProvider")
  private String platformProvider = null;

  @JsonProperty("technologies")
  @Valid
  private List<Technology> technologies = null;

  @JsonProperty("instance")
  private Instance instance = null;

  public Platform id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Platform platformName(String platformName) {
    this.platformName = platformName;
    return this;
  }

  /**
   * Get platformName
   * @return platformName
  **/
  @ApiModelProperty(value = "")


  public String getPlatformName() {
    return platformName;
  }

  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }

  public Platform defaultVpc(String defaultVpc) {
    this.defaultVpc = defaultVpc;
    return this;
  }

  /**
   * Get defaultVpc
   * @return defaultVpc
  **/
  @ApiModelProperty(value = "")


  public String getDefaultVpc() {
    return defaultVpc;
  }

  public void setDefaultVpc(String defaultVpc) {
    this.defaultVpc = defaultVpc;
  }

  public Platform defaultSubnet(String defaultSubnet) {
    this.defaultSubnet = defaultSubnet;
    return this;
  }

  /**
   * Get defaultSubnet
   * @return defaultSubnet
  **/
  @ApiModelProperty(value = "")


  public String getDefaultSubnet() {
    return defaultSubnet;
  }

  public void setDefaultSubnet(String defaultSubnet) {
    this.defaultSubnet = defaultSubnet;
  }

  public Platform cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

  /**
   * Get cidr
   * @return cidr
  **/
  @ApiModelProperty(value = "")


  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public Platform serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

  /**
   * Get serverName
   * @return serverName
  **/
  @ApiModelProperty(value = "")


  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public Platform platformProvider(String platformProvider) {
    this.platformProvider = platformProvider;
    return this;
  }

  /**
   * Get platformProvider
   * @return platformProvider
  **/
  @ApiModelProperty(value = "")


  public String getPlatformProvider() {
    return platformProvider;
  }

  public void setPlatformProvider(String platformProvider) {
    this.platformProvider = platformProvider;
  }

  public Platform technologies(List<Technology> technologies) {
    this.technologies = technologies;
    return this;
  }

  public Platform addTechnologiesItem(Technology technologiesItem) {
    if (this.technologies == null) {
      this.technologies = new ArrayList<Technology>();
    }
    this.technologies.add(technologiesItem);
    return this;
  }

  /**
   * Get technologies
   * @return technologies
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Technology> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(List<Technology> technologies) {
    this.technologies = technologies;
  }

  public Platform instance(Instance instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   * @return instance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instance getInstance() {
    return instance;
  }

  public void setInstance(Instance instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platform platform = (Platform) o;
    return Objects.equals(this.id, platform.id) &&
        Objects.equals(this.platformName, platform.platformName) &&
        Objects.equals(this.defaultVpc, platform.defaultVpc) &&
        Objects.equals(this.defaultSubnet, platform.defaultSubnet) &&
        Objects.equals(this.cidr, platform.cidr) &&
        Objects.equals(this.serverName, platform.serverName) &&
        Objects.equals(this.platformProvider, platform.platformProvider) &&
        Objects.equals(this.technologies, platform.technologies) &&
        Objects.equals(this.instance, platform.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, platformName, defaultVpc, defaultSubnet, cidr, serverName, platformProvider, technologies, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    defaultVpc: ").append(toIndentedString(defaultVpc)).append("\n");
    sb.append("    defaultSubnet: ").append(toIndentedString(defaultSubnet)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    platformProvider: ").append(toIndentedString(platformProvider)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

