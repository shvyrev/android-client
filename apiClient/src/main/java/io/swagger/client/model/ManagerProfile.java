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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * ManagerProfile
 */

public class ManagerProfile
{
	@SerializedName("id")
	private UUID id = null;

	@SerializedName("username")
	private String username = null;

	@SerializedName("about")
	private String about = null;

	@SerializedName("avatar")
	private String avatar = null;

	@SerializedName("regDate")
	private DateTime regDate = null;

	@SerializedName("assets")
	private List<String> assets = null;

	@SerializedName("url")
	private String url = null;

	public ManagerProfile id(UUID id) {
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

	public ManagerProfile username(String username) {
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

	public ManagerProfile about(String about) {
		this.about = about;
		return this;
	}

	/**
	 * Get about
	 *
	 * @return about
	 **/
	@ApiModelProperty(value = "")
	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public ManagerProfile avatar(String avatar) {
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

	public ManagerProfile regDate(DateTime regDate) {
		this.regDate = regDate;
		return this;
	}

	/**
	 * Get regDate
	 *
	 * @return regDate
	 **/
	@ApiModelProperty(value = "")
	public DateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(DateTime regDate) {
		this.regDate = regDate;
	}

	public ManagerProfile assets(List<String> assets) {
		this.assets = assets;
		return this;
	}

	public ManagerProfile addAssetsItem(String assetsItem) {
		if (this.assets == null) {
			this.assets = new ArrayList<String>();
		}
		this.assets.add(assetsItem);
		return this;
	}

	/**
	 * Get assets
	 *
	 * @return assets
	 **/
	@ApiModelProperty(value = "")
	public List<String> getAssets() {
		return assets;
	}

	public void setAssets(List<String> assets) {
		this.assets = assets;
	}

	public ManagerProfile url(String url) {
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
		ManagerProfile managerProfile = (ManagerProfile) o;
		return Objects.equals(this.id, managerProfile.id) &&
				Objects.equals(this.username, managerProfile.username) &&
				Objects.equals(this.about, managerProfile.about) &&
				Objects.equals(this.avatar, managerProfile.avatar) &&
				Objects.equals(this.regDate, managerProfile.regDate) &&
				Objects.equals(this.assets, managerProfile.assets) &&
				Objects.equals(this.url, managerProfile.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, about, avatar, regDate, assets, url);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ManagerProfile {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    about: ").append(toIndentedString(about)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    regDate: ").append(toIndentedString(regDate)).append("\n");
		sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

