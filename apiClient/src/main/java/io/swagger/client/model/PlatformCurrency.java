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
 * PlatformCurrency
 */

public class PlatformCurrency
{
	@SerializedName("name")
	private String name = null;

	@SerializedName("rateToGvt")
	private Double rateToGvt = null;

	public PlatformCurrency name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlatformCurrency rateToGvt(Double rateToGvt) {
		this.rateToGvt = rateToGvt;
		return this;
	}

	/**
	 * Get rateToGvt
	 *
	 * @return rateToGvt
	 **/
	@ApiModelProperty(value = "")
	public Double getRateToGvt() {
		return rateToGvt;
	}

	public void setRateToGvt(Double rateToGvt) {
		this.rateToGvt = rateToGvt;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlatformCurrency platformCurrency = (PlatformCurrency) o;
		return Objects.equals(this.name, platformCurrency.name) &&
				Objects.equals(this.rateToGvt, platformCurrency.rateToGvt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rateToGvt);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlatformCurrency {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    rateToGvt: ").append(toIndentedString(rateToGvt)).append("\n");
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

