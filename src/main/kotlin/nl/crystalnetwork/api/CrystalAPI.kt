package nl.crystalnetwork.api

/**
 * Interface representing the Crystal API.
 */
interface CrystalAPI {

    /**
     * Retrieves the economy system.
     *
     * @return The economy system.
     * @since 1.0
     */
    fun getEconomy(): Economy
}