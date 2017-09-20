# Sphereon.SDK.TemplateProcessor.Api.JobApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetJob**](JobApi.md#getjob) | **GET** /template/processor/0.1/jobs/{jobId} | Job definition and state
[**GetJobs**](JobApi.md#getjobs) | **GET** /template/processor/0.1/jobs | Get all jobs
[**GetResultStream**](JobApi.md#getresultstream) | **PUT** /template/processor/0.1/jobs/{jobId}/result/stream | Get the result file
[**GetResultStreamsAsContainer**](JobApi.md#getresultstreamsascontainer) | **PUT** /template/processor/0.1/jobs/{jobId}/result/container | Get the result file
[**SubmitJob**](JobApi.md#submitjob) | **PUT** /template/processor/0.1/jobs | Submit merge job for processing


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

            var apiInstance = new JobApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Job definition and state
                MergeJobResponse result = apiInstance.GetJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.GetJob: " + e.Message );
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

            var apiInstance = new JobApi();
            var status = new List<string>(); // List<string> | A list of status to filter on. (optional) 

            try
            {
                // Get all jobs
                List&lt;MergeJobResponse&gt; result = apiInstance.GetJobs(status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.GetJobs: " + e.Message );
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

            var apiInstance = new JobApi();
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
                Debug.Print("Exception when calling JobApi.GetResultStream: " + e.Message );
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

            var apiInstance = new JobApi();
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
                Debug.Print("Exception when calling JobApi.GetResultStreamsAsContainer: " + e.Message );
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

            var apiInstance = new JobApi();
            var mergesettings = new MergeSettings(); // MergeSettings | The merge- and output settings

            try
            {
                // Submit merge job for processing
                MergeJobResponse result = apiInstance.SubmitJob(mergesettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.SubmitJob: " + e.Message );
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

