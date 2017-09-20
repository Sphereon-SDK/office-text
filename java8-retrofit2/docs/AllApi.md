# AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDataSet**](AllApi.md#createDataSet) | **POST** template/processor/0.1/datasets | Store dataset
[**createTemplateContext**](AllApi.md#createTemplateContext) | **POST** template/processor/0.1/templates | Create template context
[**deleteDataSet**](AllApi.md#deleteDataSet) | **DELETE** template/processor/0.1/datasets/{dataSetId} | Delete a stored data set
[**deleteJob**](AllApi.md#deleteJob) | **DELETE** template/processor/0.1/jobs/{jobId} | Delete a job manually
[**deleteTemplateContext**](AllApi.md#deleteTemplateContext) | **DELETE** template/processor/0.1/templates/{templateId} | Delete template context
[**getJob**](AllApi.md#getJob) | **GET** template/processor/0.1/jobs/{jobId} | Job definition and state
[**getJobs**](AllApi.md#getJobs) | **GET** template/processor/0.1/jobs | Get all jobs
[**getResultStream**](AllApi.md#getResultStream) | **PUT** template/processor/0.1/jobs/{jobId}/result/stream | Get the result file
[**getResultStreamsAsContainer**](AllApi.md#getResultStreamsAsContainer) | **PUT** template/processor/0.1/jobs/{jobId}/result/container | Get the result file
[**getTemplateContext**](AllApi.md#getTemplateContext) | **GET** template/processor/0.1/templates/{templateId} | Get template context
[**submitJob**](AllApi.md#submitJob) | **PUT** template/processor/0.1/jobs | Submit merge job for processing
[**updateTemplateContext**](AllApi.md#updateTemplateContext) | **PUT** template/processor/0.1/templates | Update template context
[**uploadTemplateFile**](AllApi.md#uploadTemplateFile) | **POST** template/processor/0.1/templates/{templateId} | Upload template file


<a name="createDataSet"></a>
# **createDataSet**
> DataSetResponse createDataSet(payload)

Store dataset

Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String payload = "payload_example"; // String | The dates for the merge [   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   },   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   } ]
try {
    DataSetResponse result = apiInstance.createDataSet(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createDataSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | **String**| The dates for the merge [   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   },   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   } ] |

### Return type

[**DataSetResponse**](DataSetResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createTemplateContext"></a>
# **createTemplateContext**
> TemplateContextResponse createTemplateContext(templateRequest)

Create template context

Create a unique template context for your environment

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
TemplateContextRequest templateRequest = new TemplateContextRequest(); // TemplateContextRequest | The template request
try {
    TemplateContextResponse result = apiInstance.createTemplateContext(templateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createTemplateContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateRequest** | [**TemplateContextRequest**](TemplateContextRequest.md)| The template request |

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteDataSet"></a>
# **deleteDataSet**
> DataSetResponse deleteDataSet(dataSetId)

Delete a stored data set

Delete a stored data set

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String dataSetId = "dataSetId_example"; // String | dataSetId
try {
    DataSetResponse result = apiInstance.deleteDataSet(dataSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteDataSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataSetId** | **String**| dataSetId |

### Return type

[**DataSetResponse**](DataSetResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteJob"></a>
# **deleteJob**
> MergeJobResponse deleteJob(jobId)

Delete a job manually

Delete the merge job and all related files

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
try {
    MergeJobResponse result = apiInstance.deleteJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteJob");
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

<a name="deleteTemplateContext"></a>
# **deleteTemplateContext**
> TemplateContextResponse deleteTemplateContext(templateId)

Delete template context

Delete a template context with all history

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String templateId = "templateId_example"; // String | templateId
try {
    TemplateContextResponse result = apiInstance.deleteTemplateContext(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteTemplateContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| templateId |

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

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
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
try {
    MergeJobResponse result = apiInstance.getJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getJob");
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
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
List<String> status = Arrays.asList("status_example"); // List<String> | A list of status to filter on.
try {
    List<MergeJobResponse> result = apiInstance.getJobs(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getJobs");
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
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
ResultStreamRequest resultStreamRequest = new ResultStreamRequest(); // ResultStreamRequest | resultStreamRequest
try {
    byte[] result = apiInstance.getResultStream(jobId, resultStreamRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getResultStream");
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
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
OutputSettings outputSettings = new OutputSettings(); // OutputSettings | outputSettings
try {
    byte[] result = apiInstance.getResultStreamsAsContainer(jobId, outputSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getResultStreamsAsContainer");
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

<a name="getTemplateContext"></a>
# **getTemplateContext**
> TemplateContextResponse getTemplateContext(templateId)

Get template context

Get an existing template context

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String templateId = "templateId_example"; // String | The template context name unique for your environment
try {
    TemplateContextResponse result = apiInstance.getTemplateContext(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getTemplateContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| The template context name unique for your environment |

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

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
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
MergeSettings mergesettings = new MergeSettings(); // MergeSettings | The merge- and output settings
try {
    MergeJobResponse result = apiInstance.submitJob(mergesettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#submitJob");
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

<a name="updateTemplateContext"></a>
# **updateTemplateContext**
> TemplateContextResponse updateTemplateContext(templateContext)

Update template context

Update an existing template context for your environment

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
TemplateContext templateContext = new TemplateContext(); // TemplateContext | templateContext
try {
    TemplateContextResponse result = apiInstance.updateTemplateContext(templateContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#updateTemplateContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateContext** | [**TemplateContext**](TemplateContext.md)| templateContext |

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="uploadTemplateFile"></a>
# **uploadTemplateFile**
> TemplateContextResponse uploadTemplateFile(templateId, stream)

Upload template file

Upload the Office template file

### Example
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String templateId = "templateId_example"; // String | The template context name unique for your environment
File stream = new File("/path/to/file.txt"); // File | The template (file/inputstream) to store
try {
    TemplateContextResponse result = apiInstance.uploadTemplateFile(templateId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#uploadTemplateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| The template context name unique for your environment |
 **stream** | **File**| The template (file/inputstream) to store |

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

