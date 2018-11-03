package rubylich.ktmp.notifications

import android.app.Notification
import android.content.Context
import android.content.Intent
import android.support.v4.app.NotificationCompat
import com.example.testmodule.R
import rubylich.ktmp.features.posts.PostsActivity


interface NotificationBuilder {
    fun build(context: Context, item: BaseNotificationItem): Notification
}

class NotificationBuilderImpl : NotificationBuilder {

    override fun build(
        context: Context,
        item: BaseNotificationItem
    ): Notification {
        return NotificationCompat.Builder(context, item.channel().channelId)
            .setSmallIcon(R.drawable.ic_android_black_24dp)//todo
            .setContentTitle(item.title())
            .setContentText(item.body())
            .setAutoCancel(true)
            .setDefaults(Notification.DEFAULT_ALL)
            .setContentIntent(
                defaultPendingIntent(
                    Intent(
                        context,
                        PostsActivity::class.java
                    ), context
                )
            )//todo
            .build()
    }
}