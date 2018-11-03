package rubylich.ktmp.features.posts
import kotlinx.serialization.ImplicitReflectionSerializer

import com.google.firebase.firestore.DocumentSnapshot
import kotlinx.serialization.Mapper
import rubylich.ktmp.base.IBaseParser

actual class PostParser actual constructor() : IBaseParser<Post> {
    override fun parse(any: Any): Post {
        return (any as DocumentSnapshot).parse()
    }
}

@UseExperimental(ImplicitReflectionSerializer::class)
inline fun <reified T: Any> DocumentSnapshot.parse(): T = Mapper.unmap(this.data!!)