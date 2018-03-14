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

	@SerializedName("login")
	private String login = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("balance")
	private Double balance = null;

	@SerializedName("ownBalance")
	private Double ownBalance = null;

	@SerializedName("currency")
	private CurrencyEnum currency = null;

	@SerializedName("investedTokens")
	private Double investedTokens = null;

	@SerializedName("tradesCount")
	private Integer tradesCount = null;

	@SerializedName("investorsCount")
	private Integer investorsCount = null;

	@SerializedName("periodDuration")
	private Integer periodDuration = null;

	@SerializedName("startOfPeriod")
	private DateTime startOfPeriod = null;

	@SerializedName("endOfPeriod")
	private DateTime endOfPeriod = null;

	@SerializedName("profitAvg")
	private Double profitAvg = null;

	@SerializedName("profitTotal")
	private Double profitTotal = null;

	@SerializedName("profitAvgPercent")
	private Double profitAvgPercent = null;

	@SerializedName("profitTotalPercent")
	private Double profitTotalPercent = null;

	@SerializedName("profitTotalChange")
	private ProfitTotalChangeEnum profitTotalChange = null;

	@SerializedName("volumeTotal")
	private Double volumeTotal = null;

	@SerializedName("volumeAvg")
	private Double volumeAvg = null;

	@SerializedName("volumeTotalChange")
	private VolumeTotalChangeEnum volumeTotalChange = null;

	@SerializedName("availableInvestment")
	private Double availableInvestment = null;

	@SerializedName("feeSuccess")
	private Double feeSuccess = null;

	@SerializedName("feeManagement")
	private Double feeManagement = null;

	@SerializedName("ipfsHash")
	private String ipfsHash = null;

	@SerializedName("tradeIpfsHash")
	private String tradeIpfsHash = null;

	@SerializedName("isEnabled")
	private Boolean isEnabled = null;

	@SerializedName("chart")
	private List<Chart> chart = null;

	@SerializedName("manager")
	private ProfilePublicViewModel manager = null;

	@SerializedName("hasNewRequests")
	private Boolean hasNewRequests = null;

	@SerializedName("isHistoryEnable")
	private Boolean isHistoryEnable = null;

	@SerializedName("isInvestEnable")
	private Boolean isInvestEnable = null;

	@SerializedName("isWithdrawEnable")
	private Boolean isWithdrawEnable = null;

	@SerializedName("isOwnProgram")
	private Boolean isOwnProgram = null;

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

	public InvestmentProgramDetails login(String login) {
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

	public InvestmentProgramDetails ownBalance(Double ownBalance) {
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

	public InvestmentProgramDetails investedTokens(Double investedTokens) {
		this.investedTokens = investedTokens;
		return this;
	}

	/**
	 * Get investedTokens
	 *
	 * @return investedTokens
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestedTokens() {
		return investedTokens;
	}

	public void setInvestedTokens(Double investedTokens) {
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

	public InvestmentProgramDetails startOfPeriod(DateTime startOfPeriod) {
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

	public InvestmentProgramDetails profitAvgPercent(Double profitAvgPercent) {
		this.profitAvgPercent = profitAvgPercent;
		return this;
	}

	/**
	 * Get profitAvgPercent
	 *
	 * @return profitAvgPercent
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitAvgPercent() {
		return profitAvgPercent;
	}

	public void setProfitAvgPercent(Double profitAvgPercent) {
		this.profitAvgPercent = profitAvgPercent;
	}

	public InvestmentProgramDetails profitTotalPercent(Double profitTotalPercent) {
		this.profitTotalPercent = profitTotalPercent;
		return this;
	}

	/**
	 * Get profitTotalPercent
	 *
	 * @return profitTotalPercent
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitTotalPercent() {
		return profitTotalPercent;
	}

	public void setProfitTotalPercent(Double profitTotalPercent) {
		this.profitTotalPercent = profitTotalPercent;
	}

	public InvestmentProgramDetails profitTotalChange(ProfitTotalChangeEnum profitTotalChange) {
		this.profitTotalChange = profitTotalChange;
		return this;
	}

	/**
	 * Get profitTotalChange
	 *
	 * @return profitTotalChange
	 **/
	@ApiModelProperty(value = "")
	public ProfitTotalChangeEnum getProfitTotalChange() {
		return profitTotalChange;
	}

	public void setProfitTotalChange(ProfitTotalChangeEnum profitTotalChange) {
		this.profitTotalChange = profitTotalChange;
	}

	public InvestmentProgramDetails volumeTotal(Double volumeTotal) {
		this.volumeTotal = volumeTotal;
		return this;
	}

	/**
	 * Get volumeTotal
	 *
	 * @return volumeTotal
	 **/
	@ApiModelProperty(value = "")
	public Double getVolumeTotal() {
		return volumeTotal;
	}

	public void setVolumeTotal(Double volumeTotal) {
		this.volumeTotal = volumeTotal;
	}

	public InvestmentProgramDetails volumeAvg(Double volumeAvg) {
		this.volumeAvg = volumeAvg;
		return this;
	}

	/**
	 * Get volumeAvg
	 *
	 * @return volumeAvg
	 **/
	@ApiModelProperty(value = "")
	public Double getVolumeAvg() {
		return volumeAvg;
	}

	public void setVolumeAvg(Double volumeAvg) {
		this.volumeAvg = volumeAvg;
	}

	public InvestmentProgramDetails volumeTotalChange(VolumeTotalChangeEnum volumeTotalChange) {
		this.volumeTotalChange = volumeTotalChange;
		return this;
	}

	/**
	 * Get volumeTotalChange
	 *
	 * @return volumeTotalChange
	 **/
	@ApiModelProperty(value = "")
	public VolumeTotalChangeEnum getVolumeTotalChange() {
		return volumeTotalChange;
	}

	public void setVolumeTotalChange(VolumeTotalChangeEnum volumeTotalChange) {
		this.volumeTotalChange = volumeTotalChange;
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

	public InvestmentProgramDetails ipfsHash(String ipfsHash) {
		this.ipfsHash = ipfsHash;
		return this;
	}

	/**
	 * Get ipfsHash
	 *
	 * @return ipfsHash
	 **/
	@ApiModelProperty(value = "")
	public String getIpfsHash() {
		return ipfsHash;
	}

	public void setIpfsHash(String ipfsHash) {
		this.ipfsHash = ipfsHash;
	}

	public InvestmentProgramDetails tradeIpfsHash(String tradeIpfsHash) {
		this.tradeIpfsHash = tradeIpfsHash;
		return this;
	}

	/**
	 * Get tradeIpfsHash
	 *
	 * @return tradeIpfsHash
	 **/
	@ApiModelProperty(value = "")
	public String getTradeIpfsHash() {
		return tradeIpfsHash;
	}

	public void setTradeIpfsHash(String tradeIpfsHash) {
		this.tradeIpfsHash = tradeIpfsHash;
	}

	public InvestmentProgramDetails isEnabled(Boolean isEnabled) {
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

	public InvestmentProgramDetails chart(List<Chart> chart) {
		this.chart = chart;
		return this;
	}

	public InvestmentProgramDetails addChartItem(Chart chartItem) {
		if (this.chart == null) {
			this.chart = new ArrayList<Chart>();
		}
		this.chart.add(chartItem);
		return this;
	}

	/**
	 * Get chart
	 *
	 * @return chart
	 **/
	@ApiModelProperty(value = "")
	public List<Chart> getChart() {
		return chart;
	}

	public void setChart(List<Chart> chart) {
		this.chart = chart;
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

	public InvestmentProgramDetails hasNewRequests(Boolean hasNewRequests) {
		this.hasNewRequests = hasNewRequests;
		return this;
	}

	/**
	 * Get hasNewRequests
	 *
	 * @return hasNewRequests
	 **/
	@ApiModelProperty(value = "")
	public Boolean isHasNewRequests() {
		return hasNewRequests;
	}

	public void setHasNewRequests(Boolean hasNewRequests) {
		this.hasNewRequests = hasNewRequests;
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

	public InvestmentProgramDetails isOwnProgram(Boolean isOwnProgram) {
		this.isOwnProgram = isOwnProgram;
		return this;
	}

	/**
	 * Get isOwnProgram
	 *
	 * @return isOwnProgram
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsOwnProgram() {
		return isOwnProgram;
	}

	public void setIsOwnProgram(Boolean isOwnProgram) {
		this.isOwnProgram = isOwnProgram;
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
				Objects.equals(this.login, investmentProgramDetails.login) &&
				Objects.equals(this.logo, investmentProgramDetails.logo) &&
				Objects.equals(this.balance, investmentProgramDetails.balance) &&
				Objects.equals(this.ownBalance, investmentProgramDetails.ownBalance) &&
				Objects.equals(this.currency, investmentProgramDetails.currency) &&
				Objects.equals(this.investedTokens, investmentProgramDetails.investedTokens) &&
				Objects.equals(this.tradesCount, investmentProgramDetails.tradesCount) &&
				Objects.equals(this.investorsCount, investmentProgramDetails.investorsCount) &&
				Objects.equals(this.periodDuration, investmentProgramDetails.periodDuration) &&
				Objects.equals(this.startOfPeriod, investmentProgramDetails.startOfPeriod) &&
				Objects.equals(this.endOfPeriod, investmentProgramDetails.endOfPeriod) &&
				Objects.equals(this.profitAvg, investmentProgramDetails.profitAvg) &&
				Objects.equals(this.profitTotal, investmentProgramDetails.profitTotal) &&
				Objects.equals(this.profitAvgPercent, investmentProgramDetails.profitAvgPercent) &&
				Objects.equals(this.profitTotalPercent, investmentProgramDetails.profitTotalPercent) &&
				Objects.equals(this.profitTotalChange, investmentProgramDetails.profitTotalChange) &&
				Objects.equals(this.volumeTotal, investmentProgramDetails.volumeTotal) &&
				Objects.equals(this.volumeAvg, investmentProgramDetails.volumeAvg) &&
				Objects.equals(this.volumeTotalChange, investmentProgramDetails.volumeTotalChange) &&
				Objects.equals(this.availableInvestment, investmentProgramDetails.availableInvestment) &&
				Objects.equals(this.feeSuccess, investmentProgramDetails.feeSuccess) &&
				Objects.equals(this.feeManagement, investmentProgramDetails.feeManagement) &&
				Objects.equals(this.ipfsHash, investmentProgramDetails.ipfsHash) &&
				Objects.equals(this.tradeIpfsHash, investmentProgramDetails.tradeIpfsHash) &&
				Objects.equals(this.isEnabled, investmentProgramDetails.isEnabled) &&
				Objects.equals(this.chart, investmentProgramDetails.chart) &&
				Objects.equals(this.manager, investmentProgramDetails.manager) &&
				Objects.equals(this.hasNewRequests, investmentProgramDetails.hasNewRequests) &&
				Objects.equals(this.isHistoryEnable, investmentProgramDetails.isHistoryEnable) &&
				Objects.equals(this.isInvestEnable, investmentProgramDetails.isInvestEnable) &&
				Objects.equals(this.isWithdrawEnable, investmentProgramDetails.isWithdrawEnable) &&
				Objects.equals(this.isOwnProgram, investmentProgramDetails.isOwnProgram);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description, level, login, logo, balance, ownBalance, currency, investedTokens, tradesCount, investorsCount, periodDuration, startOfPeriod, endOfPeriod, profitAvg, profitTotal, profitAvgPercent, profitTotalPercent, profitTotalChange, volumeTotal, volumeAvg, volumeTotalChange, availableInvestment, feeSuccess, feeManagement, ipfsHash, tradeIpfsHash, isEnabled, chart, manager, hasNewRequests, isHistoryEnable, isInvestEnable, isWithdrawEnable, isOwnProgram);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentProgramDetails {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    level: ").append(toIndentedString(level)).append("\n");
		sb.append("    login: ").append(toIndentedString(login)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    ownBalance: ").append(toIndentedString(ownBalance)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    investedTokens: ").append(toIndentedString(investedTokens)).append("\n");
		sb.append("    tradesCount: ").append(toIndentedString(tradesCount)).append("\n");
		sb.append("    investorsCount: ").append(toIndentedString(investorsCount)).append("\n");
		sb.append("    periodDuration: ").append(toIndentedString(periodDuration)).append("\n");
		sb.append("    startOfPeriod: ").append(toIndentedString(startOfPeriod)).append("\n");
		sb.append("    endOfPeriod: ").append(toIndentedString(endOfPeriod)).append("\n");
		sb.append("    profitAvg: ").append(toIndentedString(profitAvg)).append("\n");
		sb.append("    profitTotal: ").append(toIndentedString(profitTotal)).append("\n");
		sb.append("    profitAvgPercent: ").append(toIndentedString(profitAvgPercent)).append("\n");
		sb.append("    profitTotalPercent: ").append(toIndentedString(profitTotalPercent)).append("\n");
		sb.append("    profitTotalChange: ").append(toIndentedString(profitTotalChange)).append("\n");
		sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
		sb.append("    volumeAvg: ").append(toIndentedString(volumeAvg)).append("\n");
		sb.append("    volumeTotalChange: ").append(toIndentedString(volumeTotalChange)).append("\n");
		sb.append("    availableInvestment: ").append(toIndentedString(availableInvestment)).append("\n");
		sb.append("    feeSuccess: ").append(toIndentedString(feeSuccess)).append("\n");
		sb.append("    feeManagement: ").append(toIndentedString(feeManagement)).append("\n");
		sb.append("    ipfsHash: ").append(toIndentedString(ipfsHash)).append("\n");
		sb.append("    tradeIpfsHash: ").append(toIndentedString(tradeIpfsHash)).append("\n");
		sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
		sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
		sb.append("    hasNewRequests: ").append(toIndentedString(hasNewRequests)).append("\n");
		sb.append("    isHistoryEnable: ").append(toIndentedString(isHistoryEnable)).append("\n");
		sb.append("    isInvestEnable: ").append(toIndentedString(isInvestEnable)).append("\n");
		sb.append("    isWithdrawEnable: ").append(toIndentedString(isWithdrawEnable)).append("\n");
		sb.append("    isOwnProgram: ").append(toIndentedString(isOwnProgram)).append("\n");
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


	/**
	 * Gets or Sets profitTotalChange
	 */
	@JsonAdapter(ProfitTotalChangeEnum.Adapter.class)
	public enum ProfitTotalChangeEnum
	{
		UNCHANGED("Unchanged"),

		UP("Up"),

		DOWN("Down");

		public static ProfitTotalChangeEnum fromValue(String text) {
			for (ProfitTotalChangeEnum b : ProfitTotalChangeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		ProfitTotalChangeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<ProfitTotalChangeEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final ProfitTotalChangeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ProfitTotalChangeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ProfitTotalChangeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets volumeTotalChange
	 */
	@JsonAdapter(VolumeTotalChangeEnum.Adapter.class)
	public enum VolumeTotalChangeEnum
	{
		UNCHANGED("Unchanged"),

		UP("Up"),

		DOWN("Down");

		public static VolumeTotalChangeEnum fromValue(String text) {
			for (VolumeTotalChangeEnum b : VolumeTotalChangeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		VolumeTotalChangeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<VolumeTotalChangeEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final VolumeTotalChangeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public VolumeTotalChangeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return VolumeTotalChangeEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

