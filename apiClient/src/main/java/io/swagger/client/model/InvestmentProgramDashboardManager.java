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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.joda.time.DateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestmentProgramDashboardManager
 */

public class InvestmentProgramDashboardManager
{
	@SerializedName("id")
	private UUID id = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("level")
	private Integer level = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("balance")
	private Double balance = null;

	@SerializedName("currency")
	private CurrencyEnum currency = null;

	@SerializedName("tradesCount")
	private Integer tradesCount = null;

	@SerializedName("periodDuration")
	private Integer periodDuration = null;

	@SerializedName("investorsCount")
	private Integer investorsCount = null;

	@SerializedName("isEnabled")
	private Boolean isEnabled = null;

	@SerializedName("startOfPeriod")
	private DateTime startOfPeriod = null;

	@SerializedName("profitTotal")
	private Double profitTotal = null;

	@SerializedName("profitTotalGvt")
	private Double profitTotalGvt = null;

	@SerializedName("profitCurrent")
	private Double profitCurrent = null;

	@SerializedName("isInvestEnable")
	private Boolean isInvestEnable = null;

	@SerializedName("isWithdrawEnable")
	private Boolean isWithdrawEnable = null;

	@SerializedName("token")
	private Token token = null;

	@SerializedName("ownBalance")
	private Double ownBalance = null;

	@SerializedName("minAccountBalanceUsd")
	private Double minAccountBalanceUsd = null;

	@SerializedName("minAccountBalance")
	private Double minAccountBalance = null;

	@SerializedName("login")
	private String login = null;

	@SerializedName("canCloseProgram")
	private Boolean canCloseProgram = null;

	@SerializedName("canClosePeriod")
	private Boolean canClosePeriod = null;

	@SerializedName("equityChart")
	private List<ChartByDate> equityChart = null;

