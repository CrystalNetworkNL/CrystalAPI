//[CrystalAPI](../../../index.md)/[nl.crystalnetwork.api](../index.md)/[CrystalAPI](index.md)

# CrystalAPI

[jvm]\
interface [CrystalAPI](index.md)

Interface representing the Crystal API.

Example usage:

```kotlin
val api = Bukkit.getPluginManager().getPlugin("CrystalCore") as CrystalAPI
val economy = api.getEconomy()
```

#### Since

1.0

## Functions

| Name | Summary |
|---|---|
| [getChat](get-chat.md) | [jvm]<br>abstract fun [getChat](get-chat.md)(): [Chat](../-chat/index.md)<br>Retrieves the chat system. |
| [getEconomy](get-economy.md) | [jvm]<br>abstract fun [getEconomy](get-economy.md)(): [Economy](../-economy/index.md)<br>Retrieves the economy system. |
