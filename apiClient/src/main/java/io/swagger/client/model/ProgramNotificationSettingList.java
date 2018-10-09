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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProgramNotificationSettingList
 */

public class ProgramNotificationSettingList
{
	@SerializedName("programId")
	private UUID programId = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("url")
	private String url = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("level")
	private Integer level = null;

	@SerializedName("settingsGeneral")
	private List<NotificationSettingViewModel> settingsGeneral = null;

	@SerializedName("settingsCustom")
	private List<NotificationSettingViewModel> settingsCustom = null;

	public ProgramNotificationSettingList programId(UUID programId) {
		this.programId = programId;
		return this;
	}

	/**
	 * Get programId
	 *
	 * @return programId
	 **/
	@ApiModelProperty(value = "")
	public UUID getProgramId() {
		return programId;
	}

	public void setProgramId(UUID programId) {
		this.programId = programId;
	}

	public ProgramNotificationSettingList title(String title) {
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

	public ProgramNotificationSettingList url(String url) {
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

	public ProgramNotificationSettingList logo(String logo) {
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

	public ProgramNotificationSettingList level(Integer level) {
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

	public ProgramNotificationSettingList settingsGeneral(List<NotificationSettingViewModel> settingsGeneral) {
		this.settingsGeneral = settingsGeneral;
		return this;
	}

	public ProgramNotificationSettingList addSettingsGeneralItem(NotificationSettingViewModel settingsGeneralItem) {
		if (this.settingsGeneral == null) {
			this.settingsGeneral = new ArrayList<NotificationSettingViewModel>();
		}
		this.settingsGeneral.add(settingsGeneralItem);
		return this;
	}

	/**
	 * Get settingsGeneral
	 *
	 * @return settingsGeneral
	 **/
	@ApiModelProperty(value = "")
	public List<NotificationSettingViewModel> getSettingsGeneral() {
		return settingsGeneral;
	}

	public void setSettingsGeneral(List<NotificationSettingViewModel> settingsGeneral) {
		this.settingsGeneral = settingsGeneral;
	}

	public ProgramNotificationSettingList settingsCustom(List<NotificationSettingViewModel> settingsCustom) {
		this.settingsCustom = settingsCustom;
		return this;
	}

	public ProgramNotificationSettingList addSettingsCustomItem(NotificationSettingViewModel settingsCustomItem) {
		if (this.settingsCustom == null) {
			this.settingsCustom = new ArrayList<NotificationSettingViewModel>();
		}
		this.settingsCustom.add(settingsCustomItem);
		return this;
	}

	/**
	 * Get settingsCustom
	 *
	 * @return settingsCustom
	 **/
	@ApiModelProperty(value = "")
	public List<NotificationSettingViewModel> getSettingsCustom() {
		return settingsCustom;
	}

	public void setSettingsCustom(List<NotificationSettingViewModel> settingsCustom) {
		this.settingsCustom = settingsCustom;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramNotificationSettingList programNotificationSettingList = (ProgramNotificationSettingList) o;
		return Objects.equals(this.programId, programNotificationSettingList.programId) &&
				Objects.equals(this.title, programNotificationSettingList.title) &&
				Objects.equals(this.url, programNotificationSettingList.url) &&
				Objects.equals(this.logo, programNotificationSettingList.logo) &&
				Objects.equals(this.level, programNotificationSettingList.level) &&
				Objects.equals(this.settingsGeneral, programNotificationSettingList.settingsGeneral) &&
				Objects.equals(this.settingsCustom, programNotificationSettingList.settingsCustom);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programId, title, url, logo, level, settingsGeneral, settingsCustom);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramNotificationSettingList {\n");

		sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    level: ").append(toIndentedString(level)).append("\n");
		sb.append("    settingsGeneral: ").append(toIndentedString(settingsGeneral)).append("\n");
		sb.append("    settingsCustom: ").append(toIndentedString(settingsCustom)).append("\n");
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

