//[CrystalAPI](../../index.md)/[nl.crystalnetwork.api.extensions](index.md)/[withdraw](withdraw.md)

# withdraw

[jvm]\
fun Player.[withdraw](withdraw.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), currency: [Economy.Currency](../nl.crystalnetwork.api/-economy/-currency/index.md))

Withdraws a specified amount of a specific currency from the player's balance.

#### Since

1.5

#### Parameters

jvm

| | |
|---|---|
| amount | The amount to withdraw. |
| currency | The type of currency to withdraw. |

#### Throws

| | |
|---|---|
| [Economy.Companion.InsufficientFundsException](../nl.crystalnetwork.api/-economy/-companion/-insufficient-funds-exception/index.md) | if the player does not have enough of the specified currency in their balance. |
