package rubylich.ktmp.features.posts

import kotlin.coroutines.coroutineContext

actual class PostsView : IPostsView {
    actual override fun showPosts(posts: List<Post>) {}
    actual override fun showAddPostDialog() {}
    actual override fun addPostButtonClick(): BroadcastChannel<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun addPostContent(): BroadcastChannel<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun showError(error: Throwable) {}
    actual override fun refresh(): BroadcastChannel<Unit> {
        coroutineContext()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun showRefresh(show: Boolean) {}
}