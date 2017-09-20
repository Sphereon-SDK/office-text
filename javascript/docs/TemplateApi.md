# TemplateProcessor.TemplateApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplateContext**](TemplateApi.md#createTemplateContext) | **POST** /template/processor/0.1/templates | Create template context
[**deleteTemplateContext**](TemplateApi.md#deleteTemplateContext) | **DELETE** /template/processor/0.1/templates/{templateId} | Delete template context
[**getTemplateContext**](TemplateApi.md#getTemplateContext) | **GET** /template/processor/0.1/templates/{templateId} | Get template context
[**updateTemplateContext**](TemplateApi.md#updateTemplateContext) | **PUT** /template/processor/0.1/templates | Update template context
[**uploadTemplateFile**](TemplateApi.md#uploadTemplateFile) | **POST** /template/processor/0.1/templates/{templateId} | Upload template file


<a name="createTemplateContext"></a>
# **createTemplateContext**
> TemplateContextResponse createTemplateContext(templateRequest)

Create template context

Create a unique template context for your environment

### Example
```javascript
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.TemplateApi();

var templateRequest = new TemplateProcessor.TemplateContextRequest(); // TemplateContextRequest | The template request


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

<a name="deleteTemplateContext"></a>
# **deleteTemplateContext**
> TemplateContextResponse deleteTemplateContext(templateId)

Delete template context

Delete a template context with all history

### Example
```javascript
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.TemplateApi();

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

<a name="getTemplateContext"></a>
# **getTemplateContext**
> TemplateContextResponse getTemplateContext(templateId)

Get template context

Get an existing template context

### Example
```javascript
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.TemplateApi();

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

<a name="updateTemplateContext"></a>
# **updateTemplateContext**
> TemplateContextResponse updateTemplateContext(templateContext)

Update template context

Update an existing template context for your environment

### Example
```javascript
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.TemplateApi();

var templateContext = new TemplateProcessor.TemplateContext(); // TemplateContext | templateContext


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateTemplateContext(templateContext, callback);
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
```javascript
var TemplateProcessor = require('template_processor');
var defaultClient = TemplateProcessor.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new TemplateProcessor.TemplateApi();

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

