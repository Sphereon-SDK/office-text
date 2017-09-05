package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.model.DataSetResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.TemplateContextResponse;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.MergeSettings;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllApi
 */
public class AllApiTest {

    private AllApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AllApi.class);
    }

    
    /**
     * Store dataset
     *
     * Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.
     */
    @Test
    public void createDataSetTest() {
        String payload = null;
        // DataSetResponse response = api.createDataSet(payload);

        // TODO: test validations
    }
    
    /**
     * Create template context
     *
     * Create a unique template context for your environment
     */
    @Test
    public void createTemplateContextTest() {
        TemplateContextRequest templateRequest = null;
        // TemplateContextResponse response = api.createTemplateContext(templateRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a stored data set
     *
     * Delete a stored data set
     */
    @Test
    public void deleteDataSetTest() {
        String dataSetId = null;
        // DataSetResponse response = api.deleteDataSet(dataSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a job manually
     *
     * Delete the merge job and all related files
     */
    @Test
    public void deleteJobTest() {
        String jobId = null;
        // MergeJobResponse response = api.deleteJob(jobId);

        // TODO: test validations
    }
    
    /**
     * Delete template context
     *
     * Delete a template context with all history
     */
    @Test
    public void deleteTemplateContextTest() {
        String templateId = null;
        // TemplateContextResponse response = api.deleteTemplateContext(templateId);

        // TODO: test validations
    }
    
    /**
     * Job definition and state
     *
     * Get the merge job definition and current state. Please not that you can differentiate based on http response status
     */
    @Test
    public void getJobTest() {
        String jobId = null;
        // MergeJobResponse response = api.getJob(jobId);

        // TODO: test validations
    }
    
    /**
     * Get all jobs
     *
     * Get all office text job definitions and their current state.
     */
    @Test
    public void getJobsTest() {
        List<String> status = null;
        // List<MergeJobResponse> response = api.getJobs(status);

        // TODO: test validations
    }
    
    /**
     * Get the result file
     *
     * Get a merge result document as a binary stream.   
     */
    @Test
    public void getResultStreamByIdTest() {
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
     */
    @Test
    public void getResultStreamsAsContainerTest() {
        String jobId = null;
        OutputSettings outputSettings = null;
        // byte[] response = api.getResultStreamsAsContainer(jobId, outputSettings);

        // TODO: test validations
    }
    
    /**
     * Get template context
     *
     * Get an existing template context
     */
    @Test
    public void getTemplateContextTest() {
        String templateId = null;
        // TemplateContextResponse response = api.getTemplateContext(templateId);

        // TODO: test validations
    }
    
    /**
     * Submit merge job for processing
     *
     * Submit merge job run.
     */
    @Test
    public void submitJobTest() {
        MergeSettings mergesettings = null;
        // MergeJobResponse response = api.submitJob(mergesettings);

        // TODO: test validations
    }
    
    /**
     * Update template context
     *
     * Update an existing template context for your environment
     */
    @Test
    public void updateTemplateContextTest() {
        TemplateContextRequest templateContextRequest = null;
        // TemplateContextResponse response = api.updateTemplateContext(templateContextRequest);

        // TODO: test validations
    }
    
    /**
     * Upload template file
     *
     * Upload the Office template file
     */
    @Test
    public void uploadTemplateFileTest() {
        String templateId = null;
        File stream = null;
        // TemplateContextResponse response = api.uploadTemplateFile(templateId, stream);

        // TODO: test validations
    }
    
}
