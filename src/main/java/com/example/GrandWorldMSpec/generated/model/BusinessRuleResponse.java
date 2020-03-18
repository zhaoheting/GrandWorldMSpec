package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.BusinessRuleSetDefinition;
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
 * Response of loading business rule.
 */
@ApiModel(description = "Response of loading business rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-17T11:58:54.625+08:00")

public class BusinessRuleResponse   {
  @JsonProperty("definition")
  private BusinessRuleSetDefinition definition = null;

  @JsonProperty("contentList")
  @Valid
  private List<byte[]> contentList = null;

  public BusinessRuleResponse definition(BusinessRuleSetDefinition definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BusinessRuleSetDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(BusinessRuleSetDefinition definition) {
    this.definition = definition;
  }

  public BusinessRuleResponse contentList(List<byte[]> contentList) {
    this.contentList = contentList;
    return this;
  }

  public BusinessRuleResponse addContentListItem(byte[] contentListItem) {
    if (this.contentList == null) {
      this.contentList = new ArrayList<>();
    }
    this.contentList.add(contentListItem);
    return this;
  }

  /**
   * Get contentList
   * @return contentList
  **/
  @ApiModelProperty(value = "")


  public List<byte[]> getContentList() {
    return contentList;
  }

  public void setContentList(List<byte[]> contentList) {
    this.contentList = contentList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRuleResponse businessRuleResponse = (BusinessRuleResponse) o;
    return Objects.equals(this.definition, businessRuleResponse.definition) &&
        Objects.equals(this.contentList, businessRuleResponse.contentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, contentList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRuleResponse {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    contentList: ").append(toIndentedString(contentList)).append("\n");
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

