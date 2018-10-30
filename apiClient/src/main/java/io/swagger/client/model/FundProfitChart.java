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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * FundProfitChart
 */

public class FundProfitChart
{
	@SerializedName("totalUsdProfit")
	private Double totalUsdProfit = null;

	@SerializedName("timeframeUsdProfit")
	private Double timeframeUsdProfit = null;

	@SerializedName("rebalances")
	private Integer rebalances = null;

	@SerializedName("creationDate")
	private DateTime creationDate = null;

	@SerializedName("equityChart")
	private List<ChartSimple> equityChart = null;

	@SerializedName("balance")
	private Double balance = null;

	@SerializedName("investors")
	private Integer investors = null;

	@SerializedName("profitChangePercent")
	private Double profitChangePercent = null;

	@SerializedName("sharpeRatio")
	private Double sharpeRatio = null;

	@SerializedName("sortinoRatio")
	private Double sortinoRatio = null;

	@SerializedName("calmarRatio")
	private Double calmarRatio = null;

	@SerializedName("maxDrawdown")
	private Double maxDrawdown = null;

	@SerializedName("totalGvtProfit")
	private Double totalGvtProfit = null;

	@SerializedName("timeframeGvtProfit")
	private Double timeframeGvtProfit = null;

	@SerializedName("rate")
	private Double rate = null;

	public FundProfitChart totalUsdProfit(Double totalUsdProfit) {
		this.totalUsdProfit = totalUsdProfit;
		return this;
	}

	/**
	 * Get totalUsdProfit
	 *
	 * @return totalUsdProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalUsdProfit() {
		return totalUsdProfit;
	}

	public void setTotalUsdProfit(Double totalUsdProfit) {
		this.totalUsdProfit = totalUsdProfit;
	}

	public FundProfitChart timeframeUsdProfit(Double timeframeUsdProfit) {
		this.timeframeUsdProfit = timeframeUsdProfit;
		return this;
	}

	/**
	 * Get timeframeUsdProfit
	 *
	 * @return timeframeUsdProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getTimeframeUsdProfit() {
		return timeframeUsdProfit;
	}

	public void setTimeframeUsdProfit(Double timeframeUsdProfit) {
		this.timeframeUsdProfit = timeframeUsdProfit;
	}

	public FundProfitChart rebalances(Integer rebalances) {
		this.rebalances = rebalances;
		return this;
	}

	/**
	 * Get rebalances
	 *
	 * @return rebalances
	 **/
	@ApiModelProperty(value = "")
	public Integer getRebalances() {
		return rebalances;
	}

	public void setRebalances(Integer rebalances) {
		this.rebalances = rebalances;
	}

