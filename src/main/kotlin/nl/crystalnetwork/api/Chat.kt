package nl.crystalnetwork.api

import org.bukkit.OfflinePlayer

interface Chat {

    var format: String

    fun setPrefix(player: OfflinePlayer, prefix: String?)

    fun removePrefix(player: OfflinePlayer) = setPrefix(player, null)

    fun setSuffix(player: OfflinePlayer, suffix: String?)

    fun removeSuffix(player: OfflinePlayer) = setSuffix(player, null)

    fun setNickName(player: OfflinePlayer, nickname: String?)

    fun removeNickName(player: OfflinePlayer) = setNickName(player, null)

    fun getPrefix(player: OfflinePlayer): String?

    fun getSuffix(player: OfflinePlayer): String?

    fun getNickName(player: OfflinePlayer): String?
}