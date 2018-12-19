package rubylich.ktmp.features.posts

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import rubylich.ktmp.base.IBasePresenter
import rubylich.ktmp.notifications.IUnreadNotificationsRepo
import kotlin.coroutines.CoroutineContext
import kotlin.random.Random

class PostsPresenter(
    private val unreadNotificationsRepo: IUnreadNotificationsRepo,
    private val postsRepo: IPostBaseRepo,
    private val postsViewPostsView: IPostsView
) : IBasePresenter, CoroutineScope {
    val job = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    override fun onCreate() {
        launch { showPosts() }

        postsViewPostsView.apply {
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

    override fun onDestroy() {
        job.cancel()
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