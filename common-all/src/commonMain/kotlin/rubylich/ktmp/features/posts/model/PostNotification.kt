package rubylich.ktmp.features.posts

import kotlinx.serialization.Serializable


@Serializable
data class PostNotification(
    val id: String = ID,
    val postId: String,
    val postContent: String,
    val sound: String = "default"
) {
    companion object {
        const val TOPIC = "posts"
        const val ID = "posts"
        const val KEY_ID = "id"
    }
}
