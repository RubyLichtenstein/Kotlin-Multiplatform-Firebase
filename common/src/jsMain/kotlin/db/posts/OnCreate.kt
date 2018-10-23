package db.posts

import features.posts.REF_POSTS
import functions
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.asPromise
import kotlinx.coroutines.async
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

}

