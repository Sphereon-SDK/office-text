
# MergeJobResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **String** | The server generated job jobId. This jobId is checked against the jobId in the request path on overy invocation | 
**job** | [**MergeJob**](MergeJob.md) |  |  [optional]
**statusMessage** | **String** | A status message, which can be informational, warning or error. AA message here does not indicate an error perse |  [optional]
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



