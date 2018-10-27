package rubylich.ktmp.features.posts

import io.mockk.MockKException
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import rubylich.ktmp.notifications.IUnreadNotificationsRepo
import kotlin.test.Test


class PostsPresenterTest {
    val postsRepo = mockk<IPostRepo>(relaxed = true)
    val postsView = mockk<IPostsView>()
    val unreadNotificationsRepo = mockk<IUnreadNotificationsRepo>(relaxed = true)

    val postsPresenter = PostsPresenter(
        Dispatchers.Unconfined,
        unreadNotificationsRepo,
        postsRepo,
        postsView
    )

    @Test
    fun onCreateTest() {
        postsPresenter.onCreate()
        every { postsView.showError(MockKException("")) } returns Unit
//        every { postsView.showError(Exception()) } returns Unit
//        verify { postsPresenter.showPosts() }
    }
}