package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.model.DataSetResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataSetApi
 */
public class DataSetApiTest {

    private DataSetApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DataSetApi.class);
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
    
}
