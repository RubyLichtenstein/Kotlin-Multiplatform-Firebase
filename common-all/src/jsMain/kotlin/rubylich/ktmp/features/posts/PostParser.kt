package rubylich.ktmp.features.posts

import kotlinx.serialization.DynamicObjectParser
import kotlinx.serialization.ImplicitReflectionSerializer
import rubylich.ktmp.functions.ts2kt_firebase_admin.DocumentSnapshot
import rubylich.ktmp.repo.Parser

actual class PostParser actual constructor() : Parser<Post> {
    override fun parse(any: Any): Post {
        return (any as DocumentSnapshot).parse()
    }
}

@UseExperimental(ImplicitReflectionSerializer::class)
inline fun <reified T: Any> DocumentSnapshot.parse(): T = DynamicObjectParser().parse(this.data().asDynamic())
