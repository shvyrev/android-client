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

import org.joda.time.DateTime;

import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProfilePublic
 */

public class ProfilePublic
{
	@SerializedName("id")
	private UUID id = null;

	@SerializedName("username")
	private String username = null;

	@SerializedName("avatar")
	private String avatar = null;

	@SerializedName("registrationDate")
	private DateTime registrationDate = null;

	@SerializedName("url")
	private String url = null;

	public ProfilePublic id(UUID id) {
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

	public ProfilePublic username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get username
	 *
	 * @return username
	 **/
	@ApiModelProperty(value = "")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ProfilePublic avatar(String avatar) {
		this.avatar = avatar;
		return this;
	}

	/**
	 * Get avatar
	 *
	 * @return avatar
	 **/
	@ApiModelProperty(value = "")
	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public ProfilePublic registrationDate(DateTime registrationDate) {
		this.registrationDate = registrationDate;
		return this;
	}

	/**
	 * Get registrationDate
	 *
	 * @return registrationDate
	 **/
	@ApiModelProperty(value = "")
	public DateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(DateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public ProfilePublic url(String url) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProfilePublic profilePublic = (ProfilePublic) o;
		return Objects.equals(this.id, profilePublic.id) &&
				Objects.equals(this.username, profilePublic.username) &&
				Objects.equals(this.avatar, profilePublic.avatar) &&
				Objects.equals(this.registrationDate, profilePublic.registrationDate) &&
				Objects.equals(this.url, profilePublic.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, avatar, registrationDate, url);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfilePublic {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

