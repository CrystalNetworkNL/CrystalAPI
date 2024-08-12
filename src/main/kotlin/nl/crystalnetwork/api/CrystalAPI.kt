package nl.crystalnetwork.api

/**
 * Interface representing the Crystal API.
 *
 * Example usage:
 * ```
 * val api = Bukkit.getPluginManager().getPlugin("CrystalCore") as CrystalAPI
 * val economy = api.getEconomy()
 * ```
 *
 * @since 1.0
 */
interface CrystalAPI {

    /**
     * Retrieves the economy system.
     *
     * @return The economy system.
     * @since 1.0
     */
    fun getEconomy(): Economy

    /**
     * Retrieves the chat system.
     *
     * @return The chat system.
     * @since 1.6
     */
    fun getChat(): Chat
}