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
    define(['SphereonTemplateProcessor/ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.TemplateProcessor) {
      root.TemplateProcessor = {};
    }
    root.TemplateProcessor.Lifecycle = factory(root.TemplateProcessor.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Lifecycle model module.
   * @module SphereonTemplateProcessor/model/Lifecycle
   * @version 0.1
   */

  /**
   * Constructs a new <code>Lifecycle</code>.
   * Lifecycle settings. When no lifecycle settings are supplied, the job and files will be deleted directly after retrieval of the file
   * @alias module:SphereonTemplateProcessor/model/Lifecycle
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Lifecycle</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonTemplateProcessor/model/Lifecycle} obj Optional instance to populate.
   * @return {module:SphereonTemplateProcessor/model/Lifecycle} The populated <code>Lifecycle</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('actionTime')) {
        obj['actionTime'] = ApiClient.convertToType(data['actionTime'], 'Date');
      }
      if (data.hasOwnProperty('action')) {
        obj['action'] = ApiClient.convertToType(data['action'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
    }
    return obj;
  }

  /**
   * The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation
   * @member {Date} actionTime
   */
  exports.prototype['actionTime'] = undefined;
  /**
   * @member {module:SphereonTemplateProcessor/model/Lifecycle.ActionEnum} action
   */
  exports.prototype['action'] = undefined;
  /**
   * @member {module:SphereonTemplateProcessor/model/Lifecycle.TypeEnum} type
   */
  exports.prototype['type'] = undefined;


  /**
   * Allowed values for the <code>action</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ActionEnum = {
    /**
     * value: "DELETE"
     * @const
     */
    "DELETE": "DELETE"  };

  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "RETRIEVAL"
     * @const
     */
    "RETRIEVAL": "RETRIEVAL",
    /**
     * value: "TIME"
     * @const
     */
    "TIME": "TIME"  };


  return exports;
}));


