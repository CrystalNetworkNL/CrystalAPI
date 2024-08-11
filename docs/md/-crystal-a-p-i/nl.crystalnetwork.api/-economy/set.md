//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)/[set](set.md)

# set

[jvm]\
abstract fun [set](set.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))

Sets the player's balance to a specified amount.

#### Since

1.0

Example usage:

```kotlin
economy.set(player, 200u)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be set. |
| amount | The amount to set the player's balance to. |

[jvm]\
abstract fun [set](set.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), currency: [Economy.Currency](-currency/index.md))

Sets the player's balance to a specified amount of a specific currency.

#### Since

1.0

Example usage:

```kotlin
economy.set(player, 200u, Economy.Currency.CRYSTALS)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be set. |
| amount | The amount to set the player's balance to. |
| currency | The type of currency to set. |
