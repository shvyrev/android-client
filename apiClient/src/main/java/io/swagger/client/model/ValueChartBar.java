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

import io.swagger.annotations.ApiModelProperty;

/**
 * ValueChartBar
 */

public class ValueChartBar
{
	@SerializedName("value")
	private Double value = null;

	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("assets")
	private List<AssetsValue> assets = null;

	public ValueChartBar value(Double value) {
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

	public ValueChartBar date(DateTime date) {
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

	public ValueChartBar assets(List<AssetsValue> assets) {
		this.assets = assets;
		return this;
	}

	public ValueChartBar addAssetsItem(AssetsValue assetsItem) {
		if (this.assets == null) {
			this.assets = new ArrayList<AssetsValue>();
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
	public List<AssetsValue> getAssets() {
		return assets;
	}

	public void setAssets(List<AssetsValue> assets) {
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
		ValueChartBar valueChartBar = (ValueChartBar) o;
		return Objects.equals(this.value, valueChartBar.value) &&
				Objects.equals(this.date, valueChartBar.date) &&
				Objects.equals(this.assets, valueChartBar.assets);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, date, assets);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ValueChartBar {\n");

		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
