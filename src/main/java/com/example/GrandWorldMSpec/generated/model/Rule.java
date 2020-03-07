package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rule entity of both table rule and business rule.
 */
@ApiModel(description = "Rule entity of both table rule and business rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-07T20:48:33.284+08:00")

public class Rule   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("lastUpdated")
  private LocalDate lastUpdated = null;

  @JsonProperty("tenantCode")
  private String tenantCode = null;

  public Rule name(String name) {
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

  public Rule lastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Last report time of the name.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Last report time of the name.")

  @Valid

  public LocalDate getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Rule tenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
    return this;
  }

  /**
   * Code of the tenant.
   * @return tenantCode
  **/
  @ApiModelProperty(value = "Code of the tenant.")


  public String getTenantCode() {
    return tenantCode;
  }

  public void setTenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.name, rule.name) &&
        Objects.equals(this.lastUpdated, rule.lastUpdated) &&
        Objects.equals(this.tenantCode, rule.tenantCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastUpdated, tenantCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    tenantCode: ").append(toIndentedString(tenantCode)).append("\n");
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

