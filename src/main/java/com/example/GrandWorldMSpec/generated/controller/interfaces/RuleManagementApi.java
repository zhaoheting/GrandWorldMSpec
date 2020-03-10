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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-10T15:19:04.437+08:00")

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
        @ApiResponse(code = 200, message = "successful operation", response = BusinessRuleResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "User not authorised to access this resource", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "The search results set does not exist.", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorModel.class) })
    @RequestMapping(value = "/ruleBusiness",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<BusinessRuleResponse> getBusinessRule(@ApiParam(value = "The name of business rule's ruleset.",required=true) @PathVariable("ruleSetName") String ruleSetName,@ApiParam(value = "The name of a table rule or business rule.",required=true) @PathVariable("ruleName") String ruleName,@ApiParam(value = "Code of the tenant.",required=true) @PathVariable("tenantKey") String tenantKey,@ApiParam(value = "Rule version.",required=true) @PathVariable("version") String version) {
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
        @ApiResponse(code = 200, message = "successful operation.", response = TableRuleResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "User not authorised to access this resource", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "The search results set does not exist.", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorModel.class) })
    @RequestMapping(value = "/ruleTable",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<TableRuleResponse> getTableRule(@ApiParam(value = "The name of table rule's bundle.",required=true) @PathVariable("bundleName") String bundleName,@ApiParam(value = "The name of a table rule or business rule.",required=true) @PathVariable("ruleName") String ruleName,@ApiParam(value = "Code of the tenant.",required=true) @PathVariable("tenantKey") String tenantKey,@ApiParam(value = "Rule version.",required=true) @PathVariable("version") String version) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"data\" : {    \"ruleContent\" : \"ruleContent\",    \"market\" : \"market\",    \"ruleDefinitionId\" : 1,    \"tenantKey\" : \"tenantKey\",    \"language\" : \"language\",    \"id\" : 6  },  \"definition\" : {    \"auditId\" : 0,    \"lastUpdated\" : \"lastUpdated\",    \"definitionContent\" : \"definitionContent\",    \"name\" : \"name\",    \"id\" : \"id\",    \"version\" : \"version\",    \"group\" : \"group\",    \"status\" : \"Pending\"  }}", TableRuleResponse.class), HttpStatus.NOT_IMPLEMENTED);
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


    @ApiOperation(value = "", nickname = "subscribeRules", notes = "rule subscription", response = SubscriptionResponse.class, tags={ "rule management", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "User not authorised to access this resource", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "The search results set does not exist.", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorModel.class) })
    @RequestMapping(value = "/ruleSubscription",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<SubscriptionResponse> subscribeRules(@ApiParam(value = "uuid that rule engine service generated, null if this is the first time."  )  @Valid @RequestBody SubscriptionRequest subscriberReport) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"subscriptionInfo\" : {    \"businessRules\" : [ {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      } ]    }, {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      } ]    } ],    \"tableRules\" : [ {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      } ]    }, {      \"lastUpdated\" : \"lastUpdated\",      \"ruleGroupName\" : \"ruleGroupName\",      \"ruleList\" : [ {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      }, {        \"lastUpdated\" : \"lastUpdated\",        \"tenantKey\" : \"tenantKey\",        \"name\" : \"name\"      } ]    } ]  },  \"key\" : \"key\",  \"status\" : \"status\"}", SubscriptionResponse.class), HttpStatus.NOT_IMPLEMENTED);
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
