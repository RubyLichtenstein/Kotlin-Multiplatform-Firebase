package com.rubylich.ktmp.notifications

import android.content.Context
import com.google.firebase.messaging.FirebaseMessaging
import rubylich.ktmp.features.posts.NotificationTopics

/**
 * Created by rl98880 on 29/06/2018.
 */
class NotificationTopicSubscriber(val context: Context) {
    fun subscribePosts() {
        FirebaseMessaging.getInstance().subscribeToTopic(
            NotificationTopics.POSTS
        )
    }
}