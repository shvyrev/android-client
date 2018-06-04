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

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * PlatformStatus
 */

public class PlatformStatus
{
	@SerializedName("isTournamentActive")
	private Boolean isTournamentActive = null;

	@SerializedName("isTournamentRegistrationActive")
	private Boolean isTournamentRegistrationActive = null;

	@SerializedName("tournamentCurrentRound")
	private Integer tournamentCurrentRound = null;

	@SerializedName("tournamentTotalRounds")
	private Integer tournamentTotalRounds = null;

	@SerializedName("programsMinAvgProfit")
	private Double programsMinAvgProfit = null;

	@SerializedName("programsMaxAvgProfit")
	private Double programsMaxAvgProfit = null;

	@SerializedName("programsMinTotalProfit")
	private Double programsMinTotalProfit = null;

	@SerializedName("programsMaxTotalProfit")
	private Double programsMaxTotalProfit = null;

	@SerializedName("iOSVersion")
	private IOsAppVersion iOSVersion = null;

	@SerializedName("androidVersion")
	private AndroidAppVersion androidVersion = null;

	public PlatformStatus isTournamentActive(Boolean isTournamentActive) {
		this.isTournamentActive = isTournamentActive;
		return this;
	}

	/**
	 * Get isTournamentActive
	 *
	 * @return isTournamentActive
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsTournamentActive() {
		return isTournamentActive;
	}

	public void setIsTournamentActive(Boolean isTournamentActive) {
		this.isTournamentActive = isTournamentActive;
	}

	public PlatformStatus isTournamentRegistrationActive(Boolean isTournamentRegistrationActive) {
		this.isTournamentRegistrationActive = isTournamentRegistrationActive;
		return this;
	}

	/**
	 * Get isTournamentRegistrationActive
	 *
	 * @return isTournamentRegistrationActive
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsTournamentRegistrationActive() {
		return isTournamentRegistrationActive;
	}

	public void setIsTournamentRegistrationActive(Boolean isTournamentRegistrationActive) {
		this.isTournamentRegistrationActive = isTournamentRegistrationActive;
	}

	public PlatformStatus tournamentCurrentRound(Integer tournamentCurrentRound) {
		this.tournamentCurrentRound = tournamentCurrentRound;
		return this;
	}

	/**
	 * Get tournamentCurrentRound
	 *
	 * @return tournamentCurrentRound
	 **/
	@ApiModelProperty(value = "")
	public Integer getTournamentCurrentRound() {
		return tournamentCurrentRound;
	}

	public void setTournamentCurrentRound(Integer tournamentCurrentRound) {
		this.tournamentCurrentRound = tournamentCurrentRound;
	}

	public PlatformStatus tournamentTotalRounds(Integer tournamentTotalRounds) {
		this.tournamentTotalRounds = tournamentTotalRounds;
		return this;
	}

	/**
	 * Get tournamentTotalRounds
	 *
	 * @return tournamentTotalRounds
	 **/
	@ApiModelProperty(value = "")
	public Integer getTournamentTotalRounds() {
		return tournamentTotalRounds;
	}

	public void setTournamentTotalRounds(Integer tournamentTotalRounds) {
		this.tournamentTotalRounds = tournamentTotalRounds;
	}

	public PlatformStatus programsMinAvgProfit(Double programsMinAvgProfit) {
		this.programsMinAvgProfit = programsMinAvgProfit;
		return this;
	}

	/**
	 * Get programsMinAvgProfit
	 *
	 * @return programsMinAvgProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getProgramsMinAvgProfit() {
		return programsMinAvgProfit;
	}

	public void setProgramsMinAvgProfit(Double programsMinAvgProfit) {
		this.programsMinAvgProfit = programsMinAvgProfit;
	}

	public PlatformStatus programsMaxAvgProfit(Double programsMaxAvgProfit) {
		this.programsMaxAvgProfit = programsMaxAvgProfit;
		return this;
	}

	/**
	 * Get programsMaxAvgProfit
	 *
	 * @return programsMaxAvgProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getProgramsMaxAvgProfit() {
		return programsMaxAvgProfit;
	}

	public void setProgramsMaxAvgProfit(Double programsMaxAvgProfit) {
		this.programsMaxAvgProfit = programsMaxAvgProfit;
	}

	public PlatformStatus programsMinTotalProfit(Double programsMinTotalProfit) {
		this.programsMinTotalProfit = programsMinTotalProfit;
		return this;
	}

	/**
	 * Get programsMinTotalProfit
	 *
	 * @return programsMinTotalProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getProgramsMinTotalProfit() {
		return programsMinTotalProfit;
	}

	public void setProgramsMinTotalProfit(Double programsMinTotalProfit) {
		this.programsMinTotalProfit = programsMinTotalProfit;
	}

	public PlatformStatus programsMaxTotalProfit(Double programsMaxTotalProfit) {
		this.programsMaxTotalProfit = programsMaxTotalProfit;
		return this;
	}

	/**
	 * Get programsMaxTotalProfit
	 *
	 * @return programsMaxTotalProfit
	 **/
	@ApiModelProperty(value = "")
	public Double getProgramsMaxTotalProfit() {
		return programsMaxTotalProfit;
	}

