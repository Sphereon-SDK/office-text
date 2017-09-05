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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.TemplateProcessor);
  }
}(this, function(expect, TemplateProcessor) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new TemplateProcessor.AllApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AllApi', function() {
    describe('createDataSet', function() {
      it('should call createDataSet successfully', function(done) {
        //uncomment below and update the code to test createDataSet
        //instance.createDataSet(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createTemplateContext', function() {
      it('should call createTemplateContext successfully', function(done) {
        //uncomment below and update the code to test createTemplateContext
        //instance.createTemplateContext(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteDataSet', function() {
      it('should call deleteDataSet successfully', function(done) {
        //uncomment below and update the code to test deleteDataSet
        //instance.deleteDataSet(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteJob', function() {
      it('should call deleteJob successfully', function(done) {
        //uncomment below and update the code to test deleteJob
        //instance.deleteJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteTemplateContext', function() {
      it('should call deleteTemplateContext successfully', function(done) {
        //uncomment below and update the code to test deleteTemplateContext
        //instance.deleteTemplateContext(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getJob', function() {
      it('should call getJob successfully', function(done) {
        //uncomment below and update the code to test getJob
        //instance.getJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getJobs', function() {
      it('should call getJobs successfully', function(done) {
        //uncomment below and update the code to test getJobs
        //instance.getJobs(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getResultStreamById', function() {
      it('should call getResultStreamById successfully', function(done) {
        //uncomment below and update the code to test getResultStreamById
        //instance.getResultStreamById(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getResultStreamsAsContainer', function() {
      it('should call getResultStreamsAsContainer successfully', function(done) {
        //uncomment below and update the code to test getResultStreamsAsContainer
        //instance.getResultStreamsAsContainer(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTemplateContext', function() {
      it('should call getTemplateContext successfully', function(done) {
        //uncomment below and update the code to test getTemplateContext
        //instance.getTemplateContext(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('submitJob', function() {
      it('should call submitJob successfully', function(done) {
        //uncomment below and update the code to test submitJob
        //instance.submitJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateTemplateContext', function() {
      it('should call updateTemplateContext successfully', function(done) {
        //uncomment below and update the code to test updateTemplateContext
        //instance.updateTemplateContext(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('uploadTemplateFile', function() {
      it('should call uploadTemplateFile successfully', function(done) {
        //uncomment below and update the code to test uploadTemplateFile
        //instance.uploadTemplateFile(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
