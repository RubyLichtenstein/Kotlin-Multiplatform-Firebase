package com.rubylich.ktmp.notifications

import android.app.NotificationManager
import android.content.Context
import rubylich.ktmp.notifications.NotificationItemResolver
import timber.log.Timber


class PushNotification(
    private val notificationManager: NotificationManager,
    private val resolver: NotificationItemResolver,
    private val notificationBuilder: NotificationBuilder
) {
    fun show(
        context: Context,
        data: Map<String, String>
    ) {
        val resolvedNotification = resolver.resolve(data)
        if (resolvedNotification.drop()) {
            Timber.tag("PushNotification")
            Timber.d("$resolvedNotification drop")
            return
        }

        val id = resolvedNotification.id()
        resolvedNotification.runAfterNotify()
        notificationManager.notify(id, notificationBuilder.build(context, resolvedNotification))
    }
}