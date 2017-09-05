# TemplateApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

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
```java
// Import classes:
//import com.sphereon.sdk.template_processor.handler.ApiClient;
//import com.sphereon.sdk.template_processor.handler.ApiException;
//import com.sphereon.sdk.template_processor.handler.Configuration;
//import com.sphereon.sdk.template_processor.handler.auth.*;
//import com.sphereon.sdk.template_processor.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

TemplateApi apiInstance = new TemplateApi();
TemplateContextRequest templateRequest = new TemplateContextRequest(); // TemplateContextRequest | The template request
try {
    TemplateContextResponse result = apiInstance.createTemplateContext(templateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#createTemplateContext");
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
//import com.sphereon.sdk.template_processor.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

TemplateApi apiInstance = new TemplateApi();
String templateId = "templateId_example"; // String | templateId
try {
    TemplateContextResponse result = apiInstance.deleteTemplateContext(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#deleteTemplateContext");
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
//import com.sphereon.sdk.template_processor.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

TemplateApi apiInstance = new TemplateApi();
String templateId = "templateId_example"; // String | The template context name unique for your environment
try {
    TemplateContextResponse result = apiInstance.getTemplateContext(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#getTemplateContext");
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
//import com.sphereon.sdk.template_processor.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

TemplateApi apiInstance = new TemplateApi();
TemplateContext templateContext = new TemplateContext(); // TemplateContext | templateContext
try {
    TemplateContextResponse result = apiInstance.updateTemplateContext(templateContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#updateTemplateContext");
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
//import com.sphereon.sdk.template_processor.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

TemplateApi apiInstance = new TemplateApi();
String templateId = "templateId_example"; // String | The template context name unique for your environment
File stream = new File("/path/to/file.txt"); // File | The template (file/inputstream) to store
try {
    TemplateContextResponse result = apiInstance.uploadTemplateFile(templateId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#uploadTemplateFile");
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

