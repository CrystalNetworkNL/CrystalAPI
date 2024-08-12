//[CrystalAPI](../../index.md)/[nl.crystalnetwork.api.extensions](index.md)/[withdrawCrystals](withdraw-crystals.md)

# withdrawCrystals

[jvm]\
fun Player.[withdrawCrystals](withdraw-crystals.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Withdraws a specified amount of crystals from the player's balance.

#### Since

1.5

#### Parameters

jvm

| | |
|---|---|
| amount | The amount of crystals to withdraw. |

#### Throws

| | |
|---|---|
| [Economy.Companion.InsufficientFundsException](../nl.crystalnetwork.api/-economy/-companion/-insufficient-funds-exception/index.md) | if the player does not have enough crystals in their balance. |
