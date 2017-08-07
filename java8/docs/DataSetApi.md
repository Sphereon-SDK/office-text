# DataSetApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDataSet**](DataSetApi.md#createDataSet) | **POST** /template/processor/0.1/datasets | Store dataset
[**deleteDataSet**](DataSetApi.md#deleteDataSet) | **DELETE** /template/processor/0.1/datasets/{dataSetId} | Delete a stored data set


<a name="createDataSet"></a>
# **createDataSet**
> DataSetResponse createDataSet(payload)

Store dataset

Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.

### Example
```java
// Import classes:
//import com.sphereon.sdk.template.processor.handler.ApiClient;
//import com.sphereon.sdk.template.processor.handler.ApiException;
//import com.sphereon.sdk.template.processor.handler.Configuration;
//import com.sphereon.sdk.template.processor.handler.auth.*;
//import com.sphereon.sdk.template.processor.api.DataSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

DataSetApi apiInstance = new DataSetApi();
String payload = "payload_example"; // String | The dates for the merge [   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   },   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   } ]
try {
    DataSetResponse result = apiInstance.createDataSet(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSetApi#createDataSet");
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

<a name="deleteDataSet"></a>
# **deleteDataSet**
> DataSetResponse deleteDataSet(dataSetId)

Delete a stored data set

Delete a stored data set

### Example
```java
// Import classes:
//import com.sphereon.sdk.template.processor.handler.ApiClient;
//import com.sphereon.sdk.template.processor.handler.ApiException;
//import com.sphereon.sdk.template.processor.handler.Configuration;
//import com.sphereon.sdk.template.processor.handler.auth.*;
//import com.sphereon.sdk.template.processor.api.DataSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

DataSetApi apiInstance = new DataSetApi();
String dataSetId = "dataSetId_example"; // String | dataSetId
try {
    DataSetResponse result = apiInstance.deleteDataSet(dataSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSetApi#deleteDataSet");
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

