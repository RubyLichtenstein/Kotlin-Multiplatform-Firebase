package com.rubylich.ktmp.notifications.service

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.rubylich.ktmp.notifications.PushNotification
import org.koin.android.ext.android.inject
import timber.log.Timber


class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val pushNotification: PushNotification by inject()

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
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
