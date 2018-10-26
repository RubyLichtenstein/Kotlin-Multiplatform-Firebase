package rubylich.ktmp.functions.db.posts

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.await
import kotlinx.coroutines.promise
import rubylich.ktmp.features.posts.Post
import rubylich.ktmp.features.posts.PostsNotification
import rubylich.ktmp.features.posts.PostsRepo
import rubylich.ktmp.features.posts.REF_POSTS
import rubylich.ktmp.functions.lib.sendDataNotificationToTopic
import rubylich.ktmp.functions.ts2kt_firebase_admin.document
import kotlin.js.Promise

fun dbPostsOnCreate(): Promise<Any> {
    return document("/$REF_POSTS/{id}")
        .onCreate { snapshot, context ->
            val postId = context.params["id"] as String
            val postsRepo = PostsRepo()

            GlobalScope.promise {
                val post: Post = postsRepo.get(postId)

                sendDataNotificationToTopic(
                    topic = PostsNotification.TOPIC,
                    payload = PostsNotification.Data(
                        postId = post.id,
                        postContent = post.content
                    )
                ).await()
            }
        }
}



