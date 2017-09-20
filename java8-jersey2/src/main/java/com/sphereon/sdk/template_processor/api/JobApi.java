package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiException;
import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.handler.Configuration;
import com.sphereon.sdk.template_processor.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.MergeSettings;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.ResultStreamRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-20T13:28:35.968+02:00")
public class JobApi {
  private ApiClient apiClient;

  public JobApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Job definition and state
   * Get the merge job definition and current state. Please not that you can differentiate based on http response status
   * @param jobId jobId (required)
   * @return MergeJobResponse
   * @throws ApiException if fails to make API call
   */
  public MergeJobResponse getJob(String jobId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getJob");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs/{jobId}"
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<MergeJobResponse> localVarReturnType = new GenericType<MergeJobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all jobs
   * Get all office text job definitions and their current state.
   * @param status A list of status to filter on. (optional)
   * @return List&lt;MergeJobResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MergeJobResponse> getJobs(List<String> status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<List<MergeJobResponse>> localVarReturnType = new GenericType<List<MergeJobResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the result file
   * Get a merge result document as a binary stream.   
   * @param jobId jobId (required)
   * @param resultStreamRequest resultStreamRequest (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getResultStream(String jobId, ResultStreamRequest resultStreamRequest) throws ApiException {
    Object localVarPostBody = resultStreamRequest;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getResultStream");
    }
    
    // verify the required parameter 'resultStreamRequest' is set
    if (resultStreamRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'resultStreamRequest' when calling getResultStream");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs/{jobId}/result/stream"
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the result file
   * Get all documents inside a compressed container as a binary stream.   
   * @param jobId jobId (required)
   * @param outputSettings outputSettings (optional)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getResultStreamsAsContainer(String jobId, OutputSettings outputSettings) throws ApiException {
    Object localVarPostBody = outputSettings;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getResultStreamsAsContainer");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs/{jobId}/result/container"
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Submit merge job for processing
   * Submit merge job run.
   * @param mergesettings The merge- and output settings (required)
   * @return MergeJobResponse
   * @throws ApiException if fails to make API call
   */
  public MergeJobResponse submitJob(MergeSettings mergesettings) throws ApiException {
    Object localVarPostBody = mergesettings;
    
    // verify the required parameter 'mergesettings' is set
    if (mergesettings == null) {
      throw new ApiException(400, "Missing the required parameter 'mergesettings' when calling submitJob");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<MergeJobResponse> localVarReturnType = new GenericType<MergeJobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
