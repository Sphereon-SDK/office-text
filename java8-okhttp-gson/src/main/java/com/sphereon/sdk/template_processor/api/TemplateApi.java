/*
 * Template-Processor
 * <b>The Template-Processor API can generate office, xml and json documents from a template and a JSON data file. Supported templates are MS Office files and freemarker files.<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.ApiCallback;
import com.sphereon.sdk.template_processor.handler.ApiClient;
import com.sphereon.sdk.template_processor.handler.ApiException;
import com.sphereon.sdk.template_processor.handler.ApiResponse;
import com.sphereon.sdk.template_processor.handler.Configuration;
import com.sphereon.sdk.template_processor.handler.Pair;
import com.sphereon.sdk.template_processor.handler.ProgressRequestBody;
import com.sphereon.sdk.template_processor.handler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.sphereon.sdk.template_processor.model.TemplateContextResponse;
import com.sphereon.sdk.template_processor.model.TemplateContextRequest;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.TemplateContext;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /* Build call for createTemplateContext */
    private com.squareup.okhttp.Call createTemplateContextCall(TemplateContextRequest templateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = templateRequest;
        
        // verify the required parameter 'templateRequest' is set
        if (templateRequest == null) {
            throw new ApiException("Missing the required parameter 'templateRequest' when calling createTemplateContext(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/templates".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create template context
     * Create a unique template context for your environment
     * @param templateRequest The template request (required)
     * @return TemplateContextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateContextResponse createTemplateContext(TemplateContextRequest templateRequest) throws ApiException {
        ApiResponse<TemplateContextResponse> resp = createTemplateContextWithHttpInfo(templateRequest);
        return resp.getData();
    }

    /**
     * Create template context
     * Create a unique template context for your environment
     * @param templateRequest The template request (required)
     * @return ApiResponse&lt;TemplateContextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateContextResponse> createTemplateContextWithHttpInfo(TemplateContextRequest templateRequest) throws ApiException {
        com.squareup.okhttp.Call call = createTemplateContextCall(templateRequest, null, null);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create template context (asynchronously)
     * Create a unique template context for your environment
     * @param templateRequest The template request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTemplateContextAsync(TemplateContextRequest templateRequest, final ApiCallback<TemplateContextResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createTemplateContextCall(templateRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteTemplateContext */
    private com.squareup.okhttp.Call deleteTemplateContextCall(String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling deleteTemplateContext(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/templates/{templateId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete template context
     * Delete a template context with all history
     * @param templateId templateId (required)
     * @return TemplateContextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateContextResponse deleteTemplateContext(String templateId) throws ApiException {
        ApiResponse<TemplateContextResponse> resp = deleteTemplateContextWithHttpInfo(templateId);
        return resp.getData();
    }

    /**
     * Delete template context
     * Delete a template context with all history
     * @param templateId templateId (required)
     * @return ApiResponse&lt;TemplateContextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateContextResponse> deleteTemplateContextWithHttpInfo(String templateId) throws ApiException {
        com.squareup.okhttp.Call call = deleteTemplateContextCall(templateId, null, null);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete template context (asynchronously)
     * Delete a template context with all history
     * @param templateId templateId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTemplateContextAsync(String templateId, final ApiCallback<TemplateContextResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTemplateContextCall(templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTemplateContext */
    private com.squareup.okhttp.Call getTemplateContextCall(String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling getTemplateContext(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/templates/{templateId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get template context
     * Get an existing template context
     * @param templateId The template context name unique for your environment (required)
     * @return TemplateContextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateContextResponse getTemplateContext(String templateId) throws ApiException {
        ApiResponse<TemplateContextResponse> resp = getTemplateContextWithHttpInfo(templateId);
        return resp.getData();
    }

    /**
     * Get template context
     * Get an existing template context
     * @param templateId The template context name unique for your environment (required)
     * @return ApiResponse&lt;TemplateContextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateContextResponse> getTemplateContextWithHttpInfo(String templateId) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateContextCall(templateId, null, null);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get template context (asynchronously)
     * Get an existing template context
     * @param templateId The template context name unique for your environment (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateContextAsync(String templateId, final ApiCallback<TemplateContextResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTemplateContextCall(templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTemplateContext */
    private com.squareup.okhttp.Call updateTemplateContextCall(TemplateContext templateContext, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = templateContext;
        
        // verify the required parameter 'templateContext' is set
        if (templateContext == null) {
            throw new ApiException("Missing the required parameter 'templateContext' when calling updateTemplateContext(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/templates".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update template context
     * Update an existing template context for your environment
     * @param templateContext templateContext (required)
     * @return TemplateContextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateContextResponse updateTemplateContext(TemplateContext templateContext) throws ApiException {
        ApiResponse<TemplateContextResponse> resp = updateTemplateContextWithHttpInfo(templateContext);
        return resp.getData();
    }

    /**
     * Update template context
     * Update an existing template context for your environment
     * @param templateContext templateContext (required)
     * @return ApiResponse&lt;TemplateContextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateContextResponse> updateTemplateContextWithHttpInfo(TemplateContext templateContext) throws ApiException {
        com.squareup.okhttp.Call call = updateTemplateContextCall(templateContext, null, null);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update template context (asynchronously)
     * Update an existing template context for your environment
     * @param templateContext templateContext (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTemplateContextAsync(TemplateContext templateContext, final ApiCallback<TemplateContextResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateTemplateContextCall(templateContext, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for uploadTemplateFile */
    private com.squareup.okhttp.Call uploadTemplateFileCall(String templateId, File stream, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling uploadTemplateFile(Async)");
        }
        
        // verify the required parameter 'stream' is set
        if (stream == null) {
            throw new ApiException("Missing the required parameter 'stream' when calling uploadTemplateFile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/templates/{templateId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (stream != null)
        localVarFormParams.put("stream", stream);

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Upload template file
     * Upload the Office template file
     * @param templateId The template context name unique for your environment (required)
     * @param stream The template (file/inputstream) to store (required)
     * @return TemplateContextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemplateContextResponse uploadTemplateFile(String templateId, File stream) throws ApiException {
        ApiResponse<TemplateContextResponse> resp = uploadTemplateFileWithHttpInfo(templateId, stream);
        return resp.getData();
    }

    /**
     * Upload template file
     * Upload the Office template file
     * @param templateId The template context name unique for your environment (required)
     * @param stream The template (file/inputstream) to store (required)
     * @return ApiResponse&lt;TemplateContextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemplateContextResponse> uploadTemplateFileWithHttpInfo(String templateId, File stream) throws ApiException {
        com.squareup.okhttp.Call call = uploadTemplateFileCall(templateId, stream, null, null);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload template file (asynchronously)
     * Upload the Office template file
     * @param templateId The template context name unique for your environment (required)
     * @param stream The template (file/inputstream) to store (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadTemplateFileAsync(String templateId, File stream, final ApiCallback<TemplateContextResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadTemplateFileCall(templateId, stream, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemplateContextResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
