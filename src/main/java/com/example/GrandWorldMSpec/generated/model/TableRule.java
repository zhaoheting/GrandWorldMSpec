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
 * Table rule entity.
 */
@ApiModel(description = "Table rule entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-17T11:58:54.625+08:00")

public class TableRule   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("bundle")
  private String bundle = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("data")
  private String data = null;

  @JsonProperty("tenantKey")
  private String tenantKey = null;

  @JsonProperty("lastUpdated")
  private String lastUpdated = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    ACTIVATED("Activated"),
    
    DROPPED("Dropped");

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

  @JsonProperty("auditId")
  private Integer auditId = null;

  public TableRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier.
   * @return id
  **/
  @ApiModelProperty(value = "Identifier.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TableRule bundle(String bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")


  public String getBundle() {
    return bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  public TableRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TableRule version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public TableRule data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public TableRule tenantKey(String tenantKey) {
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

  public TableRule lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Timestamp when it’s last updated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Timestamp when it’s last updated")


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public TableRule status(StatusEnum status) {
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

  public TableRule auditId(Integer auditId) {
    this.auditId = auditId;
    return this;
  }

  /**
   * Foreign key references to the audit table.
   * @return auditId
  **/
  @ApiModelProperty(value = "Foreign key references to the audit table.")


  public Integer getAuditId() {
    return auditId;
  }

  public void setAuditId(Integer auditId) {
    this.auditId = auditId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRule tableRule = (TableRule) o;
    return Objects.equals(this.id, tableRule.id) &&
        Objects.equals(this.bundle, tableRule.bundle) &&
        Objects.equals(this.name, tableRule.name) &&
        Objects.equals(this.version, tableRule.version) &&
        Objects.equals(this.data, tableRule.data) &&
        Objects.equals(this.tenantKey, tableRule.tenantKey) &&
        Objects.equals(this.lastUpdated, tableRule.lastUpdated) &&
        Objects.equals(this.status, tableRule.status) &&
        Objects.equals(this.auditId, tableRule.auditId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bundle, name, version, data, tenantKey, lastUpdated, status, auditId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    tenantKey: ").append(toIndentedString(tenantKey)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
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

