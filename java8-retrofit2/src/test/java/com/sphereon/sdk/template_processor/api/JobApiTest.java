package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.MergeSettings;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.ResultStreamRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
public class JobApiTest {

    private JobApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(JobApi.class);
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
    public void getResultStreamTest() {
        String jobId = null;
        ResultStreamRequest resultStreamRequest = null;
        // byte[] response = api.getResultStream(jobId, resultStreamRequest);

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
    
}
