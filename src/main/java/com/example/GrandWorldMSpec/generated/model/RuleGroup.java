package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.RuleSummary;
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
 * Rule group entity of table rule or business rule.
 */
@ApiModel(description = "Rule group entity of table rule or business rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-17T11:58:54.625+08:00")

public class RuleGroup   {
  @JsonProperty("ruleGroupName")
  private String ruleGroupName = null;

  @JsonProperty("ruleList")
  @Valid
  private List<RuleSummary> ruleList = null;

  @JsonProperty("lastUpdated")
  private String lastUpdated = null;

  public RuleGroup ruleGroupName(String ruleGroupName) {
    this.ruleGroupName = ruleGroupName;
    return this;
  }

  /**
   * The name indicates table rule's bundle or business rule's ruleset.
   * @return ruleGroupName
  **/
  @ApiModelProperty(value = "The name indicates table rule's bundle or business rule's ruleset.")


  public String getRuleGroupName() {
    return ruleGroupName;
  }

  public void setRuleGroupName(String ruleGroupName) {
    this.ruleGroupName = ruleGroupName;
  }

  public RuleGroup ruleList(List<RuleSummary> ruleList) {
    this.ruleList = ruleList;
    return this;
  }

  public RuleGroup addRuleListItem(RuleSummary ruleListItem) {
    if (this.ruleList == null) {
      this.ruleList = new ArrayList<>();
    }
    this.ruleList.add(ruleListItem);
    return this;
  }

  /**
   * The subscribed rules of the group.
   * @return ruleList
  **/
  @ApiModelProperty(value = "The subscribed rules of the group.")

  @Valid

  public List<RuleSummary> getRuleList() {
    return ruleList;
  }

  public void setRuleList(List<RuleSummary> ruleList) {
    this.ruleList = ruleList;
  }

  public RuleGroup lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Last report time of the group.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Last report time of the group.")


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleGroup ruleGroup = (RuleGroup) o;
    return Objects.equals(this.ruleGroupName, ruleGroup.ruleGroupName) &&
        Objects.equals(this.ruleList, ruleGroup.ruleList) &&
        Objects.equals(this.lastUpdated, ruleGroup.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleGroupName, ruleList, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleGroup {\n");
    
    sb.append("    ruleGroupName: ").append(toIndentedString(ruleGroupName)).append("\n");
    sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

