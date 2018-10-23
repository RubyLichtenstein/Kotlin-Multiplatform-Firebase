package com.rubylichtenstein.outconnect.notifications

import android.content.Context
import android.util.Log
import com.rubylichtenstein.outconnect.notifications.items.*
import features.posts.NotificationData.KEY_ID
import features.posts.NotificationId

interface NotificationItemResolver {
    fun resolve(context: Context, data: Map<String, String>): PushNotificationItem
}

class NotificationItemResolverImpl(private val notificationsUnreadMessagesCounter: NotificationsUnreadMessagesCounter) :
    NotificationItemResolver {
    override fun resolve(context: Context, data: Map<String, String>): PushNotificationItem {
        val id = data[KEY_ID]
        if (id != null) {
            return when (id) {
                NotificationId.POSTS ->
                    PostsNotification(
                        context,
                        data,
                        notificationsUnreadMessagesCounter
                    )

                else -> {
                    return PushNotificationItem.Drop(data, context)
                }
            }
        } else {
            return PushNotificationItem.Drop(data, context)
        }
    }
}