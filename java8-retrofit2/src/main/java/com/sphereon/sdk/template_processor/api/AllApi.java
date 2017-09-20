package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.template_processor.model.DataSetResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.MergeSettings;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.ResultStreamRequest;
import com.sphereon.sdk.template_processor.model.TemplateContext;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.TemplateContextResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AllApi {
  /**
   * Store dataset
   * Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.
   * @param payload The dates for the merge [   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   },   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   } ] (required)
   * @return Call&lt;DataSetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("template/processor/0.1/datasets")
  Call<DataSetResponse> createDataSet(
    @retrofit2.http.Body String payload
  );

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
   * Delete a stored data set
   * Delete a stored data set
   * @param dataSetId dataSetId (required)
   * @return Call&lt;DataSetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("template/processor/0.1/datasets/{dataSetId}")
  Call<DataSetResponse> deleteDataSet(
    @retrofit2.http.Path("dataSetId") String dataSetId
  );

  /**
   * Delete a job manually
   * Delete the merge job and all related files
   * @param jobId jobId (required)
   * @return Call&lt;MergeJobResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("template/processor/0.1/jobs/{jobId}")
  Call<MergeJobResponse> deleteJob(
    @retrofit2.http.Path("jobId") String jobId
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
   * Job definition and state
   * Get the merge job definition and current state. Please not that you can differentiate based on http response status
   * @param jobId jobId (required)
   * @return Call&lt;MergeJobResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("template/processor/0.1/jobs/{jobId}")
  Call<MergeJobResponse> getJob(
    @retrofit2.http.Path("jobId") String jobId
  );

  /**
   * Get all jobs
   * Get all office text job definitions and their current state.
   * @param status A list of status to filter on. (optional)
   * @return Call&lt;List&lt;MergeJobResponse&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("template/processor/0.1/jobs")
  Call<List<MergeJobResponse>> getJobs(
    @retrofit2.http.Query("status") List<String> status
  );

  /**
   * Get the result file
   * Get a merge result document as a binary stream.   
   * @param jobId jobId (required)
   * @param resultStreamRequest resultStreamRequest (required)
   * @return Call&lt;byte[]&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @PUT("template/processor/0.1/jobs/{jobId}/result/stream")
  Call<byte[]> getResultStream(
    @retrofit2.http.Path("jobId") String jobId, @retrofit2.http.Body ResultStreamRequest resultStreamRequest
  );

  /**
   * Get the result file
   * Get all documents inside a compressed container as a binary stream.   
   * @param jobId jobId (required)
   * @param outputSettings outputSettings (optional)
   * @return Call&lt;byte[]&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @PUT("template/processor/0.1/jobs/{jobId}/result/container")
  Call<byte[]> getResultStreamsAsContainer(
    @retrofit2.http.Path("jobId") String jobId, @retrofit2.http.Body OutputSettings outputSettings
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
   * Submit merge job for processing
   * Submit merge job run.
   * @param mergesettings The merge- and output settings (required)
   * @return Call&lt;MergeJobResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @PUT("template/processor/0.1/jobs")
  Call<MergeJobResponse> submitJob(
    @retrofit2.http.Body MergeSettings mergesettings
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
