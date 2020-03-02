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
 * transform the result
 */
@ApiModel(description = "transform the result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-02T14:17:48.563+08:00")

public class RuleResponse   {
  @JsonProperty("ruleInBytes")
  private byte[] ruleInBytes = null;

  public RuleResponse ruleInBytes(byte[] ruleInBytes) {
    this.ruleInBytes = ruleInBytes;
    return this;
  }

  /**
   * put zip file in a byte array.
   * @return ruleInBytes
  **/
  @ApiModelProperty(value = "put zip file in a byte array.")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getRuleInBytes() {
    return ruleInBytes;
  }

  public void setRuleInBytes(byte[] ruleInBytes) {
    this.ruleInBytes = ruleInBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleResponse ruleResponse = (RuleResponse) o;
    return Objects.equals(this.ruleInBytes, ruleResponse.ruleInBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleInBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleResponse {\n");
    
    sb.append("    ruleInBytes: ").append(toIndentedString(ruleInBytes)).append("\n");
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

