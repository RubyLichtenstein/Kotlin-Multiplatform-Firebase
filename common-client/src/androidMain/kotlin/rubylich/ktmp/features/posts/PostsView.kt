package rubylich.ktmp.features.posts

import android.app.AlertDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.example.testmodule.R
import kotlinx.android.synthetic.main.add_post_dialog_layout.view.*
import kotlinx.android.synthetic.main.posts_view_layout.*

actual class PostsView : Fragment() {

    lateinit var postsPresenter: PostsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        postsPresenter = PostsPresenter(PostsRepo(), this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.posts_view_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postsPresenter.onCreate()

//        setupSendPost(groupId)
//
//        groupPostsSwipeRefresh.setOnRefreshListener {
//            groupPostsSwipeRefresh.isRefreshing = false
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
        postsPresenter.onDestroy()
    }

    actual fun showPosts(posts: List<Post>) {}

//    fun showAddPostDialog(groupId: String) {
//    }
//
//    private fun setupSendPost(groupId: String) {
//        groupPostsAddPostButton.setOnClickListener {
//            showAddPostDialog(groupId)
//        }
//    }

    actual fun showAddPostDialog() {
        val dialogView =
            LayoutInflater.from(context).inflate(R.layout.add_post_dialog_layout, null)

        val dialog = AlertDialog.Builder(context)
            .setTitle("New post")
            .setView(dialogView)
            .setPositiveButton("Send") { dialog, which ->

            }
            .show()

        dialogView.addPostDialogContent.requestFocus()
        dialog?.window?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
    }

    actual fun addPostClick(action: () -> Unit) {
        addPostButton.setOnClickListener { action() }
    }

    actual fun addPostContent(action: (String) -> Unit) {}
}
