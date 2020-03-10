package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.TableRuleData;
import com.example.GrandWorldMSpec.generated.model.TableRuleDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response model of load table rule interface.
 */
@ApiModel(description = "Response model of load table rule interface.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-10T15:19:04.437+08:00")

public class TableRuleResponse   {
  @JsonProperty("definition")
  private TableRuleDefinition definition = null;

  @JsonProperty("data")
  private TableRuleData data = null;

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

  public TableRuleResponse data(TableRuleData data) {
    this.data = data;
    return this;
  }

  /**
   * Data of the table rule.
   * @return data
  **/
  @ApiModelProperty(value = "Data of the table rule.")

  @Valid

  public TableRuleData getData() {
    return data;
  }

  public void setData(TableRuleData data) {
    this.data = data;
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
        Objects.equals(this.data, tableRuleResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleResponse {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

