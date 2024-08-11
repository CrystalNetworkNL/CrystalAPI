//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)/[add](add.md)

# add

[jvm]\
abstract fun [add](add.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))

Adds a specified amount to the player's balance.

#### Since

1.0

Example usage:

```kotlin
economy.add(player, 100u)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be increased. |
| amount | The amount to add to the player's balance. |

[jvm]\
abstract fun [add](add.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), currency: [Economy.Currency](-currency/index.md))

Adds a specified amount of a specific currency to the player's balance.

#### Since

1.0

Example usage:

```kotlin
economy.add(player, 100u, Economy.Currency.CRYSTALS)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be increased. |
| amount | The amount to add to the player's balance. |
| currency | The type of currency to add. |
