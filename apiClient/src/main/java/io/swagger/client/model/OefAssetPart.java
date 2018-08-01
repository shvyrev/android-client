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

import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * OefAssetPart
 */

public class OefAssetPart
{
	@SerializedName("assetId")
	private UUID assetId = null;

	@SerializedName("assetPart")
	private Double assetPart = null;

	public OefAssetPart assetId(UUID assetId) {
		this.assetId = assetId;
		return this;
	}

	/**
	 * Get assetId
	 *
	 * @return assetId
	 **/
	@ApiModelProperty(value = "")
	public UUID getAssetId() {
		return assetId;
	}

	public void setAssetId(UUID assetId) {
		this.assetId = assetId;
	}

	public OefAssetPart assetPart(Double assetPart) {
		this.assetPart = assetPart;
		return this;
	}

	/**
	 * Get assetPart
	 *
	 * @return assetPart
	 **/
	@ApiModelProperty(value = "")
	public Double getAssetPart() {
		return assetPart;
	}

	public void setAssetPart(Double assetPart) {
		this.assetPart = assetPart;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OefAssetPart oefAssetPart = (OefAssetPart) o;
		return Objects.equals(this.assetId, oefAssetPart.assetId) &&
				Objects.equals(this.assetPart, oefAssetPart.assetPart);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assetId, assetPart);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OefAssetPart {\n");

		sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
		sb.append("    assetPart: ").append(toIndentedString(assetPart)).append("\n");
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

