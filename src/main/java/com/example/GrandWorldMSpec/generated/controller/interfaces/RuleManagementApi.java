/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.GrandWorldMSpec.generated.controller.interfaces;

import com.example.GrandWorldMSpec.generated.model.BusinessRuleResponse;
import com.example.GrandWorldMSpec.generated.model.ErrorModel;
import com.example.GrandWorldMSpec.generated.model.SubscriptionRequest;
import com.example.GrandWorldMSpec.generated.model.SubscriptionResponse;
import com.example.GrandWorldMSpec.generated.model.TableRuleResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-16T13:26:14.544+08:00")

@Api(value = "RuleManagement", description = "the RuleManagement API")
public interface RuleManagementApi {

    Logger log = LoggerFactory.getLogger(RuleManagementApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "", nickname = "getBusinessRule", notes = "Load business rule from SDK.", response = BusinessRuleResponse.class, tags={ "rule management", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response of loading business rule from SDK.", response = BusinessRuleResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "User not authorised to access this resource", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "The search results do not exist.", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorModel.class) })
    @RequestMapping(value = "/ruleBusiness",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<BusinessRuleResponse> getBusinessRule(@NotNull @ApiParam(value = "The name of business rule's ruleset.", required = true) @Valid @RequestParam(value = "ruleSetName", required = true) String ruleSetName,@NotNull @ApiParam(value = "The name of a table rule or business rule.", required = true) @Valid @RequestParam(value = "ruleName", required = true) String ruleName,@ApiParam(value = "Code of the tenant.") @Valid @RequestParam(value = "tenantKey", required = false) String tenantKey,@ApiParam(value = "Rule version.") @Valid @RequestParam(value = "version", required = false) String version) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"definition\" : {    \"auditId\" : 6,    \"lastUpdated\" : \"lastUpdated\",    \"definitionContent\" : \"definitionContent\",    \"id\" : 0,    \"RuleSetName\" : \"RuleSetName\",    \"compiledContent\" : \"compiledContent\",    \"version\" : \"version\",    \"status\" : \"Pending\"  },  \"contentList\" : [ \"contentList\", \"contentList\" ]}", BusinessRuleResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default RuleManagementApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "", nickname = "getTableRule", notes = "Load table rule from SDK.", response = TableRuleResponse.class, tags={ "rule management", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response of loading table rule from SDK", response = TableRuleResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "User not authorised to access this resource", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "The search results do not exist.", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorModel.class) })
    @RequestMapping(value = "/ruleTable",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<TableRuleResponse> getTableRule(@NotNull @ApiParam(value = "The name of table rule's bundle.", required = true) @Valid @RequestParam(value = "bundleName", required = true) String bundleName,@NotNull @ApiParam(value = "The name of a table rule or business rule.", required = true) @Valid @RequestParam(value = "ruleName", required = true) String ruleName,@ApiParam(value = "Code of the tenant.") @Valid @RequestParam(value = "tenantKey", required = false) String tenantKey,@ApiParam(value = "Rule version.") @Valid @RequestParam(value = "version", required = false) String version,@ApiParam(value = "Current page.", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page,@ApiParam(value = "Item amount in every page.", defaultValue = "100") @Valid @RequestParam(value = "pageSize", required = false, defaultValue="100") Integer pageSize) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"tableRuleRows\" : [ {    \"ruleDefinitionId\" : 1,    \"rowContent\" : \"rowContent\",    \"tenantKey\" : \"tenantKey\",    \"rowId\" : 6  }, {    \"ruleDefinitionId\" : 1,    \"rowContent\" : \"rowContent\",    \"tenantKey\" : \"tenantKey\",    \"rowId\" : 6  } ],  \"pageSize\" : 2,  \"definition\" : {    \"auditId\" : 0,    \"lastUpdated\" : \"lastUpdated\",    \"definitionContent\" : \"definitionContent\",    \"name\" : \"name\",    \"id\" : \"id\",    \"version\" : \"version\",    \"group\" : \"group\",    \"status\" : \"Pending\"  },  \"totalRows\" : 5,  \"currentPage\" : 5}", TableRuleResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default RuleManagementApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "", nickname = "subscribeRules", notes = "Rule engine subscriber report.", response = SubscriptionResponse.class, tags={ "rule management", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful response of rule engine subscriber report.", response = SubscriptionResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "User not authorised to access this resource", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "The search results do not exist.", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorModel.class) })
    @RequestMapping(value = "/ruleSubscription",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<SubscriptionResponse> subscribeRules(@ApiParam(value = "Rule engine subscriber report reuqest."  )  @Valid @RequestBody SubscriptionRequest subscriberRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"subscriptionInfo\" : {    \"businessRules\" : [ {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      } ]    }, {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      } ]    } ],    \"tableRules\" : [ {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      } ]    }, {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\",        \"status\" : \"status\"      } ]    } ]  },  \"key\" : \"key\",  \"status\" : \"status\"}", SubscriptionResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default RuleManagementApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
