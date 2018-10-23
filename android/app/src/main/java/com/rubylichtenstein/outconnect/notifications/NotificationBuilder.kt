package com.rubylichtenstein.outconnect.notifications

import android.app.Notification
import android.content.Context
import android.support.v4.app.NotificationCompat
import com.rubylichtenstein.outconnect.notifications.items.PushNotificationItem

interface NotificationBuilder {
    fun build(context: Context, item: PushNotificationItem): Notification
}

class NotificationBuilderImpl : NotificationBuilder {

    override fun build(
        context: Context,
        item: PushNotificationItem
    ): Notification {
        return NotificationCompat.Builder(context, context.getString(item.channel().channelId))
            .setSmallIcon(item.smallIcon())
            .setContentTitle(item.title())
            .setContentText(item.body())
            .setAutoCancel(true)
            .setDefaults(Notification.DEFAULT_ALL)
            .setContentIntent(item.pendingIntent())
            .build()
    }
}