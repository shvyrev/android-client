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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * RateViewModel
 */

public class RateViewModel
{
	@SerializedName("rate")
	private Double rate = null;

	@SerializedName("from")
	private FromEnum from = null;

	@SerializedName("to")
	private ToEnum to = null;

	public RateViewModel rate(Double rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * Get rate
	 *
	 * @return rate
	 **/
	@ApiModelProperty(value = "")
	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public RateViewModel from(FromEnum from) {
		this.from = from;
		return this;
	}

	/**
	 * Get from
	 *
	 * @return from
	 **/
	@ApiModelProperty(required = true, value = "")
	public FromEnum getFrom() {
		return from;
	}

	public void setFrom(FromEnum from) {
		this.from = from;
	}

	public RateViewModel to(ToEnum to) {
		this.to = to;
		return this;
	}

	/**
	 * Get to
	 *
	 * @return to
	 **/
	@ApiModelProperty(required = true, value = "")
	public ToEnum getTo() {
		return to;
	}

	public void setTo(ToEnum to) {
		this.to = to;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RateViewModel rateViewModel = (RateViewModel) o;
		return Objects.equals(this.rate, rateViewModel.rate) &&
				Objects.equals(this.from, rateViewModel.from) &&
				Objects.equals(this.to, rateViewModel.to);
	}

	@Override
	public int hashCode() {
		return Objects.hash(rate, from, to);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RateViewModel {\n");

		sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
	 * Gets or Sets from
	 */
	@JsonAdapter(FromEnum.Adapter.class)
	public enum FromEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USD("USD"),

		EUR("EUR");

		public static FromEnum fromValue(String text) {
			for (FromEnum b : FromEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		FromEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<FromEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final FromEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public FromEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return FromEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets to
	 */
	@JsonAdapter(ToEnum.Adapter.class)
	public enum ToEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USD("USD"),

		EUR("EUR");

		public static ToEnum fromValue(String text) {
			for (ToEnum b : ToEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		ToEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<ToEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final ToEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ToEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ToEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

