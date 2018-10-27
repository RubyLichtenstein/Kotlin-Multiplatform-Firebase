package rubylich.ktmp.notifications

import rubylich.ktmp.features.posts.PostsNotification

class PostsNotificationItem(
    private val unreadNotificationsRepo: IUnreadNotificationsRepo,
    data: Map<String, String>
) : PushNotificationItem(data) {
    private val notificationData = PostsNotification.Data.fromMap(data)

    override fun id(): Int = notificationData.id.hashCode()

    override fun body(): String = notificationData.postContent

    override fun title(): String =
        "Unread count: ${unreadNotificationsRepo.get(PostsNotification.ID)}"

    override fun runAfterNotify() {
        val id = PostsNotification.ID
        with(unreadNotificationsRepo) {
            set(id, get(id) + 1)
        }
    }

//    override fun intent(): Intent = Intent(context, PostsActivity::class.java)
}