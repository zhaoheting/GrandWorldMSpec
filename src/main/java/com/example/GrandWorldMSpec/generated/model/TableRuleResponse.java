package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.TableRuleDefinition;
import com.example.GrandWorldMSpec.generated.model.TableRuleRowData;
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
 * Response of loading table rule.
 */
@ApiModel(description = "Response of loading table rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-16T13:26:14.544+08:00")

public class TableRuleResponse   {
  @JsonProperty("definition")
  private TableRuleDefinition definition = null;

  @JsonProperty("tableRuleRows")
  @Valid
  private List<TableRuleRowData> tableRuleRows = null;

  @JsonProperty("totalRows")
  private Integer totalRows = null;

  @JsonProperty("currentPage")
  private Integer currentPage = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  public TableRuleResponse definition(TableRuleDefinition definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TableRuleDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(TableRuleDefinition definition) {
    this.definition = definition;
  }

  public TableRuleResponse tableRuleRows(List<TableRuleRowData> tableRuleRows) {
    this.tableRuleRows = tableRuleRows;
    return this;
  }

  public TableRuleResponse addTableRuleRowsItem(TableRuleRowData tableRuleRowsItem) {
    if (this.tableRuleRows == null) {
      this.tableRuleRows = new ArrayList<>();
    }
    this.tableRuleRows.add(tableRuleRowsItem);
    return this;
  }

  /**
   * Row list of table rule.
   * @return tableRuleRows
  **/
  @ApiModelProperty(value = "Row list of table rule.")

  @Valid

  public List<TableRuleRowData> getTableRuleRows() {
    return tableRuleRows;
  }

  public void setTableRuleRows(List<TableRuleRowData> tableRuleRows) {
    this.tableRuleRows = tableRuleRows;
  }

  public TableRuleResponse totalRows(Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * Total row amount of the table rule.
   * @return totalRows
  **/
  @ApiModelProperty(value = "Total row amount of the table rule.")


  public Integer getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(Integer totalRows) {
    this.totalRows = totalRows;
  }

  public TableRuleResponse currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Current page.
   * @return currentPage
  **/
  @ApiModelProperty(value = "Current page.")


  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public TableRuleResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Item amount in every page.
   * @return pageSize
  **/
  @ApiModelProperty(value = "Item amount in every page.")


  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
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
    return Objects.equals(this.definition, tableRuleResponse.definition) &&
        Objects.equals(this.tableRuleRows, tableRuleResponse.tableRuleRows) &&
        Objects.equals(this.totalRows, tableRuleResponse.totalRows) &&
        Objects.equals(this.currentPage, tableRuleResponse.currentPage) &&
        Objects.equals(this.pageSize, tableRuleResponse.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, tableRuleRows, totalRows, currentPage, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleResponse {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    tableRuleRows: ").append(toIndentedString(tableRuleRows)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

