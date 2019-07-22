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
 * PipelineDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-18T01:16:57.525Z")

public class PipelineDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("uploadedProject")
  private String uploadedProject = null;

  public PipelineDetails id(String id) {
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

  public PipelineDetails uploadedProject(String uploadedProject) {
    this.uploadedProject = uploadedProject;
    return this;
  }

  /**
   * Get uploadedProject
   * @return uploadedProject
  **/
  @ApiModelProperty(value = "")


  public String getUploadedProject() {
    return uploadedProject;
  }

  public void setUploadedProject(String uploadedProject) {
    this.uploadedProject = uploadedProject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineDetails pipelineDetails = (PipelineDetails) o;
    return Objects.equals(this.id, pipelineDetails.id) &&
        Objects.equals(this.uploadedProject, pipelineDetails.uploadedProject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uploadedProject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uploadedProject: ").append(toIndentedString(uploadedProject)).append("\n");
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

