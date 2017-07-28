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
 * Lifecycle settings. When no lifecycle settings are supplied, the job and files will be deleted directly after retrieval of the file
 */
@ApiModel(description = "Lifecycle settings. When no lifecycle settings are supplied, the job and files will be deleted directly after retrieval of the file")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-28T16:30:04.861+02:00")
public class Lifecycle {
  @SerializedName("actionTime")
  private OffsetDateTime actionTime = null;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    @SerializedName("DELETE")
    DELETE("DELETE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("RETRIEVAL")
    RETRIEVAL("RETRIEVAL"),
    
    @SerializedName("TIME")
    TIME("TIME");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public Lifecycle actionTime(OffsetDateTime actionTime) {
    this.actionTime = actionTime;
    return this;
  }

   /**
   * The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation
   * @return actionTime
  **/
  @ApiModelProperty(example = "null", value = "The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation")
  public OffsetDateTime getActionTime() {
    return actionTime;
  }

  public void setActionTime(OffsetDateTime actionTime) {
    this.actionTime = actionTime;
  }

  public Lifecycle action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(example = "null", value = "")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public Lifecycle type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lifecycle lifecycle = (Lifecycle) o;
    return Objects.equals(this.actionTime, lifecycle.actionTime) &&
        Objects.equals(this.action, lifecycle.action) &&
        Objects.equals(this.type, lifecycle.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTime, action, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lifecycle {\n");
    
    sb.append("    actionTime: ").append(toIndentedString(actionTime)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

