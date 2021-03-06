package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rule summary info of both table rule and business rule.
 */
@ApiModel(description = "Rule summary info of both table rule and business rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-18T14:03:57.953+08:00")

public class RuleSummary   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("lastUpdated")
  private String lastUpdated = null;

  @JsonProperty("tenantKey")
  private String tenantKey = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    UPDATED("updated"),
    
    FAILEDTOREFRESH("failedToRefresh"),
    
    PENDING("pending");

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

  public RuleSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of a table rule or business rule.
   * @return name
  **/
  @ApiModelProperty(value = "The name of a table rule or business rule.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RuleSummary lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Last report time of the rule.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Last report time of the rule.")


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public RuleSummary tenantKey(String tenantKey) {
    this.tenantKey = tenantKey;
    return this;
  }

  /**
   * Code of the tenant.
   * @return tenantKey
  **/
  @ApiModelProperty(value = "Code of the tenant.")


  public String getTenantKey() {
    return tenantKey;
  }

  public void setTenantKey(String tenantKey) {
    this.tenantKey = tenantKey;
  }

  public RuleSummary status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSummary ruleSummary = (RuleSummary) o;
    return Objects.equals(this.name, ruleSummary.name) &&
        Objects.equals(this.lastUpdated, ruleSummary.lastUpdated) &&
        Objects.equals(this.tenantKey, ruleSummary.tenantKey) &&
        Objects.equals(this.status, ruleSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastUpdated, tenantKey, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    tenantKey: ").append(toIndentedString(tenantKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

