package rubylich.ktmp.features.posts

import com.google.firebase.firestore.DocumentSnapshot
import rubylich.ktmp.repo.Parser

actual class PostParser actual constructor() : Parser<Post> {
    override fun parse(any: Any): Post {
        return (any as DocumentSnapshot).toObject(Post::class.java)!!
    }
}