/*
 * Core API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * OtherAssetsValue
 */

public class OtherAssetsValue
{
	@SerializedName("amount")
	private Integer amount = null;

	@SerializedName("value")
	private Double value = null;

	@SerializedName("changePercent")
	private Double changePercent = null;

	@SerializedName("changeValue")
	private Double changeValue = null;

	public OtherAssetsValue amount(Integer amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 *
	 * @return amount
	 **/
	@ApiModelProperty(value = "")
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public OtherAssetsValue value(Double value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 *
	 * @return value
	 **/
	@ApiModelProperty(value = "")
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public OtherAssetsValue changePercent(Double changePercent) {
		this.changePercent = changePercent;
		return this;
	}

	/**
	 * Get changePercent
	 *
	 * @return changePercent
	 **/
	@ApiModelProperty(value = "")
	public Double getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(Double changePercent) {
		this.changePercent = changePercent;
	}

	public OtherAssetsValue changeValue(Double changeValue) {
		this.changeValue = changeValue;
		return this;
	}

	/**
	 * Get changeValue
	 *
	 * @return changeValue
	 **/
	@ApiModelProperty(value = "")
	public Double getChangeValue() {
		return changeValue;
	}

	public void setChangeValue(Double changeValue) {
		this.changeValue = changeValue;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OtherAssetsValue otherAssetsValue = (OtherAssetsValue) o;
		return Objects.equals(this.amount, otherAssetsValue.amount) &&
				Objects.equals(this.value, otherAssetsValue.value) &&
				Objects.equals(this.changePercent, otherAssetsValue.changePercent) &&
				Objects.equals(this.changeValue, otherAssetsValue.changeValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, value, changePercent, changeValue);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OtherAssetsValue {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    changePercent: ").append(toIndentedString(changePercent)).append("\n");
		sb.append("    changeValue: ").append(toIndentedString(changeValue)).append("\n");
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

