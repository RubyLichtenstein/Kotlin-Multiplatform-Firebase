package rubylich.ktmp.notifications

interface IUnreadNotificationsRepo {
    fun get(id: String): Int
    fun set(id: String, count: Int)
    fun clear(id: String)
}

