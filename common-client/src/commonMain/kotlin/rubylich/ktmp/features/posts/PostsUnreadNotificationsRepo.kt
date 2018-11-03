package rubylich.ktmp.features.posts.notifications

import com.russhwolf.settings.Settings
import com.russhwolf.settings.get
import com.russhwolf.settings.set
import rubylich.ktmp.features.posts.PostNotification
import rubylich.ktmp.notifications.IUnreadNotificationsRepo

class PostsUnreadNotificationsRepo(factory: Settings.Factory) : IUnreadNotificationsRepo {
    private val settings: Settings = factory.create(PostNotification.ID)
    override fun get(id: String): Int = settings[id, 0]
    override fun set(id: String, count: Int) = settings.set(id, count)
    override fun clear(id: String) = settings.set(id, 0)
}