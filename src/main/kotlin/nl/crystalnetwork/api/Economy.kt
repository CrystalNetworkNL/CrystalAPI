package nl.crystalnetwork.api

import dev.triumphteam.gui.builder.item.ItemBuilder
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.OfflinePlayer
import org.bukkit.inventory.ItemFlag

/**
 * Interface representing the economy system.
 *
 * @since 1.0
 */
interface Economy {

    companion object Items {
        val CRYSTAL = lazy {
            ItemBuilder.from(Material.EMERALD)
                .name(Component.text("Crystal", NamedTextColor.AQUA))
                .lore(Component.text("A valuable currency used to purchase items.", NamedTextColor.GRAY))
                .unbreakable()
                .flags(ItemFlag.HIDE_ATTRIBUTES)
                .build()
        }

        val COIN = lazy {
            ItemBuilder.from(Material.GOLD_INGOT)
                .name(Component.text("Coin", NamedTextColor.GOLD))
                .lore(Component.text("A common currency used to purchase items.", NamedTextColor.GRAY))
                .unbreakable()
                .flags(ItemFlag.HIDE_ATTRIBUTES)
                .build()
        }
    }

    /**
     * Enum representing different types of currencies.
     *
     * @since 1.0
     */
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
     *
     * Example usage:
     * ```
     * economy.add(player, 100u)
     * ```
     */
    fun add(player: OfflinePlayer, amount: Int)

    /**
     * Adds a specified amount of a specific currency to the player's balance.
     *
     * @param player The player whose balance will be increased.
     * @param amount The amount to add to the player's balance.
     * @param currency The type of currency to add.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.add(player, 100u, Economy.Currency.CRYSTALS)
     * ```
     */
    fun add(player: OfflinePlayer, amount: Int, currency: Currency)

    /**
     * Adds a specified amount of crystals to the player's balance.
     *
     * @param player The player whose balance will be increased.
     * @param amount The amount of crystals to add to the player's balance.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.addCrystals(player, 100u)
     * ```
     */
    fun addCrystals(player: OfflinePlayer, amount: Int) = add(player, amount, Currency.CRYSTALS)

    /**
     * Adds a specified amount of coins to the player's balance.
     *
     * @param player The player whose balance will be increased.
     * @param amount The amount of coins to add to the player's balance.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.addCoins(player, 100u)
     * ```
     */
    fun addCoins(player: OfflinePlayer, amount: Int) = add(player, amount, Currency.COINS)

    /**
     * Removes a specified amount from the player's balance.
     *
     * @param player The player whose balance will be decreased.
     * @param amount The amount to remove from the player's balance.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.remove(player, 50u)
     * ```
     */
    fun remove(player: OfflinePlayer, amount: Int)

    /**
     * Removes a specified amount of a specific currency from the player's balance.
     *
     * @param player The player whose balance will be decreased.
     * @param amount The amount to remove from the player's balance.
     * @param currency The type of currency to remove.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.remove(player, 50u, Economy.Currency.COINS)
     * ```
     */
    fun remove(player: OfflinePlayer, amount: Int, currency: Currency)

    /**
     * Removes a specified amount of crystals from the player's balance.
     *
     * @param player The player whose balance will be decreased.
     * @param amount The amount of crystals to remove from the player's balance.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.removeCrystals(player, 50u)
     * ```
     */
    fun removeCrystals(player: OfflinePlayer, amount: Int) = remove(player, amount, Currency.CRYSTALS)

    /**
     * Removes a specified amount of coins from the player's balance.
     *
     * @param player The player whose balance will be decreased.
     * @param amount The amount of coins to remove from the player's balance.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.removeCoins(player, 50u)
     * ```
     */
    fun removeCoins(player: OfflinePlayer, amount: Int) = remove(player, amount, Currency.COINS)

    /**
     * Sets the player's balance to a specified amount.
     *
     * @param player The player whose balance will be set.
     * @param amount The amount to set the player's balance to.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.set(player, 200u)
     * ```
     */
    fun set(player: OfflinePlayer, amount: Int)

    /**
     * Sets the player's balance to a specified amount of a specific currency.
     *
     * @param player The player whose balance will be set.
     * @param amount The amount to set the player's balance to.
     * @param currency The type of currency to set.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.set(player, 200u, Economy.Currency.CRYSTALS)
     * ```
     */
    fun set(player: OfflinePlayer, amount: Int, currency: Currency)

    /**
     * Sets the player's balance to a specified amount of crystals.
     *
     * @param player The player whose balance will be set.
     * @param amount The amount of crystals to set the player's balance to.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.setCrystals(player, 200u)
     * ```
     */
    fun setCrystals(player: OfflinePlayer, amount: Int) = set(player, amount, Currency.CRYSTALS)

    /**
     * Sets the player's balance to a specified amount of coins.
     *
     * @param player The player whose balance will be set.
     * @param amount The amount of coins to set the player's balance to.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.setCoins(player, 200u)
     * ```
     */
    fun setCoins(player: OfflinePlayer, amount: Int) = set(player, amount, Currency.COINS)

    /**
     * Resets the player's balance to the default value.
     *
     * @param player The player whose balance will be reset.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.reset(player)
     * ```
     */
    fun reset(player: OfflinePlayer)

    /**
     * Resets the player's balance to the default value for a specific currency.
     *
     * @param player The player whose balance will be reset.
     * @param currency The type of currency to reset.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.reset(player, Economy.Currency.CRYSTALS)
     * ```
     */
    fun reset(player: OfflinePlayer, currency: Currency)

    /**
     * Resets the player's balance of crystals to the default value.
     *
     * @param player The player whose balance will be reset.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.resetCrystals(player)
     * ```
     */
    fun resetCrystals(player: OfflinePlayer) = reset(player, Currency.CRYSTALS)

    /**
     * Resets the player's balance of coins to the default value.
     *
     * @param player The player whose balance will be reset.
     * @since 1.0
     *
     * Example usage:
     * ```
     * economy.resetCoins(player)
     * ```
     */
    fun resetCoins(player: OfflinePlayer) = reset(player, Currency.COINS)

    /**
     * Retrieves the player's balance of crystals.
     *
     * @param player The player whose balance will be retrieved.
     * @return The amount of crystals the player has.
     * @since 1.0
     *
     * Example usage:
     * ```
     * val crystals = economy.getCrystals(player)
     * ```
     */
    fun getCrystals(player: OfflinePlayer): Int

    /**
     * Retrieves the player's balance of coins.
     *
     * @param player The player whose balance will be retrieved.
     * @return The amount of coins the player has.
     * @since 1.0
     *
     * Example usage:
     * ```
     * val coins = economy.getCoins(player)
     * ```
     */
    fun getCoins(player: OfflinePlayer): Int
}