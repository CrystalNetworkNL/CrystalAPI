//[CrystalAPI](../../index.md)/[nl.crystalnetwork.api.extensions](index.md)/[withdrawCoins](withdraw-coins.md)

# withdrawCoins

[jvm]\
fun Player.[withdrawCoins](withdraw-coins.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Withdraws a specified amount of coins from the player's balance.

#### Since

1.5

#### Parameters

jvm

| | |
|---|---|
| amount | The amount of coins to withdraw. |

#### Throws

| | |
|---|---|
| [Economy.Companion.InsufficientFundsException](../nl.crystalnetwork.api/-economy/-companion/-insufficient-funds-exception/index.md) | if the player does not have enough coins in their balance. |
