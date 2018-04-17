/*
 * Core API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * ChartByDate
 */

public class ChartByDate
{
	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("value")
	private Double value = null;

	public ChartByDate date(DateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Get date
	 *
	 * @return date
	 **/
	@ApiModelProperty(value = "")
	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public ChartByDate value(Double value) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChartByDate chartByDate = (ChartByDate) o;
		return Objects.equals(this.date, chartByDate.date) &&
				Objects.equals(this.value, chartByDate.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, value);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChartByDate {\n");

		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

