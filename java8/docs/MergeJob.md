
# MergeJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultFolderPath** | **String** | The target folder path of result files |  [optional]
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | The completion date/time of this job in ISO 8601 format |  [optional]
**jobId** | **String** | The server generated job jobId. This jobId is checked against the jobId in the request path on every invocation | 
**resultContainerId** | **String** | The target container id of result files |  [optional]
**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date/time of this job in ISO 8601 format |  [optional]
**dataSetId** | **String** | Data set id |  [optional]
**resultStreams** | [**List&lt;StreamLocation&gt;**](StreamLocation.md) | The storage locations of the result files. | 
**headerDataSetIds** | **List&lt;String&gt;** | Header data set ids |  [optional]
**mergeSettings** | [**MergeSettings**](MergeSettings.md) |  |  [optional]
**statusMessage** | **String** | A status message, which can be informational, warning or error. A message here does not indicate an error perse |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the job | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
UPDATED | &quot;UPDATED&quot;
PROCESSING | &quot;PROCESSING&quot;
DONE | &quot;DONE&quot;
ERROR | &quot;ERROR&quot;
DELETED | &quot;DELETED&quot;



