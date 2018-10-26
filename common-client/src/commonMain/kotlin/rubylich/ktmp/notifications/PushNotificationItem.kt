package rubylich.ktmp.notifications


abstract class PushNotificationItem(
    val data: Map<String, String>
) {
    abstract fun title(): String
    abstract fun body(): String
    abstract fun runAfterExecution()
    open fun channel(): PushNotificationChannel = PushNotificationChannel.Default()
    open fun drop(): Boolean = false
    abstract fun id(): Int

    class Drop(
        data: Map<String, String>
    ) : PushNotificationItem(data) {
        override fun runAfterExecution() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun title(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun body(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun drop(): Boolean = true

        override fun id() = 0
    }
}