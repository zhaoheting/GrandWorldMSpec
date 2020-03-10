package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.RuleGroup;
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
 * Read from subscriber’s own properties.
 */
@ApiModel(description = "Read from subscriber’s own properties.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-10T15:19:04.437+08:00")

public class SubscriptionInfo   {
  @JsonProperty("tableRules")
  @Valid
  private List<RuleGroup> tableRules = null;

  @JsonProperty("businessRules")
  @Valid
  private List<RuleGroup> businessRules = null;

  public SubscriptionInfo tableRules(List<RuleGroup> tableRules) {
    this.tableRules = tableRules;
    return this;
  }

  public SubscriptionInfo addTableRulesItem(RuleGroup tableRulesItem) {
    if (this.tableRules == null) {
      this.tableRules = new ArrayList<>();
    }
    this.tableRules.add(tableRulesItem);
    return this;
  }

  /**
   * Group list of table rule.
   * @return tableRules
  **/
  @ApiModelProperty(value = "Group list of table rule.")

  @Valid

  public List<RuleGroup> getTableRules() {
    return tableRules;
  }

  public void setTableRules(List<RuleGroup> tableRules) {
    this.tableRules = tableRules;
  }

  public SubscriptionInfo businessRules(List<RuleGroup> businessRules) {
    this.businessRules = businessRules;
    return this;
  }

  public SubscriptionInfo addBusinessRulesItem(RuleGroup businessRulesItem) {
    if (this.businessRules == null) {
      this.businessRules = new ArrayList<>();
    }
    this.businessRules.add(businessRulesItem);
    return this;
  }

  /**
   * Group list of table rule business rule.
   * @return businessRules
  **/
  @ApiModelProperty(value = "Group list of table rule business rule.")

  @Valid

  public List<RuleGroup> getBusinessRules() {
    return businessRules;
  }

  public void setBusinessRules(List<RuleGroup> businessRules) {
    this.businessRules = businessRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionInfo subscriptionInfo = (SubscriptionInfo) o;
    return Objects.equals(this.tableRules, subscriptionInfo.tableRules) &&
        Objects.equals(this.businessRules, subscriptionInfo.businessRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableRules, businessRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInfo {\n");
    
    sb.append("    tableRules: ").append(toIndentedString(tableRules)).append("\n");
    sb.append("    businessRules: ").append(toIndentedString(businessRules)).append("\n");
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

