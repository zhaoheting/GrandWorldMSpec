package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-16T13:26:14.544+08:00")

public class ApiError   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("devMessage")
  private String devMessage = null;

  @JsonProperty("userMessage")
  private String userMessage = null;

  @JsonProperty("field")
  private String field = null;

  public ApiError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * A Spring validation code/Openjaw error code/Supplier Error describing the type of error
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "A Spring validation code/Openjaw error code/Supplier Error describing the type of error")
  @NotNull


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ApiError devMessage(String devMessage) {
    this.devMessage = devMessage;
    return this;
  }

  /**
   * A message describing the error in more detail to help the developer learn more about the issue
   * @return devMessage
  **/
  @ApiModelProperty(required = true, value = "A message describing the error in more detail to help the developer learn more about the issue")
  @NotNull


  public String getDevMessage() {
    return devMessage;
  }

  public void setDevMessage(String devMessage) {
    this.devMessage = devMessage;
  }

  public ApiError userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * A message describing the error in simple language. May be the same as devMessage in some cases
   * @return userMessage
  **/
  @ApiModelProperty(required = true, value = "A message describing the error in simple language. May be the same as devMessage in some cases")
  @NotNull


  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  public ApiError field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field which was at fault for the error
   * @return field
  **/
  @ApiModelProperty(value = "The field which was at fault for the error")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.errorCode, apiError.errorCode) &&
        Objects.equals(this.devMessage, apiError.devMessage) &&
        Objects.equals(this.userMessage, apiError.userMessage) &&
        Objects.equals(this.field, apiError.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, devMessage, userMessage, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    devMessage: ").append(toIndentedString(devMessage)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

