/**
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonTemplateProcessor/ApiClient', 'SphereonTemplateProcessor/model/Error'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Error'));
  } else {
    // Browser globals (root is window)
    if (!root.OfficeTextMerge) {
      root.OfficeTextMerge = {};
    }
    root.OfficeTextMerge.Error = factory(root.OfficeTextMerge.ApiClient, root.OfficeTextMerge.Error);
  }
}(this, function(ApiClient, Error) {
  'use strict';




  /**
   * The Error model module.
   * @module SphereonTemplateProcessor/model/Error
   * @version 0.1
   */

  /**
   * Constructs a new <code>Error</code>.
   * An error
   * @alias module:SphereonTemplateProcessor/model/Error
   * @class
   * @param code {String} 
   * @param level {module:SphereonTemplateProcessor/model/Error.LevelEnum} 
   * @param message {String} 
   */
  var exports = function(code, level, message) {
    var _this = this;

    _this['code'] = code;
    _this['level'] = level;

    _this['message'] = message;
  };

  /**
   * Constructs a <code>Error</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonTemplateProcessor/model/Error} obj Optional instance to populate.
   * @return {module:SphereonTemplateProcessor/model/Error} The populated <code>Error</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('level')) {
        obj['level'] = ApiClient.convertToType(data['level'], 'String');
      }
      if (data.hasOwnProperty('cause')) {
        obj['cause'] = Error.constructFromObject(data['cause']);
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * @member {module:SphereonTemplateProcessor/model/Error.LevelEnum} level
   */
  exports.prototype['level'] = undefined;
  /**
   * @member {module:SphereonTemplateProcessor/model/Error} cause
   */
  exports.prototype['cause'] = undefined;
  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;


  /**
   * Allowed values for the <code>level</code> property.
   * @enum {String}
   * @readonly
   */
  exports.LevelEnum = {
    /**
     * value: "INFO"
     * @const
     */
    "INFO": "INFO",
    /**
     * value: "WARNING"
     * @const
     */
    "WARNING": "WARNING",
    /**
     * value: "FATAL"
     * @const
     */
    "FATAL": "FATAL"  };


  return exports;
}));


