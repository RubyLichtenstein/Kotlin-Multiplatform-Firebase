package com.rubylich.ktmp.notifications.items

import android.content.Context
import android.content.Intent
import com.beust.klaxon.Klaxon
import com.rubylich.ktmp.PostsActivity
import com.rubylich.ktmp.notifications.NotificationsUnreadMessagesCounter
import rubylich.ktmp.features.posts.NotificationData
import rubylich.ktmp.features.posts.PostsNotification

class PostsNotificationItem(
    context: Context,
    data: Map<String, String>,
    private val notificationsUnreadMessagesCounter: NotificationsUnreadMessagesCounter
) : PushNotificationItem(context, data) {

    private val notificationData =
        Klaxon().parse<PostsNotification.Data>(Klaxon().toJsonString(data))!!

    override fun id(): Int = notificationData.id.hashCode()

    override fun title() =
        data[NotificationData.KEY_TITLE]!! +
                " ${notificationsUnreadMessagesCounter.getUnreadMessagesCounter(
                    context,
                    PostsNotification.ID
                )}"

    override fun runAfterExecution() {
        super.runAfterExecution()
        notificationsUnreadMessagesCounter.addOneToUnreadMessagesCounter(
            context,
            PostsNotification.ID
        )
    }

    override fun intent(): Intent = Intent(context, PostsActivity::class.java)
}