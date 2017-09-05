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

import com.sphereon.sdk.template_processor.model.MergeJobResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;
import com.sphereon.sdk.template_processor.model.OutputSettings;
import com.sphereon.sdk.template_processor.model.MergeSettings;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /* Build call for getJob */
    private com.squareup.okhttp.Call getJobCall(String jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJob(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/jobs/{jobId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Job definition and state
     * Get the merge job definition and current state. Please not that you can differentiate based on http response status
     * @param jobId jobId (required)
     * @return MergeJobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MergeJobResponse getJob(String jobId) throws ApiException {
        ApiResponse<MergeJobResponse> resp = getJobWithHttpInfo(jobId);
        return resp.getData();
    }

    /**
     * Job definition and state
     * Get the merge job definition and current state. Please not that you can differentiate based on http response status
     * @param jobId jobId (required)
     * @return ApiResponse&lt;MergeJobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MergeJobResponse> getJobWithHttpInfo(String jobId) throws ApiException {
        com.squareup.okhttp.Call call = getJobCall(jobId, null, null);
        Type localVarReturnType = new TypeToken<MergeJobResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Job definition and state (asynchronously)
     * Get the merge job definition and current state. Please not that you can differentiate based on http response status
     * @param jobId jobId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobAsync(String jobId, final ApiCallback<MergeJobResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobCall(jobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MergeJobResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getJobs */
    private com.squareup.okhttp.Call getJobsCall(List<String> status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/jobs".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));

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
     * Get all jobs
     * Get all office text job definitions and their current state.
     * @param status A list of status to filter on. (optional)
     * @return List&lt;MergeJobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MergeJobResponse> getJobs(List<String> status) throws ApiException {
        ApiResponse<List<MergeJobResponse>> resp = getJobsWithHttpInfo(status);
        return resp.getData();
    }

    /**
     * Get all jobs
     * Get all office text job definitions and their current state.
     * @param status A list of status to filter on. (optional)
     * @return ApiResponse&lt;List&lt;MergeJobResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MergeJobResponse>> getJobsWithHttpInfo(List<String> status) throws ApiException {
        com.squareup.okhttp.Call call = getJobsCall(status, null, null);
        Type localVarReturnType = new TypeToken<List<MergeJobResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all jobs (asynchronously)
     * Get all office text job definitions and their current state.
     * @param status A list of status to filter on. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobsAsync(List<String> status, final ApiCallback<List<MergeJobResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobsCall(status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MergeJobResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getResultStreamById */
    private com.squareup.okhttp.Call getResultStreamByIdCall(String jobId, String streamId, OutputSettings outputSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = outputSettings;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getResultStreamById(Async)");
        }
        
        // verify the required parameter 'streamId' is set
        if (streamId == null) {
            throw new ApiException("Missing the required parameter 'streamId' when calling getResultStreamById(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/jobs/{jobId}/result/file/{streamId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
        .replaceAll("\\{" + "streamId" + "\\}", apiClient.escapeString(streamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
     * Get the result file
     * Get a merge result document as a binary stream.   
     * @param jobId jobId (required)
     * @param streamId streamId (required)
     * @param outputSettings outputSettings (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] getResultStreamById(String jobId, String streamId, OutputSettings outputSettings) throws ApiException {
        ApiResponse<byte[]> resp = getResultStreamByIdWithHttpInfo(jobId, streamId, outputSettings);
        return resp.getData();
    }

    /**
     * Get the result file
     * Get a merge result document as a binary stream.   
     * @param jobId jobId (required)
     * @param streamId streamId (required)
     * @param outputSettings outputSettings (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> getResultStreamByIdWithHttpInfo(String jobId, String streamId, OutputSettings outputSettings) throws ApiException {
        com.squareup.okhttp.Call call = getResultStreamByIdCall(jobId, streamId, outputSettings, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the result file (asynchronously)
     * Get a merge result document as a binary stream.   
     * @param jobId jobId (required)
     * @param streamId streamId (required)
     * @param outputSettings outputSettings (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getResultStreamByIdAsync(String jobId, String streamId, OutputSettings outputSettings, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getResultStreamByIdCall(jobId, streamId, outputSettings, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getResultStreamsAsContainer */
    private com.squareup.okhttp.Call getResultStreamsAsContainerCall(String jobId, OutputSettings outputSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = outputSettings;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getResultStreamsAsContainer(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/jobs/{jobId}/result/container".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
     * Get the result file
     * Get all documents inside a compressed container as a binary stream.   
     * @param jobId jobId (required)
     * @param outputSettings outputSettings (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] getResultStreamsAsContainer(String jobId, OutputSettings outputSettings) throws ApiException {
        ApiResponse<byte[]> resp = getResultStreamsAsContainerWithHttpInfo(jobId, outputSettings);
        return resp.getData();
    }

    /**
     * Get the result file
     * Get all documents inside a compressed container as a binary stream.   
     * @param jobId jobId (required)
     * @param outputSettings outputSettings (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> getResultStreamsAsContainerWithHttpInfo(String jobId, OutputSettings outputSettings) throws ApiException {
        com.squareup.okhttp.Call call = getResultStreamsAsContainerCall(jobId, outputSettings, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the result file (asynchronously)
     * Get all documents inside a compressed container as a binary stream.   
     * @param jobId jobId (required)
     * @param outputSettings outputSettings (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getResultStreamsAsContainerAsync(String jobId, OutputSettings outputSettings, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getResultStreamsAsContainerCall(jobId, outputSettings, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for submitJob */
    private com.squareup.okhttp.Call submitJobCall(MergeSettings mergesettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = mergesettings;
        
        // verify the required parameter 'mergesettings' is set
        if (mergesettings == null) {
            throw new ApiException("Missing the required parameter 'mergesettings' when calling submitJob(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/template/processor/0.1/jobs".replaceAll("\\{format\\}","json");

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
     * Submit merge job for processing
     * Submit merge job run.
     * @param mergesettings The merge- and output settings (required)
     * @return MergeJobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MergeJobResponse submitJob(MergeSettings mergesettings) throws ApiException {
        ApiResponse<MergeJobResponse> resp = submitJobWithHttpInfo(mergesettings);
        return resp.getData();
    }

    /**
     * Submit merge job for processing
     * Submit merge job run.
     * @param mergesettings The merge- and output settings (required)
     * @return ApiResponse&lt;MergeJobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MergeJobResponse> submitJobWithHttpInfo(MergeSettings mergesettings) throws ApiException {
        com.squareup.okhttp.Call call = submitJobCall(mergesettings, null, null);
        Type localVarReturnType = new TypeToken<MergeJobResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit merge job for processing (asynchronously)
     * Submit merge job run.
     * @param mergesettings The merge- and output settings (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitJobAsync(MergeSettings mergesettings, final ApiCallback<MergeJobResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = submitJobCall(mergesettings, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MergeJobResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
