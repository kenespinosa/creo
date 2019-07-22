package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PipelineDetails;
import io.swagger.model.Technology;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pipeline
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-18T01:16:57.525Z")

public class Pipeline   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("pipelineName")
  private String pipelineName = null;

  @JsonProperty("uploadedProject")
  private String uploadedProject = null;

  @JsonProperty("creationDate")
  private String creationDate = null;

  @JsonProperty("estimatedCost")
  private String estimatedCost = null;

  @JsonProperty("technologies")
  @Valid
  private List<Technology> technologies = null;

  @JsonProperty("pipelineDetails")
  private PipelineDetails pipelineDetails = null;

  public Pipeline id(String id) {
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

  public Pipeline pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

  /**
   * Get pipelineName
   * @return pipelineName
  **/
  @ApiModelProperty(value = "")


  public String getPipelineName() {
    return pipelineName;
  }

  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }

  public Pipeline uploadedProject(String uploadedProject) {
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

  public Pipeline creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public Pipeline estimatedCost(String estimatedCost) {
    this.estimatedCost = estimatedCost;
    return this;
  }

  /**
   * Get estimatedCost
   * @return estimatedCost
  **/
  @ApiModelProperty(value = "")


  public String getEstimatedCost() {
    return estimatedCost;
  }

  public void setEstimatedCost(String estimatedCost) {
    this.estimatedCost = estimatedCost;
  }

  public Pipeline technologies(List<Technology> technologies) {
    this.technologies = technologies;
    return this;
  }

  public Pipeline addTechnologiesItem(Technology technologiesItem) {
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

  public Pipeline pipelineDetails(PipelineDetails pipelineDetails) {
    this.pipelineDetails = pipelineDetails;
    return this;
  }

  /**
   * Get pipelineDetails
   * @return pipelineDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PipelineDetails getPipelineDetails() {
    return pipelineDetails;
  }

  public void setPipelineDetails(PipelineDetails pipelineDetails) {
    this.pipelineDetails = pipelineDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pipeline pipeline = (Pipeline) o;
    return Objects.equals(this.id, pipeline.id) &&
        Objects.equals(this.pipelineName, pipeline.pipelineName) &&
        Objects.equals(this.uploadedProject, pipeline.uploadedProject) &&
        Objects.equals(this.creationDate, pipeline.creationDate) &&
        Objects.equals(this.estimatedCost, pipeline.estimatedCost) &&
        Objects.equals(this.technologies, pipeline.technologies) &&
        Objects.equals(this.pipelineDetails, pipeline.pipelineDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pipelineName, uploadedProject, creationDate, estimatedCost, technologies, pipelineDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    uploadedProject: ").append(toIndentedString(uploadedProject)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    estimatedCost: ").append(toIndentedString(estimatedCost)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    pipelineDetails: ").append(toIndentedString(pipelineDetails)).append("\n");
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

