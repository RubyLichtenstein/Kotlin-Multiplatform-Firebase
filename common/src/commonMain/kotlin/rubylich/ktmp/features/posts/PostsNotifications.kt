package rubylich.ktmp.features.posts


object NotificationData {
    const val KEY_ID = "id"
    const val KEY_TITLE = "title"
    const val KEY_BODY = "body"
}

object PostsNotification {
    const val TOPIC = "posts"
    const val ID = "posts"

    data class Data(
        val id: String = ID,
        val post: Post,
        val sound: String = "default"
    )
}