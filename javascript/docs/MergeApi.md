# OfficeTextMerge.MergeApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDataSet**](MergeApi.md#createDataSet) | **POST** /template-processor/merge/0.1/datasets | Store dataset
[**createTemplateContext**](MergeApi.md#createTemplateContext) | **POST** /template-processor/merge/0.1/templates | Create template context
[**deleteDataSet**](MergeApi.md#deleteDataSet) | **DELETE** /template-processor/merge/0.1/datasets/{dataSetId} | Delete a stored data set
[**deleteJob**](MergeApi.md#deleteJob) | **DELETE** /template-processor/merge/0.1/jobs/{jobId} | Delete a job manually
[**deleteTemplateContext**](MergeApi.md#deleteTemplateContext) | **DELETE** /template-processor/merge/0.1/templates/{templateId} | Delete template context
[**getJob**](MergeApi.md#getJob) | **GET** /template-processor/merge/0.1/jobs/{jobId} | Job definition and state
[**getJobs**](MergeApi.md#getJobs) | **GET** /template-processor/merge/0.1/jobs | Get all jobs
[**getResultStreamById**](MergeApi.md#getResultStreamById) | **PUT** /template-processor/merge/0.1/jobs/{jobId}/result/file/{streamId} | Get the result file
[**getResultStreamsAsContainer**](MergeApi.md#getResultStreamsAsContainer) | **PUT** /template-processor/merge/0.1/jobs/{jobId}/result/container | Get the result file
[**getTemplateContext**](MergeApi.md#getTemplateContext) | **GET** /template-processor/merge/0.1/templates/{templateId} | Get template context
[**submitJob**](MergeApi.md#submitJob) | **PUT** /template-processor/merge/0.1/jobs | Submit merge job for processing
[**updateTemplateContext**](MergeApi.md#updateTemplateContext) | **PUT** /template-processor/merge/0.1/templates | Update template context
[**uploadTemplateFile**](MergeApi.md#uploadTemplateFile) | **POST** /template-processor/merge/0.1/templates/{templateId} | Upload template file


<a name="createDataSet"></a>
# **createDataSet**
> DataSetResponse createDataSet(payload)

Store dataset

Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.

### Example
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var payload = "payload_example"; // String | The dates for the merge [   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   },   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   } ]


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createDataSet(payload, callback);
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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var templateRequest = new OfficeTextMerge.TemplateContextRequest(); // TemplateContextRequest | The template request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createTemplateContext(templateRequest, callback);
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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var dataSetId = "dataSetId_example"; // String | dataSetId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteDataSet(dataSetId, callback);
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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var jobId = "jobId_example"; // String | jobId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteJob(jobId, callback);
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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var templateId = "templateId_example"; // String | templateId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteTemplateContext(templateId, callback);
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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var jobId = "jobId_example"; // String | jobId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getJob(jobId, callback);
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
> [MergeJobResponse] getJobs(opts)

Get all jobs

Get all office text job definitions and their current state.

### Example
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var opts = { 
  'status': ["status_example"] // [String] | A list of status to filter on.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getJobs(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**[String]**](String.md)| A list of status to filter on. | [optional] 

### Return type

[**[MergeJobResponse]**](MergeJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getResultStreamById"></a>
# **getResultStreamById**
> &#39;String&#39; getResultStreamById(jobId, streamId, opts)

Get the result file

Get a merge result document as a binary stream.   

### Example
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var jobId = "jobId_example"; // String | jobId

var streamId = "streamId_example"; // String | streamId

var opts = { 
  'outputSettings': new OfficeTextMerge.OutputSettings() // OutputSettings | outputSettings
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getResultStreamById(jobId, streamId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 
 **streamId** | **String**| streamId | 
 **outputSettings** | [**OutputSettings**](OutputSettings.md)| outputSettings | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

<a name="getResultStreamsAsContainer"></a>
# **getResultStreamsAsContainer**
> &#39;String&#39; getResultStreamsAsContainer(jobId, opts)

Get the result file

Get all documents inside a compressed container as a binary stream.   

### Example
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var jobId = "jobId_example"; // String | jobId

var opts = { 
  'outputSettings': new OfficeTextMerge.OutputSettings() // OutputSettings | outputSettings
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getResultStreamsAsContainer(jobId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 
 **outputSettings** | [**OutputSettings**](OutputSettings.md)| outputSettings | [optional] 

### Return type

**&#39;String&#39;**

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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var templateId = "templateId_example"; // String | The template context name unique for your environment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTemplateContext(templateId, callback);
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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var mergesettings = new OfficeTextMerge.MergeSettings(); // MergeSettings | The merge- and output settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.submitJob(mergesettings, callback);
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
> TemplateContextResponse updateTemplateContext(templateContextRequest)

Update template context

Update an existing template context for your environment

### Example
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var templateContextRequest = new OfficeTextMerge.TemplateContextRequest(); // TemplateContextRequest | templateContextRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateTemplateContext(templateContextRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateContextRequest** | [**TemplateContextRequest**](TemplateContextRequest.md)| templateContextRequest | 

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
```javascript
var OfficeTextMerge = require('office_text_merge');
var defaultClient = OfficeTextMerge.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OfficeTextMerge.MergeApi();

var templateId = "templateId_example"; // String | The template context name unique for your environment

var stream = "/path/to/file.txt"; // File | The template (file/inputstream) to store


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.uploadTemplateFile(templateId, stream, callback);
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

