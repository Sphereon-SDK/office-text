# Sphereon.SDK.Office-text.Model.MergeJob
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTime** | **DateTime?** | The completion date/time of this job in ISO 8601 format | [optional] 
**JobId** | **string** | The server generated job jobId. This jobId is checked against the jobId in the request path on every invocation | 
**CreationTime** | **DateTime?** | The creation date/time of this job in ISO 8601 format | [optional] 
**DataSetId** | **string** | Data set id | [optional] 
**HeaderDataSetIds** | **List&lt;string&gt;** | Header data set ids | [optional] 
**MergeSettings** | [**MergeSettings**](MergeSettings.md) |  | [optional] 
**SelectedTemplateIndex** | **int?** | The selected template version | 
**ResultFiles** | **List&lt;string&gt;** | The result files of a merge | [optional] 
**StatusMessage** | **string** | A status message, which can be informational, warning or error. A message here does not indicate an error perse | [optional] 
**Status** | **string** | The status of the job | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

