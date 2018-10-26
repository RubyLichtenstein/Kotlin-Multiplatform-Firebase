package rubylich.ktmp

import rubylich.ktmp.features.posts.Notifications
import rubylich.ktmp.features.posts.PostsNotification

class CommonApplication(val notifications: Notifications) {
    fun onStart() {
        notifications.subscribeToTopic(PostsNotification.TOPIC)
    }
}