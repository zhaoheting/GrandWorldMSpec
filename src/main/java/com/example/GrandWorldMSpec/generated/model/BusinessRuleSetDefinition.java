package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Business rule-set definition entity.
 */
@ApiModel(description = "Business rule-set definition entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-10T15:19:04.437+08:00")

public class BusinessRuleSetDefinition   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("RuleSetName")
  private String ruleSetName = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("definitionContent")
  private String definitionContent = null;

  @JsonProperty("compiledContent")
  private byte[] compiledContent = null;

  @JsonProperty("lastUpdated")
  private String lastUpdated = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    ACTIVATED("Activated"),
    
    DROPPED("Dropped");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("auditId")
  private Integer auditId = null;

  public BusinessRuleSetDefinition id(Integer id) {
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

  public BusinessRuleSetDefinition ruleSetName(String ruleSetName) {
    this.ruleSetName = ruleSetName;
    return this;
  }

  /**
   * Business rule set name.
   * @return ruleSetName
  **/
  @ApiModelProperty(value = "Business rule set name.")


  public String getRuleSetName() {
    return ruleSetName;
  }

  public void setRuleSetName(String ruleSetName) {
    this.ruleSetName = ruleSetName;
  }

  public BusinessRuleSetDefinition version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public BusinessRuleSetDefinition definitionContent(String definitionContent) {
    this.definitionContent = definitionContent;
    return this;
  }

  /**
   * XML Clob with rule-set definition.
   * @return definitionContent
  **/
  @ApiModelProperty(value = "XML Clob with rule-set definition.")


  public String getDefinitionContent() {
    return definitionContent;
  }

  public void setDefinitionContent(String definitionContent) {
    this.definitionContent = definitionContent;
  }

  public BusinessRuleSetDefinition compiledContent(byte[] compiledContent) {
    this.compiledContent = compiledContent;
    return this;
  }

  /**
   * Java content compiled from the rule content. Suppose each rule-set definition only generates one java file.
   * @return compiledContent
  **/
  @ApiModelProperty(value = "Java content compiled from the rule content. Suppose each rule-set definition only generates one java file.")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getCompiledContent() {
    return compiledContent;
  }

  public void setCompiledContent(byte[] compiledContent) {
    this.compiledContent = compiledContent;
  }

  public BusinessRuleSetDefinition lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Timestamp when it’s last updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Timestamp when it’s last updated.")


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public BusinessRuleSetDefinition status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BusinessRuleSetDefinition auditId(Integer auditId) {
    this.auditId = auditId;
    return this;
  }

  /**
   * Foreign key references to the audit table.
   * @return auditId
  **/
  @ApiModelProperty(value = "Foreign key references to the audit table.")


  public Integer getAuditId() {
    return auditId;
  }

  public void setAuditId(Integer auditId) {
    this.auditId = auditId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRuleSetDefinition businessRuleSetDefinition = (BusinessRuleSetDefinition) o;
    return Objects.equals(this.id, businessRuleSetDefinition.id) &&
        Objects.equals(this.ruleSetName, businessRuleSetDefinition.ruleSetName) &&
        Objects.equals(this.version, businessRuleSetDefinition.version) &&
        Objects.equals(this.definitionContent, businessRuleSetDefinition.definitionContent) &&
        Objects.equals(this.compiledContent, businessRuleSetDefinition.compiledContent) &&
        Objects.equals(this.lastUpdated, businessRuleSetDefinition.lastUpdated) &&
        Objects.equals(this.status, businessRuleSetDefinition.status) &&
        Objects.equals(this.auditId, businessRuleSetDefinition.auditId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleSetName, version, definitionContent, compiledContent, lastUpdated, status, auditId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRuleSetDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleSetName: ").append(toIndentedString(ruleSetName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    definitionContent: ").append(toIndentedString(definitionContent)).append("\n");
    sb.append("    compiledContent: ").append(toIndentedString(compiledContent)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
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

