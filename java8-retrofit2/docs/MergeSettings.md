
# MergeSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifecycle** | [**Lifecycle**](Lifecycle.md) |  |  [optional]
**mergeResult** | [**MergeResultEnum**](#MergeResultEnum) |  |  [optional]
**dataSetId** | **String** | Data set id | 
**engine** | [**EngineEnum**](#EngineEnum) |  |  [optional]
**headerDataSetIds** | **List&lt;String&gt;** | optional header data set ids |  [optional]
**resultStorageLocation** | [**StorageLocation**](StorageLocation.md) | The output location of the result files. | 
**templateVersion** | **Integer** | Template version |  [optional]
**templateId** | **String** | Template id | 
**outputSettings** | [**OutputSettings**](OutputSettings.md) |  | 


<a name="MergeResultEnum"></a>
## Enum: MergeResultEnum
Name | Value
---- | -----
SINGLE_FILE | &quot;SINGLE_FILE&quot;
SEPARATE_FILES | &quot;SEPARATE_FILES&quot;


<a name="EngineEnum"></a>
## Enum: EngineEnum
Name | Value
---- | -----
BASIC | &quot;BASIC&quot;
PREMIUM | &quot;PREMIUM&quot;



