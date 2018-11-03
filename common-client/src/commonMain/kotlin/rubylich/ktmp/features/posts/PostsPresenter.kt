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
        showPosts()

        launchAndCatch(uiContext, postsViewPostsView::showError) {
            postsViewPostsView
                .refresh()
                .consumeEach {
                    showPosts()
                }
        }

        launchAndCatch(uiContext, postsViewPostsView::showError) {
            postsViewPostsView
                .addPostButtonClick()
                .consumeEach {
                    postsViewPostsView.showAddPostDialog()
                }
        }

        launchAndCatch(uiContext, postsViewPostsView::showError) {
            postsViewPostsView
                .addPostContent()
                .consumeEach {
                    addPost(Post(Random.nextBytes(8).toString(), it))
                    showPosts()
                }
        }
    }

    override fun onDestroy() {

    }

    fun showPosts() {
        launchAndCatch(uiContext, postsViewPostsView::showError) {
            postsViewPostsView.showRefresh(true)
            postsViewPostsView.showPosts(postsRepo.getAll())
            postsViewPostsView.showRefresh(false)
            unreadNotificationsRepo.clear(PostNotification.ID)
        }
    }

    suspend fun addPost(post: Post) {
        postsRepo.set(post.id, post)
    }
}