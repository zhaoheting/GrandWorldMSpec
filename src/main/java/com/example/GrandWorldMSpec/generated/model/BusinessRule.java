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
 * Business rule entity.
 */
@ApiModel(description = "Business rule entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-10T16:17:50.323+08:00")

public class BusinessRule   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("ruleDefinitionId")
  private Integer ruleDefinitionId = null;

  @JsonProperty("ruleName")
  private String ruleName = null;

  @JsonProperty("tenantKey")
  private String tenantKey = null;

  @JsonProperty("ruleContent")
  private String ruleContent = null;

  @JsonProperty("compiledContent")
  private byte[] compiledContent = null;

  public BusinessRule id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier
   * @return id
  **/
  @ApiModelProperty(value = "Identifier")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BusinessRule ruleDefinitionId(Integer ruleDefinitionId) {
    this.ruleDefinitionId = ruleDefinitionId;
    return this;
  }

  /**
   * Foreign key.
   * @return ruleDefinitionId
  **/
  @ApiModelProperty(value = "Foreign key.")


  public Integer getRuleDefinitionId() {
    return ruleDefinitionId;
  }

  public void setRuleDefinitionId(Integer ruleDefinitionId) {
    this.ruleDefinitionId = ruleDefinitionId;
  }

  public BusinessRule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  /**
   * Name of this business rule.
   * @return ruleName
  **/
  @ApiModelProperty(value = "Name of this business rule.")


  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public BusinessRule tenantKey(String tenantKey) {
    this.tenantKey = tenantKey;
    return this;
  }

  /**
   * Get tenantKey
   * @return tenantKey
  **/
  @ApiModelProperty(value = "")


  public String getTenantKey() {
    return tenantKey;
  }

  public void setTenantKey(String tenantKey) {
    this.tenantKey = tenantKey;
  }

  public BusinessRule ruleContent(String ruleContent) {
    this.ruleContent = ruleContent;
    return this;
  }

  /**
   * Taken from the latest version of this business rule received from Console.
   * @return ruleContent
  **/
  @ApiModelProperty(value = "Taken from the latest version of this business rule received from Console.")


  public String getRuleContent() {
    return ruleContent;
  }

  public void setRuleContent(String ruleContent) {
    this.ruleContent = ruleContent;
  }

  public BusinessRule compiledContent(byte[] compiledContent) {
    this.compiledContent = compiledContent;
    return this;
  }

  /**
   * Java content compiled from the rule content. Suppose each rule only generates one java file.
   * @return compiledContent
  **/
  @ApiModelProperty(value = "Java content compiled from the rule content. Suppose each rule only generates one java file.")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getCompiledContent() {
    return compiledContent;
  }

  public void setCompiledContent(byte[] compiledContent) {
    this.compiledContent = compiledContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRule businessRule = (BusinessRule) o;
    return Objects.equals(this.id, businessRule.id) &&
        Objects.equals(this.ruleDefinitionId, businessRule.ruleDefinitionId) &&
        Objects.equals(this.ruleName, businessRule.ruleName) &&
        Objects.equals(this.tenantKey, businessRule.tenantKey) &&
        Objects.equals(this.ruleContent, businessRule.ruleContent) &&
        Objects.equals(this.compiledContent, businessRule.compiledContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleDefinitionId, ruleName, tenantKey, ruleContent, compiledContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleDefinitionId: ").append(toIndentedString(ruleDefinitionId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    tenantKey: ").append(toIndentedString(tenantKey)).append("\n");
    sb.append("    ruleContent: ").append(toIndentedString(ruleContent)).append("\n");
    sb.append("    compiledContent: ").append(toIndentedString(compiledContent)).append("\n");
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

