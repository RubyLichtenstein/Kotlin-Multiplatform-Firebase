package rubylich.ktmp.features.posts

import rubylich.ktmp.functions.ts2kt_firebase_admin.DocumentSnapshot
import rubylich.ktmp.repo.Parser

actual class PostParser actual constructor() : Parser<Post> {
    override fun parse(any: Any): Post {
        return (any as DocumentSnapshot).toPost()
    }
}

fun DocumentSnapshot.toPost(): Post {
    return Post(
        id = get("id") as String,
        content = get("content") as String
    )
}
