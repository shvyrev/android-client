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
 * FundInvestInfo
 */

public class FundInvestInfo
{
	@SerializedName("title")
	private String title = null;

	@SerializedName("availableInWallet")
	private Double availableInWallet = null;

	@SerializedName("minInvestmentAmount")
	private Double minInvestmentAmount = null;

	@SerializedName("entryFee")
	private Double entryFee = null;

	@SerializedName("gvCommission")
	private Double gvCommission = null;

	@SerializedName("rate")
	private Double rate = null;

	public FundInvestInfo title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@ApiModelProperty(value = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public FundInvestInfo availableInWallet(Double availableInWallet) {
		this.availableInWallet = availableInWallet;
		return this;
	}

	/**
	 * Get availableInWallet
	 *
	 * @return availableInWallet
	 **/
	@ApiModelProperty(value = "")
	public Double getAvailableInWallet() {
		return availableInWallet;
	}

	public void setAvailableInWallet(Double availableInWallet) {
		this.availableInWallet = availableInWallet;
	}

	public FundInvestInfo minInvestmentAmount(Double minInvestmentAmount) {
		this.minInvestmentAmount = minInvestmentAmount;
		return this;
	}

	/**
	 * Get minInvestmentAmount
	 *
	 * @return minInvestmentAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getMinInvestmentAmount() {
		return minInvestmentAmount;
	}

	public void setMinInvestmentAmount(Double minInvestmentAmount) {
		this.minInvestmentAmount = minInvestmentAmount;
	}

	public FundInvestInfo entryFee(Double entryFee) {
		this.entryFee = entryFee;
		return this;
	}

	/**
	 * Get entryFee
	 *
	 * @return entryFee
	 **/
	@ApiModelProperty(value = "")
	public Double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}

	public FundInvestInfo gvCommission(Double gvCommission) {
		this.gvCommission = gvCommission;
		return this;
	}

	/**
	 * Get gvCommission
	 *
	 * @return gvCommission
	 **/
	@ApiModelProperty(value = "")
	public Double getGvCommission() {
		return gvCommission;
	}

	public void setGvCommission(Double gvCommission) {
		this.gvCommission = gvCommission;
	}

	public FundInvestInfo rate(Double rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * Get rate
	 *
	 * @return rate
	 **/
	@ApiModelProperty(value = "")
	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FundInvestInfo fundInvestInfo = (FundInvestInfo) o;
		return Objects.equals(this.title, fundInvestInfo.title) &&
				Objects.equals(this.availableInWallet, fundInvestInfo.availableInWallet) &&
				Objects.equals(this.minInvestmentAmount, fundInvestInfo.minInvestmentAmount) &&
				Objects.equals(this.entryFee, fundInvestInfo.entryFee) &&
				Objects.equals(this.gvCommission, fundInvestInfo.gvCommission) &&
				Objects.equals(this.rate, fundInvestInfo.rate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, availableInWallet, minInvestmentAmount, entryFee, gvCommission, rate);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FundInvestInfo {\n");

		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    availableInWallet: ").append(toIndentedString(availableInWallet)).append("\n");
		sb.append("    minInvestmentAmount: ").append(toIndentedString(minInvestmentAmount)).append("\n");
		sb.append("    entryFee: ").append(toIndentedString(entryFee)).append("\n");
		sb.append("    gvCommission: ").append(toIndentedString(gvCommission)).append("\n");
		sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

