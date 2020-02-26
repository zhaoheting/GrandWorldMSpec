/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.GrandWorldMSpec.generated.controller.interfaces;

import org.springframework.core.io.Resource;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-26T21:01:17.810+08:00")

@Api(value = "RuleManagement", description = "the RuleManagement API",tags = "RuleManagement")
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

    @ApiOperation(value = "Accept rule pushes request from console to store it.", nickname = "pushRuleBundles", notes = "Accept rule pushes request from console to store it.", tags={ "RuleManagement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/ruleBundles",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> pushRuleBundles(@ApiParam(value = "rule types",required=true) @PathVariable("types") String types,@ApiParam(value = "tenant id",required=true) @PathVariable("tenantId") String tenantId,@ApiParam(value = "rule version",required=true) @PathVariable("version") String version,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile ruleZip) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default RuleManagementApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Load rules from SDK.", nickname = "rulesGet", notes = "Load rules from SDK.", tags={ "RuleManagement", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/rules",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> rulesGet(@ApiParam(value = "table/business/both.",required=true) @PathVariable("type") String type,@ApiParam(value = "if business rule.",required=true) @PathVariable("ruleSetName") String ruleSetName,@ApiParam(value = "if table rule, [table set/table name]",required=true) @PathVariable("tableName") String tableName,@ApiParam(value = "e.g. HU B2C",required=true) @PathVariable("tenantId") String tenantId,@ApiParam(value = "e.g. v0.1.0",required=true) @PathVariable("version") String version) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default RuleManagementApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
