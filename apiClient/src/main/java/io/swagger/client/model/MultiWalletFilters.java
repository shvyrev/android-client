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
 * MultiWalletFilters
 */

public class MultiWalletFilters
{
	@SerializedName("transactionType")
	private List<String> transactionType = null;

	@SerializedName("externalTransactionType")
	private List<String> externalTransactionType = null;

	public MultiWalletFilters transactionType(List<String> transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public MultiWalletFilters addTransactionTypeItem(String transactionTypeItem) {
		if (this.transactionType == null) {
			this.transactionType = new ArrayList<String>();
		}
		this.transactionType.add(transactionTypeItem);
		return this;
	}

	/**
	 * Get transactionType
	 *
	 * @return transactionType
	 **/
	@ApiModelProperty(value = "")
	public List<String> getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(List<String> transactionType) {
		this.transactionType = transactionType;
	}

	public MultiWalletFilters externalTransactionType(List<String> externalTransactionType) {
		this.externalTransactionType = externalTransactionType;
		return this;
	}

	public MultiWalletFilters addExternalTransactionTypeItem(String externalTransactionTypeItem) {
		if (this.externalTransactionType == null) {
			this.externalTransactionType = new ArrayList<String>();
		}
		this.externalTransactionType.add(externalTransactionTypeItem);
		return this;
	}

	/**
	 * Get externalTransactionType
	 *
	 * @return externalTransactionType
	 **/
	@ApiModelProperty(value = "")
	public List<String> getExternalTransactionType() {
		return externalTransactionType;
	}

	public void setExternalTransactionType(List<String> externalTransactionType) {
		this.externalTransactionType = externalTransactionType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MultiWalletFilters multiWalletFilters = (MultiWalletFilters) o;
		return Objects.equals(this.transactionType, multiWalletFilters.transactionType) &&
				Objects.equals(this.externalTransactionType, multiWalletFilters.externalTransactionType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transactionType, externalTransactionType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MultiWalletFilters {\n");

		sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
		sb.append("    externalTransactionType: ").append(toIndentedString(externalTransactionType)).append("\n");
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
