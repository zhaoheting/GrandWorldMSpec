package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.TableRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Table rule response model.
 */
@ApiModel(description = "Table rule response model.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-18T14:03:57.953+08:00")

public class TableRuleResponse   {
  @JsonProperty("tableRule")
  private TableRule tableRule = null;

  @JsonProperty("totalPage")
  private Integer totalPage = null;

  @JsonProperty("currentPage")
  private Integer currentPage = null;

  public TableRuleResponse tableRule(TableRule tableRule) {
    this.tableRule = tableRule;
    return this;
  }

  /**
   * Get tableRule
   * @return tableRule
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TableRule getTableRule() {
    return tableRule;
  }

  public void setTableRule(TableRule tableRule) {
    this.tableRule = tableRule;
  }

  public TableRuleResponse totalPage(Integer totalPage) {
    this.totalPage = totalPage;
    return this;
  }

  /**
   * Total pages of the table rule content.
   * @return totalPage
  **/
  @ApiModelProperty(value = "Total pages of the table rule content.")


  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }

  public TableRuleResponse currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Current page of the table rule content.
   * @return currentPage
  **/
  @ApiModelProperty(value = "Current page of the table rule content.")


  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRuleResponse tableRuleResponse = (TableRuleResponse) o;
    return Objects.equals(this.tableRule, tableRuleResponse.tableRule) &&
        Objects.equals(this.totalPage, tableRuleResponse.totalPage) &&
        Objects.equals(this.currentPage, tableRuleResponse.currentPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableRule, totalPage, currentPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleResponse {\n");
    
    sb.append("    tableRule: ").append(toIndentedString(tableRule)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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