	public FundProfitChart creationDate(DateTime creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * Get creationDate
	 *
	 * @return creationDate
	 **/
	@ApiModelProperty(value = "")
	public DateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(DateTime creationDate) {
		this.creationDate = creationDate;
	}

	public FundProfitChart equityChart(List<ChartSimple> equityChart) {
		this.equityChart = equityChart;
		return this;
	}

	public FundProfitChart addEquityChartItem(ChartSimple equityChartItem) {
		if (this.equityChart == null) {
			this.equityChart = new ArrayList<ChartSimple>();
		}
		this.equityChart.add(equityChartItem);
		return this;
	}

	/**
	 * Get equityChart
	 *
	 * @return equityChart
	 **/
	@ApiModelProperty(value = "")
	public List<ChartSimple> getEquityChart() {
		return equityChart;
	}

	public void setEquityChart(List<ChartSimple> equityChart) {
		this.equityChart = equityChart;
	}

	public FundProfitChart balance(Double balance) {
		this.balance = balance;
		return this;
	}

	/**
	 * Get balance
	 *
	 * @return balance
	 **/
	@ApiModelProperty(value = "")
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public FundProfitChart investors(Integer investors) {
		this.investors = investors;
		return this;
	}

	/**
	 * Get investors
	 *
	 * @return investors
	 **/
	@ApiModelProperty(value = "")
	public Integer getInvestors() {
		return investors;
	}

	public void setInvestors(Integer investors) {
		this.investors = investors;
	}

	public FundProfitChart profitChangePercent(Double profitChangePercent) {
		this.profitChangePercent = profitChangePercent;
		return this;
	}

	/**
	 * Get profitChangePercent
	 *
	 * @return profitChangePercent
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitChangePercent() {
		return profitChangePercent;
	}

	public void setProfitChangePercent(Double profitChangePercent) {
		this.profitChangePercent = profitChangePercent;
	}

	public FundProfitChart sharpeRatio(Double sharpeRatio) {
		this.sharpeRatio = sharpeRatio;
		return this;
	}

	/**
	 * Get sharpeRatio
	 *
	 * @return sharpeRatio
	 **/
	@ApiModelProperty(value = "")
	public Double getSharpeRatio() {
		return sharpeRatio;
	}

	public void setSharpeRatio(Double sharpeRatio) {
		this.sharpeRatio = sharpeRatio;
	}

	public FundProfitChart sortinoRatio(Double sortinoRatio) {
		this.sortinoRatio = sortinoRatio;
		return this;
	}

	/**
	 * Get sortinoRatio
	 *
	 * @return sortinoRatio
	 **/
	@ApiModelProperty(value = "")
	public Double getSortinoRatio() {
		return sortinoRatio;
	}

	public void setSortinoRatio(Double sortinoRatio) {
		this.sortinoRatio = sortinoRatio;
	}

	public FundProfitChart calmarRatio(Double calmarRatio) {
		this.calmarRatio = calmarRatio;
		return this;
	}

	/**
	 * Get calmarRatio
	 *
	 * @return calmarRatio
	 **/
	@ApiModelProperty(value = "")
	public Double getCalmarRatio() {
		return calmarRatio;
	}

	public void setCalmarRatio(Double calmarRatio) {
		this.calmarRatio = calmarRatio;
	}

	public FundProfitChart maxDrawdown(Double maxDrawdown) {
		this.maxDrawdown = maxDrawdown;
		return this;
	}

	/**
	 * Get maxDrawdown
	 *
	 * @return maxDrawdown
	 **/
	@ApiModelProperty(value = "")
	public Double getMaxDrawdown() {
		return maxDrawdown;
	}

	public void setMaxDrawdown(Double maxDrawdown) {
		this.maxDrawdown = maxDrawdown;
	}

	public FundProfitChart totalGvtProfit(Double totalGvtProfit) {
		this.totalGvtProfit = totalGvtProfit;
		return this;
	}

	/**
	 * Get totalGvtProfit
	 *
	 * @return totalGvtProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalGvtProfit() {
		return totalGvtProfit;
	}

	public void setTotalGvtProfit(Double totalGvtProfit) {
		this.totalGvtProfit = totalGvtProfit;
	}

	public FundProfitChart timeframeGvtProfit(Double timeframeGvtProfit) {
		this.timeframeGvtProfit = timeframeGvtProfit;
		return this;
	}

	/**
	 * Get timeframeGvtProfit
	 *
	 * @return timeframeGvtProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getTimeframeGvtProfit() {
		return timeframeGvtProfit;
	}

	public void setTimeframeGvtProfit(Double timeframeGvtProfit) {
		this.timeframeGvtProfit = timeframeGvtProfit;
	}

	public FundProfitChart rate(Double rate) {
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
		FundProfitChart fundProfitChart = (FundProfitChart) o;
		return Objects.equals(this.totalUsdProfit, fundProfitChart.totalUsdProfit) &&
				Objects.equals(this.timeframeUsdProfit, fundProfitChart.timeframeUsdProfit) &&
				Objects.equals(this.rebalances, fundProfitChart.rebalances) &&
				Objects.equals(this.creationDate, fundProfitChart.creationDate) &&
				Objects.equals(this.equityChart, fundProfitChart.equityChart) &&
				Objects.equals(this.balance, fundProfitChart.balance) &&
				Objects.equals(this.investors, fundProfitChart.investors) &&
				Objects.equals(this.profitChangePercent, fundProfitChart.profitChangePercent) &&
				Objects.equals(this.sharpeRatio, fundProfitChart.sharpeRatio) &&
				Objects.equals(this.sortinoRatio, fundProfitChart.sortinoRatio) &&
				Objects.equals(this.calmarRatio, fundProfitChart.calmarRatio) &&
				Objects.equals(this.maxDrawdown, fundProfitChart.maxDrawdown) &&
				Objects.equals(this.totalGvtProfit, fundProfitChart.totalGvtProfit) &&
				Objects.equals(this.timeframeGvtProfit, fundProfitChart.timeframeGvtProfit) &&
				Objects.equals(this.rate, fundProfitChart.rate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(totalUsdProfit, timeframeUsdProfit, rebalances, creationDate, equityChart, balance, investors, profitChangePercent, sharpeRatio, sortinoRatio, calmarRatio, maxDrawdown, totalGvtProfit, timeframeGvtProfit, rate);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FundProfitChart {\n");

		sb.append("    totalUsdProfit: ").append(toIndentedString(totalUsdProfit)).append("\n");
		sb.append("    timeframeUsdProfit: ").append(toIndentedString(timeframeUsdProfit)).append("\n");
		sb.append("    rebalances: ").append(toIndentedString(rebalances)).append("\n");
		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    equityChart: ").append(toIndentedString(equityChart)).append("\n");
		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    investors: ").append(toIndentedString(investors)).append("\n");
		sb.append("    profitChangePercent: ").append(toIndentedString(profitChangePercent)).append("\n");
		sb.append("    sharpeRatio: ").append(toIndentedString(sharpeRatio)).append("\n");
		sb.append("    sortinoRatio: ").append(toIndentedString(sortinoRatio)).append("\n");
		sb.append("    calmarRatio: ").append(toIndentedString(calmarRatio)).append("\n");
		sb.append("    maxDrawdown: ").append(toIndentedString(maxDrawdown)).append("\n");
		sb.append("    totalGvtProfit: ").append(toIndentedString(totalGvtProfit)).append("\n");
		sb.append("    timeframeGvtProfit: ").append(toIndentedString(timeframeGvtProfit)).append("\n");
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

