package com.rubylich.ktmp.notifications

import android.content.Context
import com.rubylich.ktmp.notifications.items.*
import rubylich.ktmp.features.posts.NotificationData.KEY_ID
import rubylich.ktmp.features.posts.PostsNotification

interface NotificationItemResolver {
    fun resolve(context: Context, data: Map<String, String>): PushNotificationItem
}

class NotificationItemResolverImpl(private val notificationsUnreadMessagesCounter: NotificationsUnreadMessagesCounter) :
    NotificationItemResolver {
    override fun resolve(context: Context, data: Map<String, String>): PushNotificationItem {
        val id = data[KEY_ID]
        if (id != null) {
            return when (id) {
                PostsNotification.ID ->
                    PostsNotificationItem(
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