	public InvestmentProgramDashboardManager id(UUID id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public InvestmentProgramDashboardManager title(String title) {
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

	public InvestmentProgramDashboardManager description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@ApiModelProperty(value = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public InvestmentProgramDashboardManager level(Integer level) {
		this.level = level;
		return this;
	}

	/**
	 * Get level
	 *
	 * @return level
	 **/
	@ApiModelProperty(value = "")
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public InvestmentProgramDashboardManager logo(String logo) {
		this.logo = logo;
		return this;
	}

	/**
	 * Get logo
	 *
	 * @return logo
	 **/
	@ApiModelProperty(value = "")
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public InvestmentProgramDashboardManager balance(Double balance) {
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

	public InvestmentProgramDashboardManager currency(CurrencyEnum currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@ApiModelProperty(value = "")
	public CurrencyEnum getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}

	public InvestmentProgramDashboardManager tradesCount(Integer tradesCount) {
		this.tradesCount = tradesCount;
		return this;
	}

	/**
	 * Get tradesCount
	 *
	 * @return tradesCount
	 **/
	@ApiModelProperty(value = "")
	public Integer getTradesCount() {
		return tradesCount;
	}

	public void setTradesCount(Integer tradesCount) {
		this.tradesCount = tradesCount;
	}

	public InvestmentProgramDashboardManager periodDuration(Integer periodDuration) {
		this.periodDuration = periodDuration;
		return this;
	}

	/**
	 * Get periodDuration
	 *
	 * @return periodDuration
	 **/
	@ApiModelProperty(value = "")
	public Integer getPeriodDuration() {
		return periodDuration;
	}

	public void setPeriodDuration(Integer periodDuration) {
		this.periodDuration = periodDuration;
	}

	public InvestmentProgramDashboardManager investorsCount(Integer investorsCount) {
		this.investorsCount = investorsCount;
		return this;
	}

	/**
	 * Get investorsCount
	 *
	 * @return investorsCount
	 **/
	@ApiModelProperty(value = "")
	public Integer getInvestorsCount() {
		return investorsCount;
	}

	public void setInvestorsCount(Integer investorsCount) {
		this.investorsCount = investorsCount;
	}

	public InvestmentProgramDashboardManager isEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}

	/**
	 * Get isEnabled
	 *
	 * @return isEnabled
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public InvestmentProgramDashboardManager startOfPeriod(DateTime startOfPeriod) {
		this.startOfPeriod = startOfPeriod;
		return this;
	}

	/**
	 * Get startOfPeriod
	 *
	 * @return startOfPeriod
	 **/
	@ApiModelProperty(value = "")
	public DateTime getStartOfPeriod() {
		return startOfPeriod;
	}

	public void setStartOfPeriod(DateTime startOfPeriod) {
		this.startOfPeriod = startOfPeriod;
	}

	public InvestmentProgramDashboardManager profitTotal(Double profitTotal) {
		this.profitTotal = profitTotal;
		return this;
	}

	/**
	 * Get profitTotal
	 *
	 * @return profitTotal
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitTotal() {
		return profitTotal;
	}

	public void setProfitTotal(Double profitTotal) {
		this.profitTotal = profitTotal;
	}

	public InvestmentProgramDashboardManager profitTotalGvt(Double profitTotalGvt) {
		this.profitTotalGvt = profitTotalGvt;
		return this;
	}

	/**
	 * Get profitTotalGvt
	 *
	 * @return profitTotalGvt
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitTotalGvt() {
		return profitTotalGvt;
	}

	public void setProfitTotalGvt(Double profitTotalGvt) {
		this.profitTotalGvt = profitTotalGvt;
	}

	public InvestmentProgramDashboardManager profitCurrent(Double profitCurrent) {
		this.profitCurrent = profitCurrent;
		return this;
	}

	/**
	 * Get profitCurrent
	 *
	 * @return profitCurrent
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitCurrent() {
		return profitCurrent;
	}

	public void setProfitCurrent(Double profitCurrent) {
		this.profitCurrent = profitCurrent;
	}

	public InvestmentProgramDashboardManager isInvestEnable(Boolean isInvestEnable) {
		this.isInvestEnable = isInvestEnable;
		return this;
	}

	/**
	 * Get isInvestEnable
	 *
	 * @return isInvestEnable
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsInvestEnable() {
		return isInvestEnable;
	}

	public void setIsInvestEnable(Boolean isInvestEnable) {
		this.isInvestEnable = isInvestEnable;
	}

	public InvestmentProgramDashboardManager isWithdrawEnable(Boolean isWithdrawEnable) {
		this.isWithdrawEnable = isWithdrawEnable;
		return this;
	}

	/**
	 * Get isWithdrawEnable
	 *
	 * @return isWithdrawEnable
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsWithdrawEnable() {
		return isWithdrawEnable;
	}

	public void setIsWithdrawEnable(Boolean isWithdrawEnable) {
		this.isWithdrawEnable = isWithdrawEnable;
	}

	public InvestmentProgramDashboardManager token(Token token) {
		this.token = token;
		return this;
	}

	/**
	 * Get token
	 *
	 * @return token
	 **/
	@ApiModelProperty(value = "")
	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public InvestmentProgramDashboardManager ownBalance(Double ownBalance) {
		this.ownBalance = ownBalance;
		return this;
	}

	/**
	 * Get ownBalance
	 *
	 * @return ownBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getOwnBalance() {
		return ownBalance;
	}

	public void setOwnBalance(Double ownBalance) {
		this.ownBalance = ownBalance;
	}

	public InvestmentProgramDashboardManager minAccountBalanceUsd(Double minAccountBalanceUsd) {
		this.minAccountBalanceUsd = minAccountBalanceUsd;
		return this;
	}

	/**
	 * Get minAccountBalanceUsd
	 *
	 * @return minAccountBalanceUsd
	 **/
	@ApiModelProperty(value = "")
	public Double getMinAccountBalanceUsd() {
		return minAccountBalanceUsd;
	}

	public void setMinAccountBalanceUsd(Double minAccountBalanceUsd) {
		this.minAccountBalanceUsd = minAccountBalanceUsd;
	}

	public InvestmentProgramDashboardManager minAccountBalance(Double minAccountBalance) {
		this.minAccountBalance = minAccountBalance;
		return this;
	}

	/**
	 * Get minAccountBalance
	 *
	 * @return minAccountBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getMinAccountBalance() {
		return minAccountBalance;
	}

	public void setMinAccountBalance(Double minAccountBalance) {
		this.minAccountBalance = minAccountBalance;
	}

	public InvestmentProgramDashboardManager login(String login) {
		this.login = login;
		return this;
	}

	/**
	 * Get login
	 *
	 * @return login
	 **/
	@ApiModelProperty(value = "")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public InvestmentProgramDashboardManager canCloseProgram(Boolean canCloseProgram) {
		this.canCloseProgram = canCloseProgram;
		return this;
	}

	/**
	 * Get canCloseProgram
	 *
	 * @return canCloseProgram
	 **/
	@ApiModelProperty(value = "")
	public Boolean isCanCloseProgram() {
		return canCloseProgram;
	}

	public void setCanCloseProgram(Boolean canCloseProgram) {
		this.canCloseProgram = canCloseProgram;
	}

	public InvestmentProgramDashboardManager canClosePeriod(Boolean canClosePeriod) {
		this.canClosePeriod = canClosePeriod;
		return this;
	}

	/**
	 * Get canClosePeriod
	 *
	 * @return canClosePeriod
	 **/
	@ApiModelProperty(value = "")
	public Boolean isCanClosePeriod() {
		return canClosePeriod;
	}

	public void setCanClosePeriod(Boolean canClosePeriod) {
		this.canClosePeriod = canClosePeriod;
	}

	public InvestmentProgramDashboardManager equityChart(List<ChartByDate> equityChart) {
		this.equityChart = equityChart;
		return this;
	}

	public InvestmentProgramDashboardManager addEquityChartItem(ChartByDate equityChartItem) {
		if (this.equityChart == null) {
			this.equityChart = new ArrayList<ChartByDate>();
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
	public List<ChartByDate> getEquityChart() {
		return equityChart;
	}

	public void setEquityChart(List<ChartByDate> equityChart) {
		this.equityChart = equityChart;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestmentProgramDashboardManager investmentProgramDashboardManager = (InvestmentProgramDashboardManager) o;
		return Objects.equals(this.id, investmentProgramDashboardManager.id) &&
				Objects.equals(this.title, investmentProgramDashboardManager.title) &&
				Objects.equals(this.description, investmentProgramDashboardManager.description) &&
				Objects.equals(this.level, investmentProgramDashboardManager.level) &&
				Objects.equals(this.logo, investmentProgramDashboardManager.logo) &&
				Objects.equals(this.balance, investmentProgramDashboardManager.balance) &&
				Objects.equals(this.currency, investmentProgramDashboardManager.currency) &&
				Objects.equals(this.tradesCount, investmentProgramDashboardManager.tradesCount) &&
				Objects.equals(this.periodDuration, investmentProgramDashboardManager.periodDuration) &&
				Objects.equals(this.investorsCount, investmentProgramDashboardManager.investorsCount) &&
				Objects.equals(this.isEnabled, investmentProgramDashboardManager.isEnabled) &&
				Objects.equals(this.startOfPeriod, investmentProgramDashboardManager.startOfPeriod) &&
				Objects.equals(this.profitTotal, investmentProgramDashboardManager.profitTotal) &&
				Objects.equals(this.profitTotalGvt, investmentProgramDashboardManager.profitTotalGvt) &&
				Objects.equals(this.profitCurrent, investmentProgramDashboardManager.profitCurrent) &&
				Objects.equals(this.isInvestEnable, investmentProgramDashboardManager.isInvestEnable) &&
				Objects.equals(this.isWithdrawEnable, investmentProgramDashboardManager.isWithdrawEnable) &&
				Objects.equals(this.token, investmentProgramDashboardManager.token) &&
				Objects.equals(this.ownBalance, investmentProgramDashboardManager.ownBalance) &&
				Objects.equals(this.minAccountBalanceUsd, investmentProgramDashboardManager.minAccountBalanceUsd) &&
				Objects.equals(this.minAccountBalance, investmentProgramDashboardManager.minAccountBalance) &&
				Objects.equals(this.login, investmentProgramDashboardManager.login) &&
				Objects.equals(this.canCloseProgram, investmentProgramDashboardManager.canCloseProgram) &&
				Objects.equals(this.canClosePeriod, investmentProgramDashboardManager.canClosePeriod) &&
				Objects.equals(this.equityChart, investmentProgramDashboardManager.equityChart);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description, level, logo, balance, currency, tradesCount, periodDuration, investorsCount, isEnabled, startOfPeriod, profitTotal, profitTotalGvt, profitCurrent, isInvestEnable, isWithdrawEnable, token, ownBalance, minAccountBalanceUsd, minAccountBalance, login, canCloseProgram, canClosePeriod, equityChart);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentProgramDashboardManager {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    level: ").append(toIndentedString(level)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    tradesCount: ").append(toIndentedString(tradesCount)).append("\n");
		sb.append("    periodDuration: ").append(toIndentedString(periodDuration)).append("\n");
		sb.append("    investorsCount: ").append(toIndentedString(investorsCount)).append("\n");
		sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
		sb.append("    startOfPeriod: ").append(toIndentedString(startOfPeriod)).append("\n");
		sb.append("    profitTotal: ").append(toIndentedString(profitTotal)).append("\n");
		sb.append("    profitTotalGvt: ").append(toIndentedString(profitTotalGvt)).append("\n");
		sb.append("    profitCurrent: ").append(toIndentedString(profitCurrent)).append("\n");
		sb.append("    isInvestEnable: ").append(toIndentedString(isInvestEnable)).append("\n");
		sb.append("    isWithdrawEnable: ").append(toIndentedString(isWithdrawEnable)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    ownBalance: ").append(toIndentedString(ownBalance)).append("\n");
		sb.append("    minAccountBalanceUsd: ").append(toIndentedString(minAccountBalanceUsd)).append("\n");
		sb.append("    minAccountBalance: ").append(toIndentedString(minAccountBalance)).append("\n");
		sb.append("    login: ").append(toIndentedString(login)).append("\n");
		sb.append("    canCloseProgram: ").append(toIndentedString(canCloseProgram)).append("\n");
		sb.append("    canClosePeriod: ").append(toIndentedString(canClosePeriod)).append("\n");
		sb.append("    equityChart: ").append(toIndentedString(equityChart)).append("\n");
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
	 * Gets or Sets currency
	 */
	@JsonAdapter(CurrencyEnum.Adapter.class)
	public enum CurrencyEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USD("USD"),

		EUR("EUR");

		public static CurrencyEnum fromValue(String text) {
			for (CurrencyEnum b : CurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		CurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<CurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return CurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

