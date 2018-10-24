package rubylich.ktmp.features.posts

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async


class PostsPresenter(
    private val postsRepo: PostsRepo,
    private val postsView: PostsView
) {

    fun onCreate() {
        showPosts()
        postsView.addPostClick {
            postsView.showAddPostDialog()
        }
        postsView.addPostContent { content ->
            addPost(Post("todo put id", content))
        }
    }

    fun onDestroy() {

    }

    fun showPosts() {
        GlobalScope.async {
            postsView.showPosts(postsRepo.getAll())
        }.start()
    }

    fun addPost(post: Post) {
        GlobalScope.async {
            postsRepo.set(post.id, post)
        }.start()
    }
}