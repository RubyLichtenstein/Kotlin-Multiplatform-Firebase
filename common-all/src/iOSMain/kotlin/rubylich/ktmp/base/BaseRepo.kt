package rubylich.ktmp.base

import com.firebase.firestore.FIRFirestore

actual abstract class BaseRepo<T : Any> actual constructor(
    ref: String,
    IBaseParser: IBaseParser<T>
) : IBaseRepo<T> {

    init {
        //todo move to application
        FIRFirestore.initialize()
    }

    val collection = FIRFirestore.firestore().collectionWithPath(ref)

    actual override suspend fun getAll(): List<T> {
//        collection.
        TODO()
    }

    actual override suspend fun get(id: String): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual override suspend fun set(id: String, t: T) {
//        collection.documentWithPath(id).setData()
        //todo
    }
    actual override suspend fun delete(id: String) {
        collection.documentWithPath(id).deleteDocument()
    }
    actual override suspend fun update(id: String, field: String, value: Any) {
        collection.documentWithPath(id).updateData(mapOf(field to value))
    }
}