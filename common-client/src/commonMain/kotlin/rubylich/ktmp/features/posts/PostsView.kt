package rubylich.ktmp.features.posts

import kotlinx.coroutines.channels.BroadcastChannel
import rubylich.ktmp.base.IBaseView

expect class PostsView : IPostsView {
    override fun showPosts(posts: List<Post>)
    override fun showAddPostDialog()
    override fun addPostButtonClick(): BroadcastChannel<Unit>
    override fun addPostContent(): BroadcastChannel<String>
    override fun showError(error: Throwable)
    override fun refresh(): BroadcastChannel<Unit>
    override fun showRefresh(show: Boolean)
}

interface IPostsView : IBaseView {
    fun showPosts(posts: List<Post>)
    fun showAddPostDialog()
    fun addPostButtonClick(): BroadcastChannel<Unit>
    fun refresh(): BroadcastChannel<Unit>
    fun addPostContent(): BroadcastChannel<String>
    fun showRefresh(show: Boolean)
}