package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiException;
import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.handler.Configuration;
import com.sphereon.sdk.template_processor.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.template_processor.model.DataSetResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-20T13:28:35.968+02:00")
public class DataSetApi {
  private ApiClient apiClient;

  public DataSetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataSetApi(ApiClient apiClient) {
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
    String localVarPath = "/template/processor/0.1/datasets";

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
    String localVarPath = "/template/processor/0.1/datasets/{dataSetId}"
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
}
