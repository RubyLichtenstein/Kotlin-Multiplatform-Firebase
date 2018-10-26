package rubylich.ktmp.functions.db.posts

import rubylich.ktmp.features.posts.Post
import rubylich.ktmp.features.posts.REF_POSTS
import rubylich.ktmp.functions.lib.sendDataNotificationToTopic
import rubylich.ktmp.functions.ts2kt_firebase_admin.document

fun dbPostsOnCreate(): dynamic {
    return document("/$REF_POSTS/{id}")
        .onCreate { snapshot, context ->
            sendDataNotificationToTopic("a", Post("id", "safafs"))
        }
}



