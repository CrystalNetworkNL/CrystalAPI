//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)/[getCoins](get-coins.md)

# getCoins

[jvm]\
abstract fun [getCoins](get-coins.md)(player: OfflinePlayer): [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)

Retrieves the player's balance of coins.

#### Return

The amount of coins the player has.

#### Since

1.0

Example usage:

```kotlin
val coins = economy.getCoins(player)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be retrieved. |
