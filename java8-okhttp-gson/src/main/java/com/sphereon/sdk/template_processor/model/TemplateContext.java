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
import com.sphereon.sdk.template_processor.model.OwnerInfo;
import com.sphereon.sdk.template_processor.model.StreamLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TemplateContext
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-28T16:30:04.861+02:00")
public class TemplateContext {
  /**
   * Gets or Sets templateType
   */
  public enum TemplateTypeEnum {
    @SerializedName("OFFICE")
    OFFICE("OFFICE"),
    
    @SerializedName("FREEMARKER")
    FREEMARKER("FREEMARKER");

    private String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("templateType")
  private TemplateTypeEnum templateType = null;

  @SerializedName("templateFileLocations")
  private Map<String, StreamLocation> templateFileLocations = new HashMap<String, StreamLocation>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("ownerInfo")
  private OwnerInfo ownerInfo = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("templateId")
  private String templateId = null;

  public TemplateContext templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }

  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  public TemplateContext templateFileLocations(Map<String, StreamLocation> templateFileLocations) {
    this.templateFileLocations = templateFileLocations;
    return this;
  }

  public TemplateContext putTemplateFileLocationsItem(String key, StreamLocation templateFileLocationsItem) {
    this.templateFileLocations.put(key, templateFileLocationsItem);
    return this;
  }

   /**
   * The template files (versioned)
   * @return templateFileLocations
  **/
  @ApiModelProperty(example = "null", value = "The template files (versioned)")
  public Map<String, StreamLocation> getTemplateFileLocations() {
    return templateFileLocations;
  }

  public void setTemplateFileLocations(Map<String, StreamLocation> templateFileLocations) {
    this.templateFileLocations = templateFileLocations;
  }

  public TemplateContext description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The template description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The template description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TemplateContext ownerInfo(OwnerInfo ownerInfo) {
    this.ownerInfo = ownerInfo;
    return this;
  }

   /**
   * Get ownerInfo
   * @return ownerInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public OwnerInfo getOwnerInfo() {
    return ownerInfo;
  }

  public void setOwnerInfo(OwnerInfo ownerInfo) {
    this.ownerInfo = ownerInfo;
  }

  public TemplateContext id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TemplateContext templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The template context id
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "The template context id")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateContext templateContext = (TemplateContext) o;
    return Objects.equals(this.templateType, templateContext.templateType) &&
        Objects.equals(this.templateFileLocations, templateContext.templateFileLocations) &&
        Objects.equals(this.description, templateContext.description) &&
        Objects.equals(this.ownerInfo, templateContext.ownerInfo) &&
        Objects.equals(this.id, templateContext.id) &&
        Objects.equals(this.templateId, templateContext.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateType, templateFileLocations, description, ownerInfo, id, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateContext {\n");
    
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    templateFileLocations: ").append(toIndentedString(templateFileLocations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerInfo: ").append(toIndentedString(ownerInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

