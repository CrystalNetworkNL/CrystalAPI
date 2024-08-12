//[CrystalAPI](../../index.md)/[nl.crystalnetwork.api.extensions](index.md)/[depositCoins](deposit-coins.md)

# depositCoins

[jvm]\
fun Player.[depositCoins](deposit-coins.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Deposits a specified amount of coins into the player's balance.

#### Since

1.5

#### Parameters

jvm

| | |
|---|---|
| amount | The amount of coins to deposit. |

#### Throws

| | |
|---|---|
| [Economy.Companion.InsufficientFundsException](../nl.crystalnetwork.api/-economy/-companion/-insufficient-funds-exception/index.md) | if the player does not have enough coins in their inventory. |
