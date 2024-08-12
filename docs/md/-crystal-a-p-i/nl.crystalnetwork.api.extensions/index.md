//[CrystalAPI](../../index.md)/[nl.crystalnetwork.api.extensions](index.md)

# Package-level declarations

## Properties

| Name | Summary |
|---|---|
| [api](api.md) | [jvm]<br>val [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html).[api](api.md): [CrystalAPI](../nl.crystalnetwork.api/-crystal-a-p-i/index.md)<br>Extension property to get the `CrystalAPI` instance. |
| [coins](coins.md) | [jvm]<br>var Player.[coins](coins.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Extension property to get or set the number of coins a player has. |
| [crystals](crystals.md) | [jvm]<br>var Player.[crystals](crystals.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Extension property to get or set the number of crystals a player has. |
| [economy](economy.md) | [jvm]<br>val [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html).[economy](economy.md): [Economy](../nl.crystalnetwork.api/-economy/index.md)<br>Extension property to get the `Economy` instance. |

## Functions

| Name | Summary |
|---|---|
| [deposit](deposit.md) | [jvm]<br>fun Player.[deposit](deposit.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), currency: [Economy.Currency](../nl.crystalnetwork.api/-economy/-currency/index.md))<br>Deposits a specified amount of a specific currency into the player's balance. |
| [depositCoins](deposit-coins.md) | [jvm]<br>fun Player.[depositCoins](deposit-coins.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Deposits a specified amount of coins into the player's balance. |
| [depositCrystals](deposit-crystals.md) | [jvm]<br>fun Player.[depositCrystals](deposit-crystals.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Deposits a specified amount of crystals into the player's balance. |
| [reset](reset.md) | [jvm]<br>fun Player.[reset](reset.md)()<br>Resets the player's balance of both crystals and coins to 0. |
| [resetCoins](reset-coins.md) | [jvm]<br>fun Player.[resetCoins](reset-coins.md)()<br>Resets the player's balance of coins to 0. |
| [resetCrystals](reset-crystals.md) | [jvm]<br>fun Player.[resetCrystals](reset-crystals.md)()<br>Resets the player's balance of crystals to 0. |
| [withdraw](withdraw.md) | [jvm]<br>fun Player.[withdraw](withdraw.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), currency: [Economy.Currency](../nl.crystalnetwork.api/-economy/-currency/index.md))<br>Withdraws a specified amount of a specific currency from the player's balance. |
| [withdrawCoins](withdraw-coins.md) | [jvm]<br>fun Player.[withdrawCoins](withdraw-coins.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Withdraws a specified amount of coins from the player's balance. |
| [withdrawCrystals](withdraw-crystals.md) | [jvm]<br>fun Player.[withdrawCrystals](withdraw-crystals.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Withdraws a specified amount of crystals from the player's balance. |
