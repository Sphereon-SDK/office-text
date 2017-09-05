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
    root.TemplateProcessor.StreamLocation = factory(root.TemplateProcessor.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The StreamLocation model module.
   * @module SphereonTemplateProcessor/model/StreamLocation
   * @version 0.1
   */

  /**
   * Constructs a new <code>StreamLocation</code>.
   * Location record of data stream
   * @alias module:SphereonTemplateProcessor/model/StreamLocation
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>StreamLocation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonTemplateProcessor/model/StreamLocation} obj Optional instance to populate.
   * @return {module:SphereonTemplateProcessor/model/StreamLocation} The populated <code>StreamLocation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('folderPath')) {
        obj['folderPath'] = ApiClient.convertToType(data['folderPath'], 'String');
      }
      if (data.hasOwnProperty('originalFileName')) {
        obj['originalFileName'] = ApiClient.convertToType(data['originalFileName'], 'String');
      }
      if (data.hasOwnProperty('fileName')) {
        obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
      }
      if (data.hasOwnProperty('containerId')) {
        obj['containerId'] = ApiClient.convertToType(data['containerId'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} folderPath
   */
  exports.prototype['folderPath'] = undefined;
  /**
   * @member {String} originalFileName
   */
  exports.prototype['originalFileName'] = undefined;
  /**
   * @member {String} fileName
   */
  exports.prototype['fileName'] = undefined;
  /**
   * @member {String} containerId
   */
  exports.prototype['containerId'] = undefined;



  return exports;
}));


