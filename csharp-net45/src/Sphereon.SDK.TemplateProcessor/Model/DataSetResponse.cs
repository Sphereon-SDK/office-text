/* 
 * OfficeTextMerge
 *
 * <b>The Office Text API can generate office documents from a template and a JSON data file<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Sphereon.SDK.TemplateProcessor.Model
{
    /// <summary>
    /// The merge template response.
    /// </summary>
    [DataContract]
    public partial class DataSetResponse :  IEquatable<DataSetResponse>
    {
        /// <summary>
        /// The status of the template
        /// </summary>
        /// <value>The status of the template</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum CREATED for "CREATED"
            /// </summary>
            [EnumMember(Value = "CREATED")]
            CREATED,
            
            /// <summary>
            /// Enum UPDATED for "UPDATED"
            /// </summary>
            [EnumMember(Value = "UPDATED")]
            UPDATED,
            
            /// <summary>
            /// Enum DELETED for "DELETED"
            /// </summary>
            [EnumMember(Value = "DELETED")]
            DELETED
        }

        /// <summary>
        /// The status of the template
        /// </summary>
        /// <value>The status of the template</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DataSetResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DataSetResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DataSetResponse" /> class.
        /// </summary>
        /// <param name="Id">Unique dataset id (required).</param>
        public DataSetResponse(string Id = null)
        {
            // to ensure "Id" is required (not null)
            if (Id == null)
            {
                throw new InvalidDataException("Id is a required property for DataSetResponse and cannot be null");
            }
            else
            {
                this.Id = Id;
            }
        }
        
        /// <summary>
        /// The completion date/time of this template in ISO 8601 format
        /// </summary>
        /// <value>The completion date/time of this template in ISO 8601 format</value>
        [DataMember(Name="completionTime", EmitDefaultValue=false)]
        public DateTime? CompletionTime { get; private set; }
        /// <summary>
        /// The creation date/time of this template in ISO 8601 format
        /// </summary>
        /// <value>The creation date/time of this template in ISO 8601 format</value>
        [DataMember(Name="creationTime", EmitDefaultValue=false)]
        public DateTime? CreationTime { get; private set; }
        /// <summary>
        /// Unique dataset id
        /// </summary>
        /// <value>Unique dataset id</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DataSetResponse {\n");
            sb.Append("  CompletionTime: ").Append(CompletionTime).Append("\n");
            sb.Append("  CreationTime: ").Append(CreationTime).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as DataSetResponse);
        }

        /// <summary>
        /// Returns true if DataSetResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of DataSetResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DataSetResponse other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.CompletionTime == other.CompletionTime ||
                    this.CompletionTime != null &&
                    this.CompletionTime.Equals(other.CompletionTime)
                ) && 
                (
                    this.CreationTime == other.CreationTime ||
                    this.CreationTime != null &&
                    this.CreationTime.Equals(other.CreationTime)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.Status == other.Status ||
                    this.Status != null &&
                    this.Status.Equals(other.Status)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.CompletionTime != null)
                    hash = hash * 59 + this.CompletionTime.GetHashCode();
                if (this.CreationTime != null)
                    hash = hash * 59 + this.CreationTime.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.Status != null)
                    hash = hash * 59 + this.Status.GetHashCode();
                return hash;
            }
        }
    }

}
