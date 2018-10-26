package rubylich.ktmp.features.posts


object NotificationData {
    const val KEY_ID = "id"
}

object PostsNotification {
    const val TOPIC = "posts"
    const val ID = "posts"

    data class Data(
        val id: String = ID,
        val postId: String,
        val postContent: String,
        val sound: String = "default"
    )
}