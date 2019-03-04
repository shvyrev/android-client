
# TransactionDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**programDetails** | [**ProgramTransactionDetails**](ProgramTransactionDetails.md) |  |  [optional]
**convertingDetails** | [**ConvertingDetails**](ConvertingDetails.md) |  |  [optional]
**externalTransactionDetails** | [**ExternalTransactionDetails**](ExternalTransactionDetails.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional]
**currencyName** | **String** |  |  [optional]
**currencyLogo** | **String** |  |  [optional]
**gvCommission** | **Double** |  |  [optional]
**gvCommissionCurrency** | [**GvCommissionCurrencyEnum**](#GvCommissionCurrencyEnum) |  |  [optional]
**gvCommissionPercent** | **Double** |  |  [optional]
**amount** | **Double** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INVESTING | &quot;Investing&quot;
WITHDRAWAL | &quot;Withdrawal&quot;
EXTERNALWITHDRAWAL | &quot;ExternalWithdrawal&quot;
EXTERNALDEPOSIT | &quot;ExternalDeposit&quot;
CONVERTING | &quot;Converting&quot;
OPEN | &quot;Open&quot;
CLOSE | &quot;Close&quot;
PROFIT | &quot;Profit&quot;
PLATFORMFEE | &quot;PlatformFee&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DONE | &quot;Done&quot;
PENDING | &quot;Pending&quot;
CANCELED | &quot;Canceled&quot;
ERROR | &quot;Error&quot;


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
BTC | &quot;BTC&quot;
ETH | &quot;ETH&quot;
USDT | &quot;USDT&quot;
GVT | &quot;GVT&quot;
UNDEFINED | &quot;Undefined&quot;
ADA | &quot;ADA&quot;
XRP | &quot;XRP&quot;
BCH | &quot;BCH&quot;
LTC | &quot;LTC&quot;
DOGE | &quot;DOGE&quot;
BNB | &quot;BNB&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;


<a name="GvCommissionCurrencyEnum"></a>
## Enum: GvCommissionCurrencyEnum
Name | Value
---- | -----
BTC | &quot;BTC&quot;
ETH | &quot;ETH&quot;
USDT | &quot;USDT&quot;
GVT | &quot;GVT&quot;
UNDEFINED | &quot;Undefined&quot;
ADA | &quot;ADA&quot;
XRP | &quot;XRP&quot;
BCH | &quot;BCH&quot;
LTC | &quot;LTC&quot;
DOGE | &quot;DOGE&quot;
BNB | &quot;BNB&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;


