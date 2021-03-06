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
 * DashboardPortfolioEvents
 */

public class DashboardPortfolioEvents
{
	@SerializedName("events")
	private List<DashboardPortfolioEvent> events = null;

	@SerializedName("total")
	private Integer total = null;

	public DashboardPortfolioEvents events(List<DashboardPortfolioEvent> events) {
		this.events = events;
		return this;
	}

	public DashboardPortfolioEvents addEventsItem(DashboardPortfolioEvent eventsItem) {
		if (this.events == null) {
			this.events = new ArrayList<DashboardPortfolioEvent>();
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
	public List<DashboardPortfolioEvent> getEvents() {
		return events;
	}

	public void setEvents(List<DashboardPortfolioEvent> events) {
		this.events = events;
	}

	public DashboardPortfolioEvents total(Integer total) {
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
		DashboardPortfolioEvents dashboardPortfolioEvents = (DashboardPortfolioEvents) o;
		return Objects.equals(this.events, dashboardPortfolioEvents.events) &&
				Objects.equals(this.total, dashboardPortfolioEvents.total);
	}

	@Override
	public int hashCode() {
		return Objects.hash(events, total);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DashboardPortfolioEvents {\n");

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

