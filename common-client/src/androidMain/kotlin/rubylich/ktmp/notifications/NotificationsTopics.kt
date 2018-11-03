package rubylich.ktmp.notifications

import com.google.firebase.messaging.FirebaseMessaging

actual class NotificationsTopics {
    actual fun subscribeToTopic(topic: String) {
        FirebaseMessaging.getInstance().subscribeToTopic(topic)
    }
}