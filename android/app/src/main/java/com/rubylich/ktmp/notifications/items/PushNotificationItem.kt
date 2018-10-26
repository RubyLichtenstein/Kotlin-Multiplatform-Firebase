package com.rubylich.ktmp.notifications.items

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import com.rubylich.ktmp.R
import com.rubylich.ktmp.notifications.PushNotificationChannel


abstract class PushNotificationItem(
    val context: Context,
    val data: Map<String, String>
) {
    open fun smallIcon(): Int = R.drawable.ic_android_black_24dp
    abstract fun title(): String
    abstract fun body(): String
    open fun runAfterExecution() {}
    open fun channel(): PushNotificationChannel = PushNotificationChannel.Default()
    open fun drop(): Boolean = false
    abstract fun intent(): Intent
    open fun pendingIntent(): PendingIntent = defaultPendingIntent(intent(), context)

    abstract fun id(): Int

    class Drop(
        data: Map<String, String>,
        context: Context
    ) : PushNotificationItem(context, data) {
        override fun title(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun body(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun drop(): Boolean = true

        override fun id() = 0

        override fun intent() = Intent(context, PostsNotificationItem::class.java)
    }

    private fun defaultPendingIntent(intent: Intent, context: Context): PendingIntent {
        intent.apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        }

        val requestID = System.currentTimeMillis().toInt()
        return PendingIntent.getActivity(
            context,
            requestID,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )
    }
}