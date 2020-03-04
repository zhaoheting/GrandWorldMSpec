package com.example.GrandWorldMSpec.generated.client.template;

import com.example.GrandWorldMSpec.generated.client.ApiClient;

import com.example.GrandWorldMSpec.generated.model.ActivatedInfo;
import java.io.File;
import com.example.GrandWorldMSpec.generated.model.RuleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@Component("com.example.GrandWorldMSpec.generated.client.template.RuleManagementApi")
public class RuleManagementApi {
    private ApiClient apiClient;

    public RuleManagementApi() {
        this(new ApiClient());
    }

    @Autowired
    public RuleManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Load rules from SDK.
     * Return a zip file as a byte array in customised response entity,then the file can be downloaded from front end.
     * <p><b>200</b> - Return a zip file.
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - not found
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File downLoadZipInFileGet() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/downLoadZipInFile").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/octet-stream"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/octet-stream"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Accept rule pushes request from console to store it.
     * Accept rule pushes request from console to store it.
     * <p><b>200</b> - RuleBundle ID
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * @param types rule types
     * @param tenantId tenant id
     * @param version rule version
     * @param ruleZip rule bundles
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String pushRuleBundles(String types, String tenantId, String version, File ruleZip) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'types' is set
        if (types == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'types' when calling pushRuleBundles");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling pushRuleBundles");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling pushRuleBundles");
        }
        
        // verify the required parameter 'ruleZip' is set
        if (ruleZip == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleZip' when calling pushRuleBundles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("types", types);
        uriVariables.put("tenantId", tenantId);
        uriVariables.put("version", version);
        String path = UriComponentsBuilder.fromPath("/ruleBundles").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (ruleZip != null)
            formParams.add("ruleZip", new FileSystemResource(ruleZip));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Load rules from SDK.
     * Return a zip file as a byte array in customised response entity,then the client can get the array.
     * <p><b>200</b> - Return a zip file as a byte array in customised response entity successfully.
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - not found
     * @param type rule types
     * @param ruleSetName if business rule
     * @param tableName if table rule,table set/table name
     * @param tenantId Hu B2c
     * @param version v0.1.0
     * @return RuleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RuleResponse rulesGet(String type, String ruleSetName, String tableName, String tenantId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling rulesGet");
        }
        
        // verify the required parameter 'ruleSetName' is set
        if (ruleSetName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleSetName' when calling rulesGet");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tableName' when calling rulesGet");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling rulesGet");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling rulesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("type", type);
        uriVariables.put("ruleSetName", ruleSetName);
        uriVariables.put("tableName", tableName);
        uriVariables.put("tenantId", tenantId);
        uriVariables.put("version", version);
        String path = UriComponentsBuilder.fromPath("/rules").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<RuleResponse> returnType = new ParameterizedTypeReference<RuleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Report subscriber&#39;s latest information from sdk.
     * fff.
     * <p><b>200</b> - Return a zip file.
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * @param subscriberId The subscriberId parameter
     * @param activatedRuleInfoList Activated Rule Info List.
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String rulesSubscribersSubscriberIdActivatedInfoPost(String subscriberId, List<ActivatedInfo> activatedRuleInfoList) throws RestClientException {
        Object postBody = activatedRuleInfoList;
        
        // verify the required parameter 'subscriberId' is set
        if (subscriberId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriberId' when calling rulesSubscribersSubscriberIdActivatedInfoPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriberId", subscriberId);
        String path = UriComponentsBuilder.fromPath("/rules/subscribers/{subscriberId}/activatedInfo").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
