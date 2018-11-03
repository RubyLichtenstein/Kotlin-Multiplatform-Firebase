package rubylich.ktmp.notifications

import android.app.PendingIntent
import android.content.Context
import android.content.Intent

//package com.rubylich.ktmp.notifications
//
//import android.app.PendingIntent
//import android.content.Intent
//import rubylich.ktmp.notifications.PostsNotificationItem
//
//
fun defaultPendingIntent(intent: Intent, context: Context): PendingIntent {
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
//
//override fun intent() = Intent(context, PostsNotificationItem::class.java)
