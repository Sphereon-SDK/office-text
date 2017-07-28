# template-processor-sdk-java8-jersey2

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
    <artifactId>template-processor-sdk-java8-jersey2</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:template-processor-sdk-java8-jersey2:0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/template-processor-sdk-java8-jersey2-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.template_processor.handler.*;
import com.sphereon.sdk.template_processor.handler.auth.*;
import com.sphereon.sdk.template_processor.model.*;
import com.sphereon.sdk.template_processor.api.MergeApi;

import java.io.File;
import java.util.*;

public class MergeApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        MergeApi apiInstance = new MergeApi();
        String payload = "payload_example"; // String | The dates for the merge [   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   },   {     \"Field1\": \"Field1 value\",     \"Field2\": \"Field2 value\",   } ]
        try {
            DataSetResponse result = apiInstance.createDataSet(payload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MergeApi#createDataSet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MergeApi* | [**createDataSet**](docs/MergeApi.md#createDataSet) | **POST** /template-processor/merge/0.1/datasets | Store dataset
*MergeApi* | [**createTemplateContext**](docs/MergeApi.md#createTemplateContext) | **POST** /template-processor/merge/0.1/templates | Create template context
*MergeApi* | [**deleteDataSet**](docs/MergeApi.md#deleteDataSet) | **DELETE** /template-processor/merge/0.1/datasets/{dataSetId} | Delete a stored data set
*MergeApi* | [**deleteJob**](docs/MergeApi.md#deleteJob) | **DELETE** /template-processor/merge/0.1/jobs/{jobId} | Delete a job manually
*MergeApi* | [**deleteTemplateContext**](docs/MergeApi.md#deleteTemplateContext) | **DELETE** /template-processor/merge/0.1/templates/{templateId} | Delete template context
*MergeApi* | [**getJob**](docs/MergeApi.md#getJob) | **GET** /template-processor/merge/0.1/jobs/{jobId} | Job definition and state
*MergeApi* | [**getJobs**](docs/MergeApi.md#getJobs) | **GET** /template-processor/merge/0.1/jobs | Get all jobs
*MergeApi* | [**getResultStreamById**](docs/MergeApi.md#getResultStreamById) | **PUT** /template-processor/merge/0.1/jobs/{jobId}/result/file/{streamId} | Get the result file
*MergeApi* | [**getResultStreamsAsContainer**](docs/MergeApi.md#getResultStreamsAsContainer) | **PUT** /template-processor/merge/0.1/jobs/{jobId}/result/container | Get the result file
*MergeApi* | [**getTemplateContext**](docs/MergeApi.md#getTemplateContext) | **GET** /template-processor/merge/0.1/templates/{templateId} | Get template context
*MergeApi* | [**submitJob**](docs/MergeApi.md#submitJob) | **PUT** /template-processor/merge/0.1/jobs | Submit merge job for processing
*MergeApi* | [**updateTemplateContext**](docs/MergeApi.md#updateTemplateContext) | **PUT** /template-processor/merge/0.1/templates | Update template context
*MergeApi* | [**uploadTemplateFile**](docs/MergeApi.md#uploadTemplateFile) | **POST** /template-processor/merge/0.1/templates/{templateId} | Upload template file


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

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

