package rubylich.ktmp.features.posts

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.consume
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import rubylich.ktmp.launchAndCatch
import kotlin.coroutines.CoroutineContext

class PostsPresenter(
    private val uiContext: CoroutineContext,
    private val postsRepo: IPostRepo,
    private val postsView: IPostsView
) {
    fun onCreate() {
        launchAndCatch(uiContext, postsView::showError) {
            showPosts()
        }

        launchAndCatch(uiContext, postsView::showError) {
            postsView
                .addPostClick()
                .consumeEach {
                    postsView.showAddPostDialog()
                }
        }

        launchAndCatch(uiContext, postsView::showError) {
            postsView
                .addPostContent()
                .consumeEach {
                    GlobalScope.launch {
                        addPost(Post("kuku", it))
                    }.start()
                }
        }
    }

    fun onDestroy() {

    }

    suspend fun showPosts() {
        postsView.showPosts(postsRepo.getAll())
    }

    suspend fun addPost(post: Post) {
        postsRepo.set(post.id, post)
    }
}