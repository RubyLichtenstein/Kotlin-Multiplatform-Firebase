package rubylich.ktmp.features.posts

import kotlinx.coroutines.channels.consumeEach
import rubylich.ktmp.base.IBasePresenter
import rubylich.ktmp.launchAndCatch
import rubylich.ktmp.notifications.IUnreadNotificationsRepo
import kotlin.coroutines.CoroutineContext
import kotlin.random.Random

class PostsPresenter(
    private val uiContext: CoroutineContext,
    private val unreadNotificationsRepo: IUnreadNotificationsRepo,
    private val postsRepo: IPostBaseRepo,
    private val postsViewPostsView: IPostsView
) : IBasePresenter {

    override fun onCreate() {
        launch { showPosts() }

        with(postsViewPostsView) {
            launch {
                refresh()
                    .consumeEach {
                        showPosts()
                    }
            }

            launch {
                addPostButtonClick()
                    .consumeEach {
                        postsViewPostsView.showAddPostDialog()
                    }
            }

            launch {
                addPostContent()
                    .consumeEach {
                        addPost(Post(Random.nextBytes(8).toString(), it))
                        showPosts()
                    }
            }
        }

    }

    private fun launch(function: suspend () -> Unit) =
        launchAndCatch(uiContext, postsViewPostsView::showError, function)

    override fun onDestroy() {

    }

    suspend fun showPosts() {
        with(postsViewPostsView) {
            showRefresh(true)
            showPosts(postsRepo.getAll())
            showRefresh(false)
        }
        unreadNotificationsRepo.clear(PostNotification.ID)
    }

    suspend fun addPost(post: Post) {
        postsRepo.set(post.id, post)
    }
}