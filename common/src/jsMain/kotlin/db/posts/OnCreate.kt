package db.posts

import features.posts.REF_POSTS
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.asPromise
import kotlinx.coroutines.async
import lib.sendDataNotificationToTopic
import ts2kt_firebase_admin.document

fun dbPostsOnCreate(): dynamic {
    return document("/$REF_POSTS/{id}")
        .onCreate { snapshot, context ->
            GlobalScope.async {
                sendNewPostNotification()
            }.asPromise()
        }
}

suspend fun sendNewPostNotification() {
    sendDataNotificationToTopic("a", "a")
}

