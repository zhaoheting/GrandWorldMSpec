package com.example.GrandWorldMSpec.generated.client.template;

import com.example.GrandWorldMSpec.generated.client.ApiClient;

import com.example.GrandWorldMSpec.generated.model.BusinessRuleLoadResponse;
import com.example.GrandWorldMSpec.generated.model.SubscriberReport;
import com.example.GrandWorldMSpec.generated.model.TableRuleLoadResponse;

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
     * Load business rule from SDK.
     * Load business rule from SDK.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param ruleGroupName The name of table rule&#39;s bundle or business rule&#39;s ruleset.
     * @param ruleName The name of a table rule or business rule.
     * @param tenantId Code of the tenant.
     * @param version Rule version.
     * @return BusinessRuleLoadResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BusinessRuleLoadResponse getBusinessRule(String ruleGroupName, String ruleName, String tenantId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleGroupName' is set
        if (ruleGroupName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleGroupName' when calling getBusinessRule");
        }
        
        // verify the required parameter 'ruleName' is set
        if (ruleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleName' when calling getBusinessRule");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getBusinessRule");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getBusinessRule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleGroupName", ruleGroupName);
        uriVariables.put("ruleName", ruleName);
        uriVariables.put("tenantId", tenantId);
        uriVariables.put("version", version);
        String path = UriComponentsBuilder.fromPath("/businessRule").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<BusinessRuleLoadResponse> returnType = new ParameterizedTypeReference<BusinessRuleLoadResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Load table rule from SDK.
     * Load table rule from SDK.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param ruleGroupName The name of table rule&#39;s bundle or business rule&#39;s ruleset.
     * @param ruleName The name of a table rule or business rule.
     * @param tenantId Code of the tenant.
     * @param version Rule version.
     * @param page The page parameter
     * @param pageSize The pageSize parameter
     * @return TableRuleLoadResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TableRuleLoadResponse getTableRule(String ruleGroupName, String ruleName, String tenantId, String version, Integer page, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleGroupName' is set
        if (ruleGroupName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleGroupName' when calling getTableRule");
        }
        
        // verify the required parameter 'ruleName' is set
        if (ruleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleName' when calling getTableRule");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getTableRule");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getTableRule");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling getTableRule");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageSize' when calling getTableRule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleGroupName", ruleGroupName);
        uriVariables.put("ruleName", ruleName);
        uriVariables.put("tenantId", tenantId);
        uriVariables.put("version", version);
        uriVariables.put("page", page);
        uriVariables.put("pageSize", pageSize);
        String path = UriComponentsBuilder.fromPath("/tableRule").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TableRuleLoadResponse> returnType = new ParameterizedTypeReference<TableRuleLoadResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
    public SubscriberReport ruleSubscribe(SubscriberReport subscriberReport) throws RestClientException {
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
