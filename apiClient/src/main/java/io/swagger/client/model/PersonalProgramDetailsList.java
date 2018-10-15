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

import java.io.IOException;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * PersonalProgramDetailsList
 */

public class PersonalProgramDetailsList
{
	@SerializedName("isReinvest")
	private Boolean isReinvest = null;

	@SerializedName("isFavorite")
	private Boolean isFavorite = null;

	@SerializedName("isInvested")
	private Boolean isInvested = null;

	@SerializedName("status")
	private StatusEnum status = null;

	public PersonalProgramDetailsList isReinvest(Boolean isReinvest) {
		this.isReinvest = isReinvest;
		return this;
	}

	/**
	 * Get isReinvest
	 *
	 * @return isReinvest
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsReinvest() {
		return isReinvest;
	}

	public void setIsReinvest(Boolean isReinvest) {
		this.isReinvest = isReinvest;
	}

	public PersonalProgramDetailsList isFavorite(Boolean isFavorite) {
		this.isFavorite = isFavorite;
		return this;
	}

	/**
	 * Get isFavorite
	 *
	 * @return isFavorite
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(Boolean isFavorite) {
		this.isFavorite = isFavorite;
	}

	public PersonalProgramDetailsList isInvested(Boolean isInvested) {
		this.isInvested = isInvested;
		return this;
	}

	/**
	 * Get isInvested
	 *
	 * @return isInvested
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsInvested() {
		return isInvested;
	}

	public void setIsInvested(Boolean isInvested) {
		this.isInvested = isInvested;
	}

	public PersonalProgramDetailsList status(StatusEnum status) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonalProgramDetailsList personalProgramDetailsList = (PersonalProgramDetailsList) o;
		return Objects.equals(this.isReinvest, personalProgramDetailsList.isReinvest) &&
				Objects.equals(this.isFavorite, personalProgramDetailsList.isFavorite) &&
				Objects.equals(this.isInvested, personalProgramDetailsList.isInvested) &&
				Objects.equals(this.status, personalProgramDetailsList.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isReinvest, isFavorite, isInvested, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonalProgramDetailsList {\n");

		sb.append("    isReinvest: ").append(toIndentedString(isReinvest)).append("\n");
		sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
		sb.append("    isInvested: ").append(toIndentedString(isInvested)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
	 * Gets or Sets status
	 */
	@JsonAdapter(StatusEnum.Adapter.class)
	public enum StatusEnum
	{
		ACTIVE("Active"),

		INVESTING("Investing"),

		WITHDRAWING("Withdrawing"),

		ENDED("Ended");

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

