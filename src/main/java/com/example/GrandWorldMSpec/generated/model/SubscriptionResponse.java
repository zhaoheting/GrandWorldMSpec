package com.example.GrandWorldMSpec.generated.model;

import java.util.Objects;
import com.example.GrandWorldMSpec.generated.model.SubscriptionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response of subscriber report.
 */
@ApiModel(description = "The response of subscriber report.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-17T11:58:54.625+08:00")

public class SubscriptionResponse   {
  @JsonProperty("key")
  private String key = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    SUCCESS("success"),
    
    ERROR("error");

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

  @JsonProperty("subscriptionInfo")
  private SubscriptionInfo subscriptionInfo = null;

  public SubscriptionResponse key(String key) {
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

  public SubscriptionResponse status(StatusEnum status) {
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

  public SubscriptionResponse subscriptionInfo(SubscriptionInfo subscriptionInfo) {
    this.subscriptionInfo = subscriptionInfo;
    return this;
  }

  /**
   * Get subscriptionInfo
   * @return subscriptionInfo
  **/
  @ApiModelProperty(value = "")

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
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.key, subscriptionResponse.key) &&
        Objects.equals(this.status, subscriptionResponse.status) &&
        Objects.equals(this.subscriptionInfo, subscriptionResponse.subscriptionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, status, subscriptionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

