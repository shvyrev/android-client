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
 * ManagersList
 */

public class ManagersList
{
	@SerializedName("managers")
	private List<ManagerProfile> managers = null;

	@SerializedName("total")
	private Integer total = null;

	public ManagersList managers(List<ManagerProfile> managers) {
		this.managers = managers;
		return this;
	}

	public ManagersList addManagersItem(ManagerProfile managersItem) {
		if (this.managers == null) {
			this.managers = new ArrayList<ManagerProfile>();
		}
		this.managers.add(managersItem);
		return this;
	}

	/**
	 * Get managers
	 *
	 * @return managers
	 **/
	@ApiModelProperty(value = "")
	public List<ManagerProfile> getManagers() {
		return managers;
	}

	public void setManagers(List<ManagerProfile> managers) {
		this.managers = managers;
	}

	public ManagersList total(Integer total) {
		this.total = total;
		return this;
	}

	/**
	 * Get total
	 *
	 * @return total
	 **/
	@ApiModelProperty(value = "")
	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ManagersList managersList = (ManagersList) o;
		return Objects.equals(this.managers, managersList.managers) &&
				Objects.equals(this.total, managersList.total);
	}

	@Override
	public int hashCode() {
		return Objects.hash(managers, total);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ManagersList {\n");

		sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

