package common

import kotlinx.coroutines.await
import ts2kt_firebase_admin.Firestore

actual abstract class Repo<T : Any> actual constructor(
    ref: String,
    private val parser: Parser<T>
) {
    private val collection = Firestore().collection(ref)

    actual suspend fun get(id: String): T {
        val documentSnapshot = collection.doc(id).get().await()
        return parser.parse(documentSnapshot)
    }

    actual suspend fun set(id: String, t: T) {
        collection.doc(id).set(t).await()
    }

    actual suspend fun delete(id: String) {
        collection.doc(id).delete().await()
    }

    actual suspend fun update(id: String, field: String, value: Any) {
        collection.doc(id).update(field, value).await()
    }

    //todo test
    actual suspend fun getAll(): List<T> {
        return collection.get().await().docs.map { parser.parse(it) }
    }
}