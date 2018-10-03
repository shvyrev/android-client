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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProgramDetails
 */

public class ProgramDetails
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

	@SerializedName("availableInvestment")
	private Double availableInvestment = null;

	@SerializedName("statistic")
	private ProgramDetailsListStatistic statistic = null;

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("url")
	private String url = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("status")
	private StatusEnum status = null;

	@SerializedName("manager")
	private ProfilePublic manager = null;

	@SerializedName("chart")
	private List<ChartSimple> chart = null;

	@SerializedName("personalProgramDetails")
	private PersonalProgramDetailsList personalProgramDetails = null;

	@SerializedName("dashboardProgramDetails")
	private DashboardProgramDetails dashboardProgramDetails = null;

	public ProgramDetails currency(CurrencyEnum currency) {
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

	public ProgramDetails level(Integer level) {
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

	public ProgramDetails periodDuration(Integer periodDuration) {
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

	public ProgramDetails periodStarts(DateTime periodStarts) {
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

	public ProgramDetails periodEnds(DateTime periodEnds) {
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

	public ProgramDetails availableInvestment(Double availableInvestment) {
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

	public ProgramDetails statistic(ProgramDetailsListStatistic statistic) {
		this.statistic = statistic;
		return this;
	}

	/**
	 * Get statistic
	 *
	 * @return statistic
	 **/
	@ApiModelProperty(value = "")
	public ProgramDetailsListStatistic getStatistic() {
		return statistic;
	}

	public void setStatistic(ProgramDetailsListStatistic statistic) {
		this.statistic = statistic;
	}

	public ProgramDetails id(UUID id) {
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

	public ProgramDetails logo(String logo) {
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

	public ProgramDetails url(String url) {
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

	public ProgramDetails title(String title) {
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

	public ProgramDetails description(String description) {
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

	public ProgramDetails status(StatusEnum status) {
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

	public ProgramDetails manager(ProfilePublic manager) {
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

	public ProgramDetails chart(List<ChartSimple> chart) {
		this.chart = chart;
		return this;
	}

	public ProgramDetails addChartItem(ChartSimple chartItem) {
		if (this.chart == null) {
			this.chart = new ArrayList<ChartSimple>();
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
	public List<ChartSimple> getChart() {
		return chart;
	}

	public void setChart(List<ChartSimple> chart) {
		this.chart = chart;
	}

	public ProgramDetails personalProgramDetails(PersonalProgramDetailsList personalProgramDetails) {
		this.personalProgramDetails = personalProgramDetails;
		return this;
	}

	/**
	 * Fields for authorized user
	 *
	 * @return personalProgramDetails
	 **/
	@ApiModelProperty(value = "Fields for authorized user")
	public PersonalProgramDetailsList getPersonalProgramDetails() {
		return personalProgramDetails;
	}

	public void setPersonalProgramDetails(PersonalProgramDetailsList personalProgramDetails) {
		this.personalProgramDetails = personalProgramDetails;
	}

	public ProgramDetails dashboardProgramDetails(DashboardProgramDetails dashboardProgramDetails) {
		this.dashboardProgramDetails = dashboardProgramDetails;
		return this;
	}

	/**
	 * Fields for dashboard
	 *
	 * @return dashboardProgramDetails
	 **/
	@ApiModelProperty(value = "Fields for dashboard")
	public DashboardProgramDetails getDashboardProgramDetails() {
		return dashboardProgramDetails;
	}

	public void setDashboardProgramDetails(DashboardProgramDetails dashboardProgramDetails) {
		this.dashboardProgramDetails = dashboardProgramDetails;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramDetails programDetails = (ProgramDetails) o;
		return Objects.equals(this.currency, programDetails.currency) &&
				Objects.equals(this.level, programDetails.level) &&
				Objects.equals(this.periodDuration, programDetails.periodDuration) &&
				Objects.equals(this.periodStarts, programDetails.periodStarts) &&
				Objects.equals(this.periodEnds, programDetails.periodEnds) &&
				Objects.equals(this.availableInvestment, programDetails.availableInvestment) &&
				Objects.equals(this.statistic, programDetails.statistic) &&
				Objects.equals(this.id, programDetails.id) &&
				Objects.equals(this.logo, programDetails.logo) &&
				Objects.equals(this.url, programDetails.url) &&
				Objects.equals(this.title, programDetails.title) &&
				Objects.equals(this.description, programDetails.description) &&
				Objects.equals(this.status, programDetails.status) &&
				Objects.equals(this.manager, programDetails.manager) &&
				Objects.equals(this.chart, programDetails.chart) &&
				Objects.equals(this.personalProgramDetails, programDetails.personalProgramDetails) &&
				Objects.equals(this.dashboardProgramDetails, programDetails.dashboardProgramDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, level, periodDuration, periodStarts, periodEnds, availableInvestment, statistic, id, logo, url, title, description, status, manager, chart, personalProgramDetails, dashboardProgramDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramDetails {\n");

		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    level: ").append(toIndentedString(level)).append("\n");
		sb.append("    periodDuration: ").append(toIndentedString(periodDuration)).append("\n");
		sb.append("    periodStarts: ").append(toIndentedString(periodStarts)).append("\n");
		sb.append("    periodEnds: ").append(toIndentedString(periodEnds)).append("\n");
		sb.append("    availableInvestment: ").append(toIndentedString(availableInvestment)).append("\n");
		sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
		sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
		sb.append("    personalProgramDetails: ").append(toIndentedString(personalProgramDetails)).append("\n");
		sb.append("    dashboardProgramDetails: ").append(toIndentedString(dashboardProgramDetails)).append("\n");
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
		ETH("ETH"),

		GVT("GVT"),

		BTC("BTC"),

		UNDEFINED("Undefined"),

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

