package rubylich.ktmp.features.posts

import kotlinx.serialization.Serializable

@Serializable
data class Post(val id: String = "", val content: String = "")