package com.rubylichtenstein.outconnect.notifications

import android.app.NotificationManager
import android.content.Context
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
        val resolvedNotification = resolver.resolve(context, data)
        if (resolvedNotification.drop()) {
            Timber.tag("PushNotification")
            Timber.d("$resolvedNotification drop")
            return
        }

        val id = resolvedNotification.id()
        resolvedNotification.runAfterExecution()
        notificationManager.notify(id, notificationBuilder.build(context, resolvedNotification))
    }
}