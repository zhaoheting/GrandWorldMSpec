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
 * Row data of table rule.
 */
@ApiModel(description = "Row data of table rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-16T13:26:14.544+08:00")

public class TableRuleRowData   {
  @JsonProperty("rowId")
  private Integer rowId = null;

  @JsonProperty("ruleDefinitionId")
  private Integer ruleDefinitionId = null;

  @JsonProperty("rowContent")
  private String rowContent = null;

  @JsonProperty("tenantKey")
  private String tenantKey = null;

  public TableRuleRowData rowId(Integer rowId) {
    this.rowId = rowId;
    return this;
  }

  /**
   * Identifier
   * @return rowId
  **/
  @ApiModelProperty(value = "Identifier")


  public Integer getRowId() {
    return rowId;
  }

  public void setRowId(Integer rowId) {
    this.rowId = rowId;
  }

  public TableRuleRowData ruleDefinitionId(Integer ruleDefinitionId) {
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

  public TableRuleRowData rowContent(String rowContent) {
    this.rowContent = rowContent;
    return this;
  }

  /**
   * XML clob with each row content.
   * @return rowContent
  **/
  @ApiModelProperty(value = "XML clob with each row content.")


  public String getRowContent() {
    return rowContent;
  }

  public void setRowContent(String rowContent) {
    this.rowContent = rowContent;
  }

  public TableRuleRowData tenantKey(String tenantKey) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRuleRowData tableRuleRowData = (TableRuleRowData) o;
    return Objects.equals(this.rowId, tableRuleRowData.rowId) &&
        Objects.equals(this.ruleDefinitionId, tableRuleRowData.ruleDefinitionId) &&
        Objects.equals(this.rowContent, tableRuleRowData.rowContent) &&
        Objects.equals(this.tenantKey, tableRuleRowData.tenantKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowId, ruleDefinitionId, rowContent, tenantKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleRowData {\n");
    
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    ruleDefinitionId: ").append(toIndentedString(ruleDefinitionId)).append("\n");
    sb.append("    rowContent: ").append(toIndentedString(rowContent)).append("\n");
    sb.append("    tenantKey: ").append(toIndentedString(tenantKey)).append("\n");
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

