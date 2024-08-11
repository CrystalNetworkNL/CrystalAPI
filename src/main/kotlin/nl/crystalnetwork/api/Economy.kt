package nl.crystalnetwork.api

import org.bukkit.OfflinePlayer

/**
 * Interface representing the economy system.
 */
interface Economy {

    /**
     * Adds a specified amount to the player's balance.
     *
     * @param player The player whose balance will be increased.
     * @param amount The amount to add to the player's balance.
     * @since 1.0
     */
    fun add(player: OfflinePlayer, amount: UInt)

    /**
     * Removes a specified amount from the player's balance.
     *
     * @param player The player whose balance will be decreased.
     * @param amount The amount to remove from the player's balance.
     * @since 1.0
     */
    fun remove(player: OfflinePlayer, amount: UInt)

    /**
     * Sets the player's balance to a specified amount.
     *
     * @param player The player whose balance will be set.
     * @param amount The amount to set the player's balance to.
     * @since 1.0
     */
    fun set(player: OfflinePlayer, amount: UInt)

    /**
     * Resets the player's balance to the default value.
     *
     * @param player The player whose balance will be reset.
     * @since 1.0
     */
    fun reset(player: OfflinePlayer)
}