package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiException;
import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.handler.Configuration;
import com.sphereon.sdk.template_processor.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.template_processor.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.template_processor.model.TemplateContext;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.TemplateContextResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-20T13:28:35.968+02:00")
public class TemplateApi {
  private ApiClient apiClient;

  public TemplateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TemplateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
    String localVarPath = "/template/processor/0.1/templates";

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
    String localVarPath = "/template/processor/0.1/templates/{templateId}"
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
    String localVarPath = "/template/processor/0.1/templates/{templateId}"
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
    String localVarPath = "/template/processor/0.1/templates";

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
    String localVarPath = "/template/processor/0.1/templates/{templateId}"
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
