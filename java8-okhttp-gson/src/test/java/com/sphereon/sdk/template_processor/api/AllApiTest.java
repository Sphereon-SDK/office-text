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


package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiException;
import com.sphereon.sdk.template_processor.model.DataSetResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.TemplateContextResponse;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.MergeSettings;
import java.io.File;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllApi
 */
public class AllApiTest {

    private final AllApi api = new AllApi();

    
    /**
     * Store dataset
     *
     * Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDataSetTest() throws ApiException {
        String payload = null;
        // DataSetResponse response = api.createDataSet(payload);

        // TODO: test validations
    }
    
    /**
     * Create template context
     *
     * Create a unique template context for your environment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTemplateContextTest() throws ApiException {
        TemplateContextRequest templateRequest = null;
        // TemplateContextResponse response = api.createTemplateContext(templateRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a stored data set
     *
     * Delete a stored data set
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDataSetTest() throws ApiException {
        String dataSetId = null;
        // DataSetResponse response = api.deleteDataSet(dataSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a job manually
     *
     * Delete the merge job and all related files
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTest() throws ApiException {
        String jobId = null;
        // MergeJobResponse response = api.deleteJob(jobId);

        // TODO: test validations
    }
    
    /**
     * Delete template context
     *
     * Delete a template context with all history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateContextTest() throws ApiException {
        String templateId = null;
        // TemplateContextResponse response = api.deleteTemplateContext(templateId);

        // TODO: test validations
    }
    
    /**
     * Job definition and state
     *
     * Get the merge job definition and current state. Please not that you can differentiate based on http response status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTest() throws ApiException {
        String jobId = null;
        // MergeJobResponse response = api.getJob(jobId);

        // TODO: test validations
    }
    
    /**
     * Get all jobs
     *
     * Get all office text job definitions and their current state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobsTest() throws ApiException {
        List<String> status = null;
        // List<MergeJobResponse> response = api.getJobs(status);

        // TODO: test validations
    }
    
    /**
     * Get the result file
     *
     * Get a merge result document as a binary stream.   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResultStreamByIdTest() throws ApiException {
        String jobId = null;
        String streamId = null;
        OutputSettings outputSettings = null;
        // byte[] response = api.getResultStreamById(jobId, streamId, outputSettings);

        // TODO: test validations
    }
    
    /**
     * Get the result file
     *
     * Get all documents inside a compressed container as a binary stream.   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResultStreamsAsContainerTest() throws ApiException {
        String jobId = null;
        OutputSettings outputSettings = null;
        // byte[] response = api.getResultStreamsAsContainer(jobId, outputSettings);

        // TODO: test validations
    }
    
    /**
     * Get template context
     *
     * Get an existing template context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateContextTest() throws ApiException {
        String templateId = null;
        // TemplateContextResponse response = api.getTemplateContext(templateId);

        // TODO: test validations
    }
    
    /**
     * Submit merge job for processing
     *
     * Submit merge job run.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitJobTest() throws ApiException {
        MergeSettings mergesettings = null;
        // MergeJobResponse response = api.submitJob(mergesettings);

        // TODO: test validations
    }
    
    /**
     * Update template context
     *
     * Update an existing template context for your environment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTemplateContextTest() throws ApiException {
        TemplateContextRequest templateContextRequest = null;
        // TemplateContextResponse response = api.updateTemplateContext(templateContextRequest);

        // TODO: test validations
    }
    
    /**
     * Upload template file
     *
     * Upload the Office template file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadTemplateFileTest() throws ApiException {
        String templateId = null;
        File stream = null;
        // TemplateContextResponse response = api.uploadTemplateFile(templateId, stream);

        // TODO: test validations
    }
    
}
