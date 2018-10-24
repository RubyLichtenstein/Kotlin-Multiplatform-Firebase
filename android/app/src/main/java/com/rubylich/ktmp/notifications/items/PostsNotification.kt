package com.rubylich.ktmp.notifications.items

import android.content.Context
import android.content.Intent
import com.beust.klaxon.Klaxon
import com.rubylich.ktmp.PostsActivity
import com.rubylich.ktmp.notifications.NotificationsUnreadMessagesCounter
import rubylich.ktmp.features.posts.NotificationData
import rubylich.ktmp.features.posts.PostNotificationData

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