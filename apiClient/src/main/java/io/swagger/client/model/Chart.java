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
 * Chart
 */

public class Chart
{
	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("fund")
	private Double fund = null;

	@SerializedName("profit")
	private Double profit = null;

	@SerializedName("loss")
	private Double loss = null;

	@SerializedName("totalProfit")
	private Double totalProfit = null;

	public Chart date(DateTime date) {
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

	public Chart fund(Double fund) {
		this.fund = fund;
		return this;
	}

	/**
	 * Get fund
	 *
	 * @return fund
	 **/
	@ApiModelProperty(value = "")
	public Double getFund() {
		return fund;
	}

	public void setFund(Double fund) {
		this.fund = fund;
	}

	public Chart profit(Double profit) {
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

	public Chart loss(Double loss) {
		this.loss = loss;
		return this;
	}

	/**
	 * Get loss
	 *
	 * @return loss
	 **/
	@ApiModelProperty(value = "")
	public Double getLoss() {
		return loss;
	}

	public void setLoss(Double loss) {
		this.loss = loss;
	}

	public Chart totalProfit(Double totalProfit) {
		this.totalProfit = totalProfit;
		return this;
	}

	/**
	 * Get totalProfit
	 *
	 * @return totalProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(Double totalProfit) {
		this.totalProfit = totalProfit;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Chart chart = (Chart) o;
		return Objects.equals(this.date, chart.date) &&
				Objects.equals(this.fund, chart.fund) &&
				Objects.equals(this.profit, chart.profit) &&
				Objects.equals(this.loss, chart.loss) &&
				Objects.equals(this.totalProfit, chart.totalProfit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, fund, profit, loss, totalProfit);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Chart {\n");

		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
		sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
		sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
		sb.append("    totalProfit: ").append(toIndentedString(totalProfit)).append("\n");
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
