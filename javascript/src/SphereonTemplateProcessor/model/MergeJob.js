/**
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonTemplateProcessor/ApiClient', 'SphereonTemplateProcessor/model/MergeSettings', 'SphereonTemplateProcessor/model/StorageLocation', 'SphereonTemplateProcessor/model/StreamLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MergeSettings'), require('./StorageLocation'), require('./StreamLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.TemplateProcessor) {
      root.TemplateProcessor = {};
    }
    root.TemplateProcessor.MergeJob = factory(root.TemplateProcessor.ApiClient, root.TemplateProcessor.MergeSettings, root.TemplateProcessor.StorageLocation, root.TemplateProcessor.StreamLocation);
  }
}(this, function(ApiClient, MergeSettings, StorageLocation, StreamLocation) {
  'use strict';




  /**
   * The MergeJob model module.
   * @module SphereonTemplateProcessor/model/MergeJob
   * @version 0.1
   */

  /**
   * Constructs a new <code>MergeJob</code>.
   * The merge job. Has access to the job merge data.
   * @alias module:SphereonTemplateProcessor/model/MergeJob
   * @class
   * @param jobId {String} The server generated job jobId. This jobId is checked against the jobId in the request path on every invocation
   * @param resultStreams {Array.<module:SphereonTemplateProcessor/model/StreamLocation>} The storage locations of the result files.
   * @param status {module:SphereonTemplateProcessor/model/MergeJob.StatusEnum} The status of the job
   */
  var exports = function(jobId, resultStreams, status) {
    var _this = this;


    _this['jobId'] = jobId;


    _this['resultStreams'] = resultStreams;




    _this['status'] = status;
  };

  /**
   * Constructs a <code>MergeJob</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonTemplateProcessor/model/MergeJob} obj Optional instance to populate.
   * @return {module:SphereonTemplateProcessor/model/MergeJob} The populated <code>MergeJob</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('completionTime')) {
        obj['completionTime'] = ApiClient.convertToType(data['completionTime'], 'Date');
      }
      if (data.hasOwnProperty('jobId')) {
        obj['jobId'] = ApiClient.convertToType(data['jobId'], 'String');
      }
      if (data.hasOwnProperty('creationTime')) {
        obj['creationTime'] = ApiClient.convertToType(data['creationTime'], 'Date');
      }
      if (data.hasOwnProperty('dataSetId')) {
        obj['dataSetId'] = ApiClient.convertToType(data['dataSetId'], 'String');
      }
      if (data.hasOwnProperty('resultStreams')) {
        obj['resultStreams'] = ApiClient.convertToType(data['resultStreams'], [StreamLocation]);
      }
      if (data.hasOwnProperty('headerDataSetIds')) {
        obj['headerDataSetIds'] = ApiClient.convertToType(data['headerDataSetIds'], ['String']);
      }
      if (data.hasOwnProperty('resultStorageLocation')) {
        obj['resultStorageLocation'] = StorageLocation.constructFromObject(data['resultStorageLocation']);
      }
      if (data.hasOwnProperty('mergeSettings')) {
        obj['mergeSettings'] = MergeSettings.constructFromObject(data['mergeSettings']);
      }
      if (data.hasOwnProperty('statusMessage')) {
        obj['statusMessage'] = ApiClient.convertToType(data['statusMessage'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
    }
    return obj;
  }

  /**
   * The completion date/time of this job in ISO 8601 format
   * @member {Date} completionTime
   */
  exports.prototype['completionTime'] = undefined;
  /**
   * The server generated job jobId. This jobId is checked against the jobId in the request path on every invocation
   * @member {String} jobId
   */
  exports.prototype['jobId'] = undefined;
  /**
   * The creation date/time of this job in ISO 8601 format
   * @member {Date} creationTime
   */
  exports.prototype['creationTime'] = undefined;
  /**
   * Data set id
   * @member {String} dataSetId
   */
  exports.prototype['dataSetId'] = undefined;
  /**
   * The storage locations of the result files.
   * @member {Array.<module:SphereonTemplateProcessor/model/StreamLocation>} resultStreams
   */
  exports.prototype['resultStreams'] = undefined;
  /**
   * Header data set ids
   * @member {Array.<String>} headerDataSetIds
   */
  exports.prototype['headerDataSetIds'] = undefined;
  /**
   * The storage location. (optional)
   * @member {module:SphereonTemplateProcessor/model/StorageLocation} resultStorageLocation
   */
  exports.prototype['resultStorageLocation'] = undefined;
  /**
   * @member {module:SphereonTemplateProcessor/model/MergeSettings} mergeSettings
   */
  exports.prototype['mergeSettings'] = undefined;
  /**
   * A status message, which can be informational, warning or error. A message here does not indicate an error perse
   * @member {String} statusMessage
   */
  exports.prototype['statusMessage'] = undefined;
  /**
   * The status of the job
   * @member {module:SphereonTemplateProcessor/model/MergeJob.StatusEnum} status
   */
  exports.prototype['status'] = undefined;


  /**
   * Allowed values for the <code>status</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StatusEnum = {
    /**
     * value: "CREATED"
     * @const
     */
    "CREATED": "CREATED",
    /**
     * value: "UPDATED"
     * @const
     */
    "UPDATED": "UPDATED",
    /**
     * value: "PROCESSING"
     * @const
     */
    "PROCESSING": "PROCESSING",
    /**
     * value: "DONE"
     * @const
     */
    "DONE": "DONE",
    /**
     * value: "ERROR"
     * @const
     */
    "ERROR": "ERROR",
    /**
     * value: "DELETED"
     * @const
     */
    "DELETED": "DELETED"  };


  return exports;
}));


