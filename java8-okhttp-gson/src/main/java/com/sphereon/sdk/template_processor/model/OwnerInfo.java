/*
 * Template-Processor
 * <b>The Template-Processor API can generate office, xml and json documents from a template and a JSON data file. Supported templates are MS Office files and freemarker files.<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
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

/**
 * Owner info
 */
@ApiModel(description = "Owner info")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T12:07:52.838+02:00")
public class OwnerInfo {
  @SerializedName("phone")
  private String phone = null;

  @SerializedName("companyDepartment")
  private String companyDepartment = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  public OwnerInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The owner's phone number
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "The owner's phone number")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OwnerInfo companyDepartment(String companyDepartment) {
    this.companyDepartment = companyDepartment;
    return this;
  }

   /**
   * The owner's company/department
   * @return companyDepartment
  **/
  @ApiModelProperty(example = "null", value = "The owner's company/department")
  public String getCompanyDepartment() {
    return companyDepartment;
  }

  public void setCompanyDepartment(String companyDepartment) {
    this.companyDepartment = companyDepartment;
  }

  public OwnerInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The owner's name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The owner's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OwnerInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The owner's email address
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The owner's email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerInfo ownerInfo = (OwnerInfo) o;
    return Objects.equals(this.phone, ownerInfo.phone) &&
        Objects.equals(this.companyDepartment, ownerInfo.companyDepartment) &&
        Objects.equals(this.name, ownerInfo.name) &&
        Objects.equals(this.email, ownerInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, companyDepartment, name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerInfo {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    companyDepartment: ").append(toIndentedString(companyDepartment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

