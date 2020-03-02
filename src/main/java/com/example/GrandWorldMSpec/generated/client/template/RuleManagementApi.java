package com.example.GrandWorldMSpec.generated.client.template;

import com.example.GrandWorldMSpec.generated.client.ApiClient;

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
     * Return a zip file as a byte array in customised response entity,then the client can get the array.
     * <p><b>200</b> - Return a zip file as a byte array in customised response entity successfully.
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - not found
     * @return RuleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RuleResponse downLoadZipInBytesGet() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/downLoadZipInBytes").build().toUriString();
        
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
}
