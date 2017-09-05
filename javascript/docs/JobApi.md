# TemplateProcessor.JobApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJob**](JobApi.md#getJob) | **GET** /template/processor/0.1/jobs/{jobId} | Job definition and state
[**getJobs**](JobApi.md#getJobs) | **GET** /template/processor/0.1/jobs | Get all jobs
[**getResultStreamById**](JobApi.md#getResultStreamById) | **PUT** /template/processor/0.1/jobs/{jobId}/result/file/{streamId} | Get the result file
[**getResultStreamsAsContainer**](JobApi.md#getResultStreamsAsContainer) | **PUT** /template/processor/0.1/jobs/{jobId}/result/container | Get the result file
[**submitJob**](JobApi.md#submitJob) | **PUT** /template/processor/0.1/jobs | Submit merge job for processing


<a name="getJob"></a>
# **getJob**
> MergeJobResponse getJob(jobId)

Job definition and state

Get the merge job definition and current state. Please not that you can differentiate based on http response status

### Example
```javascript
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.JobApi();

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
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.JobApi();

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
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.JobApi();

var jobId = "jobId_example"; // String | jobId

var streamId = "streamId_example"; // String | streamId

var opts = { 
  'outputSettings': new TemplateProcessor.OutputSettings() // OutputSettings | outputSettings
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
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.JobApi();

var jobId = "jobId_example"; // String | jobId

var opts = { 
  'outputSettings': new TemplateProcessor.OutputSettings() // OutputSettings | outputSettings
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

<a name="submitJob"></a>
# **submitJob**
> MergeJobResponse submitJob(mergesettings)

Submit merge job for processing

Submit merge job run.

### Example
```javascript
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.JobApi();

var mergesettings = new TemplateProcessor.MergeSettings(); // MergeSettings | The merge- and output settings


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

