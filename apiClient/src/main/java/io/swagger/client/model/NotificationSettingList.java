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

import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationSettingList
 */

public class NotificationSettingList
{
	@SerializedName("settingsGeneral")
	private List<NotificationSettingViewModel> settingsGeneral = null;

	@SerializedName("settingsProgram")
	private List<ProgramNotificationSettingList> settingsProgram = null;

	@SerializedName("settingsManager")
	private List<ManagerNotificationSettingList> settingsManager = null;

	public NotificationSettingList settingsGeneral(List<NotificationSettingViewModel> settingsGeneral) {
		this.settingsGeneral = settingsGeneral;
		return this;
	}

	public NotificationSettingList addSettingsGeneralItem(NotificationSettingViewModel settingsGeneralItem) {
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

	public NotificationSettingList settingsProgram(List<ProgramNotificationSettingList> settingsProgram) {
		this.settingsProgram = settingsProgram;
		return this;
	}

	public NotificationSettingList addSettingsProgramItem(ProgramNotificationSettingList settingsProgramItem) {
		if (this.settingsProgram == null) {
			this.settingsProgram = new ArrayList<ProgramNotificationSettingList>();
		}
		this.settingsProgram.add(settingsProgramItem);
		return this;
	}

	/**
	 * Get settingsProgram
	 *
	 * @return settingsProgram
	 **/
	@ApiModelProperty(value = "")
	public List<ProgramNotificationSettingList> getSettingsProgram() {
		return settingsProgram;
	}

	public void setSettingsProgram(List<ProgramNotificationSettingList> settingsProgram) {
		this.settingsProgram = settingsProgram;
	}

	public NotificationSettingList settingsManager(List<ManagerNotificationSettingList> settingsManager) {
		this.settingsManager = settingsManager;
		return this;
	}

	public NotificationSettingList addSettingsManagerItem(ManagerNotificationSettingList settingsManagerItem) {
		if (this.settingsManager == null) {
			this.settingsManager = new ArrayList<ManagerNotificationSettingList>();
		}
		this.settingsManager.add(settingsManagerItem);
		return this;
	}

	/**
	 * Get settingsManager
	 *
	 * @return settingsManager
	 **/
	@ApiModelProperty(value = "")
	public List<ManagerNotificationSettingList> getSettingsManager() {
		return settingsManager;
	}

	public void setSettingsManager(List<ManagerNotificationSettingList> settingsManager) {
		this.settingsManager = settingsManager;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NotificationSettingList notificationSettingList = (NotificationSettingList) o;
		return Objects.equals(this.settingsGeneral, notificationSettingList.settingsGeneral) &&
				Objects.equals(this.settingsProgram, notificationSettingList.settingsProgram) &&
				Objects.equals(this.settingsManager, notificationSettingList.settingsManager);
	}

	@Override
	public int hashCode() {
		return Objects.hash(settingsGeneral, settingsProgram, settingsManager);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotificationSettingList {\n");

		sb.append("    settingsGeneral: ").append(toIndentedString(settingsGeneral)).append("\n");
		sb.append("    settingsProgram: ").append(toIndentedString(settingsProgram)).append("\n");
		sb.append("    settingsManager: ").append(toIndentedString(settingsManager)).append("\n");
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
