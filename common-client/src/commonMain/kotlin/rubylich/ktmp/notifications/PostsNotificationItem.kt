package rubylich.ktmp.notifications

import rubylich.ktmp.features.posts.PostsNotification

class PostsNotificationItem(
    data: Map<String, String>
) : PushNotificationItem(data) {
    private val notificationData = PostsNotification.Data.fromMap(data)

    override fun id(): Int = notificationData.id.hashCode()

    override fun body(): String = notificationData.postContent

    override fun title() = notificationData.postContent
//    +
//            " ${notificationsUnreadMessagesCounter.getUnreadMessagesCounter(
//                context,
//                PostsNotification.ID
//            )}"

    override fun runAfterExecution() {
//        super.runAfterExecution()
//        notificationsUnreadMessagesCounter.addOneToUnreadMessagesCounter(
//            context,
//            PostsNotification.ID
//        )
    }

//    override fun intent(): Intent = Intent(context, PostsActivity::class.java)
}