package rubylich.ktmp.base

import com.google.firebase.firestore.FirebaseFirestore
import rubylich.ktmp.lib.await

actual abstract class BaseRepo<T : Any> actual constructor(
    ref: String,
    private val IBaseParser: IBaseParser<T>
) : IBaseRepo<T> {
    val collection = FirebaseFirestore.getInstance().collection(ref)

    actual override suspend fun get(id: String): T {
        val documentSnapshot = collection
            .document(id)
            .get()
            .await()

        return IBaseParser.parse(documentSnapshot)
    }

    actual override suspend fun set(id: String, t: T) {
        collection
            .document(id)
            .set(t)
            .await()
    }

    actual override suspend fun delete(id: String) {
        collection
            .document(id)
            .delete()
            .await()
    }

    actual override suspend fun update(id: String, field: String, value: Any) {
        collection
            .document(id)
            .update(field, value)
            .await()
    }

    actual override suspend fun getAll(): List<T> =
        collection.get().await().documents.map { IBaseParser.parse(it) }
}