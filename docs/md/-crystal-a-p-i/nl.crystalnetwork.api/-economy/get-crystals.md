//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)/[getCrystals](get-crystals.md)

# getCrystals

[jvm]\
abstract fun [getCrystals](get-crystals.md)(player: OfflinePlayer): [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)

Retrieves the player's balance of crystals.

#### Return

The amount of crystals the player has.

#### Since

1.0

Example usage:

```kotlin
val crystals = economy.getCrystals(player)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be retrieved. |
