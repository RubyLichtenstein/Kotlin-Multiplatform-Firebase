package rubylich.ktmp.notifications

import android.app.NotificationManager
import android.content.Context


class PushNotification(
    private val notificationManager: NotificationManager,
    private val resolver: NotificationItemResolver,
    private val notificationBuilder: NotificationBuilder
) {

    fun show(
        context: Context,
        data: Map<String, String>
    ) {
        val resolvedNotification = resolver.resolve(data)
        if (resolvedNotification == null) {
            //todo add multi tinder
//            Timber.w("$resolvedNotification is null")
            return
        }

        if (resolvedNotification.drop()) {
//            Timber.d("$resolvedNotification dropped")
            return
        }

        notificationManager.notify(
            resolvedNotification.id(),
            notificationBuilder.build(context, resolvedNotification)
        )

        resolvedNotification.runAfterNotify()
    }
}