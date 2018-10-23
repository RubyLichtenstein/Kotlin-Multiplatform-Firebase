package com.rubylichtenstein.outconnect.notifications.items

import android.content.Context
import android.content.Intent
import com.beust.klaxon.Klaxon
import com.rubylichtenstein.outconnect.PostsActivity
import com.rubylichtenstein.outconnect.notifications.NotificationsUnreadMessagesCounter
import features.posts.NotificationData
import features.posts.PostNotificationData

class PostsNotification(
    context: Context,
    data: Map<String, String>,
    private val notificationsUnreadMessagesCounter: NotificationsUnreadMessagesCounter
) : PushNotificationItem(context, data) {

    private val notificationData =
        Klaxon().parse<PostNotificationData>(Klaxon().toJsonString(data))!!

    override fun id(): Int = notificationData.groupId.hashCode()

    override fun title() =
        data[NotificationData.KEY_TITLE]!! +
                " ${notificationsUnreadMessagesCounter.getUnreadMessagesCounter(
                    context,
                    notificationData.groupId
                )}"

    override fun runAfterExecution() {
        super.runAfterExecution()
        notificationsUnreadMessagesCounter.addOneToUnreadMessagesCounter(
            context,
            notificationData.groupId
        )
    }

    override fun intent(): Intent = Intent(context, PostsActivity::class.java)
}