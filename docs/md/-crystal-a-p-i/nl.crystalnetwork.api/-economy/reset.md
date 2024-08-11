//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[Economy](index.md)/[reset](reset.md)

# reset

[jvm]\
abstract fun [reset](reset.md)(player: OfflinePlayer)

Resets the player's balance to the default value.

#### Since

1.0

Example usage:

```kotlin
economy.reset(player)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be reset. |

[jvm]\
abstract fun [reset](reset.md)(player: OfflinePlayer, currency: [Economy.Currency](-currency/index.md))

Resets the player's balance to the default value for a specific currency.

#### Since

1.0

Example usage:

```kotlin
economy.reset(player, Economy.Currency.CRYSTALS)
```

#### Parameters

jvm

| | |
|---|---|
| player | The player whose balance will be reset. |
| currency | The type of currency to reset. |
