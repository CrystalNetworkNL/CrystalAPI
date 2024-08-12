package nl.crystalnetwork.api.extensions

import nl.crystalnetwork.api.Economy
import nl.crystalnetwork.api.Economy.Companion.InsufficientFundsException
import nl.crystalnetwork.api.Economy.Currency
import org.bukkit.entity.Player

var Player.prefix : String?
    get() = chat.getPrefix(this)
    set(value) = chat.setPrefix(this, value)

var Player.suffix : String?
    get() = chat.getSuffix(this)
    set(value) = chat.setSuffix(this, value)

var Player.nickname : String?
    get() = chat.getNickName(this)
    set(value) = chat.setNickName(this, value)

/**
 * Extension property to get or set the number of crystals a player has.
 *
 * @since 1.5
 */
var Player.crystals: Int
    get() = api.getEconomy().getCrystals(this)
    set(value) = api.getEconomy().setCrystals(this, value)

/**
 * Extension property to get or set the number of coins a player has.
 *
 * @since 1.5
 */
var Player.coins: Int
    get() = api.getEconomy().getCoins(this)
    set(value) = api.getEconomy().setCoins(this, value)

/**
 * Resets the player's balance of both crystals and coins to 0.
 *
 * @since 1.5
 */
fun Player.reset() {
    crystals = 0
    coins = 0
}

/**
 * Resets the player's balance of crystals to 0.
 *
 * @since 1.5
 */
fun Player.resetCrystals() {  crystals = 0 }

/**
 * Resets the player's balance of coins to 0.
 *
 * @since 1.5
 */
fun Player.resetCoins() { coins = 0 }

/**
 * Deposits a specified amount of a specific currency into the player's balance.
 *
 * @param amount The amount to deposit.
 * @param currency The type of currency to deposit.
 * @throws InsufficientFundsException if the player does not have enough of the specified currency in their inventory.
 * @since 1.5
 */
@Throws(InsufficientFundsException::class)
fun Player.deposit(amount: Int, currency: Currency) {
    when (currency) {
        Currency.CRYSTALS -> {
            if (!inventory.containsAtLeast(Economy.CRYSTAL.value, amount)) {
                throw InsufficientFundsException(amount, currency)
            }

            for (i in 0 until amount) {
                inventory.removeItem(Economy.CRYSTAL.value)
            }

            crystals += amount
        }

        Currency.COINS -> {
            if (!inventory.containsAtLeast(Economy.COIN.value, amount)) {
                throw InsufficientFundsException(amount, currency)
            }

            for (i in 0 until amount) {
                inventory.removeItem(Economy.COIN.value)
            }

            coins += amount
        }
    }
}

/**
 * Deposits a specified amount of crystals into the player's balance.
 *
 * @param amount The amount of crystals to deposit.
 * @throws InsufficientFundsException if the player does not have enough crystals in their inventory.
 * @since 1.5
 */
@Throws(InsufficientFundsException::class)
fun Player.depositCrystals(amount: Int) = deposit(amount, Currency.CRYSTALS)

/**
 * Deposits a specified amount of coins into the player's balance.
 *
 * @param amount The amount of coins to deposit.
 * @throws InsufficientFundsException if the player does not have enough coins in their inventory.
 * @since 1.5
 */
@Throws(InsufficientFundsException::class)
fun Player.depositCoins(amount: Int) = deposit(amount, Currency.COINS)

/**
 * Withdraws a specified amount of a specific currency from the player's balance.
 *
 * @param amount The amount to withdraw.
 * @param currency The type of currency to withdraw.
 * @throws InsufficientFundsException if the player does not have enough of the specified currency in their balance.
 * @since 1.5
 */
@Throws(InsufficientFundsException::class)
fun Player.withdraw(amount: Int, currency: Currency) {
    when (currency) {
        Currency.CRYSTALS -> {
            if (crystals < amount) {
                throw InsufficientFundsException(amount, currency)
            }

            for (i in 0 until amount) {
                inventory.addItem(Economy.CRYSTAL.value)
            }

            crystals -= amount
        }

        Currency.COINS -> {
            if (coins < amount) {
                throw InsufficientFundsException(amount, currency)
            }

            for (i in 0 until amount) {
                inventory.addItem(Economy.COIN.value)
            }

            coins -= amount
        }
    }
}

/**
 * Withdraws a specified amount of crystals from the player's balance.
 *
 * @param amount The amount of crystals to withdraw.
 * @throws InsufficientFundsException if the player does not have enough crystals in their balance.
 * @since 1.5
 */
@Throws(InsufficientFundsException::class)
fun Player.withdrawCrystals(amount: Int) = withdraw(amount, Currency.CRYSTALS)

/**
 * Withdraws a specified amount of coins from the player's balance.
 *
 * @param amount The amount of coins to withdraw.
 * @throws InsufficientFundsException if the player does not have enough coins in their balance.
 * @since 1.5
 */
@Throws(InsufficientFundsException::class)
fun Player.withdrawCoins(amount: Int) = withdraw(amount, Currency.COINS)