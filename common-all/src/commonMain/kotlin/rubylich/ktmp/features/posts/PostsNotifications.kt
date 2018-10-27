package rubylich.ktmp.features.posts

import kotlinx.serialization.Serializable


object NotificationData {
    const val KEY_ID = "id"
}

object PostsNotification {
    const val TOPIC = "posts"
    const val ID = "posts"

    @Serializable
    data class Data(
        val id: String = ID,
        val postId: String,
        val postContent: String,
        val sound: String = "default"
    )
}