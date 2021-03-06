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

import org.joda.time.DateTime;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * BalanceChartElement
 */

public class BalanceChartElement
{
	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("managerFunds")
	private Double managerFunds = null;

	@SerializedName("investorsFunds")
	private Double investorsFunds = null;

	public BalanceChartElement date(DateTime date) {
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

	public BalanceChartElement managerFunds(Double managerFunds) {
		this.managerFunds = managerFunds;
		return this;
	}

	/**
	 * Get managerFunds
	 *
	 * @return managerFunds
	 **/
	@ApiModelProperty(value = "")
	public Double getManagerFunds() {
		return managerFunds;
	}

	public void setManagerFunds(Double managerFunds) {
		this.managerFunds = managerFunds;
	}

	public BalanceChartElement investorsFunds(Double investorsFunds) {
		this.investorsFunds = investorsFunds;
		return this;
	}

	/**
	 * Get investorsFunds
	 *
	 * @return investorsFunds
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestorsFunds() {
		return investorsFunds;
	}

	public void setInvestorsFunds(Double investorsFunds) {
		this.investorsFunds = investorsFunds;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BalanceChartElement balanceChartElement = (BalanceChartElement) o;
		return Objects.equals(this.date, balanceChartElement.date) &&
				Objects.equals(this.managerFunds, balanceChartElement.managerFunds) &&
				Objects.equals(this.investorsFunds, balanceChartElement.investorsFunds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, managerFunds, investorsFunds);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BalanceChartElement {\n");

		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    managerFunds: ").append(toIndentedString(managerFunds)).append("\n");
		sb.append("    investorsFunds: ").append(toIndentedString(investorsFunds)).append("\n");
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

