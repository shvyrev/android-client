package io.swagger.client.api;

import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

import io.swagger.client.model.ProgramBalanceChart;
import io.swagger.client.model.ProgramDetailsFull;
import io.swagger.client.model.ProgramProfitChart;
import io.swagger.client.model.ProgramSets;
import io.swagger.client.model.ProgramsList;
import io.swagger.client.model.TradesViewModel;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface ProgramsApi
{
	/**
	 * Program balance chart
	 *
	 * @param id            (required)
	 * @param dateFrom      (optional)
	 * @param dateTo        (optional)
	 * @param maxPointCount (optional)
	 * @return Call&lt;ProgramBalanceChart&gt;
	 */
	@GET("v1.0/programs/{id}/charts/balance")
	Observable<ProgramBalanceChart> v10ProgramsByIdChartsBalanceGet(
			@retrofit2.http.Path("id") UUID id, @retrofit2.http.Query("DateFrom") DateTime dateFrom, @retrofit2.http.Query("DateTo") DateTime dateTo, @retrofit2.http.Query("MaxPointCount") Integer maxPointCount
	);

	/**
	 * Program profit chart
	 *
	 * @param id            (required)
	 * @param dateFrom      (optional)
	 * @param dateTo        (optional)
	 * @param maxPointCount (optional)
	 * @return Call&lt;ProgramProfitChart&gt;
	 */
	@GET("v1.0/programs/{id}/charts/profit")
	Observable<ProgramProfitChart> v10ProgramsByIdChartsProfitGet(
			@retrofit2.http.Path("id") UUID id, @retrofit2.http.Query("DateFrom") DateTime dateFrom, @retrofit2.http.Query("DateTo") DateTime dateTo, @retrofit2.http.Query("MaxPointCount") Integer maxPointCount
	);

	/**
	 * Add to favorites
	 *
	 * @param id            (required)
	 * @param authorization JWT access token (required)
	 * @return Call&lt;Void&gt;
	 */
	@POST("v1.0/programs/{id}/favorite/add")
	Observable<Void> v10ProgramsByIdFavoriteAddPost(
			@retrofit2.http.Path("id") UUID id, @retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Remove from favorites
	 *
	 * @param id            (required)
	 * @param authorization JWT access token (required)
	 * @return Call&lt;Void&gt;
	 */
	@POST("v1.0/programs/{id}/favorite/remove")
	Observable<Void> v10ProgramsByIdFavoriteRemovePost(
			@retrofit2.http.Path("id") UUID id, @retrofit2.http.Header("Authorization") String authorization
	);

	/**
	 * Program details
	 *
	 * @param id                (required)
	 * @param authorization     (optional)
	 * @param currencySecondary (optional)
	 * @return Call&lt;ProgramDetailsFull&gt;
	 */
	@GET("v1.0/programs/{id}")
	Observable<ProgramDetailsFull> v10ProgramsByIdGet(
			@retrofit2.http.Path("id") String id, @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Query("currencySecondary") String currencySecondary
	);

	/**
	 * Trade history
	 *
	 * @param id       (required)
	 * @param dateFrom (optional)
	 * @param dateTo   (optional)
	 * @param symbol   (optional)
	 * @param sorting  (optional)
	 * @param skip     (optional)
	 * @param take     (optional)
	 * @return Call&lt;TradesViewModel&gt;
	 */
	@GET("v1.0/programs/{id}/trades")
	Observable<TradesViewModel> v10ProgramsByIdTradesGet(
			@retrofit2.http.Path("id") UUID id, @retrofit2.http.Query("DateFrom") DateTime dateFrom, @retrofit2.http.Query("DateTo") DateTime dateTo, @retrofit2.http.Query("Symbol") String symbol, @retrofit2.http.Query("Sorting") String sorting, @retrofit2.http.Query("Skip") Integer skip, @retrofit2.http.Query("Take") Integer take
	);

	/**
	 * Programs list
	 *
	 * @param authorization     (optional)
	 * @param levelMin          (optional)
	 * @param levelMax          (optional)
	 * @param profitAvgMin      (optional)
	 * @param profitAvgMax      (optional)
	 * @param sorting           (optional)
	 * @param programCurrency   (optional)
	 * @param currencySecondary (optional)
	 * @param statisticDateFrom (optional)
	 * @param statisticDateTo   (optional)
	 * @param chartPointsCount  (optional)
	 * @param mask              (optional)
	 * @param facetId           (optional)
	 * @param isFavorite        (optional)
	 * @param ids               (optional)
	 * @param managerId         (optional)
	 * @param programManagerId  (optional)
	 * @param skip              (optional)
	 * @param take              (optional)
	 * @return Call&lt;ProgramsList&gt;
	 */
	@GET("v1.0/programs")
	Observable<ProgramsList> v10ProgramsGet(
			@retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Query("LevelMin") Integer levelMin, @retrofit2.http.Query("LevelMax") Integer levelMax, @retrofit2.http.Query("ProfitAvgMin") Double profitAvgMin, @retrofit2.http.Query("ProfitAvgMax") Double profitAvgMax, @retrofit2.http.Query("Sorting") String sorting, @retrofit2.http.Query("ProgramCurrency") String programCurrency, @retrofit2.http.Query("CurrencySecondary") String currencySecondary, @retrofit2.http.Query("StatisticDateFrom") DateTime statisticDateFrom, @retrofit2.http.Query("StatisticDateTo") DateTime statisticDateTo, @retrofit2.http.Query("ChartPointsCount") Integer chartPointsCount, @retrofit2.http.Query("Mask") String mask, @retrofit2.http.Query("FacetId") String facetId, @retrofit2.http.Query("IsFavorite") Boolean isFavorite, @retrofit2.http.Query("Ids") List<UUID> ids, @retrofit2.http.Query("ManagerId") String managerId, @retrofit2.http.Query("ProgramManagerId") UUID programManagerId, @retrofit2.http.Query("Skip") Integer skip, @retrofit2.http.Query("Take") Integer take
	);

	/**
	 * Programs sets
	 *
	 * @param authorization JWT access token (required)
	 * @return Call&lt;ProgramSets&gt;
	 */
	@GET("v1.0/programs/sets")
	Observable<ProgramSets> v10ProgramsSetsGet(
			@retrofit2.http.Header("Authorization") String authorization
	);

}
