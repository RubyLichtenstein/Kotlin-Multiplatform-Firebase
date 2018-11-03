package rubylich.ktmp.notifications


import kotlinx.serialization.ImplicitReflectionSerializer
import rubylich.ktmp.features.posts.PostNotification
import rubylich.ktmp.features.posts.PostNotification.Companion.KEY_ID
import rubylich.ktmp.features.posts.notifications.PostsNotificationItem

interface INotificationItemResolver {
    fun resolve(data: Map<String, String>): BaseNotificationItem?
}

class NotificationItemResolver(private val unreadNotificationsRepo: IUnreadNotificationsRepo) :
    INotificationItemResolver {
    @UseExperimental(ImplicitReflectionSerializer::class)
    override fun resolve(data: Map<String, String>): BaseNotificationItem? {
        val id = data[KEY_ID]
        return when (id) {
            PostNotification.ID -> PostsNotificationItem(
                unreadNotificationsRepo,
                data
            )
            else -> null
        }
    }
}