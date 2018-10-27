package rubylich.ktmp.notifications

import com.russhwolf.settings.Settings
import com.russhwolf.settings.get
import com.russhwolf.settings.set

interface IUnreadNotificationsRepo {
    fun get(id: String): Int
    fun set(id: String, count: Int)
    fun clear(id: String)
}

class UnreadNotificationsRepo(factory: Settings.Factory) : IUnreadNotificationsRepo {
    val settings: Settings = factory.create(this::class.qualifiedName)
    override fun get(id: String): Int = settings[id, 0]
    override fun set(id: String, count: Int) = settings.set(id, count)
    override fun clear(id: String) = settings.set(id, 0)
}