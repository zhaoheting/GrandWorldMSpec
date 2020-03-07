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
 * One row of table rule.
 */
@ApiModel(description = "One row of table rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-07T20:48:33.284+08:00")

public class TableRuleData   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("ruleDefinitionId")
  private Integer ruleDefinitionId = null;

  @JsonProperty("rowContent")
  private String rowContent = null;

  @JsonProperty("tenantKey")
  private String tenantKey = null;

  @JsonProperty("rowId")
  private Integer rowId = null;

  public TableRuleData id(Integer id) {
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

  public TableRuleData ruleDefinitionId(Integer ruleDefinitionId) {
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

  public TableRuleData rowContent(String rowContent) {
    this.rowContent = rowContent;
    return this;
  }

  /**
   * XML Clob with each row content
   * @return rowContent
  **/
  @ApiModelProperty(value = "XML Clob with each row content")


  public String getRowContent() {
    return rowContent;
  }

  public void setRowContent(String rowContent) {
    this.rowContent = rowContent;
  }

  public TableRuleData tenantKey(String tenantKey) {
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

  public TableRuleData rowId(Integer rowId) {
    this.rowId = rowId;
    return this;
  }

  /**
   * Integer ID of each row, defines the order of each row.
   * @return rowId
  **/
  @ApiModelProperty(value = "Integer ID of each row, defines the order of each row.")


  public Integer getRowId() {
    return rowId;
  }

  public void setRowId(Integer rowId) {
    this.rowId = rowId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRuleData tableRuleData = (TableRuleData) o;
    return Objects.equals(this.id, tableRuleData.id) &&
        Objects.equals(this.ruleDefinitionId, tableRuleData.ruleDefinitionId) &&
        Objects.equals(this.rowContent, tableRuleData.rowContent) &&
        Objects.equals(this.tenantKey, tableRuleData.tenantKey) &&
        Objects.equals(this.rowId, tableRuleData.rowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleDefinitionId, rowContent, tenantKey, rowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleDefinitionId: ").append(toIndentedString(ruleDefinitionId)).append("\n");
    sb.append("    rowContent: ").append(toIndentedString(rowContent)).append("\n");
    sb.append("    tenantKey: ").append(toIndentedString(tenantKey)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
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

