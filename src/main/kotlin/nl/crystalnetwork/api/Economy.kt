package nl.crystalnetwork.api

import org.bukkit.OfflinePlayer

/**
 * Interface representing the economy system.
 */
interface Economy {

    enum class Currency {
        CRYSTALS,
        COINS,
    }

    fun add(player: OfflinePlayer, amount: UInt)
    fun add(player: OfflinePlayer, amount: UInt, currency: Currency)
    fun addCrystals(player: OfflinePlayer, amount: UInt) = add(player, amount, Currency.CRYSTALS)
    fun addCoins(player: OfflinePlayer, amount: UInt) = add(player, amount, Currency.COINS)

    fun remove(player: OfflinePlayer, amount: UInt)
    fun remove(player: OfflinePlayer, amount: UInt, currency: Currency)
    fun removeCrystals(player: OfflinePlayer, amount: UInt) = remove(player, amount, Currency.CRYSTALS)
    fun removeCoins(player: OfflinePlayer, amount: UInt) = remove(player, amount, Currency.COINS)

    fun set(player: OfflinePlayer, amount: UInt)
    fun set(player: OfflinePlayer, amount: UInt, currency: Currency)
    fun setCrystals(player: OfflinePlayer, amount: UInt) = set(player, amount, Currency.CRYSTALS)
    fun setCoins(player: OfflinePlayer, amount: UInt) = set(player, amount, Currency.COINS)

    fun reset(player: OfflinePlayer)
    fun reset(player: OfflinePlayer, currency: Currency)
    fun resetCrystals(player: OfflinePlayer) = reset(player, Currency.CRYSTALS)
    fun resetCoins(player: OfflinePlayer) = reset(player, Currency.COINS)

    fun getCrystals(player: OfflinePlayer): UInt
    fun getCoins(player: OfflinePlayer): UInt
}