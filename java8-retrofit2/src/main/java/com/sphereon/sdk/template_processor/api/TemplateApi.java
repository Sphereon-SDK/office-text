package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.template_processor.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.template_processor.model.TemplateContext;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.TemplateContextResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TemplateApi {
  /**
   * Create template context
   * Create a unique template context for your environment
   * @param templateRequest The template request (required)
   * @return Call&lt;TemplateContextResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("template/processor/0.1/templates")
  Call<TemplateContextResponse> createTemplateContext(
    @retrofit2.http.Body TemplateContextRequest templateRequest
  );

  /**
   * Delete template context
   * Delete a template context with all history
   * @param templateId templateId (required)
   * @return Call&lt;TemplateContextResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("template/processor/0.1/templates/{templateId}")
  Call<TemplateContextResponse> deleteTemplateContext(
    @retrofit2.http.Path("templateId") String templateId
  );

  /**
   * Get template context
   * Get an existing template context
   * @param templateId The template context name unique for your environment (required)
   * @return Call&lt;TemplateContextResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("template/processor/0.1/templates/{templateId}")
  Call<TemplateContextResponse> getTemplateContext(
    @retrofit2.http.Path("templateId") String templateId
  );

  /**
   * Update template context
   * Update an existing template context for your environment
   * @param templateContext templateContext (required)
   * @return Call&lt;TemplateContextResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @PUT("template/processor/0.1/templates")
  Call<TemplateContextResponse> updateTemplateContext(
    @retrofit2.http.Body TemplateContext templateContext
  );

  /**
   * Upload template file
   * Upload the Office template file
   * @param templateId The template context name unique for your environment (required)
   * @param stream The template (file/inputstream) to store (required)
   * @return Call&lt;TemplateContextResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("template/processor/0.1/templates/{templateId}")
  Call<TemplateContextResponse> uploadTemplateFile(
    @retrofit2.http.Path("templateId") String templateId, @retrofit2.http.Part("stream\"; filename=\"stream") RequestBody stream
  );

}
