package rubylich.ktmp.functions.db.posts

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.await
import kotlinx.coroutines.promise
import rubylich.ktmp.features.posts.*
import rubylich.ktmp.functions.lib.sendDataNotificationToTopic
import rubylich.ktmp.functions.ts2kt_firebase_admin.document
import kotlin.js.Promise

fun dbPostsOnCreate(): Promise<Any> = document("/$REF_POSTS/{id}")
    .onCreate { snapshot, context ->
        val postId = context.params["id"] as String
        val postsRepo = PostsRepo()

        GlobalScope.promise {
            val post: Post = postsRepo.get(postId)

            sendDataNotificationToTopic(
                topic = PostNotification.TOPIC,
                payload = PostNotification(
                    postId = post.id,
                    postContent = post.content
                )
            ).await()
        }
    }



