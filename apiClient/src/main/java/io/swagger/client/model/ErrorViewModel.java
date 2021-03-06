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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorViewModel
 */

public class ErrorViewModel
{
	@SerializedName("errors")
	private List<ErrorMessage> errors = null;

	@SerializedName("code")
	private CodeEnum code = null;

	public ErrorViewModel errors(List<ErrorMessage> errors) {
		this.errors = errors;
		return this;
	}

	public ErrorViewModel addErrorsItem(ErrorMessage errorsItem) {
		if (this.errors == null) {
			this.errors = new ArrayList<ErrorMessage>();
		}
		this.errors.add(errorsItem);
		return this;
	}

	/**
	 * Get errors
	 *
	 * @return errors
	 **/
	@ApiModelProperty(value = "")
	public List<ErrorMessage> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorMessage> errors) {
		this.errors = errors;
	}

	public ErrorViewModel code(CodeEnum code) {
		this.code = code;
		return this;
	}

	/**
	 * Get code
	 *
	 * @return code
	 **/
	@ApiModelProperty(value = "")
	public CodeEnum getCode() {
		return code;
	}

	public void setCode(CodeEnum code) {
		this.code = code;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ErrorViewModel errorViewModel = (ErrorViewModel) o;
		return Objects.equals(this.errors, errorViewModel.errors) &&
				Objects.equals(this.code, errorViewModel.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(errors, code);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorViewModel {\n");

		sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
	 * Gets or Sets code
	 */
	@JsonAdapter(CodeEnum.Adapter.class)
	public enum CodeEnum
	{
		INTERNALSERVERERROR("InternalServerError"),

		VALIDATIONERROR("ValidationError"),

		REQUIRESTWOFACTOR("RequiresTwoFactor");

		public static CodeEnum fromValue(String text) {
			for (CodeEnum b : CodeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		CodeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<CodeEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public CodeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return CodeEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

