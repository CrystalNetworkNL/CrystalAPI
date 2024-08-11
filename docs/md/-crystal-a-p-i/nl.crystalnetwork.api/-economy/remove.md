//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)/[remove](remove.md)

# remove

[jvm]\
abstract fun [remove](remove.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))

Removes a specified amount from the player's balance.

#### Since

1.0

Example usage:

```kotlin
economy.remove(player, 50u)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be decreased. |
| amount | The amount to remove from the player's balance. |

[jvm]\
abstract fun [remove](remove.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), currency: [Economy.Currency](-currency/index.md))

Removes a specified amount of a specific currency from the player's balance.

#### Since

1.0

Example usage:

```kotlin
economy.remove(player, 50u, Economy.Currency.COINS)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be decreased. |
| amount | The amount to remove from the player's balance. |
| currency | The type of currency to remove. |
