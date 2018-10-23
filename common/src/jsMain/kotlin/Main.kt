import db.posts.dbPostsOnCreate
import db.posts.dbPostsOnDelete
import lib.adminInitializeApp

external fun require(module: String): dynamic
external val exports: dynamic
val functions: dynamic by lazy { require("firebase-functions") }
val firebaseAdmin by lazy { require("firebase-admin") }

fun main(args: Array<String>) {
    adminInitializeApp()
    exports.dbPostsOnDelete = dbPostsOnDelete()
    exports.dbPostsOnCreate = dbPostsOnCreate()
}