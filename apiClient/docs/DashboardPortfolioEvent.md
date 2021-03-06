
# DashboardPortfolioEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | [**UUID**](UUID.md) |  |  [optional]
**date** | [**DateTime**](DateTime.md) |  |  [optional]
**title** | **String** |  |  [optional]
**value** | **Double** |  |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**logo** | **String** |  |  [optional]
**color** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**assetType** | [**AssetTypeEnum**](#AssetTypeEnum) |  |  [optional]


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
UNDEFINED | &quot;Undefined&quot;
GVT | &quot;GVT&quot;
ETH | &quot;ETH&quot;
BTC | &quot;BTC&quot;
ADA | &quot;ADA&quot;
USDT | &quot;USDT&quot;
XRP | &quot;XRP&quot;
BCH | &quot;BCH&quot;
LTC | &quot;LTC&quot;
DOGE | &quot;DOGE&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ALL | &quot;All&quot;
INVEST | &quot;Invest&quot;
WITHDRAW | &quot;Withdraw&quot;
PROFIT | &quot;Profit&quot;
LOSS | &quot;Loss&quot;
REINVEST | &quot;Reinvest&quot;
CANCELLED | &quot;Cancelled&quot;
ENDED | &quot;Ended&quot;


<a name="AssetTypeEnum"></a>
## Enum: AssetTypeEnum
Name | Value
---- | -----
PROGRAM | &quot;Program&quot;
FUND | &quot;Fund&quot;



