package rubylich.ktmp.features.posts

import com.google.firebase.firestore.DocumentSnapshot
import kotlinx.serialization.Mapper
import rubylich.ktmp.repo.Parser

actual class PostParser actual constructor() : Parser<Post> {
    override fun parse(any: Any): Post {
        return (any as DocumentSnapshot).parse()
    }
}

inline fun <reified T: Any> DocumentSnapshot.parse(): T = Mapper.unmap(this.data!!)