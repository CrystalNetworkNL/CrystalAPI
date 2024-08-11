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

    /**
     * Adds a specified amount to the player's balance.
     *
     * @param player The player whose balance will be increased.
     * @param amount The amount to add to the player's balance.
     * @since 1.0
     */
    fun add(player: OfflinePlayer, amount: UInt, currency: Currency)
    fun addCrystals(player: OfflinePlayer, amount: UInt) = add(player, amount, Currency.CRYSTALS)
    fun addCoins(player: OfflinePlayer, amount: UInt) = add(player, amount, Currency.COINS)

    /**
     * Removes a specified amount from the player's balance.
     *
     * @param player The player whose balance will be decreased.
     * @param amount The amount to remove from the player's balance.
     * @since 1.0
     */
    fun remove(player: OfflinePlayer, amount: UInt, currency: Currency)
    fun removeCrystals(player: OfflinePlayer, amount: UInt) = remove(player, amount, Currency.CRYSTALS)
    fun removeCoins(player: OfflinePlayer, amount: UInt) = remove(player, amount, Currency.COINS)

    /**
     * Sets the player's balance to a specified amount.
     *
     * @param player The player whose balance will be set.
     * @param amount The amount to set the player's balance to.
     * @since 1.0
     */
    fun set(player: OfflinePlayer, amount: UInt, currency: Currency)
    fun setCrystals(player: OfflinePlayer, amount: UInt) = set(player, amount, Currency.CRYSTALS)
    fun setCoins(player: OfflinePlayer, amount: UInt) = set(player, amount, Currency.COINS)

    /**
     * Resets the player's balance to the default value.
     *
     * @param player The player whose balance will be reset.
     * @since 1.0
     */
    fun reset(player: OfflinePlayer, currency: Currency)
    fun resetCrystals(player: OfflinePlayer) = reset(player, Currency.CRYSTALS)
    fun resetCoins(player: OfflinePlayer) = reset(player, Currency.COINS)
}