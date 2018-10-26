//package rubylich.ktmp.features.posts
//
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.GlobalScope
//import kotlinx.coroutines.async
//import kotlinx.coroutines.channels.BroadcastChannel
//import kotlin.test.Test
//
//
//class PostsPresenterTest {
//    val mockPostRepo = object : IPostRepo {
//        override suspend fun getAll(): List<Post> {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override suspend fun get(id: String): Post {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override suspend fun set(id: String, t: Post) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override suspend fun delete(id: String) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override suspend fun update(id: String, field: String, value: Any) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//    }
//
//    val mockedPostsView = object : IPostsView {
//        override fun addPostButtonClick(): BroadcastChannel<Unit> {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun refresh(): BroadcastChannel<Unit> {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun showRefresh(show: Boolean) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun showError(error: Throwable) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun showPosts(posts: List<Post>) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun showAddPostDialog() {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//
//        override fun addPostContent(): BroadcastChannel<String> {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//    }
//
//    @Test
//    fun onCreateTest() {
//        val postsPresenter = PostsPresenter(Dispatchers.Unconfined, mockPostRepo, mockedPostsView)
//        GlobalScope.async {
//            postsPresenter.onCreate()
//        }.start()
//    }
//}