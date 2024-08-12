//[CrystalAPI](../../../../../index.md)/[nl.crystalnetwork.api](../../../index.md)/[Economy](../../index.md)/[Companion](../index.md)/[InsufficientFundsException](index.md)

# InsufficientFundsException

class [InsufficientFundsException](index.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), currency: [Economy.Currency](../../-currency/index.md)) : [Economy.Companion.EconomyException](../-economy-exception/index.md)

Exception thrown when there are insufficient funds.

#### Since

1.5

#### Parameters

jvm

| | |
|---|---|
| amount | The amount that was attempted to be used. |
| currency | The type of currency involved. |

## Constructors

| | |
|---|---|
| [InsufficientFundsException](-insufficient-funds-exception.md) | [jvm]<br>constructor(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), currency: [Economy.Currency](../../-currency/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [cause](../-insufficient-space-exception/index.md#-654012527%2FProperties%2F-1216412040) | [jvm]<br>open val [cause](../-insufficient-space-exception/index.md#-654012527%2FProperties%2F-1216412040): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](../-insufficient-space-exception/index.md#1824300659%2FProperties%2F-1216412040) | [jvm]<br>open val [message](../-insufficient-space-exception/index.md#1824300659%2FProperties%2F-1216412040): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](../-insufficient-space-exception/index.md#282858770%2FFunctions%2F-1216412040) | [jvm]<br>fun [addSuppressed](../-insufficient-space-exception/index.md#282858770%2FFunctions%2F-1216412040)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](../-insufficient-space-exception/index.md#-1102069925%2FFunctions%2F-1216412040) | [jvm]<br>open fun [fillInStackTrace](../-insufficient-space-exception/index.md#-1102069925%2FFunctions%2F-1216412040)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](../-insufficient-space-exception/index.md#1043865560%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getLocalizedMessage](../-insufficient-space-exception/index.md#1043865560%2FFunctions%2F-1216412040)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](../-insufficient-space-exception/index.md#2050903719%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getStackTrace](../-insufficient-space-exception/index.md#2050903719%2FFunctions%2F-1216412040)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;StackTraceElement&gt; |
| [getSuppressed](../-insufficient-space-exception/index.md#672492560%2FFunctions%2F-1216412040) | [jvm]<br>fun [getSuppressed](../-insufficient-space-exception/index.md#672492560%2FFunctions%2F-1216412040)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](../-insufficient-space-exception/index.md#-418225042%2FFunctions%2F-1216412040) | [jvm]<br>open fun [initCause](../-insufficient-space-exception/index.md#-418225042%2FFunctions%2F-1216412040)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](../-insufficient-space-exception/index.md#-1769529168%2FFunctions%2F-1216412040) | [jvm]<br>open fun [printStackTrace](../-insufficient-space-exception/index.md#-1769529168%2FFunctions%2F-1216412040)()<br>open fun [printStackTrace](../-insufficient-space-exception/index.md#1841853697%2FFunctions%2F-1216412040)(p0: PrintStream)<br>open fun [printStackTrace](../-insufficient-space-exception/index.md#1175535278%2FFunctions%2F-1216412040)(p0: PrintWriter) |
| [setStackTrace](../-insufficient-space-exception/index.md#2135801318%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setStackTrace](../-insufficient-space-exception/index.md#2135801318%2FFunctions%2F-1216412040)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;StackTraceElement&gt;) |
