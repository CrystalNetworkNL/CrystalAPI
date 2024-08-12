//[CrystalAPI](../../../../index.md)/[nl.crystalnetwork.api](../../index.md)/[Economy](../index.md)/[Companion](index.md)

# Companion

[jvm]\
object [Companion](index.md)

## Types

| Name | Summary |
|---|---|
| [EconomyException](-economy-exception/index.md) | [jvm]<br>open class [EconomyException](-economy-exception/index.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [RuntimeException](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)<br>Exception thrown when an economy-related error occurs. |
| [InsufficientFundsException](-insufficient-funds-exception/index.md) | [jvm]<br>class [InsufficientFundsException](-insufficient-funds-exception/index.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), currency: [Economy.Currency](../-currency/index.md)) : [Economy.Companion.EconomyException](-economy-exception/index.md)<br>Exception thrown when there are insufficient funds. |
| [InsufficientSpaceException](-insufficient-space-exception/index.md) | [jvm]<br>class [InsufficientSpaceException](-insufficient-space-exception/index.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Economy.Companion.EconomyException](-economy-exception/index.md)<br>Exception thrown when there is insufficient space in the inventory. |

## Properties

| Name | Summary |
|---|---|
| [COIN](-c-o-i-n.md) | [jvm]<br>val [COIN](-c-o-i-n.md): [Lazy](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-lazy/index.html)&lt;@NotNullItemStack&gt;<br>Lazy-initialized item representing a coin. |
| [CRYSTAL](-c-r-y-s-t-a-l.md) | [jvm]<br>val [CRYSTAL](-c-r-y-s-t-a-l.md): [Lazy](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-lazy/index.html)&lt;@NotNullItemStack&gt;<br>Lazy-initialized item representing a crystal. |
