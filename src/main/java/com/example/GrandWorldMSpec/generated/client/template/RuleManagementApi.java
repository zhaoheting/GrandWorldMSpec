package com.example.GrandWorldMSpec.generated.client.template;

import com.example.GrandWorldMSpec.generated.client.ApiClient;

import com.example.GrandWorldMSpec.generated.model.BusinessRuleResponse;
import com.example.GrandWorldMSpec.generated.model.ErrorModel;
import com.example.GrandWorldMSpec.generated.model.SubscriptionRequest;
import com.example.GrandWorldMSpec.generated.model.SubscriptionResponse;
import com.example.GrandWorldMSpec.generated.model.TableRuleResponse;

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
     * 
     * Load business rule from SDK.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - The request was invalid
     * <p><b>401</b> - User not authorised to access this resource
     * <p><b>404</b> - The search results set does not exist.
     * <p><b>500</b> - An unexpected error occurred
     * @param ruleSetName The name of business rule&#39;s ruleset.
     * @param ruleName The name of a table rule or business rule.
     * @param tenantKey Code of the tenant.
     * @param version Rule version.
     * @return BusinessRuleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BusinessRuleResponse getBusinessRule(String ruleSetName, String ruleName, String tenantKey, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleSetName' is set
        if (ruleSetName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleSetName' when calling getBusinessRule");
        }
        
        // verify the required parameter 'ruleName' is set
        if (ruleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleName' when calling getBusinessRule");
        }
        
        // verify the required parameter 'tenantKey' is set
        if (tenantKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantKey' when calling getBusinessRule");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getBusinessRule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleSetName", ruleSetName);
        uriVariables.put("ruleName", ruleName);
        uriVariables.put("tenantKey", tenantKey);
        uriVariables.put("version", version);
        String path = UriComponentsBuilder.fromPath("/ruleBusiness").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<BusinessRuleResponse> returnType = new ParameterizedTypeReference<BusinessRuleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Load table rule from SDK.
     * <p><b>200</b> - successful operation.
     * <p><b>400</b> - The request was invalid
     * <p><b>401</b> - User not authorised to access this resource
     * <p><b>404</b> - The search results set does not exist.
     * <p><b>500</b> - An unexpected error occurred
     * @param bundleName The name of table rule&#39;s bundle.
     * @param ruleName The name of a table rule or business rule.
     * @param tenantKey Code of the tenant.
     * @param version Rule version.
     * @return TableRuleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TableRuleResponse getTableRule(String bundleName, String ruleName, String tenantKey, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bundleName' is set
        if (bundleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bundleName' when calling getTableRule");
        }
        
        // verify the required parameter 'ruleName' is set
        if (ruleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleName' when calling getTableRule");
        }
        
        // verify the required parameter 'tenantKey' is set
        if (tenantKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantKey' when calling getTableRule");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getTableRule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bundleName", bundleName);
        uriVariables.put("ruleName", ruleName);
        uriVariables.put("tenantKey", tenantKey);
        uriVariables.put("version", version);
        String path = UriComponentsBuilder.fromPath("/ruleTable").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TableRuleResponse> returnType = new ParameterizedTypeReference<TableRuleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * rule subscription
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - The request was invalid
     * <p><b>401</b> - User not authorised to access this resource
     * <p><b>404</b> - The search results set does not exist.
     * <p><b>500</b> - An unexpected error occurred
     * @param subscriberReport uuid that rule engine service generated, null if this is the first time.
     * @return SubscriptionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionResponse subscribeRules(SubscriptionRequest subscriberReport) throws RestClientException {
        Object postBody = subscriberReport;
        
        String path = UriComponentsBuilder.fromPath("/ruleSubscription").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SubscriptionResponse> returnType = new ParameterizedTypeReference<SubscriptionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
