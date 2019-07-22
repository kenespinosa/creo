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
 * Technology
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-18T01:16:57.525Z")

public class Technology   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("technologyName")
  private String technologyName = null;

  public Technology id(String id) {
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

  public Technology technologyName(String technologyName) {
    this.technologyName = technologyName;
    return this;
  }

  /**
   * Get technologyName
   * @return technologyName
  **/
  @ApiModelProperty(value = "")


  public String getTechnologyName() {
    return technologyName;
  }

  public void setTechnologyName(String technologyName) {
    this.technologyName = technologyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Technology technology = (Technology) o;
    return Objects.equals(this.id, technology.id) &&
        Objects.equals(this.technologyName, technology.technologyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, technologyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Technology {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    technologyName: ").append(toIndentedString(technologyName)).append("\n");
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

