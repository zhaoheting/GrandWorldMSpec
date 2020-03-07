package com.example.GrandWorldMSpec.generated.client.template;

import com.example.GrandWorldMSpec.generated.client.ApiClient;

import com.example.GrandWorldMSpec.generated.model.SubscriberReport;

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
     * rule subscription
     * rule subscription
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param subscriberReport uuid that rule engine service generated, null if this is the first time.
     * @return SubscriberReport
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriberReport ruleSubscriptionPost(SubscriberReport subscriberReport) throws RestClientException {
        Object postBody = subscriberReport;
        
        String path = UriComponentsBuilder.fromPath("/ruleSubscription").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SubscriberReport> returnType = new ParameterizedTypeReference<SubscriberReport>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
