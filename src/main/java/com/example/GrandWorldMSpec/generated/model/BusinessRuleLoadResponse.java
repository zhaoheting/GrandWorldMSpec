package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.BusinessRuleSetDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response model of load business rule interface.
 */
@ApiModel(description = "Response model of load business rule interface.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-07T20:48:33.284+08:00")

public class BusinessRuleLoadResponse   {
  @JsonProperty("definition")
  private BusinessRuleSetDefinition definition = null;

  @JsonProperty("content")
  private byte[] content = null;

  public BusinessRuleLoadResponse definition(BusinessRuleSetDefinition definition) {
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

  public BusinessRuleLoadResponse content(byte[] content) {
    this.content = content;
    return this;
  }

  /**
   * The content of the business rule in byte array.
   * @return content
  **/
  @ApiModelProperty(value = "The content of the business rule in byte array.")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRuleLoadResponse businessRuleLoadResponse = (BusinessRuleLoadResponse) o;
    return Objects.equals(this.definition, businessRuleLoadResponse.definition) &&
        Objects.equals(this.content, businessRuleLoadResponse.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRuleLoadResponse {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

