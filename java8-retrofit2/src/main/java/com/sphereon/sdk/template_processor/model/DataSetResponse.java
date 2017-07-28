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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * The merge template response.
 */
@ApiModel(description = "The merge template response.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-28T16:30:12.470+02:00")
public class DataSetResponse {
  @SerializedName("completionTime")
  private OffsetDateTime completionTime = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("id")
  private String id = null;

  /**
   * The status of the template
   */
  public enum StatusEnum {
    @SerializedName("CREATED")
    CREATED("CREATED"),
    
    @SerializedName("UPDATED")
    UPDATED("UPDATED"),
    
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

   /**
   * The completion date/time of this template in ISO 8601 format
   * @return completionTime
  **/
  @ApiModelProperty(example = "null", value = "The completion date/time of this template in ISO 8601 format")
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

   /**
   * The creation date/time of this template in ISO 8601 format
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "The creation date/time of this template in ISO 8601 format")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public DataSetResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique dataset id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique dataset id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The status of the template
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "The status of the template")
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
    DataSetResponse dataSetResponse = (DataSetResponse) o;
    return Objects.equals(this.completionTime, dataSetResponse.completionTime) &&
        Objects.equals(this.creationTime, dataSetResponse.creationTime) &&
        Objects.equals(this.id, dataSetResponse.id) &&
        Objects.equals(this.status, dataSetResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTime, creationTime, id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSetResponse {\n");
    
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

