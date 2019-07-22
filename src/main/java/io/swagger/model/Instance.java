package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Instance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-18T01:16:57.525Z")

public class Instance   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instanceName")
  private String instanceName = null;

  @JsonProperty("amiTypeId")
  private String amiTypeId = null;

  @JsonProperty("instanceType")
  private String instanceType = null;

  @JsonProperty("osType")
  private String osType = null;

  @JsonProperty("storage")
  private String storage = null;

  public Instance id(String id) {
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

  public Instance instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * Get instanceName
   * @return instanceName
  **/
  @ApiModelProperty(value = "")


  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public Instance amiTypeId(String amiTypeId) {
    this.amiTypeId = amiTypeId;
    return this;
  }

  /**
   * Get amiTypeId
   * @return amiTypeId
  **/
  @ApiModelProperty(value = "")


  public String getAmiTypeId() {
    return amiTypeId;
  }

  public void setAmiTypeId(String amiTypeId) {
    this.amiTypeId = amiTypeId;
  }

  public Instance instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * Get instanceType
   * @return instanceType
  **/
  @ApiModelProperty(value = "")


  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public Instance osType(String osType) {
    this.osType = osType;
    return this;
  }

  /**
   * Get osType
   * @return osType
  **/
  @ApiModelProperty(value = "")


  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }

  public Instance storage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(value = "")


  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.id, instance.id) &&
        Objects.equals(this.instanceName, instance.instanceName) &&
        Objects.equals(this.amiTypeId, instance.amiTypeId) &&
        Objects.equals(this.instanceType, instance.instanceType) &&
        Objects.equals(this.osType, instance.osType) &&
        Objects.equals(this.storage, instance.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instanceName, amiTypeId, instanceType, osType, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    amiTypeId: ").append(toIndentedString(amiTypeId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

