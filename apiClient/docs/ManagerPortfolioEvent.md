
# ManagerPortfolioEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | [**UUID**](UUID.md) |  |  [optional]
**date** | [**DateTime**](DateTime.md) |  |  [optional]
**title** | **String** |  |  [optional]
**value** | **Double** |  |  [optional]
**feeValue** | **Double** |  |  [optional]
**profitPercent** | **Double** |  |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**programType** | [**ProgramTypeEnum**](#ProgramTypeEnum) |  |  [optional]
**logo** | **String** |  |  [optional]
**color** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**periodNumber** | **Integer** |  |  [optional]


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
ASSETSTARTED | &quot;AssetStarted&quot;
PROGRAMPERIODSTATS | &quot;ProgramPeriodStats&quot;
PROGRAMPERIODENDS | &quot;ProgramPeriodEnds&quot;
INVESTORINVEST | &quot;InvestorInvest&quot;
INVESTORWITHDRAW | &quot;InvestorWithdraw&quot;
MANAGERINVEST | &quot;ManagerInvest&quot;
MANAGERWITHDRAW | &quot;ManagerWithdraw&quot;
ASSETFINISHED | &quot;AssetFinished&quot;
ENTRANCEFEE | &quot;EntranceFee&quot;


<a name="ProgramTypeEnum"></a>
## Enum: ProgramTypeEnum
Name | Value
---- | -----
PROGRAM | &quot;Program&quot;
FUND | &quot;Fund&quot;



