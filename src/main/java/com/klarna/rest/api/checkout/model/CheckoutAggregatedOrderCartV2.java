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
import com.klarna.rest.api.checkout.model.CheckoutAggregatedOrderCartItemV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CheckoutAggregatedOrderCartV2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-25T11:03:40.852Z")
public class CheckoutAggregatedOrderCartV2 {
  @JsonProperty("items")
  private List<CheckoutAggregatedOrderCartItemV2> items = null;

  @JsonProperty("total_price_including_tax")
  private Long totalPriceIncludingTax = null;

  @JsonProperty("total_tax_amount")
  private Long totalTaxAmount = null;

  @JsonProperty("total_price_excluding_tax")
  private Long totalPriceExcludingTax = null;

  public CheckoutAggregatedOrderCartV2 items(List<CheckoutAggregatedOrderCartItemV2> items) {
    this.items = items;
    return this;
  }

  public CheckoutAggregatedOrderCartV2 addItemsItem(CheckoutAggregatedOrderCartItemV2 itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<CheckoutAggregatedOrderCartItemV2>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<CheckoutAggregatedOrderCartItemV2> getItems() {
    return items;
  }

  public void setItems(List<CheckoutAggregatedOrderCartItemV2> items) {
    this.items = items;
  }

  public CheckoutAggregatedOrderCartV2 totalPriceIncludingTax(Long totalPriceIncludingTax) {
    this.totalPriceIncludingTax = totalPriceIncludingTax;
    return this;
  }

   /**
   * Get totalPriceIncludingTax
   * @return totalPriceIncludingTax
  **/
  @ApiModelProperty(value = "")
  public Long getTotalPriceIncludingTax() {
    return totalPriceIncludingTax;
  }

  public void setTotalPriceIncludingTax(Long totalPriceIncludingTax) {
    this.totalPriceIncludingTax = totalPriceIncludingTax;
  }

  public CheckoutAggregatedOrderCartV2 totalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Get totalTaxAmount
   * @return totalTaxAmount
  **/
  @ApiModelProperty(value = "")
  public Long getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public CheckoutAggregatedOrderCartV2 totalPriceExcludingTax(Long totalPriceExcludingTax) {
    this.totalPriceExcludingTax = totalPriceExcludingTax;
    return this;
  }

   /**
   * Get totalPriceExcludingTax
   * @return totalPriceExcludingTax
  **/
  @ApiModelProperty(value = "")
  public Long getTotalPriceExcludingTax() {
    return totalPriceExcludingTax;
  }

  public void setTotalPriceExcludingTax(Long totalPriceExcludingTax) {
    this.totalPriceExcludingTax = totalPriceExcludingTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutAggregatedOrderCartV2 aggregatedOrderCartV2 = (CheckoutAggregatedOrderCartV2) o;
    return Objects.equals(this.items, aggregatedOrderCartV2.items) &&
        Objects.equals(this.totalPriceIncludingTax, aggregatedOrderCartV2.totalPriceIncludingTax) &&
        Objects.equals(this.totalTaxAmount, aggregatedOrderCartV2.totalTaxAmount) &&
        Objects.equals(this.totalPriceExcludingTax, aggregatedOrderCartV2.totalPriceExcludingTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalPriceIncludingTax, totalTaxAmount, totalPriceExcludingTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutAggregatedOrderCartV2 {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalPriceIncludingTax: ").append(toIndentedString(totalPriceIncludingTax)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    totalPriceExcludingTax: ").append(toIndentedString(totalPriceExcludingTax)).append("\n");
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

