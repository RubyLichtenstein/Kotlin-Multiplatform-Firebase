package rubylich.ktmp.features.posts

expect class PostsView {
    fun showPosts(posts: List<Post>)
    fun showAddPostDialog()
    fun addPostClick(action: () -> Unit)
    fun addPostContent(action: (String) -> Unit)
}