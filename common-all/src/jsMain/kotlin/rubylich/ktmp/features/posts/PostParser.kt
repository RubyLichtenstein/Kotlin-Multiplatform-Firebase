package rubylich.ktmp.features.posts

import rubylich.ktmp.functions.ts2kt_firebase_admin.DocumentSnapshot
import rubylich.ktmp.repo.Parser

actual class PostParser actual constructor() : Parser<Post> {
//    @ImplicitReflectionSerializer
    override fun parse(any: Any): Post {
        val snapshot = (any as DocumentSnapshot)
        return Post(
            id = snapshot.get("id") as String,
            content = snapshot.get("content") as String
        )
//        return (any as DocumentSnapshot).parse()
    }
}
//do to firebase functions deployment bug
//Error: Error occurred while parsing your function triggers. Please ensure that index.js only exports cloud functions.
//@UseExperimental(ImplicitReflectionSerializer::class)
//inline fun <reified T: Any> DocumentSnapshot.parse(): T = DynamicObjectParser().parse(this.data().asDynamic())
