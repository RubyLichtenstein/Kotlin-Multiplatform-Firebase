package common

import com.google.firebase.firestore.FirebaseFirestore

actual abstract class Repo<T : Any> actual constructor(
    ref: String,
    val parser: Parser<T>
) {
    val collection = FirebaseFirestore.getInstance().collection(ref)

    actual suspend fun get(id: String): T {
        val documentSnapshot = collection
            .document(id)
            .get()
            .await()

        return parser.parse(documentSnapshot)
    }

    actual suspend fun set(id: String, t: T) {
        collection
            .document(id)
            .set(t)
            .await()
    }

    actual suspend fun delete(id: String) {
        collection
            .document(id)
            .delete()
            .await()
    }

    actual suspend fun update(id: String, field: String, value: Any) {
        collection
            .document(id)
            .update(field, value)
            .await()
    }

    actual suspend fun getAll(): List<T> =
        collection.get().await().documents.map { parser.parse(it) }
}