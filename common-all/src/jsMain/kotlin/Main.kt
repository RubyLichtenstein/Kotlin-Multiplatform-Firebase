import rubylich.ktmp.functions.db.posts.dbPostsOnCreate
import rubylich.ktmp.functions.lib.adminInitializeApp

external fun require(module: String): dynamic
external val exports: dynamic
val functions: dynamic by lazy { require("firebase-functions") }
val firebaseAdmin by lazy { require("firebase-admin") }

fun main(args: Array<String>) {
    adminInitializeApp()
//    exports.dbPostsOnDelete = dbPostsOnDelete()
    exports.dbPostsOnCreate = dbPostsOnCreate()
}