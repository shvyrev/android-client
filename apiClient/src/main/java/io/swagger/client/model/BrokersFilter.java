/*
 * Core API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: 
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
 * BrokersFilter
 */

public class BrokersFilter
{
	@SerializedName("brokerName")
	private String brokerName = null;

	@SerializedName("tradeServerName")
	private String tradeServerName = null;

	@SerializedName("tradeServerType")
	private TradeServerTypeEnum tradeServerType = null;

	@SerializedName("skip")
	private Integer skip = null;

	@SerializedName("take")
	private Integer take = null;

	public BrokersFilter brokerName(String brokerName) {
		this.brokerName = brokerName;
		return this;
	}

	/**
	 * Get brokerName
	 *
	 * @return brokerName
	 **/
	@ApiModelProperty(value = "")
	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public BrokersFilter tradeServerName(String tradeServerName) {
		this.tradeServerName = tradeServerName;
		return this;
	}

	/**
	 * Get tradeServerName
	 *
	 * @return tradeServerName
	 **/
	@ApiModelProperty(value = "")
	public String getTradeServerName() {
		return tradeServerName;
	}

	public void setTradeServerName(String tradeServerName) {
		this.tradeServerName = tradeServerName;
	}

	public BrokersFilter tradeServerType(TradeServerTypeEnum tradeServerType) {
		this.tradeServerType = tradeServerType;
		return this;
	}

	/**
	 * Get tradeServerType
	 *
	 * @return tradeServerType
	 **/
	@ApiModelProperty(value = "")
	public TradeServerTypeEnum getTradeServerType() {
		return tradeServerType;
	}

	public void setTradeServerType(TradeServerTypeEnum tradeServerType) {
		this.tradeServerType = tradeServerType;
	}

	public BrokersFilter skip(Integer skip) {
		this.skip = skip;
		return this;
	}

	/**
	 * Get skip
	 *
	 * @return skip
	 **/
	@ApiModelProperty(value = "")
	public Integer getSkip() {
		return skip;
	}

	public void setSkip(Integer skip) {
		this.skip = skip;
	}

	public BrokersFilter take(Integer take) {
		this.take = take;
		return this;
	}

	/**
	 * Get take
	 *
	 * @return take
	 **/
	@ApiModelProperty(value = "")
	public Integer getTake() {
		return take;
	}

	public void setTake(Integer take) {
		this.take = take;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrokersFilter brokersFilter = (BrokersFilter) o;
		return Objects.equals(this.brokerName, brokersFilter.brokerName) &&
				Objects.equals(this.tradeServerName, brokersFilter.tradeServerName) &&
				Objects.equals(this.tradeServerType, brokersFilter.tradeServerType) &&
				Objects.equals(this.skip, brokersFilter.skip) &&
				Objects.equals(this.take, brokersFilter.take);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brokerName, tradeServerName, tradeServerType, skip, take);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrokersFilter {\n");

		sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
		sb.append("    tradeServerName: ").append(toIndentedString(tradeServerName)).append("\n");
		sb.append("    tradeServerType: ").append(toIndentedString(tradeServerType)).append("\n");
		sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
		sb.append("    take: ").append(toIndentedString(take)).append("\n");
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
	 * Gets or Sets tradeServerType
	 */
	@JsonAdapter(TradeServerTypeEnum.Adapter.class)
	public enum TradeServerTypeEnum
	{
		UNDEFINED("Undefined"),

		METATRADER4("MetaTrader4"),

		METATRADER5("MetaTrader5"),

		NINJATRADER("NinjaTrader"),

		CTRADER("cTrader"),

		RUMUS("Rumus"),

		METASTOCK("Metastock");

		public static TradeServerTypeEnum fromValue(String text) {
			for (TradeServerTypeEnum b : TradeServerTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		TradeServerTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<TradeServerTypeEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final TradeServerTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TradeServerTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TradeServerTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

