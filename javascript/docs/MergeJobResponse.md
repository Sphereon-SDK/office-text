# OfficeTextMerge.MergeJobResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **String** | The server generated job jobId. This jobId is checked against the jobId in the request path on overy invocation | 
**job** | [**MergeJob**](MergeJob.md) |  | [optional] 
**statusMessage** | **String** | A status message, which can be informational, warning or error. AA message here does not indicate an error perse | [optional] 
**status** | **String** | The status of the job | 


<a name="StatusEnum"></a>
## Enum: StatusEnum


* `CREATED` (value: `"CREATED"`)

* `UPDATED` (value: `"UPDATED"`)

* `PROCESSING` (value: `"PROCESSING"`)

* `DONE` (value: `"DONE"`)

* `ERROR` (value: `"ERROR"`)

* `DELETED` (value: `"DELETED"`)




