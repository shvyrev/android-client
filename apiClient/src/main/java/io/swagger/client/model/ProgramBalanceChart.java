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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProgramBalanceChart
 */

public class ProgramBalanceChart
{
	@SerializedName("programCurrencyBalance")
	private Double programCurrencyBalance = null;

	@SerializedName("programCurrency")
	private ProgramCurrencyEnum programCurrency = null;

	@SerializedName("balanceChart")
	private List<ProgramBalanceChartElement> balanceChart = null;

	@SerializedName("gvtBalance")
	private Double gvtBalance = null;

	public ProgramBalanceChart programCurrencyBalance(Double programCurrencyBalance) {
		this.programCurrencyBalance = programCurrencyBalance;
		return this;
	}

	/**
	 * Get programCurrencyBalance
	 *
	 * @return programCurrencyBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getProgramCurrencyBalance() {
		return programCurrencyBalance;
	}

	public void setProgramCurrencyBalance(Double programCurrencyBalance) {
		this.programCurrencyBalance = programCurrencyBalance;
	}

	public ProgramBalanceChart programCurrency(ProgramCurrencyEnum programCurrency) {
		this.programCurrency = programCurrency;
		return this;
	}

	/**
	 * Get programCurrency
	 *
	 * @return programCurrency
	 **/
	@ApiModelProperty(value = "")
	public ProgramCurrencyEnum getProgramCurrency() {
		return programCurrency;
	}

	public void setProgramCurrency(ProgramCurrencyEnum programCurrency) {
		this.programCurrency = programCurrency;
	}

	public ProgramBalanceChart balanceChart(List<ProgramBalanceChartElement> balanceChart) {
		this.balanceChart = balanceChart;
		return this;
	}

	public ProgramBalanceChart addBalanceChartItem(ProgramBalanceChartElement balanceChartItem) {
		if (this.balanceChart == null) {
			this.balanceChart = new ArrayList<ProgramBalanceChartElement>();
		}
		this.balanceChart.add(balanceChartItem);
		return this;
	}

	/**
	 * Get balanceChart
	 *
	 * @return balanceChart
	 **/
	@ApiModelProperty(value = "")
	public List<ProgramBalanceChartElement> getBalanceChart() {
		return balanceChart;
	}

	public void setBalanceChart(List<ProgramBalanceChartElement> balanceChart) {
		this.balanceChart = balanceChart;
	}

	public ProgramBalanceChart gvtBalance(Double gvtBalance) {
		this.gvtBalance = gvtBalance;
		return this;
	}

	/**
	 * Get gvtBalance
	 *
	 * @return gvtBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getGvtBalance() {
		return gvtBalance;
	}

	public void setGvtBalance(Double gvtBalance) {
		this.gvtBalance = gvtBalance;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramBalanceChart programBalanceChart = (ProgramBalanceChart) o;
		return Objects.equals(this.programCurrencyBalance, programBalanceChart.programCurrencyBalance) &&
				Objects.equals(this.programCurrency, programBalanceChart.programCurrency) &&
				Objects.equals(this.balanceChart, programBalanceChart.balanceChart) &&
				Objects.equals(this.gvtBalance, programBalanceChart.gvtBalance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programCurrencyBalance, programCurrency, balanceChart, gvtBalance);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramBalanceChart {\n");

		sb.append("    programCurrencyBalance: ").append(toIndentedString(programCurrencyBalance)).append("\n");
		sb.append("    programCurrency: ").append(toIndentedString(programCurrency)).append("\n");
		sb.append("    balanceChart: ").append(toIndentedString(balanceChart)).append("\n");
		sb.append("    gvtBalance: ").append(toIndentedString(gvtBalance)).append("\n");
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

	/**
	 * Gets or Sets programCurrency
	 */
	@JsonAdapter(ProgramCurrencyEnum.Adapter.class)
	public enum ProgramCurrencyEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USDT("USDT"),

		XRP("XRP"),

		BCH("BCH"),

		LTC("LTC"),

		DOGE("DOGE"),

		USD("USD"),

		EUR("EUR");

		public static ProgramCurrencyEnum fromValue(String text) {
			for (ProgramCurrencyEnum b : ProgramCurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		ProgramCurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<ProgramCurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final ProgramCurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ProgramCurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ProgramCurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

