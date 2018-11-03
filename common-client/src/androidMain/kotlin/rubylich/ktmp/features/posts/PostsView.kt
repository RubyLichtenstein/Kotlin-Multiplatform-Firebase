package rubylich.ktmp.features.posts

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.EditText
import com.example.testmodule.R
import com.russhwolf.settings.PlatformSettings
import kotlinx.android.synthetic.main.add_post_dialog_layout.view.*
import kotlinx.android.synthetic.main.posts_view_layout.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import rubylich.ktmp.features.posts.notifications.PostsUnreadNotificationsRepo

actual class PostsView : Fragment(), IPostsView {

    private val dialogContentChannel = ConflatedBroadcastChannel<String>()
    private val refreshChannel = ConflatedBroadcastChannel<Unit>()
    private val addPostButtonChannel = ConflatedBroadcastChannel<Unit>()

    private val adapter = PostsAdapter()
    private lateinit var postsPresenter: PostsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        postsPresenter = PostsPresenter(
            Dispatchers.Main,
            PostsUnreadNotificationsRepo(PlatformSettings.Factory(context!!)),
            PostsRepo(),
            this
        )
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

        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(view.getContext())

        postsPresenter.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
        dialogContentChannel.close()
        addPostButtonChannel.close()
        refreshChannel.close()
        postsPresenter.onDestroy()
    }

    actual override fun showPosts(posts: List<Post>) {
        adapter.posts.addAll(posts)
    }

    actual override fun showAddPostDialog() {
        val dialogView =
            LayoutInflater.from(context).inflate(R.layout.add_post_dialog_layout, null)

        val contentEditText = dialogView.findViewById<EditText>(R.id.addPostDialogContent)

        val dialog = AlertDialog.Builder(context)
            .setTitle("New post")
            .setView(dialogView)
            .setPositiveButton("Send") { dialog: DialogInterface?, which: Int ->
                dialogContentChannel.offer(contentEditText.text.toString())
            }
            .show()

        dialogView.addPostDialogContent.requestFocus()
        dialog?.window?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
    }

    actual override fun addPostButtonClick(): BroadcastChannel<Unit> =
        addPostButtonChannel.apply {
            addPostButton.setOnClickListener {
                offer(Unit)
            }
        }

    actual override fun addPostContent(): BroadcastChannel<String> = dialogContentChannel
    actual override fun showError(error: Throwable) {}

    actual override fun refresh(): BroadcastChannel<Unit> =
        refreshChannel.apply {
            postsSwipeRefresh.setOnRefreshListener {
                offer(Unit)
            }
        }

    actual override fun showRefresh(show: Boolean) {
        postsSwipeRefresh.isRefreshing = show
    }
}
