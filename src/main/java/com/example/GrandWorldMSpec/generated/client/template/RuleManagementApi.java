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
     * Load business rule.
     * <p><b>200</b> - Successful response of loading business rule.
     * <p><b>400</b> - The request was invalid
     * <p><b>401</b> - User not authorised to access this resource
     * <p><b>404</b> - The search results do not exist.
     * <p><b>500</b> - An unexpected error occurred
     * @param acceptLanguage Requested locale string. See section 14.4: https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html
     * @param userToken JWT authentication token for the logged in user
     * @param ruleSetName The name of business rule&#39;s ruleset.
     * @param ruleName The name of a table rule or business rule.
     * @param deviceId Unique id passed by the client to represent the browser/mobile device making the call. Used only for logging purposes, and not required by t-RetailAPI for processing.
     * @param salesChannel Requested sales channel
     * @param marketCountryCode Requested market country code
     * @param brand Requested brand
     * @param multivariateTestToken A token for multivariate test
     * @param tenantKey Code of the tenant.
     * @param version Rule version.
     * @return BusinessRuleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BusinessRuleResponse getBusinessRule(String acceptLanguage, String userToken, String ruleSetName, String ruleName, String deviceId, String salesChannel, String marketCountryCode, String brand, String multivariateTestToken, String tenantKey, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'acceptLanguage' is set
        if (acceptLanguage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'acceptLanguage' when calling getBusinessRule");
        }
        
        // verify the required parameter 'userToken' is set
        if (userToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userToken' when calling getBusinessRule");
        }
        
        // verify the required parameter 'ruleSetName' is set
        if (ruleSetName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleSetName' when calling getBusinessRule");
        }
        
        // verify the required parameter 'ruleName' is set
        if (ruleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleName' when calling getBusinessRule");
        }
        
        String path = UriComponentsBuilder.fromPath("/res/ruleBusiness").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ruleSetName", ruleSetName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ruleName", ruleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenantKey", tenantKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        
        if (acceptLanguage != null)
        headerParams.add("Accept-Language", apiClient.parameterToString(acceptLanguage));
        if (deviceId != null)
        headerParams.add("Device-Id", apiClient.parameterToString(deviceId));
        if (salesChannel != null)
        headerParams.add("Sales-Channel", apiClient.parameterToString(salesChannel));
        if (marketCountryCode != null)
        headerParams.add("Market-Country-Code", apiClient.parameterToString(marketCountryCode));
        if (brand != null)
        headerParams.add("Brand", apiClient.parameterToString(brand));
        if (userToken != null)
        headerParams.add("User-Token", apiClient.parameterToString(userToken));
        if (multivariateTestToken != null)
        headerParams.add("Multivariate-Test-Token", apiClient.parameterToString(multivariateTestToken));

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
     * Load table rule.
     * <p><b>200</b> - Successful response of loading table rule.
     * <p><b>400</b> - The request was invalid
     * <p><b>401</b> - User not authorised to access this resource
     * <p><b>404</b> - The search results do not exist.
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
        
        String path = UriComponentsBuilder.fromPath("/res/ruleTable").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "bundleName", bundleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ruleName", ruleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenantKey", tenantKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

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
     * Rule engine subscriber report.
     * <p><b>200</b> - Successful response of rule engine subscriber report.
     * <p><b>400</b> - The request was invalid
     * <p><b>401</b> - User not authorised to access this resource
     * <p><b>404</b> - The search results do not exist.
     * <p><b>500</b> - An unexpected error occurred
     * @param acceptLanguage Requested locale string. See section 14.4: https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html
     * @param userToken JWT authentication token for the logged in user
     * @param deviceId Unique id passed by the client to represent the browser/mobile device making the call. Used only for logging purposes, and not required by t-RetailAPI for processing.
     * @param salesChannel Requested sales channel
     * @param marketCountryCode Requested market country code
     * @param brand Requested brand
     * @param multivariateTestToken A token for multivariate test
     * @param subscriberRequest The subscriberRequest parameter
     * @return SubscriptionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionResponse subscribeRules(String acceptLanguage, String userToken, String deviceId, String salesChannel, String marketCountryCode, String brand, String multivariateTestToken, SubscriptionRequest subscriberRequest) throws RestClientException {
        Object postBody = subscriberRequest;
        
        // verify the required parameter 'acceptLanguage' is set
        if (acceptLanguage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'acceptLanguage' when calling subscribeRules");
        }
        
        // verify the required parameter 'userToken' is set
        if (userToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userToken' when calling subscribeRules");
        }
        
        String path = UriComponentsBuilder.fromPath("/res/ruleSubscription").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (acceptLanguage != null)
        headerParams.add("Accept-Language", apiClient.parameterToString(acceptLanguage));
        if (deviceId != null)
        headerParams.add("Device-Id", apiClient.parameterToString(deviceId));
        if (salesChannel != null)
        headerParams.add("Sales-Channel", apiClient.parameterToString(salesChannel));
        if (marketCountryCode != null)
        headerParams.add("Market-Country-Code", apiClient.parameterToString(marketCountryCode));
        if (brand != null)
        headerParams.add("Brand", apiClient.parameterToString(brand));
        if (userToken != null)
        headerParams.add("User-Token", apiClient.parameterToString(userToken));
        if (multivariateTestToken != null)
        headerParams.add("Multivariate-Test-Token", apiClient.parameterToString(multivariateTestToken));

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
