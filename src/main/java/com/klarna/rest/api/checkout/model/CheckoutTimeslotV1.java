/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.checkout.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CheckoutTimeslotV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-25T11:03:40.852Z")
public class CheckoutTimeslotV1 {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  public CheckoutTimeslotV1 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutTimeslotV1 start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Start time
   * @return start
  **/
  @ApiModelProperty(value = "Start time")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public CheckoutTimeslotV1 end(String end) {
    this.end = end;
    return this;
  }

   /**
   * End time
   * @return end
  **/
  @ApiModelProperty(value = "End time")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutTimeslotV1 timeslotV1 = (CheckoutTimeslotV1) o;
    return Objects.equals(this.id, timeslotV1.id) &&
        Objects.equals(this.start, timeslotV1.start) &&
        Objects.equals(this.end, timeslotV1.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, start, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutTimeslotV1 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

