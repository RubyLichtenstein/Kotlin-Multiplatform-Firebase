package rubylich.ktmp.features.posts

import kotlinx.cinterop.ExportObjCClass
import kotlinx.cinterop.ObjCOutlet
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import platform.Foundation.NSCoder
import platform.Foundation.NSIndexPath
import platform.UIKit.*
import platform.darwin.NSInteger

@ExperimentalCoroutinesApi
@ExportObjCClass
actual class PostsView @OverrideInit constructor(coder: NSCoder) : IPostsView, UIViewController(coder) {

    @ObjCOutlet
    lateinit var tableView: UITableView

    private val dialogContentChannel = ConflatedBroadcastChannel<String>()
    private val refreshChannel = ConflatedBroadcastChannel<Unit>()
    private val addPostButtonChannel = ConflatedBroadcastChannel<Unit>()
    private lateinit var postRepo: PostsRepo
    private var posts = listOf<Post>()

    external override fun viewDidLoad() {
        super.viewDidLoad()
        postRepo = PostsRepo()

        tableView.setDataSource(object: UITableViewDataSourceProtocol {
            override fun tableView(tableView: UITableView, cellForRowAtIndexPath: NSIndexPath): UITableViewCell {
                val cell = tableView.dequeueReusableCellWithIdentifier( "PostCell", cellForRowAtIndexPath)
                val post = posts[cellForRowAtIndexPath.row.toInt()]
                cell.textLabel?.text = post.content
                return cell
            }

            override fun tableView(tableView: UITableView, numberOfRowsInSection: NSInteger): NSInteger {
                return posts.size.toLong()
            }

        })
    }

    actual override fun showPosts(posts: List<Post>) {
        this.posts = posts
        tableView.reloadData()
    }

    actual override fun showAddPostDialog() {
        val alert = UIAlertController("Create Post", null)
        alert.addAction(UIAlertAction.actionWithTitle("Cancel", 0, null))

        alert.addTextFieldWithConfigurationHandler {
                it?.placeholder = "Post content..."
        }

//        alert.addAction(UIAlertAction.actionWithTitle("Create", 0) {
//            if let content = alert.textFields?.first?.text, !content.isEmpty {
//                let newPost = Post(id: UUID().uuidString, content: content)
//                self?.postRepo.create(newPost)
//            }
//        })
//
//        this.present(alert, true)
    }

    actual override fun addPostButtonClick(): BroadcastChannel<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun addPostContent(): BroadcastChannel<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun showError(error: Throwable) {}
    actual override fun refresh(): BroadcastChannel<Unit> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override fun showRefresh(show: Boolean) {}
}