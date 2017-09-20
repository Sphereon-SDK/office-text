# Sphereon.SDK.TemplateProcessor.Api.TemplateApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateTemplateContext**](TemplateApi.md#createtemplatecontext) | **POST** /template/processor/0.1/templates | Create template context
[**DeleteTemplateContext**](TemplateApi.md#deletetemplatecontext) | **DELETE** /template/processor/0.1/templates/{templateId} | Delete template context
[**GetTemplateContext**](TemplateApi.md#gettemplatecontext) | **GET** /template/processor/0.1/templates/{templateId} | Get template context
[**UpdateTemplateContext**](TemplateApi.md#updatetemplatecontext) | **PUT** /template/processor/0.1/templates | Update template context
[**UploadTemplateFile**](TemplateApi.md#uploadtemplatefile) | **POST** /template/processor/0.1/templates/{templateId} | Upload template file


<a name="createtemplatecontext"></a>
# **CreateTemplateContext**
> TemplateContextResponse CreateTemplateContext (TemplateContextRequest templateRequest)

Create template context

Create a unique template context for your environment

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class CreateTemplateContextExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TemplateApi();
            var templateRequest = new TemplateContextRequest(); // TemplateContextRequest | The template request

            try
            {
                // Create template context
                TemplateContextResponse result = apiInstance.CreateTemplateContext(templateRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TemplateApi.CreateTemplateContext: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletetemplatecontext"></a>
# **DeleteTemplateContext**
> TemplateContextResponse DeleteTemplateContext (string templateId)

Delete template context

Delete a template context with all history

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class DeleteTemplateContextExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TemplateApi();
            var templateId = templateId_example;  // string | templateId

            try
            {
                // Delete template context
                TemplateContextResponse result = apiInstance.DeleteTemplateContext(templateId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TemplateApi.DeleteTemplateContext: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string**| templateId | 

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettemplatecontext"></a>
# **GetTemplateContext**
> TemplateContextResponse GetTemplateContext (string templateId)

Get template context

Get an existing template context

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class GetTemplateContextExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TemplateApi();
            var templateId = templateId_example;  // string | The template context name unique for your environment

            try
            {
                // Get template context
                TemplateContextResponse result = apiInstance.GetTemplateContext(templateId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TemplateApi.GetTemplateContext: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string**| The template context name unique for your environment | 

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatetemplatecontext"></a>
# **UpdateTemplateContext**
> TemplateContextResponse UpdateTemplateContext (TemplateContext templateContext)

Update template context

Update an existing template context for your environment

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class UpdateTemplateContextExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TemplateApi();
            var templateContext = new TemplateContext(); // TemplateContext | templateContext

            try
            {
                // Update template context
                TemplateContextResponse result = apiInstance.UpdateTemplateContext(templateContext);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TemplateApi.UpdateTemplateContext: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="uploadtemplatefile"></a>
# **UploadTemplateFile**
> TemplateContextResponse UploadTemplateFile (string templateId, System.IO.Stream stream)

Upload template file

Upload the Office template file

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class UploadTemplateFileExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TemplateApi();
            var templateId = templateId_example;  // string | The template context name unique for your environment
            var stream = new System.IO.Stream(); // System.IO.Stream | The template (file/inputstream) to store

            try
            {
                // Upload template file
                TemplateContextResponse result = apiInstance.UploadTemplateFile(templateId, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TemplateApi.UploadTemplateFile: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string**| The template context name unique for your environment | 
 **stream** | **System.IO.Stream**| The template (file/inputstream) to store | 

### Return type

[**TemplateContextResponse**](TemplateContextResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

