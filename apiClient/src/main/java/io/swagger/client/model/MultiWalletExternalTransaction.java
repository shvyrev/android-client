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

import org.joda.time.DateTime;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * MultiWalletExternalTransaction
 */

public class MultiWalletExternalTransaction
{
	@SerializedName("id")
	private UUID id = null;

	@SerializedName("currency")
	private CurrencyEnum currency = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("amount")
	private Double amount = null;

	@SerializedName("type")
	private TypeEnum type = null;

	@SerializedName("status")
	private String status = null;

	@SerializedName("isEnableActions")
	private Boolean isEnableActions = null;

	@SerializedName("statusUrl")
	private String statusUrl = null;

	public MultiWalletExternalTransaction id(UUID id) {
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

	public MultiWalletExternalTransaction currency(CurrencyEnum currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@ApiModelProperty(value = "")
	public CurrencyEnum getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}

	public MultiWalletExternalTransaction logo(String logo) {
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

	public MultiWalletExternalTransaction date(DateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Get date
	 *
	 * @return date
	 **/
	@ApiModelProperty(value = "")
	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public MultiWalletExternalTransaction amount(Double amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 *
	 * @return amount
	 **/
	@ApiModelProperty(value = "")
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public MultiWalletExternalTransaction type(TypeEnum type) {
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

	public MultiWalletExternalTransaction status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MultiWalletExternalTransaction isEnableActions(Boolean isEnableActions) {
		this.isEnableActions = isEnableActions;
		return this;
	}

	/**
	 * Get isEnableActions
	 *
	 * @return isEnableActions
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsEnableActions() {
		return isEnableActions;
	}

	public void setIsEnableActions(Boolean isEnableActions) {
		this.isEnableActions = isEnableActions;
	}

	public MultiWalletExternalTransaction statusUrl(String statusUrl) {
		this.statusUrl = statusUrl;
		return this;
	}

	/**
	 * Get statusUrl
	 *
	 * @return statusUrl
	 **/
	@ApiModelProperty(value = "")
	public String getStatusUrl() {
		return statusUrl;
	}

	public void setStatusUrl(String statusUrl) {
		this.statusUrl = statusUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MultiWalletExternalTransaction multiWalletExternalTransaction = (MultiWalletExternalTransaction) o;
		return Objects.equals(this.id, multiWalletExternalTransaction.id) &&
				Objects.equals(this.currency, multiWalletExternalTransaction.currency) &&
				Objects.equals(this.logo, multiWalletExternalTransaction.logo) &&
				Objects.equals(this.date, multiWalletExternalTransaction.date) &&
				Objects.equals(this.amount, multiWalletExternalTransaction.amount) &&
				Objects.equals(this.type, multiWalletExternalTransaction.type) &&
				Objects.equals(this.status, multiWalletExternalTransaction.status) &&
				Objects.equals(this.isEnableActions, multiWalletExternalTransaction.isEnableActions) &&
				Objects.equals(this.statusUrl, multiWalletExternalTransaction.statusUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, currency, logo, date, amount, type, status, isEnableActions, statusUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MultiWalletExternalTransaction {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    isEnableActions: ").append(toIndentedString(isEnableActions)).append("\n");
		sb.append("    statusUrl: ").append(toIndentedString(statusUrl)).append("\n");
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
	 * Gets or Sets currency
	 */
	@JsonAdapter(CurrencyEnum.Adapter.class)
	public enum CurrencyEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USDT("USDT"),

		XRP("XRP"),

		BCH("BCH"),

		LTC("LTC"),

		DOGE("DOGE"),

		BNB("BNB"),

		USD("USD"),

		EUR("EUR");

		public static CurrencyEnum fromValue(String text) {
			for (CurrencyEnum b : CurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		CurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<CurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return CurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets type
	 */
	@JsonAdapter(TypeEnum.Adapter.class)
	public enum TypeEnum
	{
		ALL("All"),

		DEPOSIT("Deposit"),

		WITHDRAWAL("Withdrawal");

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

