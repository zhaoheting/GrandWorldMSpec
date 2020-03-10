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
 * Data of table rule.
 */
@ApiModel(description = "Data of table rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-10T15:19:04.437+08:00")

public class TableRuleData   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("ruleDefinitionId")
  private Integer ruleDefinitionId = null;

  @JsonProperty("ruleContent")
  private String ruleContent = null;

  @JsonProperty("tenantKey")
  private String tenantKey = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("market")
  private String market = null;

  public TableRuleData id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier
   * @return id
  **/
  @ApiModelProperty(value = "Identifier")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TableRuleData ruleDefinitionId(Integer ruleDefinitionId) {
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

  public TableRuleData ruleContent(String ruleContent) {
    this.ruleContent = ruleContent;
    return this;
  }

  /**
   * XML Clob of rule content.
   * @return ruleContent
  **/
  @ApiModelProperty(value = "XML Clob of rule content.")


  public String getRuleContent() {
    return ruleContent;
  }

  public void setRuleContent(String ruleContent) {
    this.ruleContent = ruleContent;
  }

  public TableRuleData tenantKey(String tenantKey) {
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

  public TableRuleData language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public TableRuleData market(String market) {
    this.market = market;
    return this;
  }

  /**
   * Get market
   * @return market
  **/
  @ApiModelProperty(value = "")


  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRuleData tableRuleData = (TableRuleData) o;
    return Objects.equals(this.id, tableRuleData.id) &&
        Objects.equals(this.ruleDefinitionId, tableRuleData.ruleDefinitionId) &&
        Objects.equals(this.ruleContent, tableRuleData.ruleContent) &&
        Objects.equals(this.tenantKey, tableRuleData.tenantKey) &&
        Objects.equals(this.language, tableRuleData.language) &&
        Objects.equals(this.market, tableRuleData.market);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleDefinitionId, ruleContent, tenantKey, language, market);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRuleData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleDefinitionId: ").append(toIndentedString(ruleDefinitionId)).append("\n");
    sb.append("    ruleContent: ").append(toIndentedString(ruleContent)).append("\n");
    sb.append("    tenantKey: ").append(toIndentedString(tenantKey)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
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

