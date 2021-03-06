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
 * ManagerPortfolioEvents
 */

public class ManagerPortfolioEvents
{
	@SerializedName("events")
	private List<ManagerPortfolioEvent> events = null;

	@SerializedName("total")
	private Integer total = null;

	public ManagerPortfolioEvents events(List<ManagerPortfolioEvent> events) {
		this.events = events;
		return this;
	}

	public ManagerPortfolioEvents addEventsItem(ManagerPortfolioEvent eventsItem) {
		if (this.events == null) {
			this.events = new ArrayList<ManagerPortfolioEvent>();
		}
		this.events.add(eventsItem);
		return this;
	}

	/**
	 * Get events
	 *
	 * @return events
	 **/
	@ApiModelProperty(value = "")
	public List<ManagerPortfolioEvent> getEvents() {
		return events;
	}

	public void setEvents(List<ManagerPortfolioEvent> events) {
		this.events = events;
	}

	public ManagerPortfolioEvents total(Integer total) {
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
		ManagerPortfolioEvents managerPortfolioEvents = (ManagerPortfolioEvents) o;
		return Objects.equals(this.events, managerPortfolioEvents.events) &&
				Objects.equals(this.total, managerPortfolioEvents.total);
	}

	@Override
	public int hashCode() {
		return Objects.hash(events, total);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ManagerPortfolioEvents {\n");

		sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

