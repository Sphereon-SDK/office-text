package com.sphereon.sdk.template_processor.api;

import com.sphereon.sdk.template_processor.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.template_processor.model.DataSetResponse;
import com.sphereon.sdk.template_processor.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DataSetApi {
  /**
   * Store dataset
   * Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.
   * @param payload The dates for the merge [   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   },   {     \&quot;Field1\&quot;: \&quot;Field1 value\&quot;,     \&quot;Field2\&quot;: \&quot;Field2 value\&quot;,   } ] (required)
   * @return Call&lt;DataSetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("template/processor/0.1/datasets")
  Call<DataSetResponse> createDataSet(
    @retrofit2.http.Body String payload
  );

  /**
   * Delete a stored data set
   * Delete a stored data set
   * @param dataSetId dataSetId (required)
   * @return Call&lt;DataSetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("template/processor/0.1/datasets/{dataSetId}")
  Call<DataSetResponse> deleteDataSet(
    @retrofit2.http.Path("dataSetId") String dataSetId
  );

}
