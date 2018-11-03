package rubylich.ktmp.features.posts

import android.support.v7.util.SortedList
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.util.SortedListAdapterCallback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testmodule.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.post_layout.*


class PostsAdapter() :
    RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {

    val posts = SortedList<Post>(Post::class.java,
        object : SortedListAdapterCallback<Post>(this) {
            override fun compare(a: Post, b: Post): Int {
                return a.id.compareTo(b.id)
            }

            override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(item1: Post, item2: Post): Boolean {
                return item1 == item2
            }
        })

    override fun getItemCount(): Int = posts.size()

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_layout, parent, false)
        return PostViewHolder(view)
    }

    inner class PostViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView),
        LayoutContainer {

        fun bind(post: Post) {
            content.text = post.content
        }
    }
}
