package db.posts

import db.FirebaseDbRefs.REF_POSTS
import functions
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.asPromise
import kotlinx.coroutines.async

fun dbPostsOnCreate(): dynamic {
    return functions.firestore
        .document("/$REF_POSTS/{id}")
        .onCreate { snapshot, context ->
            GlobalScope.async {
                sendNewPostNotification()
            }.asPromise()
        }
}

suspend fun sendNewPostNotification() {

}

