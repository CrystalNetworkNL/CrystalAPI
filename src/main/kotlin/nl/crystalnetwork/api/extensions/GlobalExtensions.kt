package nl.crystalnetwork.api.extensions

import nl.crystalnetwork.api.Chat
import nl.crystalnetwork.api.CrystalAPI
import nl.crystalnetwork.api.Economy
import org.bukkit.Bukkit

/**
 * Extension property to get the `CrystalAPI` instance.
 *
 * @since 1.5
 */
val Any.api: CrystalAPI
    get() = Bukkit.getPluginManager().getPlugin("CrystalCore") as CrystalAPI

/**
 * Extension property to get the `Economy` instance.
 *
 * @since 1.5
 */
val Any.economy: Economy
    get() = api.getEconomy()

/**
 * Extension property to get the `Chat` instance.
 *
 * @since 1.6
 */
val Any.chat: Chat
    get() = api.getChat()