	public void setProgramsMaxTotalProfit(Double programsMaxTotalProfit) {
		this.programsMaxTotalProfit = programsMaxTotalProfit;
	}

	public PlatformStatus iOSVersion(IOsAppVersion iOSVersion) {
		this.iOSVersion = iOSVersion;
		return this;
	}

	/**
	 * Get iOSVersion
	 *
	 * @return iOSVersion
	 **/
	@ApiModelProperty(value = "")
	public IOsAppVersion getIOSVersion() {
		return iOSVersion;
	}

	public void setIOSVersion(IOsAppVersion iOSVersion) {
		this.iOSVersion = iOSVersion;
	}

	public PlatformStatus androidVersion(AndroidAppVersion androidVersion) {
		this.androidVersion = androidVersion;
		return this;
	}

	/**
	 * Get androidVersion
	 *
	 * @return androidVersion
	 **/
	@ApiModelProperty(value = "")
	public AndroidAppVersion getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(AndroidAppVersion androidVersion) {
		this.androidVersion = androidVersion;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlatformStatus platformStatus = (PlatformStatus) o;
		return Objects.equals(this.isTournamentActive, platformStatus.isTournamentActive) &&
				Objects.equals(this.isTournamentRegistrationActive, platformStatus.isTournamentRegistrationActive) &&
				Objects.equals(this.tournamentCurrentRound, platformStatus.tournamentCurrentRound) &&
				Objects.equals(this.tournamentTotalRounds, platformStatus.tournamentTotalRounds) &&
				Objects.equals(this.programsMinAvgProfit, platformStatus.programsMinAvgProfit) &&
				Objects.equals(this.programsMaxAvgProfit, platformStatus.programsMaxAvgProfit) &&
				Objects.equals(this.programsMinTotalProfit, platformStatus.programsMinTotalProfit) &&
				Objects.equals(this.programsMaxTotalProfit, platformStatus.programsMaxTotalProfit) &&
				Objects.equals(this.iOSVersion, platformStatus.iOSVersion) &&
				Objects.equals(this.androidVersion, platformStatus.androidVersion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isTournamentActive, isTournamentRegistrationActive, tournamentCurrentRound, tournamentTotalRounds, programsMinAvgProfit, programsMaxAvgProfit, programsMinTotalProfit, programsMaxTotalProfit, iOSVersion, androidVersion);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlatformStatus {\n");

		sb.append("    isTournamentActive: ").append(toIndentedString(isTournamentActive)).append("\n");
		sb.append("    isTournamentRegistrationActive: ").append(toIndentedString(isTournamentRegistrationActive)).append("\n");
		sb.append("    tournamentCurrentRound: ").append(toIndentedString(tournamentCurrentRound)).append("\n");
		sb.append("    tournamentTotalRounds: ").append(toIndentedString(tournamentTotalRounds)).append("\n");
		sb.append("    programsMinAvgProfit: ").append(toIndentedString(programsMinAvgProfit)).append("\n");
		sb.append("    programsMaxAvgProfit: ").append(toIndentedString(programsMaxAvgProfit)).append("\n");
		sb.append("    programsMinTotalProfit: ").append(toIndentedString(programsMinTotalProfit)).append("\n");
		sb.append("    programsMaxTotalProfit: ").append(toIndentedString(programsMaxTotalProfit)).append("\n");
		sb.append("    iOSVersion: ").append(toIndentedString(iOSVersion)).append("\n");
		sb.append("    androidVersion: ").append(toIndentedString(androidVersion)).append("\n");
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

