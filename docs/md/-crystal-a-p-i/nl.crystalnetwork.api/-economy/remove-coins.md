//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)/[removeCoins](remove-coins.md)

# removeCoins

[jvm]\
open fun [removeCoins](remove-coins.md)(player: OfflinePlayer, amount: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))

Removes a specified amount of coins from the player's balance.

#### Since

1.0

Example usage:

```kotlin
economy.removeCoins(player, 50u)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be decreased. |
| amount | The amount of coins to remove from the player's balance. |
