package rubylich.ktmp

import rubylich.ktmp.features.posts.PostNotification
import rubylich.ktmp.notifications.NotificationsTopics

class CommonApplication(private val notificationsTopics: NotificationsTopics) {
    fun onStart() {
        notificationsTopics.subscribeToTopic(PostNotification.TOPIC)
    }
}