package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.template_processor.model.TemplateContext;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.TemplateContextResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateApi
 */
public class TemplateApiTest {

    private TemplateApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TemplateApi.class);
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
     * Update template context
     *
     * Update an existing template context for your environment
     */
    @Test
    public void updateTemplateContextTest() {
        TemplateContext templateContext = null;
        // TemplateContextResponse response = api.updateTemplateContext(templateContext);

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
