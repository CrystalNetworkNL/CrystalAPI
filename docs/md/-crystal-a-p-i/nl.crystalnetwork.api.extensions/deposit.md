//[CrystalAPI](../../index.md)/[nl.crystalnetwork.api.extensions](index.md)/[deposit](deposit.md)

# deposit

[jvm]\
fun Player.[deposit](deposit.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), currency: [Economy.Currency](../nl.crystalnetwork.api/-economy/-currency/index.md))

Deposits a specified amount of a specific currency into the player's balance.

#### Since

1.5

#### Parameters

jvm

| | |
|---|---|
| amount | The amount to deposit. |
| currency | The type of currency to deposit. |

#### Throws

| | |
|---|---|
| [Economy.Companion.InsufficientFundsException](../nl.crystalnetwork.api/-economy/-companion/-insufficient-funds-exception/index.md) | if the player does not have enough of the specified currency in their inventory. |
