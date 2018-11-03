package rubylich.ktmp.features.posts.notifications

import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.Mapper
import rubylich.ktmp.features.posts.PostNotification
import rubylich.ktmp.notifications.BaseNotificationItem
import rubylich.ktmp.notifications.IUnreadNotificationsRepo

@ImplicitReflectionSerializer
class PostsNotificationItem(
    private val unreadNotificationsRepo: IUnreadNotificationsRepo,
    data: Map<String, String>
) : BaseNotificationItem(data) {
    private val notificationData = Mapper.unmap<PostNotification>(data)

    override fun id(): Int = notificationData.id.hashCode()

    override fun body(): String = notificationData.postContent

    override fun title(): String =
        "Unread count: ${unreadNotificationsRepo.get(PostNotification.ID)}"

    override fun runAfterNotify() {
        val id = PostNotification.ID
        with(unreadNotificationsRepo) {
            set(id, get(id) + 1)
        }
    }
}