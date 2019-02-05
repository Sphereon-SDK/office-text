# template-processor-sdk-java8

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sphereon.sdk</groupId>
    <artifactId>template-processor-sdk-java8</artifactId>
    <version>0.1.2-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:template-processor-sdk-java8:0.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/template-processor-sdk-java8-0.1.2-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.template.processor.handler.*;
import com.sphereon.sdk.template.processor.handler.auth.*;
import com.sphereon.sdk.template.processor.handler.model.*;
import com.sphereon.sdk.template.processor.api.AllApi;

import java.io.File;
import java.util.*;

public class AllApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**createDataSet**](docs/AllApi.md#createDataSet) | **POST** /template/processor/0.1/datasets | Store dataset
*AllApi* | [**createTemplateContext**](docs/AllApi.md#createTemplateContext) | **POST** /template/processor/0.1/templates | Create template context
*AllApi* | [**deleteDataSet**](docs/AllApi.md#deleteDataSet) | **DELETE** /template/processor/0.1/datasets/{dataSetId} | Delete a stored data set
*AllApi* | [**deleteJob**](docs/AllApi.md#deleteJob) | **DELETE** /template/processor/0.1/jobs/{jobId} | Delete a job manually
*AllApi* | [**deleteTemplateContext**](docs/AllApi.md#deleteTemplateContext) | **DELETE** /template/processor/0.1/templates/{templateId} | Delete template context
*AllApi* | [**getJob**](docs/AllApi.md#getJob) | **GET** /template/processor/0.1/jobs/{jobId} | Job definition and state
*AllApi* | [**getJobs**](docs/AllApi.md#getJobs) | **GET** /template/processor/0.1/jobs | Get all jobs
*AllApi* | [**getResultStreamById**](docs/AllApi.md#getResultStreamById) | **PUT** /template/processor/0.1/jobs/{jobId}/result/file/{streamId} | Get the result file
*AllApi* | [**getResultStreamsAsContainer**](docs/AllApi.md#getResultStreamsAsContainer) | **PUT** /template/processor/0.1/jobs/{jobId}/result/container | Get the result file
*AllApi* | [**getTemplateContext**](docs/AllApi.md#getTemplateContext) | **GET** /template/processor/0.1/templates/{templateId} | Get template context
*AllApi* | [**submitJob**](docs/AllApi.md#submitJob) | **PUT** /template/processor/0.1/jobs | Submit merge job for processing
*AllApi* | [**updateTemplateContext**](docs/AllApi.md#updateTemplateContext) | **PUT** /template/processor/0.1/templates | Update template context
*AllApi* | [**uploadTemplateFile**](docs/AllApi.md#uploadTemplateFile) | **POST** /template/processor/0.1/templates/{templateId} | Upload template file
*DataSetApi* | [**createDataSet**](docs/DataSetApi.md#createDataSet) | **POST** /template/processor/0.1/datasets | Store dataset
*DataSetApi* | [**deleteDataSet**](docs/DataSetApi.md#deleteDataSet) | **DELETE** /template/processor/0.1/datasets/{dataSetId} | Delete a stored data set
*JobApi* | [**getJob**](docs/JobApi.md#getJob) | **GET** /template/processor/0.1/jobs/{jobId} | Job definition and state
*JobApi* | [**getJobs**](docs/JobApi.md#getJobs) | **GET** /template/processor/0.1/jobs | Get all jobs
*JobApi* | [**getResultStreamById**](docs/JobApi.md#getResultStreamById) | **PUT** /template/processor/0.1/jobs/{jobId}/result/file/{streamId} | Get the result file
*JobApi* | [**getResultStreamsAsContainer**](docs/JobApi.md#getResultStreamsAsContainer) | **PUT** /template/processor/0.1/jobs/{jobId}/result/container | Get the result file
*JobApi* | [**submitJob**](docs/JobApi.md#submitJob) | **PUT** /template/processor/0.1/jobs | Submit merge job for processing
*TemplateApi* | [**createTemplateContext**](docs/TemplateApi.md#createTemplateContext) | **POST** /template/processor/0.1/templates | Create template context
*TemplateApi* | [**deleteTemplateContext**](docs/TemplateApi.md#deleteTemplateContext) | **DELETE** /template/processor/0.1/templates/{templateId} | Delete template context
*TemplateApi* | [**getTemplateContext**](docs/TemplateApi.md#getTemplateContext) | **GET** /template/processor/0.1/templates/{templateId} | Get template context
*TemplateApi* | [**updateTemplateContext**](docs/TemplateApi.md#updateTemplateContext) | **PUT** /template/processor/0.1/templates | Update template context
*TemplateApi* | [**uploadTemplateFile**](docs/TemplateApi.md#uploadTemplateFile) | **POST** /template/processor/0.1/templates/{templateId} | Upload template file


## Documentation for Models

 - [DataSetResponse](docs/DataSetResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Lifecycle](docs/Lifecycle.md)
 - [MergeJob](docs/MergeJob.md)
 - [MergeJobResponse](docs/MergeJobResponse.md)
 - [MergeSettings](docs/MergeSettings.md)
 - [OutputSettings](docs/OutputSettings.md)
 - [OwnerInfo](docs/OwnerInfo.md)
 - [StreamLocation](docs/StreamLocation.md)
 - [TemplateContext](docs/TemplateContext.md)
 - [TemplateContextRequest](docs/TemplateContextRequest.md)
 - [TemplateContextResponse](docs/TemplateContextResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

dev@sphereon.com

