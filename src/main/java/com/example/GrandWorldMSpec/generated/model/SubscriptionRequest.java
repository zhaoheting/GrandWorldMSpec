package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.SubscriptionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The request of subscriber report.
 */
@ApiModel(description = "The request of subscriber report.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-17T11:58:54.625+08:00")

public class SubscriptionRequest   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("lastUpdated")
  private String lastUpdated = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("subscriptionInfo")
  private SubscriptionInfo subscriptionInfo = null;

  public SubscriptionRequest key(String key) {
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

  public SubscriptionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Subscriber service name, read from subscriber’s own properties.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Subscriber service name, read from subscriber’s own properties.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Subscriber’s IP address.
   * @return ipAddress
  **/
  @ApiModelProperty(required = true, value = "Subscriber’s IP address.")
  @NotNull

@Pattern(regexp="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}") 
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public SubscriptionRequest lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Timestamp of when this subscriber reload itself last time.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Timestamp of when this subscriber reload itself last time.")


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public SubscriptionRequest metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Metadata of the subscriber it wants to use, such as subscriber’s service version.
   * @return metadata
  **/
  @ApiModelProperty(value = "Metadata of the subscriber it wants to use, such as subscriber’s service version.")


  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public SubscriptionRequest subscriptionInfo(SubscriptionInfo subscriptionInfo) {
    this.subscriptionInfo = subscriptionInfo;
    return this;
  }

  /**
   * Get subscriptionInfo
   * @return subscriptionInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.key, subscriptionRequest.key) &&
        Objects.equals(this.name, subscriptionRequest.name) &&
        Objects.equals(this.ipAddress, subscriptionRequest.ipAddress) &&
        Objects.equals(this.lastUpdated, subscriptionRequest.lastUpdated) &&
        Objects.equals(this.metadata, subscriptionRequest.metadata) &&
        Objects.equals(this.subscriptionInfo, subscriptionRequest.subscriptionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ipAddress, lastUpdated, metadata, subscriptionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

