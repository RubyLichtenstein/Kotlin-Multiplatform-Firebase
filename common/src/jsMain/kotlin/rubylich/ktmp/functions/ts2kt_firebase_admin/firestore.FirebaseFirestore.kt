@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("@google-cloud/firestore")
package rubylich.ktmp.functions.ts2kt_firebase_admin

import kotlin.js.*

external interface DocumentData {
    @nativeGetter
    operator fun get(field: String): Any?
    @nativeSetter
    operator fun set(field: String, value: Any)
}
external interface UpdateData {
    @nativeGetter
    operator fun get(fieldPath: String): Any?
    @nativeSetter
    operator fun set(fieldPath: String, value: Any)
}
external fun setLogFunction(logger: (msg: String) -> Unit): Unit = definedExternally
external interface Settings {
    var projectId: String? get() = definedExternally; set(value) = definedExternally
    var keyFilename: String? get() = definedExternally; set(value) = definedExternally
    var timestampsInSnapshots: Boolean? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external open class Firestore(settings: Settings? = definedExternally /* null */) {
    open fun settings(settings: Settings): Unit = definedExternally
    open fun collection(collectionPath: String): CollectionReference = definedExternally
    open fun doc(documentPath: String): DocumentReference = definedExternally
    open fun getAll(vararg documentRef: DocumentReference): Promise<Array<DocumentSnapshot>> = definedExternally
    open fun getCollections(): Promise<Array<CollectionReference>> = definedExternally
    open fun <T> runTransaction(updateFunction: (transaction: Transaction) -> Promise<T>): Promise<T> = definedExternally
    open fun batch(): WriteBatch = definedExternally
}
external open class GeoPoint(latitude: Number, longitude: Number) {
    open var latitude: Number = definedExternally
    open var longitude: Number = definedExternally
    open fun isEqual(other: GeoPoint): Boolean = definedExternally
}
external open class Transaction {
    open fun get(query: Query): Promise<QuerySnapshot> = definedExternally
    open fun get(documentRef: DocumentReference): Promise<DocumentSnapshot> = definedExternally
    open fun getAll(vararg documentRef: DocumentReference): Promise<Array<DocumentSnapshot>> = definedExternally
    open fun create(documentRef: DocumentReference, data: DocumentData): Transaction = definedExternally
    open fun set(documentRef: DocumentReference, data: DocumentData, options: SetOptions? = definedExternally /* null */): Transaction = definedExternally
    open fun update(documentRef: DocumentReference, data: UpdateData, precondition: Precondition? = definedExternally /* null */): Transaction = definedExternally
    open fun update(documentRef: DocumentReference, field: String, value: Any, vararg fieldsOrPrecondition: Any): Transaction = definedExternally
    open fun update(documentRef: DocumentReference, field: FieldPath, value: Any, vararg fieldsOrPrecondition: Any): Transaction = definedExternally
    open fun delete(documentRef: DocumentReference, precondition: Precondition? = definedExternally /* null */): Transaction = definedExternally
}
external open class WriteBatch {
    open fun create(documentRef: DocumentReference, data: DocumentData): WriteBatch = definedExternally
    open fun set(documentRef: DocumentReference, data: DocumentData, options: SetOptions? = definedExternally /* null */): WriteBatch = definedExternally
    open fun update(documentRef: DocumentReference, data: UpdateData, precondition: Precondition? = definedExternally /* null */): WriteBatch = definedExternally
    open fun update(documentRef: DocumentReference, field: String, value: Any, vararg fieldsOrPrecondition: Any): WriteBatch = definedExternally
    open fun update(documentRef: DocumentReference, field: FieldPath, value: Any, vararg fieldsOrPrecondition: Any): WriteBatch = definedExternally
    open fun delete(documentRef: DocumentReference, precondition: Precondition? = definedExternally /* null */): WriteBatch = definedExternally
    open fun commit(): Promise<Array<WriteResult>> = definedExternally
}
external interface Precondition {
    var lastUpdateTime: Timestamp? get() = definedExternally; set(value) = definedExternally
}
external interface SetOptions {
    var merge: Boolean? get() = definedExternally; set(value) = definedExternally
    var mergeFields: Array<dynamic /* String | FieldPath */>? get() = definedExternally; set(value) = definedExternally
}
external open class WriteResult {
    open var writeTime: Timestamp = definedExternally
    open fun isEqual(other: WriteResult): Boolean = definedExternally
}
external open class DocumentReference {
    open var id: String = definedExternally
    open var firestore: Firestore = definedExternally
    open var parent: CollectionReference = definedExternally
    open var path: String = definedExternally
    open fun collection(collectionPath: String): CollectionReference = definedExternally
    open fun getCollections(): Promise<Array<CollectionReference>> = definedExternally
    open fun create(data: DocumentData): Promise<WriteResult> = definedExternally
    open fun set(data: dynamic, options: SetOptions? = definedExternally /* null */): Promise<WriteResult> = definedExternally
    open fun update(data: UpdateData, precondition: Precondition? = definedExternally /* null */): Promise<WriteResult> = definedExternally
    open fun update(field: String, value: Any, vararg moreFieldsOrPrecondition: Any): Promise<WriteResult> = definedExternally
    open fun update(field: FieldPath, value: Any, vararg moreFieldsOrPrecondition: Any): Promise<WriteResult> = definedExternally
    open fun delete(precondition: Precondition? = definedExternally /* null */): Promise<WriteResult> = definedExternally
    open fun get(): Promise<DocumentSnapshot> = definedExternally
    open fun onSnapshot(onNext: (snapshot: DocumentSnapshot) -> Unit, onError: ((error: Error) -> Unit)? = definedExternally /* null */): () -> Unit = definedExternally
    open fun isEqual(other: DocumentReference): Boolean = definedExternally
}
external open class DocumentSnapshot {
    open var exists: Boolean = definedExternally
    open var ref: DocumentReference = definedExternally
    open var id: String = definedExternally
    open var createTime: Timestamp = definedExternally
    open var updateTime: Timestamp = definedExternally
    open var readTime: Timestamp = definedExternally
    open fun data(): DocumentData? = definedExternally
    open fun get(fieldPath: String): Any = definedExternally
    open fun get(fieldPath: FieldPath): Any = definedExternally
    open fun isEqual(other: DocumentSnapshot): Boolean = definedExternally
}
external open class QueryDocumentSnapshot : DocumentSnapshot {
    override var createTime: Timestamp = definedExternally
    override var updateTime: Timestamp = definedExternally
    override fun data(): DocumentData = definedExternally
}
external open class Query {
    open var firestore: Firestore = definedExternally
    open fun where(fieldPath: String, opStr: dynamic /* String /* "<" */ | String /* "<=" */ | String /* "==" */ | String /* ">=" */ | String /* ">" */ | String /* "array-contains" */ */, value: Any): Query = definedExternally
    open fun where(fieldPath: FieldPath, opStr: dynamic /* String /* "<" */ | String /* "<=" */ | String /* "==" */ | String /* ">=" */ | String /* ">" */ | String /* "array-contains" */ */, value: Any): Query = definedExternally
    open fun orderBy(fieldPath: String, directionStr: String? /* "desc" */ = definedExternally /* null */): Query = definedExternally
    open fun orderBy(fieldPath: String, directionStr: String? /* "asc" */ = definedExternally /* null */): Query = definedExternally
    open fun orderBy(fieldPath: FieldPath, directionStr: String? /* "desc" */ = definedExternally /* null */): Query = definedExternally
    open fun orderBy(fieldPath: FieldPath, directionStr: String? /* "asc" */ = definedExternally /* null */): Query = definedExternally
    open fun limit(limit: Number): Query = definedExternally
    open fun offset(offset: Number): Query = definedExternally
    open fun select(vararg field: String): Query = definedExternally
    open fun select(vararg field: FieldPath): Query = definedExternally
    open fun startAt(snapshot: DocumentSnapshot): Query = definedExternally
    open fun startAt(vararg fieldValues: Any): Query = definedExternally
    open fun startAfter(snapshot: DocumentSnapshot): Query = definedExternally
    open fun startAfter(vararg fieldValues: Any): Query = definedExternally
    open fun endBefore(snapshot: DocumentSnapshot): Query = definedExternally
    open fun endBefore(vararg fieldValues: Any): Query = definedExternally
    open fun endAt(snapshot: DocumentSnapshot): Query = definedExternally
    open fun endAt(vararg fieldValues: Any): Query = definedExternally
    open fun get(): Promise<QuerySnapshot> = definedExternally
//    open fun stream(): Node.ReadableStream = definedExternally
    open fun onSnapshot(onNext: (snapshot: QuerySnapshot) -> Unit, onError: ((error: Error) -> Unit)? = definedExternally /* null */): () -> Unit = definedExternally
    open fun isEqual(other: Query): Boolean = definedExternally
    open fun orderBy(fieldPath: String): Query = definedExternally
    open fun orderBy(fieldPath: FieldPath): Query = definedExternally
}
external open class QuerySnapshot {
    open var query: Query = definedExternally
    open var docChanges: Array<DocumentChange> = definedExternally
    open var docs: Array<QueryDocumentSnapshot> = definedExternally
    open var size: Number = definedExternally
    open var empty: Boolean = definedExternally
    open var readTime: Timestamp = definedExternally
    open fun forEach(callback: (result: QueryDocumentSnapshot) -> Unit, thisArg: Any? = definedExternally /* null */): Unit = definedExternally
    open fun isEqual(other: QuerySnapshot): Boolean = definedExternally
}
external interface DocumentChange {
    var type: dynamic /* String /* "added" */ | String /* "removed" */ | String /* "modified" */ */
    var doc: QueryDocumentSnapshot
    var oldIndex: Number
    var newIndex: Number
    fun isEqual(other: DocumentChange): Boolean
}
external open class CollectionReference : Query {
    open var id: String = definedExternally
    open var parent: DocumentReference? = definedExternally
    open var path: String = definedExternally
    open fun doc(documentPath: String? = definedExternally /* null */): DocumentReference = definedExternally
    open fun add(data: DocumentData): Promise<DocumentReference> = definedExternally
    open fun isEqual(other: CollectionReference): Boolean = definedExternally
}
external open class FieldValue {
    open fun isEqual(other: FieldValue): Boolean = definedExternally
    companion object {
        fun serverTimestamp(): FieldValue = definedExternally
        fun delete(): FieldValue = definedExternally
        fun arrayUnion(vararg elements: Any): FieldValue = definedExternally
        fun arrayRemove(vararg elements: Any): FieldValue = definedExternally
    }
}
external open class FieldPath(vararg fieldNames: String) {
    open fun isEqual(other: FieldPath): Boolean = definedExternally
    companion object {
        fun documentId(): FieldPath = definedExternally
    }
}
external open class Timestamp(seconds: Number, nanoseconds: Number) {
    open var seconds: Number = definedExternally
    open var nanoseconds: Number = definedExternally
    open fun toDate(): Date = definedExternally
    open fun toMillis(): Number = definedExternally
    open fun isEqual(other: Timestamp): Boolean = definedExternally
    companion object {
        fun now(): Timestamp = definedExternally
        fun fromDate(date: Date): Timestamp = definedExternally
        fun fromMillis(milliseconds: Number): Timestamp = definedExternally
    }
}
