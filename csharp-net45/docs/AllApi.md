# Sphereon.SDK.TemplateProcessor.Api.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDataSet**](AllApi.md#createdataset) | **POST** /template/processor/0.1/datasets | Store dataset
[**CreateTemplateContext**](AllApi.md#createtemplatecontext) | **POST** /template/processor/0.1/templates | Create template context
[**DeleteDataSet**](AllApi.md#deletedataset) | **DELETE** /template/processor/0.1/datasets/{dataSetId} | Delete a stored data set
[**DeleteJob**](AllApi.md#deletejob) | **DELETE** /template/processor/0.1/jobs/{jobId} | Delete a job manually
[**DeleteTemplateContext**](AllApi.md#deletetemplatecontext) | **DELETE** /template/processor/0.1/templates/{templateId} | Delete template context
[**GetJob**](AllApi.md#getjob) | **GET** /template/processor/0.1/jobs/{jobId} | Job definition and state
[**GetJobs**](AllApi.md#getjobs) | **GET** /template/processor/0.1/jobs | Get all jobs
[**GetResultStream**](AllApi.md#getresultstream) | **PUT** /template/processor/0.1/jobs/{jobId}/result/stream | Get the result file
[**GetResultStreamsAsContainer**](AllApi.md#getresultstreamsascontainer) | **PUT** /template/processor/0.1/jobs/{jobId}/result/container | Get the result file
[**GetTemplateContext**](AllApi.md#gettemplatecontext) | **GET** /template/processor/0.1/templates/{templateId} | Get template context
[**SubmitJob**](AllApi.md#submitjob) | **PUT** /template/processor/0.1/jobs | Submit merge job for processing
[**UpdateTemplateContext**](AllApi.md#updatetemplatecontext) | **PUT** /template/processor/0.1/templates | Update template context
[**UploadTemplateFile**](AllApi.md#uploadtemplatefile) | **POST** /template/processor/0.1/templates/{templateId} | Upload template file


<a name="createdataset"></a>
# **CreateDataSet**
> DataSetResponse CreateDataSet (string payload)

Store dataset

Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class CreateDataSetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var payload = payload_example;  // string | The dates for the merge [   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   },   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   } ]

            try
            {
                // Store dataset
                DataSetResponse result = apiInstance.CreateDataSet(payload);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateDataSet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | **string**| The dates for the merge [   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   },   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   } ] | 

### Return type

[**DataSetResponse**](DataSetResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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

            var apiInstance = new AllApi();
            var templateRequest = new TemplateContextRequest(); // TemplateContextRequest | The template request

            try
            {
                // Create template context
                TemplateContextResponse result = apiInstance.CreateTemplateContext(templateRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateTemplateContext: " + e.Message );
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

<a name="deletedataset"></a>
# **DeleteDataSet**
> DataSetResponse DeleteDataSet (string dataSetId)

Delete a stored data set

Delete a stored data set

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class DeleteDataSetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var dataSetId = dataSetId_example;  // string | dataSetId

            try
            {
                // Delete a stored data set
                DataSetResponse result = apiInstance.DeleteDataSet(dataSetId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.DeleteDataSet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataSetId** | **string**| dataSetId | 

### Return type

[**DataSetResponse**](DataSetResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletejob"></a>
# **DeleteJob**
> MergeJobResponse DeleteJob (string jobId)

Delete a job manually

Delete the merge job and all related files

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class DeleteJobExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Delete a job manually
                MergeJobResponse result = apiInstance.DeleteJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.DeleteJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 

### Return type

[**MergeJobResponse**](MergeJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
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

            var apiInstance = new AllApi();
            var templateId = templateId_example;  // string | templateId

            try
            {
                // Delete template context
                TemplateContextResponse result = apiInstance.DeleteTemplateContext(templateId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.DeleteTemplateContext: " + e.Message );
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

<a name="getjob"></a>
# **GetJob**
> MergeJobResponse GetJob (string jobId)

Job definition and state

Get the merge job definition and current state. Please not that you can differentiate based on http response status

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class GetJobExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Job definition and state
                MergeJobResponse result = apiInstance.GetJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 

### Return type

[**MergeJobResponse**](MergeJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getjobs"></a>
# **GetJobs**
> List<MergeJobResponse> GetJobs (List<string> status = null)

Get all jobs

Get all office text job definitions and their current state.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class GetJobsExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var status = new List<string>(); // List<string> | A list of status to filter on. (optional) 

            try
            {
                // Get all jobs
                List&lt;MergeJobResponse&gt; result = apiInstance.GetJobs(status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetJobs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;string&gt;**](string.md)| A list of status to filter on. | [optional] 

### Return type

[**List<MergeJobResponse>**](MergeJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getresultstream"></a>
# **GetResultStream**
> byte[] GetResultStream (string jobId, ResultStreamRequest resultStreamRequest)

Get the result file

Get a merge result document as a binary stream.   

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class GetResultStreamExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId
            var resultStreamRequest = new ResultStreamRequest(); // ResultStreamRequest | resultStreamRequest

            try
            {
                // Get the result file
                byte[] result = apiInstance.GetResultStream(jobId, resultStreamRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetResultStream: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 
 **resultStreamRequest** | [**ResultStreamRequest**](ResultStreamRequest.md)| resultStreamRequest | 

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getresultstreamsascontainer"></a>
# **GetResultStreamsAsContainer**
> byte[] GetResultStreamsAsContainer (string jobId, OutputSettings outputSettings = null)

Get the result file

Get all documents inside a compressed container as a binary stream.   

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class GetResultStreamsAsContainerExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId
            var outputSettings = new OutputSettings(); // OutputSettings | outputSettings (optional) 

            try
            {
                // Get the result file
                byte[] result = apiInstance.GetResultStreamsAsContainer(jobId, outputSettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetResultStreamsAsContainer: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 
 **outputSettings** | [**OutputSettings**](OutputSettings.md)| outputSettings | [optional] 

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

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

            var apiInstance = new AllApi();
            var templateId = templateId_example;  // string | The template context name unique for your environment

            try
            {
                // Get template context
                TemplateContextResponse result = apiInstance.GetTemplateContext(templateId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetTemplateContext: " + e.Message );
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

<a name="submitjob"></a>
# **SubmitJob**
> MergeJobResponse SubmitJob (MergeSettings mergesettings)

Submit merge job for processing

Submit merge job run.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.TemplateProcessor.Api;
using Sphereon.SDK.TemplateProcessor.Client;
using Sphereon.SDK.TemplateProcessor.Model;

namespace Example
{
    public class SubmitJobExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var mergesettings = new MergeSettings(); // MergeSettings | The merge- and output settings

            try
            {
                // Submit merge job for processing
                MergeJobResponse result = apiInstance.SubmitJob(mergesettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.SubmitJob: " + e.Message );
            }
        }
    }
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

            var apiInstance = new AllApi();
            var templateContext = new TemplateContext(); // TemplateContext | templateContext

            try
            {
                // Update template context
                TemplateContextResponse result = apiInstance.UpdateTemplateContext(templateContext);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.UpdateTemplateContext: " + e.Message );
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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.UploadTemplateFile: " + e.Message );
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

