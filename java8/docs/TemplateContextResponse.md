
# TemplateContextResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date/time of this response in ISO 8601 format |  [optional]
**context** | [**TemplateContext**](TemplateContext.md) |  |  [optional]
**id** | **String** | Unique template context id | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the template | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
UPDATED | &quot;UPDATED&quot;
DELETED | &quot;DELETED&quot;
PROCESSING | &quot;PROCESSING&quot;



