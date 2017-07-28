# OfficeTextMerge.MergeJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultFolderPath** | **String** | The target folder path of result files | [optional] 
**completionTime** | **Date** | The completion date/time of this job in ISO 8601 format | [optional] 
**jobId** | **String** | The server generated job jobId. This jobId is checked against the jobId in the request path on every invocation | 
**resultContainerId** | **String** | The target container id of result files | [optional] 
**creationTime** | **Date** | The creation date/time of this job in ISO 8601 format | [optional] 
**dataSetId** | **String** | Data set id | [optional] 
**resultStreams** | [**[StreamLocation]**](StreamLocation.md) | The storage locations of the result files. | 
**headerDataSetIds** | **[String]** | Header data set ids | [optional] 
**mergeSettings** | [**MergeSettings**](MergeSettings.md) |  | [optional] 
**statusMessage** | **String** | A status message, which can be informational, warning or error. A message here does not indicate an error perse | [optional] 
**status** | **String** | The status of the job | 


<a name="StatusEnum"></a>
## Enum: StatusEnum


* `CREATED` (value: `"CREATED"`)

* `UPDATED` (value: `"UPDATED"`)

* `PROCESSING` (value: `"PROCESSING"`)

* `DONE` (value: `"DONE"`)

* `ERROR` (value: `"ERROR"`)

* `DELETED` (value: `"DELETED"`)




