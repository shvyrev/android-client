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
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestmentProgramDetails
 */

public class InvestmentProgramDetails
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

	@SerializedName("investedTokens")
	private Integer investedTokens = null;

	@SerializedName("tradesCount")
	private Integer tradesCount = null;

	@SerializedName("investorsCount")
	private Integer investorsCount = null;

	@SerializedName("periodDuration")
	private Integer periodDuration = null;

	@SerializedName("endOfPeriod")
	private DateTime endOfPeriod = null;

	@SerializedName("profitAvg")
	private Double profitAvg = null;

	@SerializedName("profitTotal")
	private Double profitTotal = null;

	@SerializedName("availableInvestment")
	private Double availableInvestment = null;

	@SerializedName("feeSuccess")
	private Double feeSuccess = null;

	@SerializedName("feeManagement")
	private Double feeManagement = null;

	@SerializedName("manager")
	private ProfilePublicViewModel manager = null;

	@SerializedName("isPending")
	private Boolean isPending = null;

	@SerializedName("isHistoryEnable")
	private Boolean isHistoryEnable = null;

	@SerializedName("isInvestEnable")
	private Boolean isInvestEnable = null;

	@SerializedName("isWithdrawEnable")
	private Boolean isWithdrawEnable = null;

	public InvestmentProgramDetails id(UUID id) {
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

	public InvestmentProgramDetails title(String title) {
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

	public InvestmentProgramDetails description(String description) {
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

	public InvestmentProgramDetails level(Integer level) {
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

	public InvestmentProgramDetails logo(String logo) {
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

	public InvestmentProgramDetails balance(Double balance) {
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

	public InvestmentProgramDetails currency(CurrencyEnum currency) {
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

	public InvestmentProgramDetails investedTokens(Integer investedTokens) {
		this.investedTokens = investedTokens;
		return this;
	}

	/**
	 * Get investedTokens
	 *
	 * @return investedTokens
	 **/
	@ApiModelProperty(value = "")
	public Integer getInvestedTokens() {
		return investedTokens;
	}

	public void setInvestedTokens(Integer investedTokens) {
		this.investedTokens = investedTokens;
	}

	public InvestmentProgramDetails tradesCount(Integer tradesCount) {
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

	public InvestmentProgramDetails investorsCount(Integer investorsCount) {
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

	public InvestmentProgramDetails periodDuration(Integer periodDuration) {
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

	public InvestmentProgramDetails endOfPeriod(DateTime endOfPeriod) {
		this.endOfPeriod = endOfPeriod;
		return this;
	}

	/**
	 * Get endOfPeriod
	 *
	 * @return endOfPeriod
	 **/
	@ApiModelProperty(value = "")
	public DateTime getEndOfPeriod() {
		return endOfPeriod;
	}

	public void setEndOfPeriod(DateTime endOfPeriod) {
		this.endOfPeriod = endOfPeriod;
	}

	public InvestmentProgramDetails profitAvg(Double profitAvg) {
		this.profitAvg = profitAvg;
		return this;
	}

	/**
	 * Get profitAvg
	 *
	 * @return profitAvg
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitAvg() {
		return profitAvg;
	}

	public void setProfitAvg(Double profitAvg) {
		this.profitAvg = profitAvg;
	}

	public InvestmentProgramDetails profitTotal(Double profitTotal) {
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

	public InvestmentProgramDetails availableInvestment(Double availableInvestment) {
		this.availableInvestment = availableInvestment;
		return this;
	}

	/**
	 * Get availableInvestment
	 *
	 * @return availableInvestment
	 **/
	@ApiModelProperty(value = "")
	public Double getAvailableInvestment() {
		return availableInvestment;
	}

	public void setAvailableInvestment(Double availableInvestment) {
		this.availableInvestment = availableInvestment;
	}

	public InvestmentProgramDetails feeSuccess(Double feeSuccess) {
		this.feeSuccess = feeSuccess;
		return this;
	}

	/**
	 * Get feeSuccess
	 *
	 * @return feeSuccess
	 **/
	@ApiModelProperty(value = "")
	public Double getFeeSuccess() {
		return feeSuccess;
	}

	public void setFeeSuccess(Double feeSuccess) {
		this.feeSuccess = feeSuccess;
	}

	public InvestmentProgramDetails feeManagement(Double feeManagement) {
		this.feeManagement = feeManagement;
		return this;
	}

	/**
	 * Get feeManagement
	 *
	 * @return feeManagement
	 **/
	@ApiModelProperty(value = "")
	public Double getFeeManagement() {
		return feeManagement;
	}

	public void setFeeManagement(Double feeManagement) {
		this.feeManagement = feeManagement;
	}

	public InvestmentProgramDetails manager(ProfilePublicViewModel manager) {
		this.manager = manager;
		return this;
	}

	/**
	 * Get manager
	 *
	 * @return manager
	 **/
	@ApiModelProperty(value = "")
	public ProfilePublicViewModel getManager() {
		return manager;
	}

	public void setManager(ProfilePublicViewModel manager) {
		this.manager = manager;
	}

	public InvestmentProgramDetails isPending(Boolean isPending) {
		this.isPending = isPending;
		return this;
	}

	/**
	 * Get isPending
	 *
	 * @return isPending
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsPending() {
		return isPending;
	}

	public void setIsPending(Boolean isPending) {
		this.isPending = isPending;
	}

	public InvestmentProgramDetails isHistoryEnable(Boolean isHistoryEnable) {
		this.isHistoryEnable = isHistoryEnable;
		return this;
	}

	/**
	 * Get isHistoryEnable
	 *
	 * @return isHistoryEnable
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsHistoryEnable() {
		return isHistoryEnable;
	}

	public void setIsHistoryEnable(Boolean isHistoryEnable) {
		this.isHistoryEnable = isHistoryEnable;
	}

	public InvestmentProgramDetails isInvestEnable(Boolean isInvestEnable) {
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

	public InvestmentProgramDetails isWithdrawEnable(Boolean isWithdrawEnable) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestmentProgramDetails investmentProgramDetails = (InvestmentProgramDetails) o;
		return Objects.equals(this.id, investmentProgramDetails.id) &&
				Objects.equals(this.title, investmentProgramDetails.title) &&
				Objects.equals(this.description, investmentProgramDetails.description) &&
				Objects.equals(this.level, investmentProgramDetails.level) &&
				Objects.equals(this.logo, investmentProgramDetails.logo) &&
				Objects.equals(this.balance, investmentProgramDetails.balance) &&
				Objects.equals(this.currency, investmentProgramDetails.currency) &&
				Objects.equals(this.investedTokens, investmentProgramDetails.investedTokens) &&
				Objects.equals(this.tradesCount, investmentProgramDetails.tradesCount) &&
				Objects.equals(this.investorsCount, investmentProgramDetails.investorsCount) &&
				Objects.equals(this.periodDuration, investmentProgramDetails.periodDuration) &&
				Objects.equals(this.endOfPeriod, investmentProgramDetails.endOfPeriod) &&
				Objects.equals(this.profitAvg, investmentProgramDetails.profitAvg) &&
				Objects.equals(this.profitTotal, investmentProgramDetails.profitTotal) &&
				Objects.equals(this.availableInvestment, investmentProgramDetails.availableInvestment) &&
				Objects.equals(this.feeSuccess, investmentProgramDetails.feeSuccess) &&
				Objects.equals(this.feeManagement, investmentProgramDetails.feeManagement) &&
				Objects.equals(this.manager, investmentProgramDetails.manager) &&
				Objects.equals(this.isPending, investmentProgramDetails.isPending) &&
				Objects.equals(this.isHistoryEnable, investmentProgramDetails.isHistoryEnable) &&
				Objects.equals(this.isInvestEnable, investmentProgramDetails.isInvestEnable) &&
				Objects.equals(this.isWithdrawEnable, investmentProgramDetails.isWithdrawEnable);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description, level, logo, balance, currency, investedTokens, tradesCount, investorsCount, periodDuration, endOfPeriod, profitAvg, profitTotal, availableInvestment, feeSuccess, feeManagement, manager, isPending, isHistoryEnable, isInvestEnable, isWithdrawEnable);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentProgramDetails {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    level: ").append(toIndentedString(level)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    investedTokens: ").append(toIndentedString(investedTokens)).append("\n");
		sb.append("    tradesCount: ").append(toIndentedString(tradesCount)).append("\n");
		sb.append("    investorsCount: ").append(toIndentedString(investorsCount)).append("\n");
		sb.append("    periodDuration: ").append(toIndentedString(periodDuration)).append("\n");
		sb.append("    endOfPeriod: ").append(toIndentedString(endOfPeriod)).append("\n");
		sb.append("    profitAvg: ").append(toIndentedString(profitAvg)).append("\n");
		sb.append("    profitTotal: ").append(toIndentedString(profitTotal)).append("\n");
		sb.append("    availableInvestment: ").append(toIndentedString(availableInvestment)).append("\n");
		sb.append("    feeSuccess: ").append(toIndentedString(feeSuccess)).append("\n");
		sb.append("    feeManagement: ").append(toIndentedString(feeManagement)).append("\n");
		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
		sb.append("    isPending: ").append(toIndentedString(isPending)).append("\n");
		sb.append("    isHistoryEnable: ").append(toIndentedString(isHistoryEnable)).append("\n");
		sb.append("    isInvestEnable: ").append(toIndentedString(isInvestEnable)).append("\n");
		sb.append("    isWithdrawEnable: ").append(toIndentedString(isWithdrawEnable)).append("\n");
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

