package com.rubylich.ktmp.notifications.service

import android.app.NotificationManager
import android.content.Context
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.russhwolf.settings.PlatformSettings
import rubylich.ktmp.features.posts.notifications.PostsUnreadNotificationsRepo
import rubylich.ktmp.notifications.NotificationBuilderImpl
import rubylich.ktmp.notifications.NotificationItemResolver
import rubylich.ktmp.notifications.PushNotification
import timber.log.Timber

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        val unreadNotificationsRepo =
            PostsUnreadNotificationsRepo(PlatformSettings.Factory(applicationContext))

        val pushNotification = PushNotification(
            notificationManager =
            applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager,
            resolver = NotificationItemResolver(unreadNotificationsRepo),
            notificationBuilder = NotificationBuilderImpl()
        )

        val data = remoteMessage.data

        if (data != null) {
            Timber.tag("PushNotification")
            Timber.d("onMessageReceived: $data")
            pushNotification.show(applicationContext, data)
        } else {
            Timber.e("$remoteMessage is null")
        }
    }
}
