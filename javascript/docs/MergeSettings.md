# TemplateProcessor.MergeSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifecycle** | [**Lifecycle**](Lifecycle.md) |  | [optional] 
**mergeResult** | **String** |  | [optional] 
**dataSetId** | **String** | Data set id | 
**engine** | **String** |  | [optional] 
**headerDataSetIds** | **[String]** | optional header data set ids | [optional] 
**resultStorageLocation** | [**StorageLocation**](StorageLocation.md) | The output location of the result files. | 
**templateVersion** | **Number** | Template version | [optional] 
**templateId** | **String** | Template id | 
**outputSettings** | [**OutputSettings**](OutputSettings.md) |  | 


<a name="MergeResultEnum"></a>
## Enum: MergeResultEnum


* `SINGLE_FILE` (value: `"SINGLE_FILE"`)

* `SEPARATE_FILES` (value: `"SEPARATE_FILES"`)




<a name="EngineEnum"></a>
## Enum: EngineEnum


* `BASIC` (value: `"BASIC"`)

* `PREMIUM` (value: `"PREMIUM"`)




