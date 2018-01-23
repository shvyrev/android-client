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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestmentProgramViewModel
 */

public class InvestmentProgramViewModel
{
	@SerializedName("investmentProgram")
	private InvestmentProgram investmentProgram = null;

	@SerializedName("statistic")
	private List<InvestmentProgramStatistic> statistic = null;

	public InvestmentProgramViewModel investmentProgram(InvestmentProgram investmentProgram) {
		this.investmentProgram = investmentProgram;
		return this;
	}

	/**
	 * Get investmentProgram
	 *
	 * @return investmentProgram
	 **/
	@ApiModelProperty(value = "")
	public InvestmentProgram getInvestmentProgram() {
		return investmentProgram;
	}

	public void setInvestmentProgram(InvestmentProgram investmentProgram) {
		this.investmentProgram = investmentProgram;
	}

	public InvestmentProgramViewModel statistic(List<InvestmentProgramStatistic> statistic) {
		this.statistic = statistic;
		return this;
	}

	public InvestmentProgramViewModel addStatisticItem(InvestmentProgramStatistic statisticItem) {
		if (this.statistic == null) {
			this.statistic = new ArrayList<InvestmentProgramStatistic>();
		}
		this.statistic.add(statisticItem);
		return this;
	}

	/**
	 * Get statistic
	 *
	 * @return statistic
	 **/
	@ApiModelProperty(value = "")
	public List<InvestmentProgramStatistic> getStatistic() {
		return statistic;
	}

	public void setStatistic(List<InvestmentProgramStatistic> statistic) {
		this.statistic = statistic;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestmentProgramViewModel investmentProgramViewModel = (InvestmentProgramViewModel) o;
		return Objects.equals(this.investmentProgram, investmentProgramViewModel.investmentProgram) &&
				Objects.equals(this.statistic, investmentProgramViewModel.statistic);
	}

	@Override
	public int hashCode() {
		return Objects.hash(investmentProgram, statistic);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentProgramViewModel {\n");

		sb.append("    investmentProgram: ").append(toIndentedString(investmentProgram)).append("\n");
		sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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
