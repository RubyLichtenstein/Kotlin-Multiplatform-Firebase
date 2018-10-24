package rubylich.ktmp.features.posts

data class PostNotificationData(
    val id: String,
    val title: String,
    val body: String,
    val sound: String = "default",
    val click_action: String,
    val tag: String,
    val groupId: String,
    val groupName: String,
    val fromId: String
)

object NotificationData {
    const val KEY_ID = "id"
    const val KEY_TITLE = "title"
    const val KEY_BODY = "body"
}

object NotificationTopics {
    const val POSTS = "posts"
}

object NotificationId {
    const val POSTS = "posts"
}