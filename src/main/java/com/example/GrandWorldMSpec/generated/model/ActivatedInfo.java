package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
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
 * jkljk
 */
@ApiModel(description = "jkljk")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-04T16:16:02.453+08:00")

public class ActivatedInfo   {
  @JsonProperty("ruleGroup")
  private String ruleGroup = null;

  @JsonProperty("ruleList")
  @Valid
  private List<String> ruleList = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("activatedTime")
  private String activatedTime = null;

  public ActivatedInfo ruleGroup(String ruleGroup) {
    this.ruleGroup = ruleGroup;
    return this;
  }

  /**
   * jkljk
   * @return ruleGroup
  **/
  @ApiModelProperty(value = "jkljk")


  public String getRuleGroup() {
    return ruleGroup;
  }

  public void setRuleGroup(String ruleGroup) {
    this.ruleGroup = ruleGroup;
  }

  public ActivatedInfo ruleList(List<String> ruleList) {
    this.ruleList = ruleList;
    return this;
  }

  public ActivatedInfo addRuleListItem(String ruleListItem) {
    if (this.ruleList == null) {
      this.ruleList = new ArrayList<>();
    }
    this.ruleList.add(ruleListItem);
    return this;
  }

  /**
   * jkljkarray
   * @return ruleList
  **/
  @ApiModelProperty(value = "jkljkarray")


  public List<String> getRuleList() {
    return ruleList;
  }

  public void setRuleList(List<String> ruleList) {
    this.ruleList = ruleList;
  }

  public ActivatedInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * jkljk
   * @return version
  **/
  @ApiModelProperty(value = "jkljk")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ActivatedInfo activatedTime(String activatedTime) {
    this.activatedTime = activatedTime;
    return this;
  }

  /**
   * current time
   * @return activatedTime
  **/
  @ApiModelProperty(value = "current time")


  public String getActivatedTime() {
    return activatedTime;
  }

  public void setActivatedTime(String activatedTime) {
    this.activatedTime = activatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivatedInfo activatedInfo = (ActivatedInfo) o;
    return Objects.equals(this.ruleGroup, activatedInfo.ruleGroup) &&
        Objects.equals(this.ruleList, activatedInfo.ruleList) &&
        Objects.equals(this.version, activatedInfo.version) &&
        Objects.equals(this.activatedTime, activatedInfo.activatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleGroup, ruleList, version, activatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivatedInfo {\n");
    
    sb.append("    ruleGroup: ").append(toIndentedString(ruleGroup)).append("\n");
    sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    activatedTime: ").append(toIndentedString(activatedTime)).append("\n");
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

