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
 * ProgramBalanceChartElement
 */

public class ProgramBalanceChartElement
{
	@SerializedName("profit")
	private Double profit = null;

	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("managerFunds")
	private Double managerFunds = null;

	@SerializedName("investorsFunds")
	private Double investorsFunds = null;

	public ProgramBalanceChartElement profit(Double profit) {
		this.profit = profit;
		return this;
	}

	/**
	 * Get profit
	 *
	 * @return profit
	 **/
	@ApiModelProperty(value = "")
	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public ProgramBalanceChartElement date(DateTime date) {
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

	public ProgramBalanceChartElement managerFunds(Double managerFunds) {
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

	public ProgramBalanceChartElement investorsFunds(Double investorsFunds) {
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
		ProgramBalanceChartElement programBalanceChartElement = (ProgramBalanceChartElement) o;
		return Objects.equals(this.profit, programBalanceChartElement.profit) &&
				Objects.equals(this.date, programBalanceChartElement.date) &&
				Objects.equals(this.managerFunds, programBalanceChartElement.managerFunds) &&
				Objects.equals(this.investorsFunds, programBalanceChartElement.investorsFunds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(profit, date, managerFunds, investorsFunds);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramBalanceChartElement {\n");

		sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
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

