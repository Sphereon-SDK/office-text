/**
 * OfficeTextMerge
 * <b>The Office Text API can generate office documents from a template and a JSON data file<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 * <p>
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.office_text.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * The merge template request.
 */
@ApiModel(description = "The merge template request.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-16T14:10:19.023+02:00")
public class TemplateContextRequest {
    @SerializedName("description")
    private String description = null;

    @SerializedName("ownerInfo")
    private OwnerInfo ownerInfo = null;

    @SerializedName("templateId")
    private String templateId = null;

    public TemplateContextRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateContextRequest ownerInfo(OwnerInfo ownerInfo) {
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

    public TemplateContextRequest templateId(String templateId) {
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
        TemplateContextRequest templateContextRequest = (TemplateContextRequest) o;
        return Objects.equals(this.description, templateContextRequest.description) &&
                Objects.equals(this.ownerInfo, templateContextRequest.ownerInfo) &&
                Objects.equals(this.templateId, templateContextRequest.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, ownerInfo, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateContextRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ownerInfo: ").append(toIndentedString(ownerInfo)).append("\n");
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

