package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.MergeSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JobApi {
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
   * @return Call&lt;List<MergeJobResponse>&gt;
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
   * @param streamId streamId (required)
   * @param outputSettings outputSettings (optional)
   * @return Call&lt;byte[]&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @PUT("template/processor/0.1/jobs/{jobId}/result/file/{streamId}")
  Call<byte[]> getResultStreamById(
    @retrofit2.http.Path("jobId") String jobId, @retrofit2.http.Path("streamId") String streamId, @retrofit2.http.Body OutputSettings outputSettings
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

}
