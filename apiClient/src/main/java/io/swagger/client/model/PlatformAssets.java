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
 * PlatformAssets
 */

public class PlatformAssets
{
	@SerializedName("assets")
	private List<PlatformAsset> assets = null;

	public PlatformAssets assets(List<PlatformAsset> assets) {
		this.assets = assets;
		return this;
	}

	public PlatformAssets addAssetsItem(PlatformAsset assetsItem) {
		if (this.assets == null) {
			this.assets = new ArrayList<PlatformAsset>();
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
	public List<PlatformAsset> getAssets() {
		return assets;
	}

	public void setAssets(List<PlatformAsset> assets) {
		this.assets = assets;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlatformAssets platformAssets = (PlatformAssets) o;
		return Objects.equals(this.assets, platformAssets.assets);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assets);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlatformAssets {\n");

		sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

