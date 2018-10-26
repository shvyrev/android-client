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
 * BlockchainInfo
 */

public class BlockchainInfo
{
	@SerializedName("hash")
	private String hash = null;

	@SerializedName("status")
	private StatusEnum status = null;

	public BlockchainInfo hash(String hash) {
		this.hash = hash;
		return this;
	}

	/**
	 * Get hash
	 *
	 * @return hash
	 **/
	@ApiModelProperty(value = "")
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public BlockchainInfo status(StatusEnum status) {
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
		BlockchainInfo blockchainInfo = (BlockchainInfo) o;
		return Objects.equals(this.hash, blockchainInfo.hash) &&
				Objects.equals(this.status, blockchainInfo.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hash, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BlockchainInfo {\n");

		sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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
		UNDEFINED("Undefined"),

		NEW("New"),

		PENDING("Pending"),

		CONFIRMEDBYGATE("ConfirmedByGate"),

		CONFIRMEDANDVALIDATED("ConfirmedAndValidated"),

		PENDINGADDINWALLET("PendingAddInWallet"),

		ERROR("Error"),

		CANCELLED("Cancelled");

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

