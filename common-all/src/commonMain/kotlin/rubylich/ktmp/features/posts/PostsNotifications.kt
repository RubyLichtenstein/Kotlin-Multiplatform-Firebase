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
    ) {
        companion object {
            fun fromMap(map: Map<String, String>): Data {
                return Data(
                    id = map["id"] as String,
                    postId = map["postId"] as String,
                    postContent = map["postContent"] as String,
                    sound = map["sound"] as String
                )
            }
        }
    }
}