//[CrystalAPI](../../index.md)/[nl.crystalnetwork.api.extensions](index.md)/[depositCrystals](deposit-crystals.md)

# depositCrystals

[jvm]\
fun Player.[depositCrystals](deposit-crystals.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Deposits a specified amount of crystals into the player's balance.

#### Since

1.5

#### Parameters

jvm

| | |
|---|---|
| amount | The amount of crystals to deposit. |

#### Throws

| | |
|---|---|
| [Economy.Companion.InsufficientFundsException](../nl.crystalnetwork.api/-economy/-companion/-insufficient-funds-exception/index.md) | if the player does not have enough crystals in their inventory. |
