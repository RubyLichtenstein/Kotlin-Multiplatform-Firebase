package rubylich.ktmp.features.posts

import kotlinx.channels.SendChannel
import kotlinx.coroutines.channels.BroadcastChannel

actual class PostsView : IPostsView {
    actual override fun showPosts(posts: List<Post>) {}
    actual override fun showAddPostDialog() {}
    actual override fun addPostButtonClick(): SendChannel<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun addPostContent(): BroadcastChannel<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun showError(error: Throwable) {}
    actual override fun refresh(): BroadcastChannel<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun showRefresh(show: Boolean) {}
}