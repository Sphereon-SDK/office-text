/*
 * OfficeTextMerge
 * <b>The Office Text API can generate office documents from a template and a JSON data file<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.template_processor.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.sphereon.sdk.template_processor.model.MergeSettings;
import com.sphereon.sdk.template_processor.model.StreamLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The merge job. Has access to the job merge data.
 */
@ApiModel(description = "The merge job. Has access to the job merge data.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-28T16:30:04.861+02:00")
public class MergeJob {
  @SerializedName("resultFolderPath")
  private String resultFolderPath = null;

  @SerializedName("completionTime")
  private OffsetDateTime completionTime = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("resultContainerId")
  private String resultContainerId = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("dataSetId")
  private String dataSetId = null;

  @SerializedName("resultStreams")
  private List<StreamLocation> resultStreams = new ArrayList<StreamLocation>();

  @SerializedName("headerDataSetIds")
  private List<String> headerDataSetIds = new ArrayList<String>();

  @SerializedName("mergeSettings")
  private MergeSettings mergeSettings = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  /**
   * The status of the job
   */
  public enum StatusEnum {
    @SerializedName("CREATED")
    CREATED("CREATED"),
    
    @SerializedName("UPDATED")
    UPDATED("UPDATED"),
    
    @SerializedName("PROCESSING")
    PROCESSING("PROCESSING"),
    
    @SerializedName("DONE")
    DONE("DONE"),
    
    @SerializedName("ERROR")
    ERROR("ERROR"),
    
    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public MergeJob resultFolderPath(String resultFolderPath) {
    this.resultFolderPath = resultFolderPath;
    return this;
  }

   /**
   * The target folder path of result files
   * @return resultFolderPath
  **/
  @ApiModelProperty(example = "null", value = "The target folder path of result files")
  public String getResultFolderPath() {
    return resultFolderPath;
  }

  public void setResultFolderPath(String resultFolderPath) {
    this.resultFolderPath = resultFolderPath;
  }

   /**
   * The completion date/time of this job in ISO 8601 format
   * @return completionTime
  **/
  @ApiModelProperty(example = "null", value = "The completion date/time of this job in ISO 8601 format")
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  public MergeJob jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * The server generated job jobId. This jobId is checked against the jobId in the request path on every invocation
   * @return jobId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The server generated job jobId. This jobId is checked against the jobId in the request path on every invocation")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public MergeJob resultContainerId(String resultContainerId) {
    this.resultContainerId = resultContainerId;
    return this;
  }

   /**
   * The target container id of result files
   * @return resultContainerId
  **/
  @ApiModelProperty(example = "null", value = "The target container id of result files")
  public String getResultContainerId() {
    return resultContainerId;
  }

  public void setResultContainerId(String resultContainerId) {
    this.resultContainerId = resultContainerId;
  }

   /**
   * The creation date/time of this job in ISO 8601 format
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "The creation date/time of this job in ISO 8601 format")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public MergeJob dataSetId(String dataSetId) {
    this.dataSetId = dataSetId;
    return this;
  }

   /**
   * Data set id
   * @return dataSetId
  **/
  @ApiModelProperty(example = "null", value = "Data set id")
  public String getDataSetId() {
    return dataSetId;
  }

  public void setDataSetId(String dataSetId) {
    this.dataSetId = dataSetId;
  }

  public MergeJob resultStreams(List<StreamLocation> resultStreams) {
    this.resultStreams = resultStreams;
    return this;
  }

  public MergeJob addResultStreamsItem(StreamLocation resultStreamsItem) {
    this.resultStreams.add(resultStreamsItem);
    return this;
  }

   /**
   * The storage locations of the result files.
   * @return resultStreams
  **/
  @ApiModelProperty(example = "null", required = true, value = "The storage locations of the result files.")
  public List<StreamLocation> getResultStreams() {
    return resultStreams;
  }

  public void setResultStreams(List<StreamLocation> resultStreams) {
    this.resultStreams = resultStreams;
  }

  public MergeJob headerDataSetIds(List<String> headerDataSetIds) {
    this.headerDataSetIds = headerDataSetIds;
    return this;
  }

  public MergeJob addHeaderDataSetIdsItem(String headerDataSetIdsItem) {
    this.headerDataSetIds.add(headerDataSetIdsItem);
    return this;
  }

   /**
   * Header data set ids
   * @return headerDataSetIds
  **/
  @ApiModelProperty(example = "null", value = "Header data set ids")
  public List<String> getHeaderDataSetIds() {
    return headerDataSetIds;
  }

  public void setHeaderDataSetIds(List<String> headerDataSetIds) {
    this.headerDataSetIds = headerDataSetIds;
  }

  public MergeJob mergeSettings(MergeSettings mergeSettings) {
    this.mergeSettings = mergeSettings;
    return this;
  }

   /**
   * Get mergeSettings
   * @return mergeSettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public MergeSettings getMergeSettings() {
    return mergeSettings;
  }

  public void setMergeSettings(MergeSettings mergeSettings) {
    this.mergeSettings = mergeSettings;
  }

   /**
   * A status message, which can be informational, warning or error. A message here does not indicate an error perse
   * @return statusMessage
  **/
  @ApiModelProperty(example = "null", value = "A status message, which can be informational, warning or error. A message here does not indicate an error perse")
  public String getStatusMessage() {
    return statusMessage;
  }

   /**
   * The status of the job
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "The status of the job")
  public StatusEnum getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeJob mergeJob = (MergeJob) o;
    return Objects.equals(this.resultFolderPath, mergeJob.resultFolderPath) &&
        Objects.equals(this.completionTime, mergeJob.completionTime) &&
        Objects.equals(this.jobId, mergeJob.jobId) &&
        Objects.equals(this.resultContainerId, mergeJob.resultContainerId) &&
        Objects.equals(this.creationTime, mergeJob.creationTime) &&
        Objects.equals(this.dataSetId, mergeJob.dataSetId) &&
        Objects.equals(this.resultStreams, mergeJob.resultStreams) &&
        Objects.equals(this.headerDataSetIds, mergeJob.headerDataSetIds) &&
        Objects.equals(this.mergeSettings, mergeJob.mergeSettings) &&
        Objects.equals(this.statusMessage, mergeJob.statusMessage) &&
        Objects.equals(this.status, mergeJob.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultFolderPath, completionTime, jobId, resultContainerId, creationTime, dataSetId, resultStreams, headerDataSetIds, mergeSettings, statusMessage, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeJob {\n");
    
    sb.append("    resultFolderPath: ").append(toIndentedString(resultFolderPath)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    resultContainerId: ").append(toIndentedString(resultContainerId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    dataSetId: ").append(toIndentedString(dataSetId)).append("\n");
    sb.append("    resultStreams: ").append(toIndentedString(resultStreams)).append("\n");
    sb.append("    headerDataSetIds: ").append(toIndentedString(headerDataSetIds)).append("\n");
    sb.append("    mergeSettings: ").append(toIndentedString(mergeSettings)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
