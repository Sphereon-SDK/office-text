/* 
 * Template-Processor
 *
 * <b>The Template-Processor API can generate office, xml and json documents from a template and a JSON data file. Supported templates are MS Office files and freemarker files.<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Sphereon.SDK.Template.Processor.Client;
using Sphereon.SDK.Template.Processor.Api;
using Sphereon.SDK.Template.Processor.Model;

namespace Sphereon.SDK.Template.Processor.Test
{
    /// <summary>
    ///  Class for testing TemplateApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class TemplateApiTests
    {
        private TemplateApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new TemplateApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of TemplateApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' TemplateApi
            //Assert.IsInstanceOfType(typeof(TemplateApi), instance, "instance is a TemplateApi");
        }

        
        /// <summary>
        /// Test CreateTemplateContext
        /// </summary>
        [Test]
        public void CreateTemplateContextTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TemplateContextRequest templateRequest = null;
            //var response = instance.CreateTemplateContext(templateRequest);
            //Assert.IsInstanceOf<TemplateContextResponse> (response, "response is TemplateContextResponse");
        }
        
        /// <summary>
        /// Test DeleteTemplateContext
        /// </summary>
        [Test]
        public void DeleteTemplateContextTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string templateId = null;
            //var response = instance.DeleteTemplateContext(templateId);
            //Assert.IsInstanceOf<TemplateContextResponse> (response, "response is TemplateContextResponse");
        }
        
        /// <summary>
        /// Test GetTemplateContext
        /// </summary>
        [Test]
        public void GetTemplateContextTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string templateId = null;
            //var response = instance.GetTemplateContext(templateId);
            //Assert.IsInstanceOf<TemplateContextResponse> (response, "response is TemplateContextResponse");
        }
        
        /// <summary>
        /// Test UpdateTemplateContext
        /// </summary>
        [Test]
        public void UpdateTemplateContextTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TemplateContextRequest templateContextRequest = null;
            //var response = instance.UpdateTemplateContext(templateContextRequest);
            //Assert.IsInstanceOf<TemplateContextResponse> (response, "response is TemplateContextResponse");
        }
        
        /// <summary>
        /// Test UploadTemplateFile
        /// </summary>
        [Test]
        public void UploadTemplateFileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string templateId = null;
            //System.IO.Stream stream = null;
            //var response = instance.UploadTemplateFile(templateId, stream);
            //Assert.IsInstanceOf<TemplateContextResponse> (response, "response is TemplateContextResponse");
        }
        
    }

}
