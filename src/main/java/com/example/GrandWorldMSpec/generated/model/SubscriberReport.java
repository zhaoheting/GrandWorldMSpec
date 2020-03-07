package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.SubscriptionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The data model of subscriber report.
 */
@ApiModel(description = "The data model of subscriber report.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-07T20:48:33.284+08:00")

public class SubscriberReport   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("lastUpdated")
  private LocalDate lastUpdated = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("subscriptionInfo")
  private SubscriptionInfo subscriptionInfo = null;

  public SubscriberReport key(String key) {
    this.key = key;
    return this;
  }

  /**
   * UUID that rule engine service generated, null if this is the first time.
   * @return key
  **/
  @ApiModelProperty(value = "UUID that rule engine service generated, null if this is the first time.")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SubscriberReport name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Subscriber service name, read from subscriber’s own properties.
   * @return name
  **/
  @ApiModelProperty(value = "Subscriber service name, read from subscriber’s own properties.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriberReport status(String status) {
    this.status = status;
    return this;
  }

  /**
   * success or error (status of the subscription)
   * @return status
  **/
  @ApiModelProperty(value = "success or error (status of the subscription)")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SubscriberReport address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Subscriber’s IP address.
   * @return address
  **/
  @ApiModelProperty(value = "Subscriber’s IP address.")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public SubscriberReport lastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Timestamp of when this subscriber reload itself last time.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Timestamp of when this subscriber reload itself last time.")

  @Valid

  public LocalDate getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public SubscriberReport metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * metadata of the subscriber it wants to use, such as subscriber’s service version.
   * @return metadata
  **/
  @ApiModelProperty(value = "metadata of the subscriber it wants to use, such as subscriber’s service version.")


  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public SubscriberReport subscriptionInfo(SubscriptionInfo subscriptionInfo) {
    this.subscriptionInfo = subscriptionInfo;
    return this;
  }

  /**
   * A subscription info entity.
   * @return subscriptionInfo
  **/
  @ApiModelProperty(value = "A subscription info entity.")

  @Valid

  public SubscriptionInfo getSubscriptionInfo() {
    return subscriptionInfo;
  }

  public void setSubscriptionInfo(SubscriptionInfo subscriptionInfo) {
    this.subscriptionInfo = subscriptionInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberReport subscriberReport = (SubscriberReport) o;
    return Objects.equals(this.key, subscriberReport.key) &&
        Objects.equals(this.name, subscriberReport.name) &&
        Objects.equals(this.status, subscriberReport.status) &&
        Objects.equals(this.address, subscriberReport.address) &&
        Objects.equals(this.lastUpdated, subscriberReport.lastUpdated) &&
        Objects.equals(this.metadata, subscriberReport.metadata) &&
        Objects.equals(this.subscriptionInfo, subscriberReport.subscriptionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, status, address, lastUpdated, metadata, subscriptionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberReport {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    subscriptionInfo: ").append(toIndentedString(subscriptionInfo)).append("\n");
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

