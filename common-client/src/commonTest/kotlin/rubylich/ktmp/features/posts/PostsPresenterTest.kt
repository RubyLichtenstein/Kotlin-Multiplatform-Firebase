package rubylich.ktmp.features.posts

import io.mockk.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.launch
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
        unreadNotificationsRepo,
        postsRepo,
        postsView
    )

    @Test
    fun addPostTest() {
        GlobalScope.launch(Dispatchers.Default) {
            postsPresenter.addPost(Post("", ""))
            coVerify(exactly = 3) { postsPresenter.showPosts() }
        }
    }
}