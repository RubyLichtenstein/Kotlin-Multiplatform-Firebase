package rubylich.ktmp.notifications


import kotlinx.serialization.ImplicitReflectionSerializer
import rubylich.ktmp.features.posts.NotificationData.KEY_ID
import rubylich.ktmp.features.posts.PostsNotification

interface NotificationItemResolver {
    fun resolve(data: Map<String, String>): PushNotificationItem
}

class NotificationItemResolverImpl(private val unreadNotificationsRepo: IUnreadNotificationsRepo) :
    NotificationItemResolver {
    @UseExperimental(ImplicitReflectionSerializer::class)
    override fun resolve(data: Map<String, String>): PushNotificationItem {
        val id = data[KEY_ID]
        return when (id) {
            PostsNotification.ID -> PostsNotificationItem(
                unreadNotificationsRepo,
                data
            )
            else -> PushNotificationItem.Drop(data)
        }
    }
}