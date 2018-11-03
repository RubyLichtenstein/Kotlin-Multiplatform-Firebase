package rubylich.ktmp.notifications


abstract class BaseNotificationItem(
    val data: Map<String, String>
) {
    abstract fun title(): String
    abstract fun body(): String
    abstract fun runAfterNotify()
    open fun channel(): PushNotificationChannel = PushNotificationChannel.Default()
    open fun drop(): Boolean = false
    abstract fun id(): Int
}