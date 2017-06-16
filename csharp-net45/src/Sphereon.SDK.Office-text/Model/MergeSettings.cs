/* 
 * OfficeTextMerge
 *
 * <b>The Office Text API can generate office documents from a template and a JSON data file<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
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

namespace Sphereon.SDK.Office-text.Model
{
    /// <summary>
    /// Merge settings
    /// </summary>
    [DataContract]
    public partial class MergeSettings :  IEquatable<MergeSettings>
    {
        /// <summary>
        /// Gets or Sets MergeResult
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MergeResultEnum
        {
            
            /// <summary>
            /// Enum SINGLEFILE for "SINGLE_FILE"
            /// </summary>
            [EnumMember(Value = "SINGLE_FILE")]
            SINGLEFILE,
            
            /// <summary>
            /// Enum SEPARATEFILES for "SEPARATE_FILES"
            /// </summary>
            [EnumMember(Value = "SEPARATE_FILES")]
            SEPARATEFILES
        }

        /// <summary>
        /// Gets or Sets Engine
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EngineEnum
        {
            
            /// <summary>
            /// Enum BASIC for "BASIC"
            /// </summary>
            [EnumMember(Value = "BASIC")]
            BASIC,
            
            /// <summary>
            /// Enum PREMIUM for "PREMIUM"
            /// </summary>
            [EnumMember(Value = "PREMIUM")]
            PREMIUM
        }

        /// <summary>
        /// Gets or Sets MergeResult
        /// </summary>
        [DataMember(Name="mergeResult", EmitDefaultValue=false)]
        public MergeResultEnum? MergeResult { get; set; }
        /// <summary>
        /// Gets or Sets Engine
        /// </summary>
        [DataMember(Name="engine", EmitDefaultValue=false)]
        public EngineEnum? Engine { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MergeSettings" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MergeSettings() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MergeSettings" /> class.
        /// </summary>
        /// <param name="Lifecycle">Lifecycle.</param>
        /// <param name="MergeResult">MergeResult.</param>
        /// <param name="DataSetId">Data set id (required).</param>
        /// <param name="Engine">Engine.</param>
        /// <param name="HeaderDataSetIds">optional header data set ids.</param>
        /// <param name="TemplateVersion">Template version.</param>
        /// <param name="TemplateId">Template id (required).</param>
        /// <param name="OutputSettings">OutputSettings (required).</param>
        public MergeSettings(Lifecycle Lifecycle = null, MergeResultEnum? MergeResult = null, string DataSetId = null, EngineEnum? Engine = null, List<string> HeaderDataSetIds = null, string TemplateVersion = null, string TemplateId = null, OutputSettings OutputSettings = null)
        {
            // to ensure "DataSetId" is required (not null)
            if (DataSetId == null)
            {
                throw new InvalidDataException("DataSetId is a required property for MergeSettings and cannot be null");
            }
            else
            {
                this.DataSetId = DataSetId;
            }
            // to ensure "TemplateId" is required (not null)
            if (TemplateId == null)
            {
                throw new InvalidDataException("TemplateId is a required property for MergeSettings and cannot be null");
            }
            else
            {
                this.TemplateId = TemplateId;
            }
            // to ensure "OutputSettings" is required (not null)
            if (OutputSettings == null)
            {
                throw new InvalidDataException("OutputSettings is a required property for MergeSettings and cannot be null");
            }
            else
            {
                this.OutputSettings = OutputSettings;
            }
            this.Lifecycle = Lifecycle;
            this.MergeResult = MergeResult;
            this.Engine = Engine;
            this.HeaderDataSetIds = HeaderDataSetIds;
            this.TemplateVersion = TemplateVersion;
        }
        
        /// <summary>
        /// Gets or Sets Lifecycle
        /// </summary>
        [DataMember(Name="lifecycle", EmitDefaultValue=false)]
        public Lifecycle Lifecycle { get; set; }
        /// <summary>
        /// Data set id
        /// </summary>
        /// <value>Data set id</value>
        [DataMember(Name="dataSetId", EmitDefaultValue=false)]
        public string DataSetId { get; set; }
        /// <summary>
        /// optional header data set ids
        /// </summary>
        /// <value>optional header data set ids</value>
        [DataMember(Name="headerDataSetIds", EmitDefaultValue=false)]
        public List<string> HeaderDataSetIds { get; set; }
        /// <summary>
        /// Template version
        /// </summary>
        /// <value>Template version</value>
        [DataMember(Name="templateVersion", EmitDefaultValue=false)]
        public string TemplateVersion { get; set; }
        /// <summary>
        /// Template id
        /// </summary>
        /// <value>Template id</value>
        [DataMember(Name="templateId", EmitDefaultValue=false)]
        public string TemplateId { get; set; }
        /// <summary>
        /// Gets or Sets OutputSettings
        /// </summary>
        [DataMember(Name="outputSettings", EmitDefaultValue=false)]
        public OutputSettings OutputSettings { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MergeSettings {\n");
            sb.Append("  Lifecycle: ").Append(Lifecycle).Append("\n");
            sb.Append("  MergeResult: ").Append(MergeResult).Append("\n");
            sb.Append("  DataSetId: ").Append(DataSetId).Append("\n");
            sb.Append("  Engine: ").Append(Engine).Append("\n");
            sb.Append("  HeaderDataSetIds: ").Append(HeaderDataSetIds).Append("\n");
            sb.Append("  TemplateVersion: ").Append(TemplateVersion).Append("\n");
            sb.Append("  TemplateId: ").Append(TemplateId).Append("\n");
            sb.Append("  OutputSettings: ").Append(OutputSettings).Append("\n");
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
            return this.Equals(obj as MergeSettings);
        }

        /// <summary>
        /// Returns true if MergeSettings instances are equal
        /// </summary>
        /// <param name="other">Instance of MergeSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MergeSettings other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Lifecycle == other.Lifecycle ||
                    this.Lifecycle != null &&
                    this.Lifecycle.Equals(other.Lifecycle)
                ) && 
                (
                    this.MergeResult == other.MergeResult ||
                    this.MergeResult != null &&
                    this.MergeResult.Equals(other.MergeResult)
                ) && 
                (
                    this.DataSetId == other.DataSetId ||
                    this.DataSetId != null &&
                    this.DataSetId.Equals(other.DataSetId)
                ) && 
                (
                    this.Engine == other.Engine ||
                    this.Engine != null &&
                    this.Engine.Equals(other.Engine)
                ) && 
                (
                    this.HeaderDataSetIds == other.HeaderDataSetIds ||
                    this.HeaderDataSetIds != null &&
                    this.HeaderDataSetIds.SequenceEqual(other.HeaderDataSetIds)
                ) && 
                (
                    this.TemplateVersion == other.TemplateVersion ||
                    this.TemplateVersion != null &&
                    this.TemplateVersion.Equals(other.TemplateVersion)
                ) && 
                (
                    this.TemplateId == other.TemplateId ||
                    this.TemplateId != null &&
                    this.TemplateId.Equals(other.TemplateId)
                ) && 
                (
                    this.OutputSettings == other.OutputSettings ||
                    this.OutputSettings != null &&
                    this.OutputSettings.Equals(other.OutputSettings)
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
                if (this.Lifecycle != null)
                    hash = hash * 59 + this.Lifecycle.GetHashCode();
                if (this.MergeResult != null)
                    hash = hash * 59 + this.MergeResult.GetHashCode();
                if (this.DataSetId != null)
                    hash = hash * 59 + this.DataSetId.GetHashCode();
                if (this.Engine != null)
                    hash = hash * 59 + this.Engine.GetHashCode();
                if (this.HeaderDataSetIds != null)
                    hash = hash * 59 + this.HeaderDataSetIds.GetHashCode();
                if (this.TemplateVersion != null)
                    hash = hash * 59 + this.TemplateVersion.GetHashCode();
                if (this.TemplateId != null)
                    hash = hash * 59 + this.TemplateId.GetHashCode();
                if (this.OutputSettings != null)
                    hash = hash * 59 + this.OutputSettings.GetHashCode();
                return hash;
            }
        }
    }

}
