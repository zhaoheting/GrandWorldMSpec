package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Table rule definition entity.
 */
@ApiModel(description = "Table rule definition entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-07T20:48:33.284+08:00")

public class TableRuleDefinition   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("definitionContent")
  private String definitionContent = null;

  @JsonProperty("lastUpdated")
  private LocalDate lastUpdated = null;

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
  private Long auditId = null;

  public TableRuleDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier.
   * @return id
  **/
  @ApiModelProperty(value = "Identifier.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TableRuleDefinition group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")


  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public TableRuleDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TableRuleDefinition version(String version) {
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

  public TableRuleDefinition definitionContent(String definitionContent) {
    this.definitionContent = definitionContent;
    return this;
  }

  /**
   * Get definitionContent
   * @return definitionContent
  **/
  @ApiModelProperty(value = "")


  public String getDefinitionContent() {
    return definitionContent;
  }

  public void setDefinitionContent(String definitionContent) {
    this.definitionContent = definitionContent;
  }

  public TableRuleDefinition lastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Timestamp when it’s last updated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Timestamp when it’s last updated")

  @Valid

  public LocalDate getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public TableRuleDefinition status(StatusEnum status) {
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

  public TableRuleDefinition auditId(Long auditId) {
    this.auditId = auditId;
    return this;
  }

  /**
   * Foreign key references to the audit table.
   * @return auditId
  **/
  @ApiModelProperty(value = "Foreign key references to the audit table.")


  public Long getAuditId() {
    return auditId;
  }

  public void setAuditId(Long auditId) {
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
    TableRuleDefinition tableRuleDefinition = (TableRuleDefinition) o;
    return Objects.equals(this.id, tableRuleDefinition.id) &&
        Objects.equals(this.group, tableRuleDefinition.group) &&
        Objects.equals(this.name, tableRuleDefinition.name) &&
        Objects.equals(this.version, tableRuleDefinition.version) &&
        Objects.equals(this.definitionContent, tableRuleDefinition.definitionContent) &&
        Objects.equals(this.lastUpdated, tableRuleDefinition.lastUpdated) &&
        Objects.equals(this.status, tableRuleDefinition.status) &&
        Objects.equals(this.auditId, tableRuleDefinition.auditId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, group, name, version, definitionContent, lastUpdated, status, auditId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    definitionContent: ").append(toIndentedString(definitionContent)).append("\n");
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

