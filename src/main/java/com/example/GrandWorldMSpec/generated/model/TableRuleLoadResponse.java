package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.TableRuleData;
import com.example.GrandWorldMSpec.generated.model.TableRuleDefinition;
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
 * Response model of load table rule interface.
 */
@ApiModel(description = "Response model of load table rule interface.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-07T20:48:33.284+08:00")

public class TableRuleLoadResponse   {
  @JsonProperty("definition")
  private TableRuleDefinition definition = null;

  @JsonProperty("rows")
  @Valid
  private List<TableRuleData> rows = null;

  @JsonProperty("total")
  private Integer total = null;

  public TableRuleLoadResponse definition(TableRuleDefinition definition) {
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

  public TableRuleLoadResponse rows(List<TableRuleData> rows) {
    this.rows = rows;
    return this;
  }

  public TableRuleLoadResponse addRowsItem(TableRuleData rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * All rows of the table rule.
   * @return rows
  **/
  @ApiModelProperty(value = "All rows of the table rule.")

  @Valid

  public List<TableRuleData> getRows() {
    return rows;
  }

  public void setRows(List<TableRuleData> rows) {
    this.rows = rows;
  }

  public TableRuleLoadResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total rows of the table rule.
   * @return total
  **/
  @ApiModelProperty(value = "The total rows of the table rule.")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRuleLoadResponse tableRuleLoadResponse = (TableRuleLoadResponse) o;
    return Objects.equals(this.definition, tableRuleLoadResponse.definition) &&
        Objects.equals(this.rows, tableRuleLoadResponse.rows) &&
        Objects.equals(this.total, tableRuleLoadResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, rows, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleLoadResponse {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

