package rubylich.ktmp.features.posts

import com.google.firebase.messaging.FirebaseMessaging

actual class Notifications {
    actual fun subscribeToTopic(topic: String) {
        FirebaseMessaging.getInstance().subscribeToTopic(topic)
    }
}