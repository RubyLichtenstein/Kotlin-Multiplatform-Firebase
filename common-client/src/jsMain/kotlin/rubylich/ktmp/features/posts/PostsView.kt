package rubylich.ktmp.features.posts

actual class PostsView {
    actual fun showPosts(posts: List<Post>) {}
    actual fun showAddPostDialog() {}
    actual fun addPostClick(action: () -> Unit) {}
    actual fun addPostContent(action: (String) -> Unit) {}
}