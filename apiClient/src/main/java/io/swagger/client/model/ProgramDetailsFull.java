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

import org.joda.time.DateTime;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProgramDetailsFull
 */

public class ProgramDetailsFull
{
	@SerializedName("currency")
	private CurrencyEnum currency = null;

	@SerializedName("level")
	private Integer level = null;

	@SerializedName("periodDuration")
	private Integer periodDuration = null;

	@SerializedName("periodStarts")
	private DateTime periodStarts = null;

	@SerializedName("periodEnds")
	private DateTime periodEnds = null;

	@SerializedName("entryFee")
	private Double entryFee = null;

	@SerializedName("successFee")
	private Double successFee = null;

	@SerializedName("isReinvesting")
	private Boolean isReinvesting = null;

	@SerializedName("availableInvestment")
	private Double availableInvestment = null;

	@SerializedName("statistic")
	private ProgramStatistic statistic = null;

	@SerializedName("personalProgramDetails")
	private PersonalProgramDetailsFull personalProgramDetails = null;

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("url")
	private String url = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("status")
	private StatusEnum status = null;

	@SerializedName("manager")
	private ProfilePublic manager = null;

	public ProgramDetailsFull currency(CurrencyEnum currency) {
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

	public ProgramDetailsFull level(Integer level) {
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

	public ProgramDetailsFull periodDuration(Integer periodDuration) {
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

	public ProgramDetailsFull periodStarts(DateTime periodStarts) {
		this.periodStarts = periodStarts;
		return this;
	}

	/**
	 * Get periodStarts
	 *
	 * @return periodStarts
	 **/
	@ApiModelProperty(value = "")
	public DateTime getPeriodStarts() {
		return periodStarts;
	}

	public void setPeriodStarts(DateTime periodStarts) {
		this.periodStarts = periodStarts;
	}

	public ProgramDetailsFull periodEnds(DateTime periodEnds) {
		this.periodEnds = periodEnds;
		return this;
	}

	/**
	 * Get periodEnds
	 *
	 * @return periodEnds
	 **/
	@ApiModelProperty(value = "")
	public DateTime getPeriodEnds() {
		return periodEnds;
	}

	public void setPeriodEnds(DateTime periodEnds) {
		this.periodEnds = periodEnds;
	}

	public ProgramDetailsFull entryFee(Double entryFee) {
		this.entryFee = entryFee;
		return this;
	}

	/**
	 * Get entryFee
	 *
	 * @return entryFee
	 **/
	@ApiModelProperty(value = "")
	public Double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}

	public ProgramDetailsFull successFee(Double successFee) {
		this.successFee = successFee;
		return this;
	}

	/**
	 * Get successFee
	 *
	 * @return successFee
	 **/
	@ApiModelProperty(value = "")
	public Double getSuccessFee() {
		return successFee;
	}

	public void setSuccessFee(Double successFee) {
		this.successFee = successFee;
	}

	public ProgramDetailsFull isReinvesting(Boolean isReinvesting) {
		this.isReinvesting = isReinvesting;
		return this;
	}

	/**
	 * Get isReinvesting
	 *
	 * @return isReinvesting
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsReinvesting() {
		return isReinvesting;
	}

	public void setIsReinvesting(Boolean isReinvesting) {
		this.isReinvesting = isReinvesting;
	}

	public ProgramDetailsFull availableInvestment(Double availableInvestment) {
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

	public ProgramDetailsFull statistic(ProgramStatistic statistic) {
		this.statistic = statistic;
		return this;
	}

	/**
	 * Get statistic
	 *
	 * @return statistic
	 **/
	@ApiModelProperty(value = "")
	public ProgramStatistic getStatistic() {
		return statistic;
	}

	public void setStatistic(ProgramStatistic statistic) {
		this.statistic = statistic;
	}

	public ProgramDetailsFull personalProgramDetails(PersonalProgramDetailsFull personalProgramDetails) {
		this.personalProgramDetails = personalProgramDetails;
		return this;
	}

	/**
	 * Fields for authorized user
	 *
	 * @return personalProgramDetails
	 **/
	@ApiModelProperty(value = "Fields for authorized user")
	public PersonalProgramDetailsFull getPersonalProgramDetails() {
		return personalProgramDetails;
	}

	public void setPersonalProgramDetails(PersonalProgramDetailsFull personalProgramDetails) {
		this.personalProgramDetails = personalProgramDetails;
	}

	public ProgramDetailsFull id(UUID id) {
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

	public ProgramDetailsFull logo(String logo) {
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

	public ProgramDetailsFull url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 *
	 * @return url
	 **/
	@ApiModelProperty(value = "")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ProgramDetailsFull description(String description) {
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

	public ProgramDetailsFull title(String title) {
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

	public ProgramDetailsFull status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public ProgramDetailsFull manager(ProfilePublic manager) {
		this.manager = manager;
		return this;
	}

	/**
	 * Get manager
	 *
	 * @return manager
	 **/
	@ApiModelProperty(value = "")
	public ProfilePublic getManager() {
		return manager;
	}

	public void setManager(ProfilePublic manager) {
		this.manager = manager;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramDetailsFull programDetailsFull = (ProgramDetailsFull) o;
		return Objects.equals(this.currency, programDetailsFull.currency) &&
				Objects.equals(this.level, programDetailsFull.level) &&
				Objects.equals(this.periodDuration, programDetailsFull.periodDuration) &&
				Objects.equals(this.periodStarts, programDetailsFull.periodStarts) &&
				Objects.equals(this.periodEnds, programDetailsFull.periodEnds) &&
				Objects.equals(this.entryFee, programDetailsFull.entryFee) &&
				Objects.equals(this.successFee, programDetailsFull.successFee) &&
				Objects.equals(this.isReinvesting, programDetailsFull.isReinvesting) &&
				Objects.equals(this.availableInvestment, programDetailsFull.availableInvestment) &&
				Objects.equals(this.statistic, programDetailsFull.statistic) &&
				Objects.equals(this.personalProgramDetails, programDetailsFull.personalProgramDetails) &&
				Objects.equals(this.id, programDetailsFull.id) &&
				Objects.equals(this.logo, programDetailsFull.logo) &&
				Objects.equals(this.url, programDetailsFull.url) &&
				Objects.equals(this.description, programDetailsFull.description) &&
				Objects.equals(this.title, programDetailsFull.title) &&
				Objects.equals(this.status, programDetailsFull.status) &&
				Objects.equals(this.manager, programDetailsFull.manager);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, level, periodDuration, periodStarts, periodEnds, entryFee, successFee, isReinvesting, availableInvestment, statistic, personalProgramDetails, id, logo, url, description, title, status, manager);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramDetailsFull {\n");

		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    level: ").append(toIndentedString(level)).append("\n");
		sb.append("    periodDuration: ").append(toIndentedString(periodDuration)).append("\n");
		sb.append("    periodStarts: ").append(toIndentedString(periodStarts)).append("\n");
		sb.append("    periodEnds: ").append(toIndentedString(periodEnds)).append("\n");
		sb.append("    entryFee: ").append(toIndentedString(entryFee)).append("\n");
		sb.append("    successFee: ").append(toIndentedString(successFee)).append("\n");
		sb.append("    isReinvesting: ").append(toIndentedString(isReinvesting)).append("\n");
		sb.append("    availableInvestment: ").append(toIndentedString(availableInvestment)).append("\n");
		sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
		sb.append("    personalProgramDetails: ").append(toIndentedString(personalProgramDetails)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

	/**
	 * Gets or Sets status
	 */
	@JsonAdapter(StatusEnum.Adapter.class)
	public enum StatusEnum
	{
		NONE("None"),

		PENDING("Pending"),

		ERRORCREATING("ErrorCreating"),

		ACTIVE("Active"),

		CLOSED("Closed"),

		ARCHIVED("Archived"),

		CLOSEDDUETOINACTIVITY("ClosedDueToInactivity");

		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<StatusEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public StatusEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return StatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

