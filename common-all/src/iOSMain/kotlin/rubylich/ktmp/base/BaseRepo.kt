package rubylich.ktmp.base

import com.firebase.firestore.FIRFirestore
import rubylich.ktmp.awaitCallback

actual abstract class BaseRepo<T : Any> actual constructor(
        ref: String,
        private val parser: IBaseParser<T>
) : IBaseRepo<T> {

    init {
        //todo move to application
        FIRFirestore.initialize()
    }

    private val collection = FIRFirestore.firestore().collectionWithPath(ref)

    actual override suspend fun getAll(): List<T> {
        return awaitCallback { cont ->
            collection.getDocumentsWithCompletion { document, error ->
                if (error != null) {
                    cont.onError(Exception(error.localizedDescription))
                } else {
                    cont.onComplete(document!!.documents.filterNotNull().map { parser.parse(it) })
                }
            }
        }
    }

    actual override suspend fun get(id: String): T {
        return awaitCallback { cont ->
            collection.documentWithPath(id).getDocumentWithCompletion { document, error ->
                if (error != null) {
                    cont.onError(Exception(error.localizedDescription))
                } else {
                    cont.onComplete(parser.parse(document!!))
                }
            }
        }
    }


    actual override suspend fun set(id: String, t: T) {
//        return awaitCallback {
//            collection.documentWithPath(id).setData(Mapper.map(t) as Map<Any?, *>) { error ->
//
//            }
//        }
        TODO()
    }

    actual override suspend fun delete(id: String) {
        return awaitCallback { cont ->
            collection.documentWithPath(id).deleteDocumentWithCompletion { error ->
                if (error != null) {
                    cont.onError(Exception(error.localizedDescription))
                } else {
                    cont.onComplete(Unit)
                }
            }
        }
    }

    actual override suspend fun update(id: String, field: String, value: Any) {
        return awaitCallback { cont ->
            collection.documentWithPath(id).updateData(mapOf(field to value)) { error ->
                if (error != null) {
                    cont.onError(Exception(error.localizedDescription))
                } else {
                    cont.onComplete(Unit)
                }
            }
        }
    }
}