package com.rubylich.ktmp.notifications

import android.content.Context
import android.preference.PreferenceManager

class NotificationsUnreadMessagesCounter {

    fun getUnreadMessagesCounter(
        context: Context,
        chatId: String
    ): Int {
        return PreferenceManager
            .getDefaultSharedPreferences(context)
            .getInt(chatId, 0)
    }

    fun addOneToUnreadMessagesCounter(
        context: Context,
        chatId: String
    ) {
        val count = getUnreadMessagesCounter(context, chatId)
        setCount(context, chatId, count + 1)
    }

    fun clearUnreadMessagesCounter(
        context: Context,
        chatId: String
    ) {
        setCount(context, chatId, 0)
    }

    private fun setCount(
        context: Context,
        chatId: String,
        count: Int
    ) {
        PreferenceManager
            .getDefaultSharedPreferences(context)
            .edit()
            .putInt(chatId, count)
            .apply()
    }
}