package rubylich.ktmp.base

import kotlinx.coroutines.await
import rubylich.ktmp.functions.ts2kt_firebase_admin.Firestore

actual abstract class BaseRepo<T : Any> actual constructor(
    ref: String,
    private val parser: IBaseParser<T>
) : IBaseRepo<T> {
    private val collection = Firestore().collection(ref)

    actual override suspend fun get(id: String): T {
        val documentSnapshot = collection.doc(id).get().await()
        return parser.parse(documentSnapshot)
    }

    actual override suspend fun set(id: String, t: T) {
        collection.doc(id).set(t).await()
    }

    actual override suspend fun delete(id: String) {
        collection.doc(id).delete().await()
    }

    actual override suspend fun update(id: String, field: String, value: Any) {
        collection.doc(id).update(field, value).await()
    }

    actual override suspend fun getAll(): List<T> {
        return collection.get().await().docs.map { parser.parse(it) }
    }
}