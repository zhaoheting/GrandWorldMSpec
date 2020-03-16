package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.ApiError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-16T13:26:14.544+08:00")

public class ErrorModel   {
  @JsonProperty("apiErrors")
  @Valid
  private List<ApiError> apiErrors = null;

  public ErrorModel apiErrors(List<ApiError> apiErrors) {
    this.apiErrors = apiErrors;
    return this;
  }

  public ErrorModel addApiErrorsItem(ApiError apiErrorsItem) {
    if (this.apiErrors == null) {
      this.apiErrors = new ArrayList<>();
    }
    this.apiErrors.add(apiErrorsItem);
    return this;
  }

  /**
   * list of one or more errors that have occured
   * @return apiErrors
  **/
  @ApiModelProperty(value = "list of one or more errors that have occured")

  @Valid

  public List<ApiError> getApiErrors() {
    return apiErrors;
  }

  public void setApiErrors(List<ApiError> apiErrors) {
    this.apiErrors = apiErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.apiErrors, errorModel.apiErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    apiErrors: ").append(toIndentedString(apiErrors)).append("\n");
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

