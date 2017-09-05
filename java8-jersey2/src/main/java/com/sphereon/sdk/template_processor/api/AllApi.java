package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiException;
import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.handler.Configuration;
import com.sphereon.sdk.template_processor.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.template_processor.model.DataSetResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.TemplateContextResponse;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.MergeSettings;
import com.sphereon.sdk.template_processor.model.TemplateContext;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T12:07:31.439+02:00")
public class AllApi {
  private ApiClient apiClient;

  public AllApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AllApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Store dataset
   * Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.
   * @param payload The dates for the merge [   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   },   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   } ] (required)
   * @return DataSetResponse
   * @throws ApiException if fails to make API call
   */
  public DataSetResponse createDataSet(String payload) throws ApiException {
    Object localVarPostBody = payload;
    
    // verify the required parameter 'payload' is set
    if (payload == null) {
      throw new ApiException(400, "Missing the required parameter 'payload' when calling createDataSet");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/datasets".replaceAll("\\{format\\}","json");

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

    GenericType<DataSetResponse> localVarReturnType = new GenericType<DataSetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create template context
   * Create a unique template context for your environment
   * @param templateRequest The template request (required)
   * @return TemplateContextResponse
   * @throws ApiException if fails to make API call
   */
  public TemplateContextResponse createTemplateContext(TemplateContextRequest templateRequest) throws ApiException {
    Object localVarPostBody = templateRequest;
    
    // verify the required parameter 'templateRequest' is set
    if (templateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'templateRequest' when calling createTemplateContext");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/templates".replaceAll("\\{format\\}","json");

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

    GenericType<TemplateContextResponse> localVarReturnType = new GenericType<TemplateContextResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a stored data set
   * Delete a stored data set
   * @param dataSetId dataSetId (required)
   * @return DataSetResponse
   * @throws ApiException if fails to make API call
   */
  public DataSetResponse deleteDataSet(String dataSetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dataSetId' is set
    if (dataSetId == null) {
      throw new ApiException(400, "Missing the required parameter 'dataSetId' when calling deleteDataSet");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/datasets/{dataSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dataSetId" + "\\}", apiClient.escapeString(dataSetId.toString()));

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

    GenericType<DataSetResponse> localVarReturnType = new GenericType<DataSetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a job manually
   * Delete the merge job and all related files
   * @param jobId jobId (required)
   * @return MergeJobResponse
   * @throws ApiException if fails to make API call
   */
  public MergeJobResponse deleteJob(String jobId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling deleteJob");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs/{jobId}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete template context
   * Delete a template context with all history
   * @param templateId templateId (required)
   * @return TemplateContextResponse
   * @throws ApiException if fails to make API call
   */
  public TemplateContextResponse deleteTemplateContext(String templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplateContext");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    GenericType<TemplateContextResponse> localVarReturnType = new GenericType<TemplateContextResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
    String localVarPath = "/template/processor/0.1/jobs/{jobId}".replaceAll("\\{format\\}","json")
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
   * @return List<MergeJobResponse>
   * @throws ApiException if fails to make API call
   */
  public List<MergeJobResponse> getJobs(List<String> status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs".replaceAll("\\{format\\}","json");

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
   * @param streamId streamId (required)
   * @param outputSettings outputSettings (optional)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getResultStreamById(String jobId, String streamId, OutputSettings outputSettings) throws ApiException {
    Object localVarPostBody = outputSettings;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getResultStreamById");
    }
    
    // verify the required parameter 'streamId' is set
    if (streamId == null) {
      throw new ApiException(400, "Missing the required parameter 'streamId' when calling getResultStreamById");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/jobs/{jobId}/result/file/{streamId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "streamId" + "\\}", apiClient.escapeString(streamId.toString()));

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
    String localVarPath = "/template/processor/0.1/jobs/{jobId}/result/container".replaceAll("\\{format\\}","json")
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
   * Get template context
   * Get an existing template context
   * @param templateId The template context name unique for your environment (required)
   * @return TemplateContextResponse
   * @throws ApiException if fails to make API call
   */
  public TemplateContextResponse getTemplateContext(String templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateContext");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    GenericType<TemplateContextResponse> localVarReturnType = new GenericType<TemplateContextResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
    String localVarPath = "/template/processor/0.1/jobs".replaceAll("\\{format\\}","json");

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
  /**
   * Update template context
   * Update an existing template context for your environment
   * @param templateContext templateContext (required)
   * @return TemplateContextResponse
   * @throws ApiException if fails to make API call
   */
  public TemplateContextResponse updateTemplateContext(TemplateContext templateContext) throws ApiException {
    Object localVarPostBody = templateContext;
    
    // verify the required parameter 'templateContext' is set
    if (templateContext == null) {
      throw new ApiException(400, "Missing the required parameter 'templateContext' when calling updateTemplateContext");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/templates".replaceAll("\\{format\\}","json");

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

    GenericType<TemplateContextResponse> localVarReturnType = new GenericType<TemplateContextResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload template file
   * Upload the Office template file
   * @param templateId The template context name unique for your environment (required)
   * @param stream The template (file/inputstream) to store (required)
   * @return TemplateContextResponse
   * @throws ApiException if fails to make API call
   */
  public TemplateContextResponse uploadTemplateFile(String templateId, File stream) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling uploadTemplateFile");
    }
    
    // verify the required parameter 'stream' is set
    if (stream == null) {
      throw new ApiException(400, "Missing the required parameter 'stream' when calling uploadTemplateFile");
    }
    
    // create path and map variables
    String localVarPath = "/template/processor/0.1/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (stream != null)
      localVarFormParams.put("stream", stream);

    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<TemplateContextResponse> localVarReturnType = new GenericType<TemplateContextResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
