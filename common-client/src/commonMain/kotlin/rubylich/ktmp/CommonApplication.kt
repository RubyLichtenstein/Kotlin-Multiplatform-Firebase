package rubylich.ktmp

import rubylich.ktmp.features.posts.Notifications
import rubylich.ktmp.features.posts.PostNotification

class CommonApplication(val notifications: Notifications) {
    fun onStart() {
        notifications.subscribeToTopic(PostNotification.TOPIC)
    }
}