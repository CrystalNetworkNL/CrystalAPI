//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)

# Economy

[jvm]\
interface [Economy](index.md)

Interface representing the economy system.

#### Since

1.0

## Types

| Name | Summary |
|---|---|
| [Currency](-currency/index.md) | [jvm]<br>enum [Currency](-currency/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Economy.Currency](-currency/index.md)&gt; <br>Enum representing different types of currencies. |

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>abstract fun [add](add.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Adds a specified amount to the player's balance.<br>[jvm]<br>abstract fun [add](add.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), currency: [Economy.Currency](-currency/index.md))<br>Adds a specified amount of a specific currency to the player's balance. |
| [addCoins](add-coins.md) | [jvm]<br>open fun [addCoins](add-coins.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Adds a specified amount of coins to the player's balance. |
| [addCrystals](add-crystals.md) | [jvm]<br>open fun [addCrystals](add-crystals.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Adds a specified amount of crystals to the player's balance. |
| [getCoins](get-coins.md) | [jvm]<br>abstract fun [getCoins](get-coins.md)(player: OfflinePlayer): [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)<br>Retrieves the player's balance of coins. |
| [getCrystals](get-crystals.md) | [jvm]<br>abstract fun [getCrystals](get-crystals.md)(player: OfflinePlayer): [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)<br>Retrieves the player's balance of crystals. |
| [remove](remove.md) | [jvm]<br>abstract fun [remove](remove.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Removes a specified amount from the player's balance.<br>[jvm]<br>abstract fun [remove](remove.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), currency: [Economy.Currency](-currency/index.md))<br>Removes a specified amount of a specific currency from the player's balance. |
| [removeCoins](remove-coins.md) | [jvm]<br>open fun [removeCoins](remove-coins.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Removes a specified amount of coins from the player's balance. |
| [removeCrystals](remove-crystals.md) | [jvm]<br>open fun [removeCrystals](remove-crystals.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Removes a specified amount of crystals from the player's balance. |
| [reset](reset.md) | [jvm]<br>abstract fun [reset](reset.md)(player: OfflinePlayer)<br>Resets the player's balance to the default value.<br>[jvm]<br>abstract fun [reset](reset.md)(player: OfflinePlayer, currency: [Economy.Currency](-currency/index.md))<br>Resets the player's balance to the default value for a specific currency. |
| [resetCoins](reset-coins.md) | [jvm]<br>open fun [resetCoins](reset-coins.md)(player: OfflinePlayer)<br>Resets the player's balance of coins to the default value. |
| [resetCrystals](reset-crystals.md) | [jvm]<br>open fun [resetCrystals](reset-crystals.md)(player: OfflinePlayer)<br>Resets the player's balance of crystals to the default value. |
| [set](set.md) | [jvm]<br>abstract fun [set](set.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Sets the player's balance to a specified amount.<br>[jvm]<br>abstract fun [set](set.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), currency: [Economy.Currency](-currency/index.md))<br>Sets the player's balance to a specified amount of a specific currency. |
| [setCoins](set-coins.md) | [jvm]<br>open fun [setCoins](set-coins.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Sets the player's balance to a specified amount of coins. |
| [setCrystals](set-crystals.md) | [jvm]<br>open fun [setCrystals](set-crystals.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))<br>Sets the player's balance to a specified amount of crystals. |
