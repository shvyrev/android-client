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
 * ProgramSets
 */

public class ProgramSets
{
	@SerializedName("sets")
	private List<ProgramFacet> sets = null;

	@SerializedName("favoritesCount")
	private Integer favoritesCount = null;

	public ProgramSets sets(List<ProgramFacet> sets) {
		this.sets = sets;
		return this;
	}

	public ProgramSets addSetsItem(ProgramFacet setsItem) {
		if (this.sets == null) {
			this.sets = new ArrayList<ProgramFacet>();
		}
		this.sets.add(setsItem);
		return this;
	}

	/**
	 * Get sets
	 *
	 * @return sets
	 **/
	@ApiModelProperty(value = "")
	public List<ProgramFacet> getSets() {
		return sets;
	}

	public void setSets(List<ProgramFacet> sets) {
		this.sets = sets;
	}

	public ProgramSets favoritesCount(Integer favoritesCount) {
		this.favoritesCount = favoritesCount;
		return this;
	}

	/**
	 * Get favoritesCount
	 *
	 * @return favoritesCount
	 **/
	@ApiModelProperty(value = "")
	public Integer getFavoritesCount() {
		return favoritesCount;
	}

	public void setFavoritesCount(Integer favoritesCount) {
		this.favoritesCount = favoritesCount;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramSets programSets = (ProgramSets) o;
		return Objects.equals(this.sets, programSets.sets) &&
				Objects.equals(this.favoritesCount, programSets.favoritesCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sets, favoritesCount);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramSets {\n");

		sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
		sb.append("    favoritesCount: ").append(toIndentedString(favoritesCount)).append("\n");
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

