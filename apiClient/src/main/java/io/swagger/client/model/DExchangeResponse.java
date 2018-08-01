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

import io.swagger.annotations.ApiModelProperty;

/**
 * DExchangeResponse
 */

public class DExchangeResponse
{
	@SerializedName("jsonrpc")
	private String jsonrpc = null;

	@SerializedName("id")
	private Integer id = null;

	@SerializedName("result")
	private Object result = null;

	public DExchangeResponse jsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
		return this;
	}

	/**
	 * Get jsonrpc
	 *
	 * @return jsonrpc
	 **/
	@ApiModelProperty(value = "")
	public String getJsonrpc() {
		return jsonrpc;
	}

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public DExchangeResponse id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DExchangeResponse result(Object result) {
		this.result = result;
		return this;
	}

	/**
	 * Get result
	 *
	 * @return result
	 **/
	@ApiModelProperty(value = "")
	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DExchangeResponse dexchangeResponse = (DExchangeResponse) o;
		return Objects.equals(this.jsonrpc, dexchangeResponse.jsonrpc) &&
				Objects.equals(this.id, dexchangeResponse.id) &&
				Objects.equals(this.result, dexchangeResponse.result);
	}

	@Override
	public int hashCode() {
		return Objects.hash(jsonrpc, id, result);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DExchangeResponse {\n");

		sb.append("    jsonrpc: ").append(toIndentedString(jsonrpc)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

