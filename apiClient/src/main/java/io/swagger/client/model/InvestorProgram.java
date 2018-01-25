/*
 * Core API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: 
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
 * InvestorProgram
 */

public class InvestorProgram
{
	@SerializedName("investmentProgram")
	private InvestmentShort investmentProgram = null;

	@SerializedName("requests")
	private List<InvestmentRequest> requests = null;

	@SerializedName("totalIn")
	private Double totalIn = null;

	@SerializedName("totalOut")
	private Double totalOut = null;

	public InvestorProgram investmentProgram(InvestmentShort investmentProgram) {
		this.investmentProgram = investmentProgram;
		return this;
	}

	/**
	 * Get investmentProgram
	 *
	 * @return investmentProgram
	 **/
	@ApiModelProperty(value = "")
	public InvestmentShort getInvestmentProgram() {
		return investmentProgram;
	}

	public void setInvestmentProgram(InvestmentShort investmentProgram) {
		this.investmentProgram = investmentProgram;
	}

	public InvestorProgram requests(List<InvestmentRequest> requests) {
		this.requests = requests;
		return this;
	}

	public InvestorProgram addRequestsItem(InvestmentRequest requestsItem) {
		if (this.requests == null) {
			this.requests = new ArrayList<InvestmentRequest>();
		}
		this.requests.add(requestsItem);
		return this;
	}

	/**
	 * Get requests
	 *
	 * @return requests
	 **/
	@ApiModelProperty(value = "")
	public List<InvestmentRequest> getRequests() {
		return requests;
	}

	public void setRequests(List<InvestmentRequest> requests) {
		this.requests = requests;
	}

	/**
	 * Get totalIn
	 *
	 * @return totalIn
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalIn() {
		return totalIn;
	}

	/**
	 * Get totalOut
	 *
	 * @return totalOut
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalOut() {
		return totalOut;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestorProgram investorProgram = (InvestorProgram) o;
		return Objects.equals(this.investmentProgram, investorProgram.investmentProgram) &&
				Objects.equals(this.requests, investorProgram.requests) &&
				Objects.equals(this.totalIn, investorProgram.totalIn) &&
				Objects.equals(this.totalOut, investorProgram.totalOut);
	}

	@Override
	public int hashCode() {
		return Objects.hash(investmentProgram, requests, totalIn, totalOut);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestorProgram {\n");

		sb.append("    investmentProgram: ").append(toIndentedString(investmentProgram)).append("\n");
		sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
		sb.append("    totalIn: ").append(toIndentedString(totalIn)).append("\n");
		sb.append("    totalOut: ").append(toIndentedString(totalOut)).append("\n");
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

