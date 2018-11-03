package rubylich.ktmp.features.posts

import io.mockk.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import rubylich.ktmp.launchAndCatch
import rubylich.ktmp.notifications.IUnreadNotificationsRepo
import kotlin.test.Test


class PostsPresenterTest {
    val postsRepo = mockk<IPostBaseRepo> {
        coEvery { set(any(), any()) } returns Unit
    }

    val postsView = mockk<IPostsView> {
        every { showRefresh(true) } answers { Unit }
        every { refresh() } answers { ConflatedBroadcastChannel() }
        every { addPostContent() } answers { ConflatedBroadcastChannel() }
    }

    val unreadNotificationsRepo = mockk<IUnreadNotificationsRepo>(relaxed = true)

    val postsPresenter = PostsPresenter(
        Dispatchers.Unconfined,
        unreadNotificationsRepo,
        postsRepo,
        postsView
    )
//
//    @Test
//    fun onCreateTest() {
//        postsPresenter.onCreate()
//        verify { postsPresenter.showPosts() }
//    }

    @Test
    fun addPostTest() {
        launchAndCatch(Dispatchers.Default, {}) {
            postsPresenter.addPost(Post("", ""))
            coVerify(exactly = 3) { postsPresenter.showPosts() }
        }
    }
}