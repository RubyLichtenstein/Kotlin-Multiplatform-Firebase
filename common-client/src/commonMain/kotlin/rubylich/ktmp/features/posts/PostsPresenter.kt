package rubylich.ktmp.features.posts

import kotlinx.coroutines.channels.consumeEach
import rubylich.ktmp.launchAndCatch
import kotlin.coroutines.CoroutineContext
import kotlin.random.Random

class PostsPresenter(
    private val uiContext: CoroutineContext,
    private val postsRepo: IPostRepo,
    private val postsView: IPostsView
) {
    fun onCreate() {
        showPosts()

        launchAndCatch(uiContext, postsView::showError) {
            postsView
                .refresh()
                .consumeEach {
                    showPosts()
                }
        }

        launchAndCatch(uiContext, postsView::showError) {
            postsView
                .addPostButtonClick()
                .consumeEach {
                    postsView.showAddPostDialog()
                }
        }

        launchAndCatch(uiContext, postsView::showError) {
            postsView
                .addPostContent()
                .consumeEach {
                    addPost(Post(Random.nextBytes(8).toString(), it))
                    showPosts()
                }
        }
    }

    fun onDestroy() {

    }

    fun showPosts() {
        launchAndCatch(uiContext, postsView::showError) {
            postsView.showPosts(postsRepo.getAll())
            postsView.showRefresh(false)
        }
    }

    suspend fun addPost(post: Post) {
        postsRepo.set(post.id, post)
    }
}