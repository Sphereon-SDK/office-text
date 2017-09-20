# JobApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJob**](JobApi.md#getJob) | **GET** template/processor/0.1/jobs/{jobId} | Job definition and state
[**getJobs**](JobApi.md#getJobs) | **GET** template/processor/0.1/jobs | Get all jobs
[**getResultStream**](JobApi.md#getResultStream) | **PUT** template/processor/0.1/jobs/{jobId}/result/stream | Get the result file
[**getResultStreamsAsContainer**](JobApi.md#getResultStreamsAsContainer) | **PUT** template/processor/0.1/jobs/{jobId}/result/container | Get the result file
[**submitJob**](JobApi.md#submitJob) | **PUT** template/processor/0.1/jobs | Submit merge job for processing


<a name="getJob"></a>
# **getJob**
> MergeJobResponse getJob(jobId)

Job definition and state

Get the merge job definition and current state. Please not that you can differentiate based on http response status

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
try {
    MergeJobResponse result = apiInstance.getJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId |

### Return type

[**MergeJobResponse**](MergeJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getJobs"></a>
# **getJobs**
> List&lt;MergeJobResponse&gt; getJobs(status)

Get all jobs

Get all office text job definitions and their current state.

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

JobApi apiInstance = new JobApi();
List<String> status = Arrays.asList("status_example"); // List<String> | A list of status to filter on.
try {
    List<MergeJobResponse> result = apiInstance.getJobs(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;String&gt;**](String.md)| A list of status to filter on. | [optional] [enum: CREATED, UPDATED, PROCESSING, DONE, ERROR, DELETED]

### Return type

[**List&lt;MergeJobResponse&gt;**](MergeJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getResultStream"></a>
# **getResultStream**
> byte[] getResultStream(jobId, resultStreamRequest)

Get the result file

Get a merge result document as a binary stream.   

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
ResultStreamRequest resultStreamRequest = new ResultStreamRequest(); // ResultStreamRequest | resultStreamRequest
try {
    byte[] result = apiInstance.getResultStream(jobId, resultStreamRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getResultStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId |
 **resultStreamRequest** | [**ResultStreamRequest**](ResultStreamRequest.md)| resultStreamRequest |

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

<a name="getResultStreamsAsContainer"></a>
# **getResultStreamsAsContainer**
> byte[] getResultStreamsAsContainer(jobId, outputSettings)

Get the result file

Get all documents inside a compressed container as a binary stream.   

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
OutputSettings outputSettings = new OutputSettings(); // OutputSettings | outputSettings
try {
    byte[] result = apiInstance.getResultStreamsAsContainer(jobId, outputSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getResultStreamsAsContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId |
 **outputSettings** | [**OutputSettings**](OutputSettings.md)| outputSettings | [optional]

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

<a name="submitJob"></a>
# **submitJob**
> MergeJobResponse submitJob(mergesettings)

Submit merge job for processing

Submit merge job run.

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

JobApi apiInstance = new JobApi();
MergeSettings mergesettings = new MergeSettings(); // MergeSettings | The merge- and output settings
try {
    MergeJobResponse result = apiInstance.submitJob(mergesettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#submitJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mergesettings** | [**MergeSettings**](MergeSettings.md)| The merge- and output settings |

### Return type

[**MergeJobResponse**](MergeJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

