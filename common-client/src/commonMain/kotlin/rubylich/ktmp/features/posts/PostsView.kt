package rubylich.ktmp.features.posts

import kotlinx.coroutines.channels.BroadcastChannel

expect class PostsView : IPostsView {
    override fun showPosts(posts: List<Post>)
    override fun showAddPostDialog()
    override fun addPostClick(): BroadcastChannel<Unit>
    override fun addPostContent(): BroadcastChannel<String>
    override fun showError(error: Throwable)
}

interface IPostsView : BaseView {
    fun showPosts(posts: List<Post>)
    fun showAddPostDialog()
    fun addPostClick(): BroadcastChannel<Unit>
    fun addPostContent(): BroadcastChannel<String>
}