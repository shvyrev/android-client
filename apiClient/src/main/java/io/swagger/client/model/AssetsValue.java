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
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * AssetsValue
 */

public class AssetsValue
{
	@SerializedName("type")
	private TypeEnum type = null;

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("avatar")
	private String avatar = null;

	@SerializedName("color")
	private String color = null;

	@SerializedName("value")
	private Double value = null;

	@SerializedName("changePercent")
	private Double changePercent = null;

	@SerializedName("changeValue")
	private Double changeValue = null;

	public AssetsValue type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public AssetsValue id(UUID id) {
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

	public AssetsValue title(String title) {
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

	public AssetsValue avatar(String avatar) {
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

	public AssetsValue color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * Get color
	 *
	 * @return color
	 **/
	@ApiModelProperty(value = "")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public AssetsValue value(Double value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 *
	 * @return value
	 **/
	@ApiModelProperty(value = "")
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public AssetsValue changePercent(Double changePercent) {
		this.changePercent = changePercent;
		return this;
	}

	/**
	 * Get changePercent
	 *
	 * @return changePercent
	 **/
	@ApiModelProperty(value = "")
	public Double getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(Double changePercent) {
		this.changePercent = changePercent;
	}

	public AssetsValue changeValue(Double changeValue) {
		this.changeValue = changeValue;
		return this;
	}

	/**
	 * Get changeValue
	 *
	 * @return changeValue
	 **/
	@ApiModelProperty(value = "")
	public Double getChangeValue() {
		return changeValue;
	}

	public void setChangeValue(Double changeValue) {
		this.changeValue = changeValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AssetsValue assetsValue = (AssetsValue) o;
		return Objects.equals(this.type, assetsValue.type) &&
				Objects.equals(this.id, assetsValue.id) &&
				Objects.equals(this.title, assetsValue.title) &&
				Objects.equals(this.avatar, assetsValue.avatar) &&
				Objects.equals(this.color, assetsValue.color) &&
				Objects.equals(this.value, assetsValue.value) &&
				Objects.equals(this.changePercent, assetsValue.changePercent) &&
				Objects.equals(this.changeValue, assetsValue.changeValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, id, title, avatar, color, value, changePercent, changeValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AssetsValue {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    changePercent: ").append(toIndentedString(changePercent)).append("\n");
		sb.append("    changeValue: ").append(toIndentedString(changeValue)).append("\n");
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
	 * Gets or Sets type
	 */
	@JsonAdapter(TypeEnum.Adapter.class)
	public enum TypeEnum
	{
		ALL("All"),

		PROGRAM("Program"),

		FUND("Fund");

		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<TypeEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

