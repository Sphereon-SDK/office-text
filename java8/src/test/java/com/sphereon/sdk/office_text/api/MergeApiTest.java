/**
 * OfficeTextMerge
 * <b>The Office Text API can generate office documents from a template and a JSON data file<</b>    The flow is generally as follows:      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 * <p>
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.office_text.api;

import com.sphereon.sdk.office_text.handler.ApiException;
import com.sphereon.sdk.office_text.model.*;
import org.apache.commons.io.FileUtils;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * API tests for MergeApi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MergeApiTest {

    protected static final String MS_WORD_DOCX = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
    private static String headerId;
    private static String dataSetId;
    private static String templateId;
    private static File templateFile;
    private static String jobId;
    private final MergeApi api = new MergeApi();

    /**
     * Store dataset
     * <p>
     * Upload and store a data set. Currently only JSON is supported. This call returns an id which can be specified when submitting a merge job.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _01_createDataSetTest() throws ApiException {

        String header1PayLoad = getPayLoad("header1.json");
        DataSetResponse response = api.createDataSet(header1PayLoad);
        Assert.assertNotNull(response);
        Assert.assertEquals(DataSetResponse.StatusEnum.CREATED, response.getStatus());
        this.headerId = response.getId();
        Assert.assertNotNull(headerId);

        String dataSet1PayLoad = getPayLoad("dataset1.json");
        response = api.createDataSet(dataSet1PayLoad);
        Assert.assertEquals(DataSetResponse.StatusEnum.CREATED, response.getStatus());
        this.dataSetId = response.getId();
        Assert.assertNotNull(dataSetId);
    }


    /**
     * Create template context
     * <p>
     * Create a unique template context for your environment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _02_createTemplateContextTest() throws ApiException {
        this.templateId = "templateId";
        TemplateContextResponse response = null;
        try {
            response = api.deleteTemplateContext(templateId);
            Assert.assertNotNull(response);
        } catch (Exception e) {

        }


        OwnerInfo initialOwnerInfo = new OwnerInfo();
        initialOwnerInfo.setCompanyDepartment("companyDepartment");
        initialOwnerInfo.setEmail("email");
        initialOwnerInfo.setName("name");
        initialOwnerInfo.setPhone("phone");

        String description = "description";

        TemplateContextRequest templateContextRequest = new TemplateContextRequest();
        templateContextRequest.setDescription(description);
        templateContextRequest.setOwnerInfo(initialOwnerInfo);
        templateContextRequest.setTemplateId(templateId);
        response = api.createTemplateContext(templateContextRequest);
        Assert.assertNotNull(response);
        Assert.assertEquals(TemplateContextResponse.StatusEnum.CREATED, response.getStatus());
        TemplateContext templateContext = response.getContext();
        Assert.assertNotNull(templateContext);
        OwnerInfo ownerInfo = templateContext.getOwnerInfo();
        Assert.assertNotNull(ownerInfo);
        Assert.assertEquals(initialOwnerInfo.getCompanyDepartment(), ownerInfo.getCompanyDepartment());
        Assert.assertEquals(initialOwnerInfo.getEmail(), ownerInfo.getEmail());
        Assert.assertEquals(initialOwnerInfo.getName(), ownerInfo.getName());
        Assert.assertEquals(initialOwnerInfo.getPhone(), ownerInfo.getPhone());

        Assert.assertEquals(description, templateContext.getDescription());
        Assert.assertEquals(templateId, templateContext.getTemplateId());
        Map<String, String> templateFiles = templateContext.getTemplateFiles();
        Assert.assertTrue(templateFiles.isEmpty());
    }

    /**
     * Update template context
     * <p>
     * Update an existing template context for your environment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _03_updateTemplateContextTest() throws ApiException {
        String changedDescription = "changedDescription";
        OwnerInfo changedOwnerInfo = new OwnerInfo();
        changedOwnerInfo.setCompanyDepartment("changedCompanyDepartment");
        changedOwnerInfo.setEmail("changedEmail");
        changedOwnerInfo.setName("changedName");
        changedOwnerInfo.setPhone("changedPhone");

        TemplateContextRequest templateContextRequest = new TemplateContextRequest();
        templateContextRequest.setDescription(changedDescription);
        templateContextRequest.setOwnerInfo(changedOwnerInfo);
        templateContextRequest.setTemplateId(templateId);
        TemplateContextResponse response = api.updateTemplateContext(templateContextRequest);

        Assert.assertNotNull(response);
        Assert.assertEquals(TemplateContextResponse.StatusEnum.UPDATED, response.getStatus());
        TemplateContext templateContext = response.getContext();
        Assert.assertNotNull(templateContext);
        OwnerInfo ownerInfo = templateContext.getOwnerInfo();
        Assert.assertNotNull(ownerInfo);
        Assert.assertEquals(changedOwnerInfo.getCompanyDepartment(), ownerInfo.getCompanyDepartment());
        Assert.assertEquals(changedOwnerInfo.getEmail(), ownerInfo.getEmail());
        Assert.assertEquals(changedOwnerInfo.getName(), ownerInfo.getName());
        Assert.assertEquals(changedOwnerInfo.getPhone(), ownerInfo.getPhone());

        Assert.assertEquals(changedDescription, templateContext.getDescription());
        Assert.assertEquals(templateId, templateContext.getTemplateId());
        Map<String, String> templateFiles = templateContext.getTemplateFiles();
        Assert.assertTrue(templateFiles.isEmpty());
    }

    /**
     * Upload template file
     * <p>
     * Upload the Office template file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _04_uploadTemplateFileTest() throws ApiException {
        templateFile = getFile("Template with header fields.dotx");
        TemplateContextResponse response = api.uploadTemplateFile(templateId, templateFile);
        TemplateContext templateContext = response.getContext();
        Assert.assertNotNull(templateContext);
    }

    /**
     * Get template context
     * <p>
     * Get an existing template context
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _05_getTemplateContextTest() throws ApiException {
        String changedDescription = "changedDescription";
        OwnerInfo changedOwnerInfo = new OwnerInfo();
        changedOwnerInfo.setCompanyDepartment("changedCompanyDepartment");
        changedOwnerInfo.setEmail("changedEmail");
        changedOwnerInfo.setName("changedName");
        changedOwnerInfo.setPhone("changedPhone");


        TemplateContextResponse response = api.getTemplateContext(templateId);
        Assert.assertNotNull(response);
        Assert.assertEquals(TemplateContextResponse.StatusEnum.PROCESSING, response.getStatus());
        TemplateContext templateContext = response.getContext();
        Assert.assertNotNull(templateContext);
        OwnerInfo ownerInfo = templateContext.getOwnerInfo();
        Assert.assertNotNull(ownerInfo);
        Assert.assertEquals(changedOwnerInfo.getCompanyDepartment(), ownerInfo.getCompanyDepartment());
        Assert.assertEquals(changedOwnerInfo.getEmail(), ownerInfo.getEmail());
        Assert.assertEquals(changedOwnerInfo.getName(), ownerInfo.getName());
        Assert.assertEquals(changedOwnerInfo.getPhone(), ownerInfo.getPhone());

        Assert.assertEquals(changedDescription, templateContext.getDescription());
        Assert.assertEquals(templateId, templateContext.getTemplateId());
        Map<String, String> templateFiles = templateContext.getTemplateFiles();
        Assert.assertEquals(1, templateFiles.size());
        Set<String> keys = templateFiles.keySet();
        String key = keys.iterator().next();
        String expectedFileName = templateFile.getName();
        Assert.assertTrue(templateFiles.get(key).contains(expectedFileName));
    }

    @Test
    public void _06_deleteAllJobsTest() throws ApiException {
        List<String> statusses = new ArrayList<>();

        for (MergeJobResponse.StatusEnum statusEnum : MergeJobResponse.StatusEnum.values()) {
            statusses.add(statusEnum.name());
        }

        List<MergeJobResponse> response = api.getJobs(statusses);
        for (MergeJobResponse mergeJobResponse : response) {
            api.deleteJob(mergeJobResponse.getJobId());
        }
    }

    /**
     * Submit merge job for processing
     * <p>
     * Submit merge job run.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _07_submitJobTest() throws ApiException {
        MergeSettings providedMergeSettings = new MergeSettings();
        providedMergeSettings.setMergeResult(MergeSettings.MergeResultEnum.SINGLE_FILE);
        providedMergeSettings.setTemplateId(templateId);
        providedMergeSettings.setDataSetId(dataSetId);
        providedMergeSettings.setEngine(MergeSettings.EngineEnum.PREMIUM);
        Lifecycle lifecycle = new Lifecycle();
        lifecycle.setType(Lifecycle.TypeEnum.TIME);
        providedMergeSettings.setLifecycle(lifecycle);
        providedMergeSettings.getHeaderDataSetIds().add(headerId);
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.setOutputFormat(OutputSettings.OutputFormatEnum.DOCX);
        outputSettings.setDeliveryFormat(OutputSettings.DeliveryFormatEnum.PLAIN);
        providedMergeSettings.setOutputSettings(outputSettings);
        MergeJobResponse response = api.submitJob(providedMergeSettings);
        Assert.assertNotNull(response);
        Assert.assertEquals(MergeJobResponse.StatusEnum.CREATED, response.getStatus());
        MergeJob job = response.getJob();
        Assert.assertNotNull(job);

        Assert.assertEquals(MergeJob.StatusEnum.CREATED, job.getStatus());

        this.jobId = job.getJobId();
        Assert.assertNotNull(this.jobId);
        MergeSettings mergeSettings = job.getMergeSettings();
        Assert.assertNotNull(mergeSettings);

        Assert.assertEquals(providedMergeSettings.getMergeResult(), mergeSettings.getMergeResult());
        Assert.assertEquals(providedMergeSettings.getTemplateId(), mergeSettings.getTemplateId());
        Assert.assertEquals(providedMergeSettings.getDataSetId(), mergeSettings.getDataSetId());
        Assert.assertEquals(providedMergeSettings.getEngine(), mergeSettings.getEngine());
        Assert.assertEquals(providedMergeSettings.getLifecycle().getType(), mergeSettings.getLifecycle().getType());
        Assert.assertEquals(providedMergeSettings.getHeaderDataSetIds().size(), mergeSettings.getHeaderDataSetIds().size());
    }


    /**
     * Job definition and state
     * <p>
     * Get the merge job definition and current state. Please not that you can differentiate based on http response status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _08_getJobTest() throws ApiException {
        MergeJobResponse response = api.getJob(jobId);
        Assert.assertNotNull(response);
        Assert.assertEquals(jobId, response.getJobId());
    }

    /**
     * Get all jobs
     * <p>
     * Get all office text job definitions and their current state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _09_getJobsTest() throws ApiException {
        List<String> statusses = new ArrayList<>();

        for (MergeJobResponse.StatusEnum statusEnum : MergeJobResponse.StatusEnum.values()) {
            statusses.add(statusEnum.name());
        }

        List<MergeJobResponse> response = api.getJobs(statusses);
        Assert.assertNotNull(response);
        Assert.assertEquals(1, response.size());
        MergeJobResponse mergeJobResponse = response.get(0);
        Assert.assertEquals(jobId, mergeJobResponse.getJobId());
    }

    /**
     * Get the result file
     * <p>
     * Get a merge result document as a binary stream.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _10_getResultStreamByIdTest() throws ApiException, InterruptedException {
        MergeJobResponse mergeJobResponse;
        int countDown = 20;
        do {
            mergeJobResponse = api.getJob(jobId);
            Thread.sleep(1000);
            countDown--;
        }
        while (mergeJobResponse != null && !MergeJobResponse.StatusEnum.DONE.equals(mergeJobResponse.getStatus()) && countDown > 0);


        MergeJob job = mergeJobResponse.getJob();
        Assert.assertNotNull(job);
        List<String> resultFiles = job.getResultFiles();
        Assert.assertNotNull(resultFiles);
        Assert.assertEquals(1, resultFiles.size());
        String streamId = resultFiles.get(0);
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.setDeliveryFormat(OutputSettings.DeliveryFormatEnum.PLAIN);
        outputSettings.setOutputFormat(OutputSettings.OutputFormatEnum.DOCX);
        byte[] data = api.getResultStreamById(jobId, streamId, outputSettings);

        assertValidMediaType(data, MediaType.APPLICATION_ZIP.toString()); // DOCX document is actually a zip file
    }

    /**
     * Get the result file
     * <p>
     * Get all documents inside a compressed container as a binary stream.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _11_getResultStreamsAsContainerTest() throws ApiException, InterruptedException {
        MergeJobResponse mergeJobResponse;
        int countDown = 20;
        do {
            mergeJobResponse = api.getJob(jobId);
            Thread.sleep(1000);
            countDown--;
        }
        while (mergeJobResponse != null && !MergeJobResponse.StatusEnum.DONE.equals(mergeJobResponse.getStatus()) && countDown > 0);


        MergeJob job = mergeJobResponse.getJob();
        Assert.assertNotNull(job);
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.setDeliveryFormat(OutputSettings.DeliveryFormatEnum.ZIP);
        outputSettings.setOutputFormat(OutputSettings.OutputFormatEnum.DOCX);

        byte[] data = api.getResultStreamsAsContainer(jobId, outputSettings);
        assertValidMediaType(data, MediaType.APPLICATION_ZIP.toString());
    }


    /**
     * Delete a stored data set
     * <p>
     * Delete a stored data set
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _12_deleteDataSetTest() throws ApiException {
        DataSetResponse response = api.deleteDataSet(dataSetId);
        Assert.assertNotNull(response);
        Assert.assertEquals(DataSetResponse.StatusEnum.DELETED, response.getStatus());
        Assert.assertEquals(dataSetId, response.getId());

        response = api.deleteDataSet(headerId);
        Assert.assertNotNull(response);
        Assert.assertEquals(DataSetResponse.StatusEnum.DELETED, response.getStatus());
        Assert.assertEquals(headerId, response.getId());


    }


    /**
     * Delete template context
     * <p>
     * Delete a template context with all history
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _13_deleteTemplateContextTest() throws ApiException {
        TemplateContextResponse response = api.deleteTemplateContext(templateId);
        Assert.assertNotNull(response);
        Assert.assertEquals(TemplateContextResponse.StatusEnum.DELETED, response.getStatus());
        Assert.assertEquals(templateId, response.getContext().getTemplateId());
    }

    /**
     * Delete a job manually
     * <p>
     * Delete the merge job and all related files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _14_deleteJobTest() throws ApiException {
        MergeJobResponse response = api.deleteJob(jobId);
        Assert.assertNotNull(response);
        Assert.assertEquals(MergeJobResponse.StatusEnum.DELETED, response.getStatus());
        Assert.assertEquals(jobId, response.getJobId());
    }

    /**
     * Get all jobs
     * <p>
     * Get all office text job definitions and their current state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _15_getJobsTest() throws ApiException {
        List<String> statusses = new ArrayList<>();
        statusses.add("DONE");
        List<MergeJobResponse> response = api.getJobs(statusses);
        Assert.assertNotNull(response);
        Assert.assertEquals(0, response.size());
    }

    private String getPayLoad(String fileName) {
        try {
            File file = getFile(fileName);
            return FileUtils.readFileToString(file);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
        return "";
    }

    private File getFile(String fileName) {
        try {
            URL resource = getClass().getClassLoader().getResource(fileName);
            File file = new File(resource.toURI());
            Assert.assertTrue(file.exists());
            return file;
        } catch (URISyntaxException e) {
            Assert.fail(e.getMessage());
        }
        return null;
    }

    private void assertValidMediaType(byte[] data, String expectedMediaType) {
        Assert.assertNotNull(data);

        AutoDetectParser autoDetectParser = new AutoDetectParser();

        InputStream is = TikaInputStream.get(new ByteArrayInputStream(data));
        Metadata metadata = new Metadata();
        BodyContentHandler bodyContentHandler = new BodyContentHandler(-1);
        try {
            autoDetectParser.parse(is, bodyContentHandler, metadata, new ParseContext());
            MimeTypes mimeTypes = new MimeTypes();
            MediaType mediaType = mimeTypes.detect(is, metadata);
            is.close();
            Assert.assertEquals(expectedMediaType, mediaType.toString());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}
