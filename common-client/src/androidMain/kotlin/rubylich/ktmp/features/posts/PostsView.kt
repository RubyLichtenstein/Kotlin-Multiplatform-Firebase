package rubylich.ktmp.features.posts

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.EditText
import com.example.testmodule.R
import kotlinx.android.synthetic.main.add_post_dialog_layout.view.*
import kotlinx.android.synthetic.main.posts_view_layout.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.ConflatedBroadcastChannel

actual class PostsView : Fragment(), IPostsView {

    val dialogContentBroadcast = ConflatedBroadcastChannel<String>()

    lateinit var postsPresenter: PostsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        postsPresenter = PostsPresenter(Dispatchers.Main, PostsRepo(), this)
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
    }

    override fun onDestroy() {
        super.onDestroy()
        postsPresenter.onDestroy()
    }

    actual override fun showPosts(posts: List<Post>) {}

    actual override fun showAddPostDialog() {
        val dialogView =
            LayoutInflater.from(context).inflate(R.layout.add_post_dialog_layout, null)

        val contentEditText = dialogView.findViewById<EditText>(R.id.addPostDialogContent)

        val dialog = AlertDialog.Builder(context)
            .setTitle("New post")
            .setView(dialogView)
            .setPositiveButton("Send") { dialog: DialogInterface?, which: Int ->
                dialogContentBroadcast.offer(contentEditText.text.toString())
            }
            .show()

        dialogView.addPostDialogContent.requestFocus()
        dialog?.window?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
    }

    actual override fun addPostClick(): BroadcastChannel<Unit> {
        val conflatedBroadcastChannel = ConflatedBroadcastChannel<Unit>()

        addPostButton.setOnClickListener {
            conflatedBroadcastChannel.offer(Unit)
        }

        return conflatedBroadcastChannel
    }

    actual override fun addPostContent(): BroadcastChannel<String> = dialogContentBroadcast
    actual override fun showError(error: Throwable) {}
}
