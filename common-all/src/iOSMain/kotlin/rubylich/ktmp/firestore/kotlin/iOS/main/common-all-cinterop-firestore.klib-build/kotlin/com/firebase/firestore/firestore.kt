@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "CONFLICTING_OVERLOADS", "RETURN_TYPE_MISMATCH_ON_INHERITANCE", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "WRONG_MODIFIER_CONTAINING_DECLARATION", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UNUSED_PARAMETER", "MANY_IMPL_MEMBER_NOT_IMPLEMENTED", "MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED", "EXTENSION_SHADOWED_BY_MEMBER", "REDUNDANT_NULLABLE", "DEPRECATION")
package com.firebase.firestore

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs._NSZone
import kotlin.collections.List
import kotlin.collections.Map
import platform.Foundation.NSComparisonResult
import platform.Foundation.NSCopyingProtocol
import platform.Foundation.NSCopyingProtocolMeta
import platform.Foundation.NSDate
import platform.Foundation.NSError
import platform.Foundation.NSPredicate
import platform.Foundation.NSZone
import platform.darwin.NSInteger
import platform.darwin.NSIntegerVar
import platform.darwin.NSObject
import platform.darwin.NSObjectMeta
import platform.darwin.NSObjectProtocol
import platform.darwin.NSObjectProtocolMeta
import platform.darwin.NSUInteger
import platform.darwin.NSUIntegerVar
import platform.darwin.dispatch_queue_t
import platform.posix.int32_t
import platform.posix.int64_t

// NOTE THIS FILE IS AUTO-GENERATED

@ExternalObjCClass("kniprot_com_firebase_firestore0") interface FIRListenerRegistrationProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_firebase_firestore0") interface FIRListenerRegistrationProtocol : NSObjectProtocol {
    
    @ObjCMethod("remove", "objcKniBridge2")
    fun remove(): Unit
}

@ExternalObjCClass open class FIRQuerySnapshotMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge4")
    external override fun new(): FIRQuerySnapshot?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge6")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRQuerySnapshot?
    
    @ObjCMethod("alloc", "objcKniBridge8")
    external override fun alloc(): FIRQuerySnapshot?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRQuerySnapshot : NSObject {
    companion object : FIRQuerySnapshotMeta(), ObjCClassOf<FIRQuerySnapshot> {}
    
    val query: FIRQuery
        get() = objcKniBridge12(nativeNullPtr, this.objcPtr())
    
    val metadata: FIRSnapshotMetadata
        get() = objcKniBridge14(nativeNullPtr, this.objcPtr())
    
    val empty: Boolean
        get() = objcKniBridge16(nativeNullPtr, this.objcPtr())
    
    val count: NSInteger
        get() = objcKniBridge18(nativeNullPtr, this.objcPtr())
    
    val documents: List<*>
        get() = objcKniBridge20(nativeNullPtr, this.objcPtr())
    
    val documentChanges: List<*>
        get() = objcKniBridge22(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("documentChangesWithIncludeMetadataChanges:", "objcKniBridge10")
    external open fun documentChangesWithIncludeMetadataChanges(includeMetadataChanges: Boolean): List<*>
    
    @ObjCMethod("query", "objcKniBridge12")
    external open fun query(): FIRQuery
    
    @ObjCMethod("metadata", "objcKniBridge14")
    external open fun metadata(): FIRSnapshotMetadata
    
    @ObjCMethod("isEmpty", "objcKniBridge16")
    external open fun isEmpty(): Boolean
    
    @ObjCMethod("count", "objcKniBridge18")
    external open fun count(): NSInteger
    
    @ObjCMethod("documents", "objcKniBridge20")
    external open fun documents(): List<*>
    
    @ObjCMethod("documentChanges", "objcKniBridge22")
    external open fun documentChanges(): List<*>
    
    @ObjCMethod("init", "objcKniBridge24")
    external override fun init(): FIRQuerySnapshot?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRQueryMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge26")
    external override fun new(): FIRQuery?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge28")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRQuery?
    
    @ObjCMethod("alloc", "objcKniBridge30")
    external override fun alloc(): FIRQuery?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRQuery : NSObject {
    companion object : FIRQueryMeta(), ObjCClassOf<FIRQuery> {}
    
    val firestore: FIRFirestore
        get() = objcKniBridge92(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("getDocumentsWithCompletion:", "objcKniBridge32")
    external open fun getDocumentsWithCompletion(completion: FIRQuerySnapshotBlock?): Unit
    
    @ObjCMethod("getDocumentsWithSource:completion:", "objcKniBridge34")
    external open fun getDocumentsWithSource(source: FIRFirestoreSource, completion: FIRQuerySnapshotBlock?): Unit
    
    @ObjCMethod("addSnapshotListener:", "objcKniBridge36")
    external open fun addSnapshotListener(listener: FIRQuerySnapshotBlock?): FIRListenerRegistrationProtocol
    
    @ObjCMethod("addSnapshotListenerWithIncludeMetadataChanges:listener:", "objcKniBridge38")
    external open fun addSnapshotListenerWithIncludeMetadataChanges(includeMetadataChanges: Boolean, listener: FIRQuerySnapshotBlock?): FIRListenerRegistrationProtocol
    
    @ObjCMethod("queryWhereField:isEqualTo:", "objcKniBridge40")
    external open fun queryWhereField(field: String, isEqualTo: Any): FIRQuery
    
    @ObjCMethod("queryWhereFieldPath:isEqualTo:", "objcKniBridge42")
    external open fun queryWhereFieldPath(path: FIRFieldPath, isEqualTo: Any): FIRQuery
    
    @ObjCMethod("queryWhereField:isLessThan:", "objcKniBridge44")
    external open fun queryWhereField(field: String, isLessThan: Any): FIRQuery
    
    @ObjCMethod("queryWhereFieldPath:isLessThan:", "objcKniBridge46")
    external open fun queryWhereFieldPath(path: FIRFieldPath, isLessThan: Any): FIRQuery
    
    @ObjCMethod("queryWhereField:isLessThanOrEqualTo:", "objcKniBridge48")
    external open fun queryWhereField(field: String, isLessThanOrEqualTo: Any): FIRQuery
    
    @ObjCMethod("queryWhereFieldPath:isLessThanOrEqualTo:", "objcKniBridge50")
    external open fun queryWhereFieldPath(path: FIRFieldPath, isLessThanOrEqualTo: Any): FIRQuery
    
    @ObjCMethod("queryWhereField:isGreaterThan:", "objcKniBridge52")
    external open fun queryWhereField(field: String, isGreaterThan: Any): FIRQuery
    
    @ObjCMethod("queryWhereFieldPath:isGreaterThan:", "objcKniBridge54")
    external open fun queryWhereFieldPath(path: FIRFieldPath, isGreaterThan: Any): FIRQuery
    
    @ObjCMethod("queryWhereField:isGreaterThanOrEqualTo:", "objcKniBridge56")
    external open fun queryWhereField(field: String, isGreaterThanOrEqualTo: Any): FIRQuery
    
    @ObjCMethod("queryWhereFieldPath:isGreaterThanOrEqualTo:", "objcKniBridge58")
    external open fun queryWhereFieldPath(path: FIRFieldPath, isGreaterThanOrEqualTo: Any): FIRQuery
    
    @ObjCMethod("queryWhereField:arrayContains:", "objcKniBridge60")
    external open fun queryWhereField(field: String, arrayContains: Any): FIRQuery
    
    @ObjCMethod("queryWhereFieldPath:arrayContains:", "objcKniBridge62")
    external open fun queryWhereFieldPath(path: FIRFieldPath, arrayContains: Any): FIRQuery
    
    @ObjCMethod("queryFilteredUsingPredicate:", "objcKniBridge64")
    external open fun queryFilteredUsingPredicate(predicate: NSPredicate): FIRQuery
    
    @ObjCMethod("queryOrderedByField:", "objcKniBridge66")
    external open fun queryOrderedByField(field: String): FIRQuery
    
    @ObjCMethod("queryOrderedByFieldPath:", "objcKniBridge68")
    external open fun queryOrderedByFieldPath(path: FIRFieldPath): FIRQuery
    
    @ObjCMethod("queryOrderedByField:descending:", "objcKniBridge70")
    external open fun queryOrderedByField(field: String, descending: Boolean): FIRQuery
    
    @ObjCMethod("queryOrderedByFieldPath:descending:", "objcKniBridge72")
    external open fun queryOrderedByFieldPath(path: FIRFieldPath, descending: Boolean): FIRQuery
    
    @ObjCMethod("queryLimitedTo:", "objcKniBridge74")
    external open fun queryLimitedTo(limit: NSInteger): FIRQuery
    
    @ObjCMethod("queryStartingAtDocument:", "objcKniBridge76")
    external open fun queryStartingAtDocument(document: FIRDocumentSnapshot): FIRQuery
    
    @ObjCMethod("queryStartingAtValues:", "objcKniBridge78")
    external open fun queryStartingAtValues(fieldValues: List<*>): FIRQuery
    
    @ObjCMethod("queryStartingAfterDocument:", "objcKniBridge80")
    external open fun queryStartingAfterDocument(document: FIRDocumentSnapshot): FIRQuery
    
    @ObjCMethod("queryStartingAfterValues:", "objcKniBridge82")
    external open fun queryStartingAfterValues(fieldValues: List<*>): FIRQuery
    
    @ObjCMethod("queryEndingBeforeDocument:", "objcKniBridge84")
    external open fun queryEndingBeforeDocument(document: FIRDocumentSnapshot): FIRQuery
    
    @ObjCMethod("queryEndingBeforeValues:", "objcKniBridge86")
    external open fun queryEndingBeforeValues(fieldValues: List<*>): FIRQuery
    
    @ObjCMethod("queryEndingAtDocument:", "objcKniBridge88")
    external open fun queryEndingAtDocument(document: FIRDocumentSnapshot): FIRQuery
    
    @ObjCMethod("queryEndingAtValues:", "objcKniBridge90")
    external open fun queryEndingAtValues(fieldValues: List<*>): FIRQuery
    
    @ObjCMethod("firestore", "objcKniBridge92")
    external open fun firestore(): FIRFirestore
    
    @ObjCMethod("init", "objcKniBridge94")
    external override fun init(): FIRQuery?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRFieldPathMeta : NSObjectMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("documentID", "objcKniBridge96")
    external open fun documentID(): FIRFieldPath
    
    @ObjCMethod("new", "objcKniBridge98")
    external override fun new(): FIRFieldPath?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge100")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRFieldPath?
    
    @ObjCMethod("alloc", "objcKniBridge102")
    external override fun alloc(): FIRFieldPath?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRFieldPath : NSObject, NSCopyingProtocol {
    companion object : FIRFieldPathMeta(), ObjCClassOf<FIRFieldPath> {}
    
    @ObjCMethod("initWithFields:", "objcKniBridge104")
    external open fun initWithFields(fieldNames: List<*>): FIRFieldPath
    
    @ObjCConstructor("initWithFields:", true)
    constructor(fields: List<*>) {}
    
    @ObjCMethod("init", "objcKniBridge106")
    external override fun init(): FIRFieldPath?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("copyWithZone:", "objcKniBridge108")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

@ExternalObjCClass open class FIRDocumentSnapshotMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge110")
    external override fun new(): FIRDocumentSnapshot?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge112")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRDocumentSnapshot?
    
    @ObjCMethod("alloc", "objcKniBridge114")
    external override fun alloc(): FIRDocumentSnapshot?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRDocumentSnapshot : NSObject {
    companion object : FIRDocumentSnapshotMeta(), ObjCClassOf<FIRDocumentSnapshot> {}
    
    val exists: Boolean
        get() = objcKniBridge126(nativeNullPtr, this.objcPtr())
    
    val reference: FIRDocumentReference
        get() = objcKniBridge128(nativeNullPtr, this.objcPtr())
    
    val documentID: String
        get() = objcKniBridge130(nativeNullPtr, this.objcPtr())
    
    val metadata: FIRSnapshotMetadata
        get() = objcKniBridge132(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("data", "objcKniBridge116")
    external open fun data(): Map<Any?, *>?
    
    @ObjCMethod("dataWithServerTimestampBehavior:", "objcKniBridge118")
    external open fun dataWithServerTimestampBehavior(serverTimestampBehavior: FIRServerTimestampBehavior): Map<Any?, *>?
    
    @ObjCMethod("valueForField:", "objcKniBridge120")
    external open fun valueForField(field: Any): Any?
    
    @ObjCMethod("valueForField:serverTimestampBehavior:", "objcKniBridge122")
    external open fun valueForField(field: Any, serverTimestampBehavior: FIRServerTimestampBehavior): Any?
    
    @ObjCMethod("objectForKeyedSubscript:", "objcKniBridge124")
    external open fun objectForKeyedSubscript(key: Any): Any?
    
    @ObjCMethod("exists", "objcKniBridge126")
    external open fun exists(): Boolean
    
    @ObjCMethod("reference", "objcKniBridge128")
    external open fun reference(): FIRDocumentReference
    
    @ObjCMethod("documentID", "objcKniBridge130")
    external open fun documentID(): String
    
    @ObjCMethod("metadata", "objcKniBridge132")
    external open fun metadata(): FIRSnapshotMetadata
    
    @ObjCMethod("init", "objcKniBridge134")
    external override fun init(): FIRDocumentSnapshot?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRDocumentReferenceMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge136")
    external override fun new(): FIRDocumentReference?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge138")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRDocumentReference?
    
    @ObjCMethod("alloc", "objcKniBridge140")
    external override fun alloc(): FIRDocumentReference?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRDocumentReference : NSObject {
    companion object : FIRDocumentReferenceMeta(), ObjCClassOf<FIRDocumentReference> {}
    
    val documentID: String
        get() = objcKniBridge172(nativeNullPtr, this.objcPtr())
    
    val parent: FIRCollectionReference
        get() = objcKniBridge174(nativeNullPtr, this.objcPtr())
    
    val firestore: FIRFirestore
        get() = objcKniBridge176(nativeNullPtr, this.objcPtr())
    
    val path: String
        get() = objcKniBridge178(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("collectionWithPath:", "objcKniBridge142")
    external open fun collectionWithPath(collectionPath: String): FIRCollectionReference
    
    @ObjCMethod("setData:", "objcKniBridge144")
    external open fun setData(documentData: Map<Any?, *>): Unit
    
    @ObjCMethod("setData:merge:", "objcKniBridge146")
    external open fun setData(documentData: Map<Any?, *>, merge: Boolean): Unit
    
    @ObjCMethod("setData:mergeFields:", "objcKniBridge148")
    external open fun setData(documentData: Map<Any?, *>, mergeFields: List<*>): Unit
    
    @ObjCMethod("setData:completion:", "objcKniBridge150")
    external open fun setData(documentData: Map<Any?, *>, completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("setData:merge:completion:", "objcKniBridge152")
    external open fun setData(documentData: Map<Any?, *>, merge: Boolean, completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("setData:mergeFields:completion:", "objcKniBridge154")
    external open fun setData(documentData: Map<Any?, *>, mergeFields: List<*>, completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("updateData:", "objcKniBridge156")
    external open fun updateData(fields: Map<Any?, *>): Unit
    
    @ObjCMethod("updateData:completion:", "objcKniBridge158")
    external open fun updateData(fields: Map<Any?, *>, completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("deleteDocument", "objcKniBridge160")
    external open fun deleteDocument(): Unit
    
    @ObjCMethod("deleteDocumentWithCompletion:", "objcKniBridge162")
    external open fun deleteDocumentWithCompletion(completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("getDocumentWithCompletion:", "objcKniBridge164")
    external open fun getDocumentWithCompletion(completion: FIRDocumentSnapshotBlock?): Unit
    
    @ObjCMethod("getDocumentWithSource:completion:", "objcKniBridge166")
    external open fun getDocumentWithSource(source: FIRFirestoreSource, completion: FIRDocumentSnapshotBlock?): Unit
    
    @ObjCMethod("addSnapshotListener:", "objcKniBridge168")
    external open fun addSnapshotListener(listener: FIRDocumentSnapshotBlock?): FIRListenerRegistrationProtocol
    
    @ObjCMethod("addSnapshotListenerWithIncludeMetadataChanges:listener:", "objcKniBridge170")
    external open fun addSnapshotListenerWithIncludeMetadataChanges(includeMetadataChanges: Boolean, listener: FIRDocumentSnapshotBlock?): FIRListenerRegistrationProtocol
    
    @ObjCMethod("documentID", "objcKniBridge172")
    external open fun documentID(): String
    
    @ObjCMethod("parent", "objcKniBridge174")
    external open fun parent(): FIRCollectionReference
    
    @ObjCMethod("firestore", "objcKniBridge176")
    external open fun firestore(): FIRFirestore
    
    @ObjCMethod("path", "objcKniBridge178")
    external open fun path(): String
    
    @ObjCMethod("init", "objcKniBridge180")
    external override fun init(): FIRDocumentReference?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRCollectionReferenceMeta : FIRQueryMeta {
    
    @ObjCMethod("new", "objcKniBridge182")
    external override fun new(): FIRCollectionReference?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge184")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRCollectionReference?
    
    @ObjCMethod("alloc", "objcKniBridge186")
    external override fun alloc(): FIRCollectionReference?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRCollectionReference : FIRQuery {
    companion object : FIRCollectionReferenceMeta(), ObjCClassOf<FIRCollectionReference> {}
    
    val collectionID: String
        get() = objcKniBridge196(nativeNullPtr, this.objcPtr())
    
    val parent: FIRDocumentReference?
        get() = objcKniBridge198(nativeNullPtr, this.objcPtr())
    
    val path: String
        get() = objcKniBridge200(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("documentWithAutoID", "objcKniBridge188")
    external open fun documentWithAutoID(): FIRDocumentReference
    
    @ObjCMethod("documentWithPath:", "objcKniBridge190")
    external open fun documentWithPath(documentPath: String): FIRDocumentReference
    
    @ObjCMethod("addDocumentWithData:", "objcKniBridge192")
    external open fun addDocumentWithData(data: Map<Any?, *>): FIRDocumentReference
    
    @ObjCMethod("addDocumentWithData:completion:", "objcKniBridge194")
    external open fun addDocumentWithData(data: Map<Any?, *>, completion: ((NSError?) -> Unit)?): FIRDocumentReference
    
    @ObjCMethod("collectionID", "objcKniBridge196")
    external open fun collectionID(): String
    
    @ObjCMethod("parent", "objcKniBridge198")
    external open fun parent(): FIRDocumentReference?
    
    @ObjCMethod("path", "objcKniBridge200")
    external open fun path(): String
    
    @ObjCMethod("init", "objcKniBridge202")
    external override fun init(): FIRCollectionReference?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRFirestoreMeta : NSObjectMeta {
    
    @ObjCMethod("firestore", "objcKniBridge204")
    external open fun firestore(): FIRFirestore
    
    @ObjCMethod("firestoreForApp:", "objcKniBridge206")
    external open fun firestoreForApp(app: objcnames.classes.FIRApp): FIRFirestore
    
    @ObjCMethod("enableLogging:", "objcKniBridge208")
    external open fun enableLogging(logging: Boolean): Unit
    
    @ObjCMethod("new", "objcKniBridge210")
    external override fun new(): FIRFirestore?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge212")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRFirestore?
    
    @ObjCMethod("alloc", "objcKniBridge214")
    external override fun alloc(): FIRFirestore?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRFirestore : NSObject {
    companion object : FIRFirestoreMeta(), ObjCClassOf<FIRFirestore> {}
    
    var settings: FIRFirestoreSettings
        get() = objcKniBridge228(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge230(nativeNullPtr, this.objcPtr(), value)
    
    val app: objcnames.classes.FIRApp
        get() = objcKniBridge232(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("collectionWithPath:", "objcKniBridge216")
    external open fun collectionWithPath(collectionPath: String): FIRCollectionReference
    
    @ObjCMethod("documentWithPath:", "objcKniBridge218")
    external open fun documentWithPath(documentPath: String): FIRDocumentReference
    
    @ObjCMethod("runTransactionWithBlock:completion:", "objcKniBridge220")
    external open fun runTransactionWithBlock(updateBlock: (FIRTransaction?, CPointer<ObjCObjectVar<NSError?>>?) -> Any?, completion: (Any?, NSError?) -> Unit): Unit
    
    @ObjCMethod("batch", "objcKniBridge222")
    external open fun batch(): FIRWriteBatch
    
    @ObjCMethod("enableNetworkWithCompletion:", "objcKniBridge224")
    external open fun enableNetworkWithCompletion(completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("disableNetworkWithCompletion:", "objcKniBridge226")
    external open fun disableNetworkWithCompletion(completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("settings", "objcKniBridge228")
    external open fun settings(): FIRFirestoreSettings
    
    @ObjCMethod("setSettings:", "objcKniBridge230")
    external open fun setSettings(settings: FIRFirestoreSettings): Unit
    
    @ObjCMethod("app", "objcKniBridge232")
    external open fun app(): objcnames.classes.FIRApp
    
    @ObjCMethod("init", "objcKniBridge234")
    external override fun init(): FIRFirestore?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRTransactionMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge236")
    external override fun new(): FIRTransaction?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge238")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRTransaction?
    
    @ObjCMethod("alloc", "objcKniBridge240")
    external override fun alloc(): FIRTransaction?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRTransaction : NSObject {
    companion object : FIRTransactionMeta(), ObjCClassOf<FIRTransaction> {}
    
    @ObjCMethod("setData:forDocument:", "objcKniBridge242")
    external open fun setData(data: Map<Any?, *>, forDocument: FIRDocumentReference): FIRTransaction
    
    @ObjCMethod("setData:forDocument:merge:", "objcKniBridge244")
    external open fun setData(data: Map<Any?, *>, forDocument: FIRDocumentReference, merge: Boolean): FIRTransaction
    
    @ObjCMethod("setData:forDocument:mergeFields:", "objcKniBridge246")
    external open fun setData(data: Map<Any?, *>, forDocument: FIRDocumentReference, mergeFields: List<*>): FIRTransaction
    
    @ObjCMethod("updateData:forDocument:", "objcKniBridge248")
    external open fun updateData(fields: Map<Any?, *>, forDocument: FIRDocumentReference): FIRTransaction
    
    @ObjCMethod("deleteDocument:", "objcKniBridge250")
    external open fun deleteDocument(document: FIRDocumentReference): FIRTransaction
    
    @ObjCMethod("getDocument:error:", "objcKniBridge252")
    external open fun getDocument(document: FIRDocumentReference, error: CPointer<ObjCObjectVar<NSError?>>?): FIRDocumentSnapshot?
    
    @ObjCMethod("init", "objcKniBridge254")
    external override fun init(): FIRTransaction?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRWriteBatchMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge256")
    external override fun new(): FIRWriteBatch?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge258")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRWriteBatch?
    
    @ObjCMethod("alloc", "objcKniBridge260")
    external override fun alloc(): FIRWriteBatch?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRWriteBatch : NSObject {
    companion object : FIRWriteBatchMeta(), ObjCClassOf<FIRWriteBatch> {}
    
    @ObjCMethod("setData:forDocument:", "objcKniBridge262")
    external open fun setData(data: Map<Any?, *>, forDocument: FIRDocumentReference): FIRWriteBatch
    
    @ObjCMethod("setData:forDocument:merge:", "objcKniBridge264")
    external open fun setData(data: Map<Any?, *>, forDocument: FIRDocumentReference, merge: Boolean): FIRWriteBatch
    
    @ObjCMethod("setData:forDocument:mergeFields:", "objcKniBridge266")
    external open fun setData(data: Map<Any?, *>, forDocument: FIRDocumentReference, mergeFields: List<*>): FIRWriteBatch
    
    @ObjCMethod("updateData:forDocument:", "objcKniBridge268")
    external open fun updateData(fields: Map<Any?, *>, forDocument: FIRDocumentReference): FIRWriteBatch
    
    @ObjCMethod("deleteDocument:", "objcKniBridge270")
    external open fun deleteDocument(document: FIRDocumentReference): FIRWriteBatch
    
    @ObjCMethod("commit", "objcKniBridge272")
    external open fun commit(): Unit
    
    @ObjCMethod("commitWithCompletion:", "objcKniBridge274")
    external open fun commitWithCompletion(completion: ((NSError?) -> Unit)?): Unit
    
    @ObjCMethod("init", "objcKniBridge276")
    external override fun init(): FIRWriteBatch?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRFirestoreSettingsMeta : NSObjectMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("new", "objcKniBridge278")
    external override fun new(): FIRFirestoreSettings?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge280")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRFirestoreSettings?
    
    @ObjCMethod("alloc", "objcKniBridge282")
    external override fun alloc(): FIRFirestoreSettings?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRFirestoreSettings : NSObject, NSCopyingProtocol {
    companion object : FIRFirestoreSettingsMeta(), ObjCClassOf<FIRFirestoreSettings> {}
    
    var host: String
        get() = objcKniBridge286(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge288(nativeNullPtr, this.objcPtr(), value)
    
    var sslEnabled: Boolean
        get() = objcKniBridge290(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge292(nativeNullPtr, this.objcPtr(), value)
    
    var dispatchQueue: dispatch_queue_t?
        get() = objcKniBridge294(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge296(nativeNullPtr, this.objcPtr(), value)
    
    var persistenceEnabled: Boolean
        get() = objcKniBridge298(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge300(nativeNullPtr, this.objcPtr(), value)
    
    var timestampsInSnapshotsEnabled: Boolean
        get() = objcKniBridge302(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge304(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("init", "objcKniBridge284")
    external override fun init(): FIRFirestoreSettings
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("host", "objcKniBridge286")
    external open fun host(): String
    
    @ObjCMethod("setHost:", "objcKniBridge288")
    external open fun setHost(host: String): Unit
    
    @ObjCMethod("isSSLEnabled", "objcKniBridge290")
    external open fun isSSLEnabled(): Boolean
    
    @ObjCMethod("setSslEnabled:", "objcKniBridge292")
    external open fun setSslEnabled(sslEnabled: Boolean): Unit
    
    @ObjCMethod("dispatchQueue", "objcKniBridge294")
    external open fun dispatchQueue(): dispatch_queue_t?
    
    @ObjCMethod("setDispatchQueue:", "objcKniBridge296")
    external open fun setDispatchQueue(dispatchQueue: dispatch_queue_t?): Unit
    
    @ObjCMethod("isPersistenceEnabled", "objcKniBridge298")
    external open fun isPersistenceEnabled(): Boolean
    
    @ObjCMethod("setPersistenceEnabled:", "objcKniBridge300")
    external open fun setPersistenceEnabled(persistenceEnabled: Boolean): Unit
    
    @ObjCMethod("areTimestampsInSnapshotsEnabled", "objcKniBridge302")
    external open fun areTimestampsInSnapshotsEnabled(): Boolean
    
    @ObjCMethod("setTimestampsInSnapshotsEnabled:", "objcKniBridge304")
    external open fun setTimestampsInSnapshotsEnabled(timestampsInSnapshotsEnabled: Boolean): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge306")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

@ExternalObjCClass open class FIRSnapshotMetadataMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge308")
    external override fun new(): FIRSnapshotMetadata?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge310")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRSnapshotMetadata?
    
    @ObjCMethod("alloc", "objcKniBridge312")
    external override fun alloc(): FIRSnapshotMetadata?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRSnapshotMetadata : NSObject {
    companion object : FIRSnapshotMetadataMeta(), ObjCClassOf<FIRSnapshotMetadata> {}
    
    val pendingWrites: Boolean
        get() = objcKniBridge314(nativeNullPtr, this.objcPtr())
    
    val fromCache: Boolean
        get() = objcKniBridge316(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("hasPendingWrites", "objcKniBridge314")
    external open fun hasPendingWrites(): Boolean
    
    @ObjCMethod("isFromCache", "objcKniBridge316")
    external open fun isFromCache(): Boolean
    
    @ObjCMethod("init", "objcKniBridge318")
    external override fun init(): FIRSnapshotMetadata?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRDocumentChangeMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge320")
    external override fun new(): FIRDocumentChange?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge322")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRDocumentChange?
    
    @ObjCMethod("alloc", "objcKniBridge324")
    external override fun alloc(): FIRDocumentChange?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRDocumentChange : NSObject {
    companion object : FIRDocumentChangeMeta(), ObjCClassOf<FIRDocumentChange> {}
    
    val type: FIRDocumentChangeType
        get() = objcKniBridge326(nativeNullPtr, this.objcPtr())
    
    val document: FIRQueryDocumentSnapshot
        get() = objcKniBridge328(nativeNullPtr, this.objcPtr())
    
    val oldIndex: NSUInteger
        get() = objcKniBridge330(nativeNullPtr, this.objcPtr())
    
    val newIndex: NSUInteger
        get() = objcKniBridge332(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("type", "objcKniBridge326")
    external open fun type(): FIRDocumentChangeType
    
    @ObjCMethod("document", "objcKniBridge328")
    external open fun document(): FIRQueryDocumentSnapshot
    
    @ObjCMethod("oldIndex", "objcKniBridge330")
    external open fun oldIndex(): NSUInteger
    
    @ObjCMethod("newIndex", "objcKniBridge332")
    external open fun newIndex(): NSUInteger
    
    @ObjCMethod("init", "objcKniBridge334")
    external override fun init(): FIRDocumentChange?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRQueryDocumentSnapshotMeta : FIRDocumentSnapshotMeta {
    
    @ObjCMethod("new", "objcKniBridge336")
    external override fun new(): FIRQueryDocumentSnapshot?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge338")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRQueryDocumentSnapshot?
    
    @ObjCMethod("alloc", "objcKniBridge340")
    external override fun alloc(): FIRQueryDocumentSnapshot?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRQueryDocumentSnapshot : FIRDocumentSnapshot {
    companion object : FIRQueryDocumentSnapshotMeta(), ObjCClassOf<FIRQueryDocumentSnapshot> {}
    
    @ObjCMethod("data", "objcKniBridge342")
    external override fun data(): Map<Any?, *>
    
    @ObjCMethod("dataWithServerTimestampBehavior:", "objcKniBridge344")
    external override fun dataWithServerTimestampBehavior(serverTimestampBehavior: FIRServerTimestampBehavior): Map<Any?, *>
    
    @ObjCMethod("init", "objcKniBridge346")
    external override fun init(): FIRQueryDocumentSnapshot?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRFieldValueMeta : NSObjectMeta {
    
    @ObjCMethod("fieldValueForDelete", "objcKniBridge348")
    external open fun fieldValueForDelete(): FIRFieldValue
    
    @ObjCMethod("fieldValueForServerTimestamp", "objcKniBridge350")
    external open fun fieldValueForServerTimestamp(): FIRFieldValue
    
    @ObjCMethod("fieldValueForArrayUnion:", "objcKniBridge352")
    external open fun fieldValueForArrayUnion(elements: List<*>): FIRFieldValue
    
    @ObjCMethod("fieldValueForArrayRemove:", "objcKniBridge354")
    external open fun fieldValueForArrayRemove(elements: List<*>): FIRFieldValue
    
    @ObjCMethod("new", "objcKniBridge356")
    external override fun new(): FIRFieldValue?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge358")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRFieldValue?
    
    @ObjCMethod("alloc", "objcKniBridge360")
    external override fun alloc(): FIRFieldValue?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRFieldValue : NSObject {
    companion object : FIRFieldValueMeta(), ObjCClassOf<FIRFieldValue> {}
    
    @ObjCMethod("init", "objcKniBridge362")
    external override fun init(): FIRFieldValue?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class FIRGeoPointMeta : NSObjectMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("new", "objcKniBridge364")
    external override fun new(): FIRGeoPoint?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge366")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRGeoPoint?
    
    @ObjCMethod("alloc", "objcKniBridge368")
    external override fun alloc(): FIRGeoPoint?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRGeoPoint : NSObject, NSCopyingProtocol {
    companion object : FIRGeoPointMeta(), ObjCClassOf<FIRGeoPoint> {}
    
    val latitude: Double
        get() = objcKniBridge372(nativeNullPtr, this.objcPtr())
    
    val longitude: Double
        get() = objcKniBridge374(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("initWithLatitude:longitude:", "objcKniBridge370")
    external open fun initWithLatitude(latitude: Double, longitude: Double): FIRGeoPoint
    
    @ObjCConstructor("initWithLatitude:longitude:", true)
    constructor(latitude: Double, longitude: Double) {}
    
    @ObjCMethod("latitude", "objcKniBridge372")
    external open fun latitude(): Double
    
    @ObjCMethod("longitude", "objcKniBridge374")
    external open fun longitude(): Double
    
    @ObjCMethod("init", "objcKniBridge376")
    external override fun init(): FIRGeoPoint?
    
    @ObjCConstructor("init", false)
    constructor() {}
    
    @ObjCMethod("copyWithZone:", "objcKniBridge378")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

@ExternalObjCClass open class FIRTimestampMeta : NSObjectMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("timestampWithSeconds:nanoseconds:", "objcKniBridge380")
    external open fun timestampWithSeconds(seconds: int64_t, nanoseconds: int32_t): FIRTimestamp
    
    @ObjCMethod("timestampWithDate:", "objcKniBridge382")
    external open fun timestampWithDate(date: NSDate): FIRTimestamp
    
    @ObjCMethod("timestamp", "objcKniBridge384")
    external open fun timestamp(): FIRTimestamp
    
    @ObjCMethod("new", "objcKniBridge386")
    external override fun new(): FIRTimestamp?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge388")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): FIRTimestamp?
    
    @ObjCMethod("alloc", "objcKniBridge390")
    external override fun alloc(): FIRTimestamp?
    
    protected constructor() {}
}

@ExternalObjCClass open class FIRTimestamp : NSObject, NSCopyingProtocol {
    companion object : FIRTimestampMeta(), ObjCClassOf<FIRTimestamp> {}
    
    val seconds: int64_t
        get() = objcKniBridge398(nativeNullPtr, this.objcPtr())
    
    val nanoseconds: int32_t
        get() = objcKniBridge400(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("initWithSeconds:nanoseconds:", "objcKniBridge392")
    external open fun initWithSeconds(seconds: int64_t, nanoseconds: int32_t): FIRTimestamp
    
    @ObjCConstructor("initWithSeconds:nanoseconds:", true)
    constructor(seconds: int64_t, nanoseconds: int32_t) {}
    
    @ObjCMethod("dateValue", "objcKniBridge394")
    external open fun dateValue(): NSDate
    
    @ObjCMethod("compare:", "objcKniBridge396")
    external open fun compare(other: FIRTimestamp): NSComparisonResult
    
    @ObjCMethod("seconds", "objcKniBridge398")
    external open fun seconds(): int64_t
    
    @ObjCMethod("nanoseconds", "objcKniBridge400")
    external open fun nanoseconds(): int32_t
    
    @ObjCMethod("init", "objcKniBridge402")
    external override fun init(): FIRTimestamp?
    
    @ObjCConstructor("init", false)
    constructor() {}
    
    @ObjCMethod("copyWithZone:", "objcKniBridge404")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

val FIRFirestoreErrorDomain: String
    get() = interpretObjCPointerOrNull<String>(kniBridge442())!!

enum class FIRFirestoreSource(override val value: NSUInteger) : CEnum {
    FIRFirestoreSourceDefault(0u),
    FIRFirestoreSourceServer(1u),
    FIRFirestoreSourceCache(2u),
    ;
    
    companion object {
        fun byValue(value: NSUInteger) = FIRFirestoreSource.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSUIntegerVar.size.toInt())
        var value: FIRFirestoreSource
            get() = byValue(this.reinterpret<NSUIntegerVar>().value)
            set(value) { this.reinterpret<NSUIntegerVar>().value = value.value }
    }
}

enum class FIRServerTimestampBehavior(override val value: NSInteger) : CEnum {
    FIRServerTimestampBehaviorNone(0),
    FIRServerTimestampBehaviorEstimate(1),
    FIRServerTimestampBehaviorPrevious(2),
    ;
    
    companion object {
        fun byValue(value: NSInteger) = FIRServerTimestampBehavior.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSIntegerVar.size.toInt())
        var value: FIRServerTimestampBehavior
            get() = byValue(this.reinterpret<NSIntegerVar>().value)
            set(value) { this.reinterpret<NSIntegerVar>().value = value.value }
    }
}

enum class FIRDocumentChangeType(override val value: NSInteger) : CEnum {
    FIRDocumentChangeTypeAdded(0),
    FIRDocumentChangeTypeModified(1),
    FIRDocumentChangeTypeRemoved(2),
    ;
    
    companion object {
        fun byValue(value: NSInteger) = FIRDocumentChangeType.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSIntegerVar.size.toInt())
        var value: FIRDocumentChangeType
            get() = byValue(this.reinterpret<NSIntegerVar>().value)
            set(value) { this.reinterpret<NSIntegerVar>().value = value.value }
    }
}

typealias FIRFirestoreErrorCodeVar = LongVarOf<FIRFirestoreErrorCode>
typealias FIRFirestoreErrorCode = NSInteger

val FIRFirestoreErrorCodeOK: FIRFirestoreErrorCode get() = 0
val FIRFirestoreErrorCodeCancelled: FIRFirestoreErrorCode get() = 1
val FIRFirestoreErrorCodeUnknown: FIRFirestoreErrorCode get() = 2
val FIRFirestoreErrorCodeInvalidArgument: FIRFirestoreErrorCode get() = 3
val FIRFirestoreErrorCodeDeadlineExceeded: FIRFirestoreErrorCode get() = 4
val FIRFirestoreErrorCodeNotFound: FIRFirestoreErrorCode get() = 5
val FIRFirestoreErrorCodeAlreadyExists: FIRFirestoreErrorCode get() = 6
val FIRFirestoreErrorCodePermissionDenied: FIRFirestoreErrorCode get() = 7
val FIRFirestoreErrorCodeResourceExhausted: FIRFirestoreErrorCode get() = 8
val FIRFirestoreErrorCodeFailedPrecondition: FIRFirestoreErrorCode get() = 9
val FIRFirestoreErrorCodeAborted: FIRFirestoreErrorCode get() = 10
val FIRFirestoreErrorCodeOutOfRange: FIRFirestoreErrorCode get() = 11
val FIRFirestoreErrorCodeUnimplemented: FIRFirestoreErrorCode get() = 12
val FIRFirestoreErrorCodeInternal: FIRFirestoreErrorCode get() = 13
val FIRFirestoreErrorCodeUnavailable: FIRFirestoreErrorCode get() = 14
val FIRFirestoreErrorCodeDataLoss: FIRFirestoreErrorCode get() = 15
val FIRFirestoreErrorCodeUnauthenticated: FIRFirestoreErrorCode get() = 16

typealias FIRQuerySnapshotBlockVar = ObjCBlockVar<FIRQuerySnapshotBlock>
typealias FIRQuerySnapshotBlock = ((FIRQuerySnapshot?, NSError?) -> Unit)?

typealias FIRDocumentSnapshotBlockVar = ObjCBlockVar<FIRDocumentSnapshotBlock>
typealias FIRDocumentSnapshotBlock = ((FIRDocumentSnapshot?, NSError?) -> Unit)?

@kotlin.native.internal.ExportForCompiler
@ObjCBridge("remove", "v16@0:8", "knimi_com_firebase_firestore1")
internal fun objcKniBridge2(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge0(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore3")
internal fun objcKniBridge4(kniSC: NativePtr, kniR: NativePtr): FIRQuerySnapshot? {
    return interpretObjCPointerOrNull<FIRQuerySnapshot>(kniBridge2(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore5")
internal fun objcKniBridge6(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRQuerySnapshot? {
    return interpretObjCPointerOrNull<FIRQuerySnapshot>(kniBridge4(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore7")
internal fun objcKniBridge8(kniSC: NativePtr, kniR: NativePtr): FIRQuerySnapshot? {
    return interpretObjCPointerOrNull<FIRQuerySnapshot>(kniBridge6(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentChangesWithIncludeMetadataChanges:", "@20@0:8B16", "knimi_com_firebase_firestore9")
internal fun objcKniBridge10(kniSC: NativePtr, kniR: NativePtr, includeMetadataChanges: Boolean): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge8(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, includeMetadataChanges.toByte()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("query", "@16@0:8", "knimi_com_firebase_firestore11")
internal fun objcKniBridge12(kniSC: NativePtr, kniR: NativePtr): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge10(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("metadata", "@16@0:8", "knimi_com_firebase_firestore13")
internal fun objcKniBridge14(kniSC: NativePtr, kniR: NativePtr): FIRSnapshotMetadata {
    return interpretObjCPointerOrNull<FIRSnapshotMetadata>(kniBridge12(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEmpty", "B16@0:8", "knimi_com_firebase_firestore15")
internal fun objcKniBridge16(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge14(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("count", "q16@0:8", "knimi_com_firebase_firestore17")
internal fun objcKniBridge18(kniSC: NativePtr, kniR: NativePtr): NSInteger {
    return kniBridge16(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documents", "@16@0:8", "knimi_com_firebase_firestore19")
internal fun objcKniBridge20(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge18(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentChanges", "@16@0:8", "knimi_com_firebase_firestore21")
internal fun objcKniBridge22(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge20(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore23")
internal fun objcKniBridge24(kniSC: NativePtr, kniR: NativePtr): FIRQuerySnapshot? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRQuerySnapshot>(kniBridge22(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore25")
internal fun objcKniBridge26(kniSC: NativePtr, kniR: NativePtr): FIRQuery? {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge24(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore27")
internal fun objcKniBridge28(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRQuery? {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge26(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore29")
internal fun objcKniBridge30(kniSC: NativePtr, kniR: NativePtr): FIRQuery? {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge28(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("getDocumentsWithCompletion:", "v24@0:8@\u003F16", "knimi_com_firebase_firestore31")
internal fun objcKniBridge32(kniSC: NativePtr, kniR: NativePtr, completion: FIRQuerySnapshotBlock?): Unit {
    return kniBridge30(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("getDocumentsWithSource:completion:", "v32@0:8Q16@\u003F24", "knimi_com_firebase_firestore33")
internal fun objcKniBridge34(kniSC: NativePtr, kniR: NativePtr, source: FIRFirestoreSource, completion: FIRQuerySnapshotBlock?): Unit {
    return kniBridge34(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, source.value, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("addSnapshotListener:", "@24@0:8@\u003F16", "knimi_com_firebase_firestore35")
internal fun objcKniBridge36(kniSC: NativePtr, kniR: NativePtr, listener: FIRQuerySnapshotBlock?): FIRListenerRegistrationProtocol {
    return interpretObjCPointerOrNull<FIRListenerRegistrationProtocol>(kniBridge38(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(listener)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("addSnapshotListenerWithIncludeMetadataChanges:listener:", "@28@0:8B16@\u003F20", "knimi_com_firebase_firestore37")
internal fun objcKniBridge38(kniSC: NativePtr, kniR: NativePtr, includeMetadataChanges: Boolean, listener: FIRQuerySnapshotBlock?): FIRListenerRegistrationProtocol {
    return interpretObjCPointerOrNull<FIRListenerRegistrationProtocol>(kniBridge42(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, includeMetadataChanges.toByte(), createKotlinObjectHolder(listener)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereField:isEqualTo:", "@32@0:8@16@24", "knimi_com_firebase_firestore39")
internal fun objcKniBridge40(kniSC: NativePtr, kniR: NativePtr, field: String, isEqualTo: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge46(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), isEqualTo.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereFieldPath:isEqualTo:", "@32@0:8@16@24", "knimi_com_firebase_firestore41")
internal fun objcKniBridge42(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath, isEqualTo: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge48(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr(), isEqualTo.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereField:isLessThan:", "@32@0:8@16@24", "knimi_com_firebase_firestore43")
internal fun objcKniBridge44(kniSC: NativePtr, kniR: NativePtr, field: String, isLessThan: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge50(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), isLessThan.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereFieldPath:isLessThan:", "@32@0:8@16@24", "knimi_com_firebase_firestore45")
internal fun objcKniBridge46(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath, isLessThan: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge52(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr(), isLessThan.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereField:isLessThanOrEqualTo:", "@32@0:8@16@24", "knimi_com_firebase_firestore47")
internal fun objcKniBridge48(kniSC: NativePtr, kniR: NativePtr, field: String, isLessThanOrEqualTo: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge54(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), isLessThanOrEqualTo.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereFieldPath:isLessThanOrEqualTo:", "@32@0:8@16@24", "knimi_com_firebase_firestore49")
internal fun objcKniBridge50(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath, isLessThanOrEqualTo: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge56(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr(), isLessThanOrEqualTo.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereField:isGreaterThan:", "@32@0:8@16@24", "knimi_com_firebase_firestore51")
internal fun objcKniBridge52(kniSC: NativePtr, kniR: NativePtr, field: String, isGreaterThan: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge58(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), isGreaterThan.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereFieldPath:isGreaterThan:", "@32@0:8@16@24", "knimi_com_firebase_firestore53")
internal fun objcKniBridge54(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath, isGreaterThan: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge60(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr(), isGreaterThan.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereField:isGreaterThanOrEqualTo:", "@32@0:8@16@24", "knimi_com_firebase_firestore55")
internal fun objcKniBridge56(kniSC: NativePtr, kniR: NativePtr, field: String, isGreaterThanOrEqualTo: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge62(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), isGreaterThanOrEqualTo.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereFieldPath:isGreaterThanOrEqualTo:", "@32@0:8@16@24", "knimi_com_firebase_firestore57")
internal fun objcKniBridge58(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath, isGreaterThanOrEqualTo: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge64(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr(), isGreaterThanOrEqualTo.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereField:arrayContains:", "@32@0:8@16@24", "knimi_com_firebase_firestore59")
internal fun objcKniBridge60(kniSC: NativePtr, kniR: NativePtr, field: String, arrayContains: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge66(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), arrayContains.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryWhereFieldPath:arrayContains:", "@32@0:8@16@24", "knimi_com_firebase_firestore61")
internal fun objcKniBridge62(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath, arrayContains: Any): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge68(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr(), arrayContains.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryFilteredUsingPredicate:", "@24@0:8@16", "knimi_com_firebase_firestore63")
internal fun objcKniBridge64(kniSC: NativePtr, kniR: NativePtr, predicate: NSPredicate): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge70(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, predicate.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryOrderedByField:", "@24@0:8@16", "knimi_com_firebase_firestore65")
internal fun objcKniBridge66(kniSC: NativePtr, kniR: NativePtr, field: String): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge72(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryOrderedByFieldPath:", "@24@0:8@16", "knimi_com_firebase_firestore67")
internal fun objcKniBridge68(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge74(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryOrderedByField:descending:", "@28@0:8@16B24", "knimi_com_firebase_firestore69")
internal fun objcKniBridge70(kniSC: NativePtr, kniR: NativePtr, field: String, descending: Boolean): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge76(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), descending.toByte()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryOrderedByFieldPath:descending:", "@28@0:8@16B24", "knimi_com_firebase_firestore71")
internal fun objcKniBridge72(kniSC: NativePtr, kniR: NativePtr, path: FIRFieldPath, descending: Boolean): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge78(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, path.objcPtr(), descending.toByte()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryLimitedTo:", "@24@0:8q16", "knimi_com_firebase_firestore73")
internal fun objcKniBridge74(kniSC: NativePtr, kniR: NativePtr, limit: NSInteger): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge80(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, limit))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryStartingAtDocument:", "@24@0:8@16", "knimi_com_firebase_firestore75")
internal fun objcKniBridge76(kniSC: NativePtr, kniR: NativePtr, document: FIRDocumentSnapshot): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge82(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, document.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryStartingAtValues:", "@24@0:8@16", "knimi_com_firebase_firestore77")
internal fun objcKniBridge78(kniSC: NativePtr, kniR: NativePtr, fieldValues: List<*>): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge84(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fieldValues.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryStartingAfterDocument:", "@24@0:8@16", "knimi_com_firebase_firestore79")
internal fun objcKniBridge80(kniSC: NativePtr, kniR: NativePtr, document: FIRDocumentSnapshot): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge86(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, document.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryStartingAfterValues:", "@24@0:8@16", "knimi_com_firebase_firestore81")
internal fun objcKniBridge82(kniSC: NativePtr, kniR: NativePtr, fieldValues: List<*>): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge88(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fieldValues.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryEndingBeforeDocument:", "@24@0:8@16", "knimi_com_firebase_firestore83")
internal fun objcKniBridge84(kniSC: NativePtr, kniR: NativePtr, document: FIRDocumentSnapshot): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge90(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, document.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryEndingBeforeValues:", "@24@0:8@16", "knimi_com_firebase_firestore85")
internal fun objcKniBridge86(kniSC: NativePtr, kniR: NativePtr, fieldValues: List<*>): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge92(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fieldValues.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryEndingAtDocument:", "@24@0:8@16", "knimi_com_firebase_firestore87")
internal fun objcKniBridge88(kniSC: NativePtr, kniR: NativePtr, document: FIRDocumentSnapshot): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge94(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, document.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("queryEndingAtValues:", "@24@0:8@16", "knimi_com_firebase_firestore89")
internal fun objcKniBridge90(kniSC: NativePtr, kniR: NativePtr, fieldValues: List<*>): FIRQuery {
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge96(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fieldValues.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("firestore", "@16@0:8", "knimi_com_firebase_firestore91")
internal fun objcKniBridge92(kniSC: NativePtr, kniR: NativePtr): FIRFirestore {
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge98(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore93")
internal fun objcKniBridge94(kniSC: NativePtr, kniR: NativePtr): FIRQuery? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRQuery>(kniBridge100(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentID", "@16@0:8", "knimi_com_firebase_firestore95")
internal fun objcKniBridge96(kniSC: NativePtr, kniR: NativePtr): FIRFieldPath {
    return interpretObjCPointerOrNull<FIRFieldPath>(kniBridge102(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore97")
internal fun objcKniBridge98(kniSC: NativePtr, kniR: NativePtr): FIRFieldPath? {
    return interpretObjCPointerOrNull<FIRFieldPath>(kniBridge104(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore99")
internal fun objcKniBridge100(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRFieldPath? {
    return interpretObjCPointerOrNull<FIRFieldPath>(kniBridge106(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore101")
internal fun objcKniBridge102(kniSC: NativePtr, kniR: NativePtr): FIRFieldPath? {
    return interpretObjCPointerOrNull<FIRFieldPath>(kniBridge108(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithFields:", "@24@0:8@16", "knimi_com_firebase_firestore103")
internal fun objcKniBridge104(kniSC: NativePtr, kniR: NativePtr, fieldNames: List<*>): FIRFieldPath {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRFieldPath>(kniBridge110(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fieldNames.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore105")
internal fun objcKniBridge106(kniSC: NativePtr, kniR: NativePtr): FIRFieldPath? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRFieldPath>(kniBridge112(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore107")
internal fun objcKniBridge108(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge114(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore109")
internal fun objcKniBridge110(kniSC: NativePtr, kniR: NativePtr): FIRDocumentSnapshot? {
    return interpretObjCPointerOrNull<FIRDocumentSnapshot>(kniBridge116(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore111")
internal fun objcKniBridge112(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRDocumentSnapshot? {
    return interpretObjCPointerOrNull<FIRDocumentSnapshot>(kniBridge118(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore113")
internal fun objcKniBridge114(kniSC: NativePtr, kniR: NativePtr): FIRDocumentSnapshot? {
    return interpretObjCPointerOrNull<FIRDocumentSnapshot>(kniBridge120(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("data", "@16@0:8", "knimi_com_firebase_firestore115")
internal fun objcKniBridge116(kniSC: NativePtr, kniR: NativePtr): Map<Any?, *>? {
    return interpretObjCPointerOrNull<Map<Any?, *>>(kniBridge122(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataWithServerTimestampBehavior:", "@24@0:8q16", "knimi_com_firebase_firestore117")
internal fun objcKniBridge118(kniSC: NativePtr, kniR: NativePtr, serverTimestampBehavior: FIRServerTimestampBehavior): Map<Any?, *>? {
    return interpretObjCPointerOrNull<Map<Any?, *>>(kniBridge124(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, serverTimestampBehavior.value))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueForField:", "@24@0:8@16", "knimi_com_firebase_firestore119")
internal fun objcKniBridge120(kniSC: NativePtr, kniR: NativePtr, field: Any): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge126(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueForField:serverTimestampBehavior:", "@32@0:8@16q24", "knimi_com_firebase_firestore121")
internal fun objcKniBridge122(kniSC: NativePtr, kniR: NativePtr, field: Any, serverTimestampBehavior: FIRServerTimestampBehavior): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge128(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr(), serverTimestampBehavior.value))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("objectForKeyedSubscript:", "@24@0:8@16", "knimi_com_firebase_firestore123")
internal fun objcKniBridge124(kniSC: NativePtr, kniR: NativePtr, key: Any): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge130(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, key.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("exists", "B16@0:8", "knimi_com_firebase_firestore125")
internal fun objcKniBridge126(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge132(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("reference", "@16@0:8", "knimi_com_firebase_firestore127")
internal fun objcKniBridge128(kniSC: NativePtr, kniR: NativePtr): FIRDocumentReference {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge134(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentID", "@16@0:8", "knimi_com_firebase_firestore129")
internal fun objcKniBridge130(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge136(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("metadata", "@16@0:8", "knimi_com_firebase_firestore131")
internal fun objcKniBridge132(kniSC: NativePtr, kniR: NativePtr): FIRSnapshotMetadata {
    return interpretObjCPointerOrNull<FIRSnapshotMetadata>(kniBridge138(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore133")
internal fun objcKniBridge134(kniSC: NativePtr, kniR: NativePtr): FIRDocumentSnapshot? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRDocumentSnapshot>(kniBridge140(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore135")
internal fun objcKniBridge136(kniSC: NativePtr, kniR: NativePtr): FIRDocumentReference? {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge142(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore137")
internal fun objcKniBridge138(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRDocumentReference? {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge144(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore139")
internal fun objcKniBridge140(kniSC: NativePtr, kniR: NativePtr): FIRDocumentReference? {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge146(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("collectionWithPath:", "@24@0:8@16", "knimi_com_firebase_firestore141")
internal fun objcKniBridge142(kniSC: NativePtr, kniR: NativePtr, collectionPath: String): FIRCollectionReference {
    return interpretObjCPointerOrNull<FIRCollectionReference>(kniBridge148(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, collectionPath.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:", "v24@0:8@16", "knimi_com_firebase_firestore143")
internal fun objcKniBridge144(kniSC: NativePtr, kniR: NativePtr, documentData: Map<Any?, *>): Unit {
    return kniBridge150(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentData.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:merge:", "v28@0:8@16B24", "knimi_com_firebase_firestore145")
internal fun objcKniBridge146(kniSC: NativePtr, kniR: NativePtr, documentData: Map<Any?, *>, merge: Boolean): Unit {
    return kniBridge152(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentData.objcPtr(), merge.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:mergeFields:", "v32@0:8@16@24", "knimi_com_firebase_firestore147")
internal fun objcKniBridge148(kniSC: NativePtr, kniR: NativePtr, documentData: Map<Any?, *>, mergeFields: List<*>): Unit {
    return kniBridge154(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentData.objcPtr(), mergeFields.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:completion:", "v32@0:8@16@\u003F24", "knimi_com_firebase_firestore149")
internal fun objcKniBridge150(kniSC: NativePtr, kniR: NativePtr, documentData: Map<Any?, *>, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge156(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentData.objcPtr(), createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:merge:completion:", "v36@0:8@16B24@\u003F28", "knimi_com_firebase_firestore151")
internal fun objcKniBridge152(kniSC: NativePtr, kniR: NativePtr, documentData: Map<Any?, *>, merge: Boolean, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge160(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentData.objcPtr(), merge.toByte(), createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:mergeFields:completion:", "v40@0:8@16@24@\u003F32", "knimi_com_firebase_firestore153")
internal fun objcKniBridge154(kniSC: NativePtr, kniR: NativePtr, documentData: Map<Any?, *>, mergeFields: List<*>, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge164(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentData.objcPtr(), mergeFields.objcPtr(), createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("updateData:", "v24@0:8@16", "knimi_com_firebase_firestore155")
internal fun objcKniBridge156(kniSC: NativePtr, kniR: NativePtr, fields: Map<Any?, *>): Unit {
    return kniBridge168(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fields.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("updateData:completion:", "v32@0:8@16@\u003F24", "knimi_com_firebase_firestore157")
internal fun objcKniBridge158(kniSC: NativePtr, kniR: NativePtr, fields: Map<Any?, *>, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge170(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fields.objcPtr(), createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("deleteDocument", "v16@0:8", "knimi_com_firebase_firestore159")
internal fun objcKniBridge160(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge174(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("deleteDocumentWithCompletion:", "v24@0:8@\u003F16", "knimi_com_firebase_firestore161")
internal fun objcKniBridge162(kniSC: NativePtr, kniR: NativePtr, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge176(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("getDocumentWithCompletion:", "v24@0:8@\u003F16", "knimi_com_firebase_firestore163")
internal fun objcKniBridge164(kniSC: NativePtr, kniR: NativePtr, completion: FIRDocumentSnapshotBlock?): Unit {
    return kniBridge180(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("getDocumentWithSource:completion:", "v32@0:8Q16@\u003F24", "knimi_com_firebase_firestore165")
internal fun objcKniBridge166(kniSC: NativePtr, kniR: NativePtr, source: FIRFirestoreSource, completion: FIRDocumentSnapshotBlock?): Unit {
    return kniBridge184(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, source.value, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("addSnapshotListener:", "@24@0:8@\u003F16", "knimi_com_firebase_firestore167")
internal fun objcKniBridge168(kniSC: NativePtr, kniR: NativePtr, listener: FIRDocumentSnapshotBlock?): FIRListenerRegistrationProtocol {
    return interpretObjCPointerOrNull<FIRListenerRegistrationProtocol>(kniBridge188(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(listener)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("addSnapshotListenerWithIncludeMetadataChanges:listener:", "@28@0:8B16@\u003F20", "knimi_com_firebase_firestore169")
internal fun objcKniBridge170(kniSC: NativePtr, kniR: NativePtr, includeMetadataChanges: Boolean, listener: FIRDocumentSnapshotBlock?): FIRListenerRegistrationProtocol {
    return interpretObjCPointerOrNull<FIRListenerRegistrationProtocol>(kniBridge192(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, includeMetadataChanges.toByte(), createKotlinObjectHolder(listener)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentID", "@16@0:8", "knimi_com_firebase_firestore171")
internal fun objcKniBridge172(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge196(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("parent", "@16@0:8", "knimi_com_firebase_firestore173")
internal fun objcKniBridge174(kniSC: NativePtr, kniR: NativePtr): FIRCollectionReference {
    return interpretObjCPointerOrNull<FIRCollectionReference>(kniBridge198(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("firestore", "@16@0:8", "knimi_com_firebase_firestore175")
internal fun objcKniBridge176(kniSC: NativePtr, kniR: NativePtr): FIRFirestore {
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge200(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("path", "@16@0:8", "knimi_com_firebase_firestore177")
internal fun objcKniBridge178(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge202(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore179")
internal fun objcKniBridge180(kniSC: NativePtr, kniR: NativePtr): FIRDocumentReference? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge204(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore181")
internal fun objcKniBridge182(kniSC: NativePtr, kniR: NativePtr): FIRCollectionReference? {
    return interpretObjCPointerOrNull<FIRCollectionReference>(kniBridge206(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore183")
internal fun objcKniBridge184(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRCollectionReference? {
    return interpretObjCPointerOrNull<FIRCollectionReference>(kniBridge208(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore185")
internal fun objcKniBridge186(kniSC: NativePtr, kniR: NativePtr): FIRCollectionReference? {
    return interpretObjCPointerOrNull<FIRCollectionReference>(kniBridge210(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentWithAutoID", "@16@0:8", "knimi_com_firebase_firestore187")
internal fun objcKniBridge188(kniSC: NativePtr, kniR: NativePtr): FIRDocumentReference {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge212(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentWithPath:", "@24@0:8@16", "knimi_com_firebase_firestore189")
internal fun objcKniBridge190(kniSC: NativePtr, kniR: NativePtr, documentPath: String): FIRDocumentReference {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge214(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentPath.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("addDocumentWithData:", "@24@0:8@16", "knimi_com_firebase_firestore191")
internal fun objcKniBridge192(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>): FIRDocumentReference {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge216(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("addDocumentWithData:completion:", "@32@0:8@16@\u003F24", "knimi_com_firebase_firestore193")
internal fun objcKniBridge194(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>, completion: ((NSError?) -> Unit)?): FIRDocumentReference {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge218(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), createKotlinObjectHolder(completion)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("collectionID", "@16@0:8", "knimi_com_firebase_firestore195")
internal fun objcKniBridge196(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge222(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("parent", "@16@0:8", "knimi_com_firebase_firestore197")
internal fun objcKniBridge198(kniSC: NativePtr, kniR: NativePtr): FIRDocumentReference? {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge224(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("path", "@16@0:8", "knimi_com_firebase_firestore199")
internal fun objcKniBridge200(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge226(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore201")
internal fun objcKniBridge202(kniSC: NativePtr, kniR: NativePtr): FIRCollectionReference? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRCollectionReference>(kniBridge228(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("firestore", "@16@0:8", "knimi_com_firebase_firestore203")
internal fun objcKniBridge204(kniSC: NativePtr, kniR: NativePtr): FIRFirestore {
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge230(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("firestoreForApp:", "@24@0:8@16", "knimi_com_firebase_firestore205")
internal fun objcKniBridge206(kniSC: NativePtr, kniR: NativePtr, app: objcnames.classes.FIRApp): FIRFirestore {
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge232(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, app.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("enableLogging:", "v20@0:8B16", "knimi_com_firebase_firestore207")
internal fun objcKniBridge208(kniSC: NativePtr, kniR: NativePtr, logging: Boolean): Unit {
    return kniBridge234(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, logging.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore209")
internal fun objcKniBridge210(kniSC: NativePtr, kniR: NativePtr): FIRFirestore? {
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge236(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore211")
internal fun objcKniBridge212(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRFirestore? {
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge238(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore213")
internal fun objcKniBridge214(kniSC: NativePtr, kniR: NativePtr): FIRFirestore? {
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge240(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("collectionWithPath:", "@24@0:8@16", "knimi_com_firebase_firestore215")
internal fun objcKniBridge216(kniSC: NativePtr, kniR: NativePtr, collectionPath: String): FIRCollectionReference {
    return interpretObjCPointerOrNull<FIRCollectionReference>(kniBridge242(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, collectionPath.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentWithPath:", "@24@0:8@16", "knimi_com_firebase_firestore217")
internal fun objcKniBridge218(kniSC: NativePtr, kniR: NativePtr, documentPath: String): FIRDocumentReference {
    return interpretObjCPointerOrNull<FIRDocumentReference>(kniBridge244(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentPath.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("runTransactionWithBlock:completion:", "v32@0:8@\u003F16@\u003F24", "knimi_com_firebase_firestore219")
internal fun objcKniBridge220(kniSC: NativePtr, kniR: NativePtr, updateBlock: (FIRTransaction?, CPointer<ObjCObjectVar<NSError?>>?) -> Any?, completion: (Any?, NSError?) -> Unit): Unit {
    return kniBridge246(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(updateBlock), createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("batch", "@16@0:8", "knimi_com_firebase_firestore221")
internal fun objcKniBridge222(kniSC: NativePtr, kniR: NativePtr): FIRWriteBatch {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge252(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("enableNetworkWithCompletion:", "v24@0:8@\u003F16", "knimi_com_firebase_firestore223")
internal fun objcKniBridge224(kniSC: NativePtr, kniR: NativePtr, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge254(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("disableNetworkWithCompletion:", "v24@0:8@\u003F16", "knimi_com_firebase_firestore225")
internal fun objcKniBridge226(kniSC: NativePtr, kniR: NativePtr, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge258(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("settings", "@16@0:8", "knimi_com_firebase_firestore227")
internal fun objcKniBridge228(kniSC: NativePtr, kniR: NativePtr): FIRFirestoreSettings {
    return interpretObjCPointerOrNull<FIRFirestoreSettings>(kniBridge262(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSettings:", "v24@0:8@16", "knimi_com_firebase_firestore229")
internal fun objcKniBridge230(kniSC: NativePtr, kniR: NativePtr, settings: FIRFirestoreSettings): Unit {
    return kniBridge264(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, settings.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("app", "@16@0:8", "knimi_com_firebase_firestore231")
internal fun objcKniBridge232(kniSC: NativePtr, kniR: NativePtr): objcnames.classes.FIRApp {
    return interpretObjCPointerOrNull<objcnames.classes.FIRApp>(kniBridge266(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore233")
internal fun objcKniBridge234(kniSC: NativePtr, kniR: NativePtr): FIRFirestore? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRFirestore>(kniBridge268(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore235")
internal fun objcKniBridge236(kniSC: NativePtr, kniR: NativePtr): FIRTransaction? {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge270(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore237")
internal fun objcKniBridge238(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRTransaction? {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge272(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore239")
internal fun objcKniBridge240(kniSC: NativePtr, kniR: NativePtr): FIRTransaction? {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge274(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:forDocument:", "@32@0:8@16@24", "knimi_com_firebase_firestore241")
internal fun objcKniBridge242(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>, forDocument: FIRDocumentReference): FIRTransaction {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge276(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), forDocument.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:forDocument:merge:", "@36@0:8@16@24B32", "knimi_com_firebase_firestore243")
internal fun objcKniBridge244(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>, forDocument: FIRDocumentReference, merge: Boolean): FIRTransaction {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge278(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), forDocument.objcPtr(), merge.toByte()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:forDocument:mergeFields:", "@40@0:8@16@24@32", "knimi_com_firebase_firestore245")
internal fun objcKniBridge246(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>, forDocument: FIRDocumentReference, mergeFields: List<*>): FIRTransaction {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge280(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), forDocument.objcPtr(), mergeFields.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("updateData:forDocument:", "@32@0:8@16@24", "knimi_com_firebase_firestore247")
internal fun objcKniBridge248(kniSC: NativePtr, kniR: NativePtr, fields: Map<Any?, *>, forDocument: FIRDocumentReference): FIRTransaction {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge282(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fields.objcPtr(), forDocument.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("deleteDocument:", "@24@0:8@16", "knimi_com_firebase_firestore249")
internal fun objcKniBridge250(kniSC: NativePtr, kniR: NativePtr, document: FIRDocumentReference): FIRTransaction {
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge284(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, document.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("getDocument:error:", "@32@0:8@16^@24", "knimi_com_firebase_firestore251")
internal fun objcKniBridge252(kniSC: NativePtr, kniR: NativePtr, document: FIRDocumentReference, error: CPointer<ObjCObjectVar<NSError?>>?): FIRDocumentSnapshot? {
    return interpretObjCPointerOrNull<FIRDocumentSnapshot>(kniBridge286(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, document.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore253")
internal fun objcKniBridge254(kniSC: NativePtr, kniR: NativePtr): FIRTransaction? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRTransaction>(kniBridge288(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore255")
internal fun objcKniBridge256(kniSC: NativePtr, kniR: NativePtr): FIRWriteBatch? {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge290(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore257")
internal fun objcKniBridge258(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRWriteBatch? {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge292(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore259")
internal fun objcKniBridge260(kniSC: NativePtr, kniR: NativePtr): FIRWriteBatch? {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge294(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:forDocument:", "@32@0:8@16@24", "knimi_com_firebase_firestore261")
internal fun objcKniBridge262(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>, forDocument: FIRDocumentReference): FIRWriteBatch {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge296(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), forDocument.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:forDocument:merge:", "@36@0:8@16@24B32", "knimi_com_firebase_firestore263")
internal fun objcKniBridge264(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>, forDocument: FIRDocumentReference, merge: Boolean): FIRWriteBatch {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge298(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), forDocument.objcPtr(), merge.toByte()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setData:forDocument:mergeFields:", "@40@0:8@16@24@32", "knimi_com_firebase_firestore265")
internal fun objcKniBridge266(kniSC: NativePtr, kniR: NativePtr, data: Map<Any?, *>, forDocument: FIRDocumentReference, mergeFields: List<*>): FIRWriteBatch {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge300(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), forDocument.objcPtr(), mergeFields.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("updateData:forDocument:", "@32@0:8@16@24", "knimi_com_firebase_firestore267")
internal fun objcKniBridge268(kniSC: NativePtr, kniR: NativePtr, fields: Map<Any?, *>, forDocument: FIRDocumentReference): FIRWriteBatch {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge302(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fields.objcPtr(), forDocument.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("deleteDocument:", "@24@0:8@16", "knimi_com_firebase_firestore269")
internal fun objcKniBridge270(kniSC: NativePtr, kniR: NativePtr, document: FIRDocumentReference): FIRWriteBatch {
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge304(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, document.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("commit", "v16@0:8", "knimi_com_firebase_firestore271")
internal fun objcKniBridge272(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge306(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("commitWithCompletion:", "v24@0:8@\u003F16", "knimi_com_firebase_firestore273")
internal fun objcKniBridge274(kniSC: NativePtr, kniR: NativePtr, completion: ((NSError?) -> Unit)?): Unit {
    return kniBridge308(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore275")
internal fun objcKniBridge276(kniSC: NativePtr, kniR: NativePtr): FIRWriteBatch? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRWriteBatch>(kniBridge312(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore277")
internal fun objcKniBridge278(kniSC: NativePtr, kniR: NativePtr): FIRFirestoreSettings? {
    return interpretObjCPointerOrNull<FIRFirestoreSettings>(kniBridge314(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore279")
internal fun objcKniBridge280(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRFirestoreSettings? {
    return interpretObjCPointerOrNull<FIRFirestoreSettings>(kniBridge316(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore281")
internal fun objcKniBridge282(kniSC: NativePtr, kniR: NativePtr): FIRFirestoreSettings? {
    return interpretObjCPointerOrNull<FIRFirestoreSettings>(kniBridge318(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore283")
internal fun objcKniBridge284(kniSC: NativePtr, kniR: NativePtr): FIRFirestoreSettings {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRFirestoreSettings>(kniBridge320(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("host", "@16@0:8", "knimi_com_firebase_firestore285")
internal fun objcKniBridge286(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge322(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHost:", "v24@0:8@16", "knimi_com_firebase_firestore287")
internal fun objcKniBridge288(kniSC: NativePtr, kniR: NativePtr, host: String): Unit {
    return kniBridge324(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, host.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isSSLEnabled", "B16@0:8", "knimi_com_firebase_firestore289")
internal fun objcKniBridge290(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge326(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSslEnabled:", "v20@0:8B16", "knimi_com_firebase_firestore291")
internal fun objcKniBridge292(kniSC: NativePtr, kniR: NativePtr, sslEnabled: Boolean): Unit {
    return kniBridge328(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, sslEnabled.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dispatchQueue", "@16@0:8", "knimi_com_firebase_firestore293")
internal fun objcKniBridge294(kniSC: NativePtr, kniR: NativePtr): dispatch_queue_t? {
    return interpretObjCPointerOrNull<NSObject>(kniBridge330(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDispatchQueue:", "v24@0:8@16", "knimi_com_firebase_firestore295")
internal fun objcKniBridge296(kniSC: NativePtr, kniR: NativePtr, dispatchQueue: dispatch_queue_t?): Unit {
    return kniBridge332(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, dispatchQueue.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isPersistenceEnabled", "B16@0:8", "knimi_com_firebase_firestore297")
internal fun objcKniBridge298(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge334(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setPersistenceEnabled:", "v20@0:8B16", "knimi_com_firebase_firestore299")
internal fun objcKniBridge300(kniSC: NativePtr, kniR: NativePtr, persistenceEnabled: Boolean): Unit {
    return kniBridge336(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, persistenceEnabled.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("areTimestampsInSnapshotsEnabled", "B16@0:8", "knimi_com_firebase_firestore301")
internal fun objcKniBridge302(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge338(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTimestampsInSnapshotsEnabled:", "v20@0:8B16", "knimi_com_firebase_firestore303")
internal fun objcKniBridge304(kniSC: NativePtr, kniR: NativePtr, timestampsInSnapshotsEnabled: Boolean): Unit {
    return kniBridge340(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, timestampsInSnapshotsEnabled.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore305")
internal fun objcKniBridge306(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge342(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore307")
internal fun objcKniBridge308(kniSC: NativePtr, kniR: NativePtr): FIRSnapshotMetadata? {
    return interpretObjCPointerOrNull<FIRSnapshotMetadata>(kniBridge344(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore309")
internal fun objcKniBridge310(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRSnapshotMetadata? {
    return interpretObjCPointerOrNull<FIRSnapshotMetadata>(kniBridge346(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore311")
internal fun objcKniBridge312(kniSC: NativePtr, kniR: NativePtr): FIRSnapshotMetadata? {
    return interpretObjCPointerOrNull<FIRSnapshotMetadata>(kniBridge348(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hasPendingWrites", "B16@0:8", "knimi_com_firebase_firestore313")
internal fun objcKniBridge314(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge350(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isFromCache", "B16@0:8", "knimi_com_firebase_firestore315")
internal fun objcKniBridge316(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge352(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore317")
internal fun objcKniBridge318(kniSC: NativePtr, kniR: NativePtr): FIRSnapshotMetadata? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRSnapshotMetadata>(kniBridge354(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore319")
internal fun objcKniBridge320(kniSC: NativePtr, kniR: NativePtr): FIRDocumentChange? {
    return interpretObjCPointerOrNull<FIRDocumentChange>(kniBridge356(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore321")
internal fun objcKniBridge322(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRDocumentChange? {
    return interpretObjCPointerOrNull<FIRDocumentChange>(kniBridge358(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore323")
internal fun objcKniBridge324(kniSC: NativePtr, kniR: NativePtr): FIRDocumentChange? {
    return interpretObjCPointerOrNull<FIRDocumentChange>(kniBridge360(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("type", "q16@0:8", "knimi_com_firebase_firestore325")
internal fun objcKniBridge326(kniSC: NativePtr, kniR: NativePtr): FIRDocumentChangeType {
    return FIRDocumentChangeType.byValue(kniBridge362(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("document", "@16@0:8", "knimi_com_firebase_firestore327")
internal fun objcKniBridge328(kniSC: NativePtr, kniR: NativePtr): FIRQueryDocumentSnapshot {
    return interpretObjCPointerOrNull<FIRQueryDocumentSnapshot>(kniBridge364(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("oldIndex", "Q16@0:8", "knimi_com_firebase_firestore329")
internal fun objcKniBridge330(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge366(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("newIndex", "Q16@0:8", "knimi_com_firebase_firestore331")
internal fun objcKniBridge332(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge368(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore333")
internal fun objcKniBridge334(kniSC: NativePtr, kniR: NativePtr): FIRDocumentChange? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRDocumentChange>(kniBridge370(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore335")
internal fun objcKniBridge336(kniSC: NativePtr, kniR: NativePtr): FIRQueryDocumentSnapshot? {
    return interpretObjCPointerOrNull<FIRQueryDocumentSnapshot>(kniBridge372(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore337")
internal fun objcKniBridge338(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRQueryDocumentSnapshot? {
    return interpretObjCPointerOrNull<FIRQueryDocumentSnapshot>(kniBridge374(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore339")
internal fun objcKniBridge340(kniSC: NativePtr, kniR: NativePtr): FIRQueryDocumentSnapshot? {
    return interpretObjCPointerOrNull<FIRQueryDocumentSnapshot>(kniBridge376(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("data", "@16@0:8", "knimi_com_firebase_firestore341")
internal fun objcKniBridge342(kniSC: NativePtr, kniR: NativePtr): Map<Any?, *> {
    return interpretObjCPointerOrNull<Map<Any?, *>>(kniBridge378(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataWithServerTimestampBehavior:", "@24@0:8q16", "knimi_com_firebase_firestore343")
internal fun objcKniBridge344(kniSC: NativePtr, kniR: NativePtr, serverTimestampBehavior: FIRServerTimestampBehavior): Map<Any?, *> {
    return interpretObjCPointerOrNull<Map<Any?, *>>(kniBridge380(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, serverTimestampBehavior.value))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore345")
internal fun objcKniBridge346(kniSC: NativePtr, kniR: NativePtr): FIRQueryDocumentSnapshot? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRQueryDocumentSnapshot>(kniBridge382(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("fieldValueForDelete", "@16@0:8", "knimi_com_firebase_firestore347")
internal fun objcKniBridge348(kniSC: NativePtr, kniR: NativePtr): FIRFieldValue {
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge384(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("fieldValueForServerTimestamp", "@16@0:8", "knimi_com_firebase_firestore349")
internal fun objcKniBridge350(kniSC: NativePtr, kniR: NativePtr): FIRFieldValue {
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge386(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("fieldValueForArrayUnion:", "@24@0:8@16", "knimi_com_firebase_firestore351")
internal fun objcKniBridge352(kniSC: NativePtr, kniR: NativePtr, elements: List<*>): FIRFieldValue {
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge388(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, elements.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("fieldValueForArrayRemove:", "@24@0:8@16", "knimi_com_firebase_firestore353")
internal fun objcKniBridge354(kniSC: NativePtr, kniR: NativePtr, elements: List<*>): FIRFieldValue {
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge390(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, elements.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore355")
internal fun objcKniBridge356(kniSC: NativePtr, kniR: NativePtr): FIRFieldValue? {
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge392(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore357")
internal fun objcKniBridge358(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRFieldValue? {
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge394(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore359")
internal fun objcKniBridge360(kniSC: NativePtr, kniR: NativePtr): FIRFieldValue? {
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge396(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore361")
internal fun objcKniBridge362(kniSC: NativePtr, kniR: NativePtr): FIRFieldValue? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRFieldValue>(kniBridge398(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore363")
internal fun objcKniBridge364(kniSC: NativePtr, kniR: NativePtr): FIRGeoPoint? {
    return interpretObjCPointerOrNull<FIRGeoPoint>(kniBridge400(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore365")
internal fun objcKniBridge366(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRGeoPoint? {
    return interpretObjCPointerOrNull<FIRGeoPoint>(kniBridge402(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore367")
internal fun objcKniBridge368(kniSC: NativePtr, kniR: NativePtr): FIRGeoPoint? {
    return interpretObjCPointerOrNull<FIRGeoPoint>(kniBridge404(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithLatitude:longitude:", "@32@0:8d16d24", "knimi_com_firebase_firestore369")
internal fun objcKniBridge370(kniSC: NativePtr, kniR: NativePtr, latitude: Double, longitude: Double): FIRGeoPoint {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRGeoPoint>(kniBridge406(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, latitude, longitude))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("latitude", "d16@0:8", "knimi_com_firebase_firestore371")
internal fun objcKniBridge372(kniSC: NativePtr, kniR: NativePtr): Double {
    return kniBridge408(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("longitude", "d16@0:8", "knimi_com_firebase_firestore373")
internal fun objcKniBridge374(kniSC: NativePtr, kniR: NativePtr): Double {
    return kniBridge410(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore375")
internal fun objcKniBridge376(kniSC: NativePtr, kniR: NativePtr): FIRGeoPoint? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRGeoPoint>(kniBridge412(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore377")
internal fun objcKniBridge378(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge414(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("timestampWithSeconds:nanoseconds:", "@28@0:8q16i24", "knimi_com_firebase_firestore379")
internal fun objcKniBridge380(kniSC: NativePtr, kniR: NativePtr, seconds: int64_t, nanoseconds: int32_t): FIRTimestamp {
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge416(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, seconds, nanoseconds))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("timestampWithDate:", "@24@0:8@16", "knimi_com_firebase_firestore381")
internal fun objcKniBridge382(kniSC: NativePtr, kniR: NativePtr, date: NSDate): FIRTimestamp {
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge418(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, date.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("timestamp", "@16@0:8", "knimi_com_firebase_firestore383")
internal fun objcKniBridge384(kniSC: NativePtr, kniR: NativePtr): FIRTimestamp {
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge420(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_firebase_firestore385")
internal fun objcKniBridge386(kniSC: NativePtr, kniR: NativePtr): FIRTimestamp? {
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge422(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore387")
internal fun objcKniBridge388(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): FIRTimestamp? {
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge424(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_firebase_firestore389")
internal fun objcKniBridge390(kniSC: NativePtr, kniR: NativePtr): FIRTimestamp? {
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge426(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithSeconds:nanoseconds:", "@28@0:8q16i24", "knimi_com_firebase_firestore391")
internal fun objcKniBridge392(kniSC: NativePtr, kniR: NativePtr, seconds: int64_t, nanoseconds: int32_t): FIRTimestamp {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge428(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, seconds, nanoseconds))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dateValue", "@16@0:8", "knimi_com_firebase_firestore393")
internal fun objcKniBridge394(kniSC: NativePtr, kniR: NativePtr): NSDate {
    return interpretObjCPointerOrNull<NSDate>(kniBridge430(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("compare:", "q24@0:8@16", "knimi_com_firebase_firestore395")
internal fun objcKniBridge396(kniSC: NativePtr, kniR: NativePtr, other: FIRTimestamp): NSComparisonResult {
    return kniBridge432(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, other.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("seconds", "q16@0:8", "knimi_com_firebase_firestore397")
internal fun objcKniBridge398(kniSC: NativePtr, kniR: NativePtr): int64_t {
    return kniBridge434(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("nanoseconds", "i16@0:8", "knimi_com_firebase_firestore399")
internal fun objcKniBridge400(kniSC: NativePtr, kniR: NativePtr): int32_t {
    return kniBridge436(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_firebase_firestore401")
internal fun objcKniBridge402(kniSC: NativePtr, kniR: NativePtr): FIRTimestamp? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<FIRTimestamp>(kniBridge438(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_firebase_firestore403")
internal fun objcKniBridge404(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge440(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@SymbolName("com_firebase_firestore_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge1")
private fun kniBridge1(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRListenerRegistrationProtocol>().remove()
}
@SymbolName("com_firebase_firestore_kniBridge2")
private external fun kniBridge2(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge3")
private fun kniBridge3(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshotMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge4")
private external fun kniBridge4(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge5")
private fun kniBridge5(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshotMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge7")
private fun kniBridge7(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshotMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: NativePtr, p2: Byte): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge9")
private fun kniBridge9(p0: NativePtr, p1: Byte): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().documentChangesWithIncludeMetadataChanges(includeMetadataChanges = p1.toBoolean()).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge11")
private fun kniBridge11(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().query().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge12")
private external fun kniBridge12(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge13")
private fun kniBridge13(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().metadata().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge15")
private fun kniBridge15(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().isEmpty().toByte()
}
@SymbolName("com_firebase_firestore_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge17")
private fun kniBridge17(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().count()
}
@SymbolName("com_firebase_firestore_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge19")
private fun kniBridge19(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().documents().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge21")
private fun kniBridge21(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().documentChanges().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge23")
private fun kniBridge23(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuerySnapshot>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge25")
private fun kniBridge25(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge27")
private fun kniBridge27(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge29")
private fun kniBridge29(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryMeta>().alloc().objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge31")
private fun kniBridge31(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRQuerySnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRQuerySnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge32")
private fun kniBridge32(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().getDocumentsWithCompletion(completion = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRQuerySnapshot?, p1: NSError?): Unit {
return kniBridge33(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge35")
private fun kniBridge35(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRQuerySnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRQuerySnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge36")
private fun kniBridge36(p0: NativePtr, p1: ULong, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().getDocumentsWithSource(source = FIRFirestoreSource.byValue(p1), completion = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRQuerySnapshot?, p1: NSError?): Unit {
return kniBridge37(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge39")
private fun kniBridge39(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRQuerySnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRQuerySnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_firebase_firestore_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge40")
private fun kniBridge40(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().addSnapshotListener(listener = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRQuerySnapshot?, p1: NSError?): Unit {
return kniBridge41(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge43")
private fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRQuerySnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRQuerySnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr, p2: Byte, p3: NativePtr): NativePtr
@SymbolName("com_firebase_firestore_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge44")
private fun kniBridge44(p0: NativePtr, p1: Byte, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().addSnapshotListenerWithIncludeMetadataChanges(includeMetadataChanges = p1.toBoolean(), listener = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRQuerySnapshot?, p1: NSError?): Unit {
return kniBridge45(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge47")
private fun kniBridge47(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereField(field = interpretObjCPointerOrNull<String>(p1)!!, isEqualTo = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge49")
private fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!, isEqualTo = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge51")
private fun kniBridge51(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereField(field = interpretObjCPointerOrNull<String>(p1)!!, isLessThan = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge53")
private fun kniBridge53(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!, isLessThan = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge55")
private fun kniBridge55(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereField(field = interpretObjCPointerOrNull<String>(p1)!!, isLessThanOrEqualTo = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge57")
private fun kniBridge57(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!, isLessThanOrEqualTo = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge59")
private fun kniBridge59(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereField(field = interpretObjCPointerOrNull<String>(p1)!!, isGreaterThan = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge61")
private fun kniBridge61(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!, isGreaterThan = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge63")
private fun kniBridge63(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereField(field = interpretObjCPointerOrNull<String>(p1)!!, isGreaterThanOrEqualTo = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge65")
private fun kniBridge65(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!, isGreaterThanOrEqualTo = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge67")
private fun kniBridge67(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereField(field = interpretObjCPointerOrNull<String>(p1)!!, arrayContains = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge69")
private fun kniBridge69(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryWhereFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!, arrayContains = interpretObjCPointerOrNull<Any>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge71")
private fun kniBridge71(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryFilteredUsingPredicate(predicate = interpretObjCPointerOrNull<NSPredicate>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge73")
private fun kniBridge73(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryOrderedByField(field = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge74")
private external fun kniBridge74(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge75")
private fun kniBridge75(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryOrderedByFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Byte): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge77")
private fun kniBridge77(p0: NativePtr, p1: NativePtr, p2: Byte): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryOrderedByField(field = interpretObjCPointerOrNull<String>(p1)!!, descending = p2.toBoolean()).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge78")
private external fun kniBridge78(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Byte): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge79")
private fun kniBridge79(p0: NativePtr, p1: NativePtr, p2: Byte): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryOrderedByFieldPath(path = interpretObjCPointerOrNull<FIRFieldPath>(p1)!!, descending = p2.toBoolean()).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge81")
private fun kniBridge81(p0: NativePtr, p1: Long): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryLimitedTo(limit = p1).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge83")
private fun kniBridge83(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryStartingAtDocument(document = interpretObjCPointerOrNull<FIRDocumentSnapshot>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge85")
private fun kniBridge85(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryStartingAtValues(fieldValues = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge87")
private fun kniBridge87(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryStartingAfterDocument(document = interpretObjCPointerOrNull<FIRDocumentSnapshot>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge88")
private external fun kniBridge88(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge89")
private fun kniBridge89(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryStartingAfterValues(fieldValues = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge91")
private fun kniBridge91(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryEndingBeforeDocument(document = interpretObjCPointerOrNull<FIRDocumentSnapshot>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge93")
private fun kniBridge93(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryEndingBeforeValues(fieldValues = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge95")
private fun kniBridge95(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryEndingAtDocument(document = interpretObjCPointerOrNull<FIRDocumentSnapshot>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge97")
private fun kniBridge97(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().queryEndingAtValues(fieldValues = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge98")
private external fun kniBridge98(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge99")
private fun kniBridge99(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().firestore().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge101")
private fun kniBridge101(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQuery>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge103")
private fun kniBridge103(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldPathMeta>().documentID().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge104")
private external fun kniBridge104(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge105")
private fun kniBridge105(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldPathMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge106")
private external fun kniBridge106(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge107")
private fun kniBridge107(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldPathMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge108")
private external fun kniBridge108(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge109")
private fun kniBridge109(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldPathMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge111")
private fun kniBridge111(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldPath>().initWithFields(fieldNames = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge113")
private fun kniBridge113(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldPath>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge115")
private fun kniBridge115(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldPath>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge117")
private fun kniBridge117(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshotMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge119")
private fun kniBridge119(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshotMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge121")
private fun kniBridge121(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshotMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge122")
private external fun kniBridge122(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge123")
private fun kniBridge123(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().data().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge125")
private fun kniBridge125(p0: NativePtr, p1: Long): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().dataWithServerTimestampBehavior(serverTimestampBehavior = FIRServerTimestampBehavior.byValue(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge127")
private fun kniBridge127(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().valueForField(field = interpretObjCPointerOrNull<Any>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge129")
private fun kniBridge129(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().valueForField(field = interpretObjCPointerOrNull<Any>(p1)!!, serverTimestampBehavior = FIRServerTimestampBehavior.byValue(p2)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge131")
private fun kniBridge131(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().objectForKeyedSubscript(key = interpretObjCPointerOrNull<Any>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge133")
private fun kniBridge133(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().exists().toByte()
}
@SymbolName("com_firebase_firestore_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge135")
private fun kniBridge135(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().reference().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge137")
private fun kniBridge137(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().documentID().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge139")
private fun kniBridge139(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().metadata().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge140")
private external fun kniBridge140(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge141")
private fun kniBridge141(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentSnapshot>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge143")
private fun kniBridge143(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReferenceMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge145")
private fun kniBridge145(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReferenceMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge147")
private fun kniBridge147(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReferenceMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge149")
private fun kniBridge149(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().collectionWithPath(collectionPath = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge151")
private fun kniBridge151(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().setData(documentData = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!)
}
@SymbolName("com_firebase_firestore_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge153")
private fun kniBridge153(p0: NativePtr, p1: NativePtr, p2: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().setData(documentData = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, merge = p2.toBoolean())
}
@SymbolName("com_firebase_firestore_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge155")
private fun kniBridge155(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().setData(documentData = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, mergeFields = interpretObjCPointerOrNull<List<*>>(p2)!!)
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge157")
private fun kniBridge157(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge159")
private external fun kniBridge159(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge158")
private fun kniBridge158(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().setData(documentData = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, completion = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge159(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge161")
private fun kniBridge161(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Byte, p4: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge162")
private fun kniBridge162(p0: NativePtr, p1: NativePtr, p2: Byte, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().setData(documentData = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, merge = p2.toBoolean(), completion = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge163(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge165")
private fun kniBridge165(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge166")
private fun kniBridge166(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().setData(documentData = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, mergeFields = interpretObjCPointerOrNull<List<*>>(p2)!!, completion = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge167(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_firebase_firestore_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge169")
private fun kniBridge169(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().updateData(fields = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!)
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge171")
private fun kniBridge171(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge170")
private external fun kniBridge170(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge173")
private external fun kniBridge173(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge172")
private fun kniBridge172(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().updateData(fields = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, completion = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge173(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_firebase_firestore_kniBridge174")
private external fun kniBridge174(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge175")
private fun kniBridge175(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().deleteDocument()
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge177")
private fun kniBridge177(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge179")
private external fun kniBridge179(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge178")
private fun kniBridge178(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().deleteDocumentWithCompletion(completion = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge179(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge181")
private fun kniBridge181(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRDocumentSnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRDocumentSnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge183")
private external fun kniBridge183(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge182")
private fun kniBridge182(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().getDocumentWithCompletion(completion = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRDocumentSnapshot?, p1: NSError?): Unit {
return kniBridge183(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge185")
private fun kniBridge185(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRDocumentSnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRDocumentSnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge184")
private external fun kniBridge184(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge187")
private external fun kniBridge187(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge186")
private fun kniBridge186(p0: NativePtr, p1: ULong, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().getDocumentWithSource(source = FIRFirestoreSource.byValue(p1), completion = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRDocumentSnapshot?, p1: NSError?): Unit {
return kniBridge187(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge189")
private fun kniBridge189(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRDocumentSnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRDocumentSnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge188")
private external fun kniBridge188(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_firebase_firestore_kniBridge191")
private external fun kniBridge191(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge190")
private fun kniBridge190(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().addSnapshotListener(listener = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRDocumentSnapshot?, p1: NSError?): Unit {
return kniBridge191(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge193")
private fun kniBridge193(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(FIRDocumentSnapshot?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRDocumentSnapshot>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge192")
private external fun kniBridge192(p0: NativePtr, p1: NativePtr, p2: Byte, p3: NativePtr): NativePtr
@SymbolName("com_firebase_firestore_kniBridge195")
private external fun kniBridge195(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge194")
private fun kniBridge194(p0: NativePtr, p1: Byte, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().addSnapshotListenerWithIncludeMetadataChanges(includeMetadataChanges = p1.toBoolean(), listener = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: FIRDocumentSnapshot?, p1: NSError?): Unit {
return kniBridge195(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge197")
private fun kniBridge197(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().documentID().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge198")
private external fun kniBridge198(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge199")
private fun kniBridge199(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().parent().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge201")
private fun kniBridge201(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().firestore().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge202")
private external fun kniBridge202(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge203")
private fun kniBridge203(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().path().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge205")
private fun kniBridge205(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentReference>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge207")
private fun kniBridge207(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReferenceMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge208")
private external fun kniBridge208(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge209")
private fun kniBridge209(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReferenceMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge211")
private fun kniBridge211(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReferenceMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge212")
private external fun kniBridge212(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge213")
private fun kniBridge213(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().documentWithAutoID().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge214")
private external fun kniBridge214(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge215")
private fun kniBridge215(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().documentWithPath(documentPath = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge216")
private external fun kniBridge216(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge217")
private fun kniBridge217(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().addDocumentWithData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge219")
private fun kniBridge219(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge218")
private external fun kniBridge218(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("com_firebase_firestore_kniBridge221")
private external fun kniBridge221(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge220")
private fun kniBridge220(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().addDocumentWithData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, completion = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge221(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge222")
private external fun kniBridge222(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge223")
private fun kniBridge223(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().collectionID().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge225")
private fun kniBridge225(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().parent().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge226")
private external fun kniBridge226(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge227")
private fun kniBridge227(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().path().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge228")
private external fun kniBridge228(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge229")
private fun kniBridge229(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRCollectionReference>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge230")
private external fun kniBridge230(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge231")
private fun kniBridge231(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreMeta>().firestore().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge233")
private fun kniBridge233(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreMeta>().firestoreForApp(app = interpretObjCPointerOrNull<objcnames.classes.FIRApp>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge234")
private external fun kniBridge234(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge235")
private fun kniBridge235(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreMeta>().enableLogging(logging = p1.toBoolean())
}
@SymbolName("com_firebase_firestore_kniBridge236")
private external fun kniBridge236(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge237")
private fun kniBridge237(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge238")
private external fun kniBridge238(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge239")
private fun kniBridge239(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge240")
private external fun kniBridge240(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge241")
private fun kniBridge241(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge242")
private external fun kniBridge242(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge243")
private fun kniBridge243(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().collectionWithPath(collectionPath = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge244")
private external fun kniBridge244(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge245")
private fun kniBridge245(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().documentWithPath(documentPath = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge247")
private fun kniBridge247(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(FIRTransaction?, CPointer<ObjCObjectVar<NSError?>>?) -> Any?>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<FIRTransaction>(p0), interpretCPointer<ObjCObjectVar<NSError?>>(p1)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge248")
private fun kniBridge248(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<Any>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge246")
private external fun kniBridge246(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_firebase_firestore_kniBridge251")
private external fun kniBridge251(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge249")
private fun kniBridge249(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().runTransactionWithBlock(updateBlock = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: FIRTransaction?, p1: CPointer<ObjCObjectVar<NSError?>>?): Any? {
return interpretObjCPointerOrNull<Any>(kniBridge250(p0.objcPtr(), p1.rawValue, interpretCPointer<COpaque>(kniBlockPtr).rawValue))} }, completion = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: Any?, p1: NSError?): Unit {
return kniBridge251(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_firebase_firestore_kniBridge252")
private external fun kniBridge252(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge253")
private fun kniBridge253(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().batch().objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge255")
private fun kniBridge255(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge257")
private external fun kniBridge257(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge256")
private fun kniBridge256(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().enableNetworkWithCompletion(completion = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge257(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge259")
private fun kniBridge259(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge261")
private external fun kniBridge261(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge260")
private fun kniBridge260(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().disableNetworkWithCompletion(completion = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge261(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_firebase_firestore_kniBridge262")
private external fun kniBridge262(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge263")
private fun kniBridge263(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().settings().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge264")
private external fun kniBridge264(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge265")
private fun kniBridge265(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().setSettings(settings = interpretObjCPointerOrNull<FIRFirestoreSettings>(p1)!!)
}
@SymbolName("com_firebase_firestore_kniBridge266")
private external fun kniBridge266(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge267")
private fun kniBridge267(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().app().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge268")
private external fun kniBridge268(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge269")
private fun kniBridge269(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestore>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge270")
private external fun kniBridge270(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge271")
private fun kniBridge271(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransactionMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge272")
private external fun kniBridge272(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge273")
private fun kniBridge273(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransactionMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge274")
private external fun kniBridge274(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge275")
private fun kniBridge275(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransactionMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge276")
private external fun kniBridge276(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge277")
private fun kniBridge277(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransaction>().setData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge278")
private external fun kniBridge278(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Byte): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge279")
private fun kniBridge279(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Byte): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransaction>().setData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!, merge = p3.toBoolean()).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge280")
private external fun kniBridge280(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge281")
private fun kniBridge281(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransaction>().setData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!, mergeFields = interpretObjCPointerOrNull<List<*>>(p3)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge282")
private external fun kniBridge282(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge283")
private fun kniBridge283(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransaction>().updateData(fields = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge284")
private external fun kniBridge284(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge285")
private fun kniBridge285(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransaction>().deleteDocument(document = interpretObjCPointerOrNull<FIRDocumentReference>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge286")
private external fun kniBridge286(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge287")
private fun kniBridge287(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransaction>().getDocument(document = interpretObjCPointerOrNull<FIRDocumentReference>(p1)!!, error = interpretCPointer<ObjCObjectVar<NSError?>>(p2)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge288")
private external fun kniBridge288(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge289")
private fun kniBridge289(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTransaction>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge290")
private external fun kniBridge290(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge291")
private fun kniBridge291(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatchMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge292")
private external fun kniBridge292(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge293")
private fun kniBridge293(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatchMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge294")
private external fun kniBridge294(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge295")
private fun kniBridge295(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatchMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge296")
private external fun kniBridge296(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge297")
private fun kniBridge297(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().setData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge298")
private external fun kniBridge298(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Byte): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge299")
private fun kniBridge299(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Byte): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().setData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!, merge = p3.toBoolean()).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge300")
private external fun kniBridge300(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge301")
private fun kniBridge301(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().setData(data = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!, mergeFields = interpretObjCPointerOrNull<List<*>>(p3)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge302")
private external fun kniBridge302(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge303")
private fun kniBridge303(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().updateData(fields = interpretObjCPointerOrNull<Map<Any?, *>>(p1)!!, forDocument = interpretObjCPointerOrNull<FIRDocumentReference>(p2)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge304")
private external fun kniBridge304(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge305")
private fun kniBridge305(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().deleteDocument(document = interpretObjCPointerOrNull<FIRDocumentReference>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge306")
private external fun kniBridge306(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge307")
private fun kniBridge307(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().commit()
}
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge309")
private fun kniBridge309(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_firebase_firestore_kniBridge308")
private external fun kniBridge308(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_firebase_firestore_kniBridge311")
private external fun kniBridge311(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge310")
private fun kniBridge310(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().commitWithCompletion(completion = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge311(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_firebase_firestore_kniBridge312")
private external fun kniBridge312(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge313")
private fun kniBridge313(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRWriteBatch>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge314")
private external fun kniBridge314(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge315")
private fun kniBridge315(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettingsMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge316")
private external fun kniBridge316(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge317")
private fun kniBridge317(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettingsMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge318")
private external fun kniBridge318(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge319")
private fun kniBridge319(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettingsMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge320")
private external fun kniBridge320(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge321")
private fun kniBridge321(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge322")
private external fun kniBridge322(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge323")
private fun kniBridge323(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().host().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge324")
private external fun kniBridge324(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge325")
private fun kniBridge325(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().setHost(host = interpretObjCPointerOrNull<String>(p1)!!)
}
@SymbolName("com_firebase_firestore_kniBridge326")
private external fun kniBridge326(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge327")
private fun kniBridge327(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().isSSLEnabled().toByte()
}
@SymbolName("com_firebase_firestore_kniBridge328")
private external fun kniBridge328(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge329")
private fun kniBridge329(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().setSslEnabled(sslEnabled = p1.toBoolean())
}
@SymbolName("com_firebase_firestore_kniBridge330")
private external fun kniBridge330(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge331")
private fun kniBridge331(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().dispatchQueue().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge332")
private external fun kniBridge332(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge333")
private fun kniBridge333(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().setDispatchQueue(dispatchQueue = interpretObjCPointerOrNull<NSObject>(p1))
}
@SymbolName("com_firebase_firestore_kniBridge334")
private external fun kniBridge334(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge335")
private fun kniBridge335(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().isPersistenceEnabled().toByte()
}
@SymbolName("com_firebase_firestore_kniBridge336")
private external fun kniBridge336(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge337")
private fun kniBridge337(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().setPersistenceEnabled(persistenceEnabled = p1.toBoolean())
}
@SymbolName("com_firebase_firestore_kniBridge338")
private external fun kniBridge338(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge339")
private fun kniBridge339(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().areTimestampsInSnapshotsEnabled().toByte()
}
@SymbolName("com_firebase_firestore_kniBridge340")
private external fun kniBridge340(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge341")
private fun kniBridge341(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().setTimestampsInSnapshotsEnabled(timestampsInSnapshotsEnabled = p1.toBoolean())
}
@SymbolName("com_firebase_firestore_kniBridge342")
private external fun kniBridge342(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge343")
private fun kniBridge343(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFirestoreSettings>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge344")
private external fun kniBridge344(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge345")
private fun kniBridge345(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRSnapshotMetadataMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge346")
private external fun kniBridge346(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge347")
private fun kniBridge347(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRSnapshotMetadataMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge348")
private external fun kniBridge348(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge349")
private fun kniBridge349(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRSnapshotMetadataMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge350")
private external fun kniBridge350(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge351")
private fun kniBridge351(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRSnapshotMetadata>().hasPendingWrites().toByte()
}
@SymbolName("com_firebase_firestore_kniBridge352")
private external fun kniBridge352(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge353")
private fun kniBridge353(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRSnapshotMetadata>().isFromCache().toByte()
}
@SymbolName("com_firebase_firestore_kniBridge354")
private external fun kniBridge354(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge355")
private fun kniBridge355(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRSnapshotMetadata>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge356")
private external fun kniBridge356(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge357")
private fun kniBridge357(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChangeMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge358")
private external fun kniBridge358(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge359")
private fun kniBridge359(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChangeMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge360")
private external fun kniBridge360(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge361")
private fun kniBridge361(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChangeMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge362")
private external fun kniBridge362(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge363")
private fun kniBridge363(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChange>().type().value
}
@SymbolName("com_firebase_firestore_kniBridge364")
private external fun kniBridge364(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge365")
private fun kniBridge365(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChange>().document().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge366")
private external fun kniBridge366(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge367")
private fun kniBridge367(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChange>().oldIndex()
}
@SymbolName("com_firebase_firestore_kniBridge368")
private external fun kniBridge368(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge369")
private fun kniBridge369(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChange>().newIndex()
}
@SymbolName("com_firebase_firestore_kniBridge370")
private external fun kniBridge370(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge371")
private fun kniBridge371(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRDocumentChange>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge372")
private external fun kniBridge372(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge373")
private fun kniBridge373(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryDocumentSnapshotMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge374")
private external fun kniBridge374(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge375")
private fun kniBridge375(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryDocumentSnapshotMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge376")
private external fun kniBridge376(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge377")
private fun kniBridge377(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryDocumentSnapshotMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge378")
private external fun kniBridge378(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge379")
private fun kniBridge379(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryDocumentSnapshot>().data().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge380")
private external fun kniBridge380(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge381")
private fun kniBridge381(p0: NativePtr, p1: Long): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryDocumentSnapshot>().dataWithServerTimestampBehavior(serverTimestampBehavior = FIRServerTimestampBehavior.byValue(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge382")
private external fun kniBridge382(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge383")
private fun kniBridge383(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRQueryDocumentSnapshot>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge384")
private external fun kniBridge384(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge385")
private fun kniBridge385(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValueMeta>().fieldValueForDelete().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge386")
private external fun kniBridge386(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge387")
private fun kniBridge387(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValueMeta>().fieldValueForServerTimestamp().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge388")
private external fun kniBridge388(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge389")
private fun kniBridge389(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValueMeta>().fieldValueForArrayUnion(elements = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge390")
private external fun kniBridge390(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge391")
private fun kniBridge391(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValueMeta>().fieldValueForArrayRemove(elements = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge392")
private external fun kniBridge392(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge393")
private fun kniBridge393(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValueMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge394")
private external fun kniBridge394(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge395")
private fun kniBridge395(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValueMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge396")
private external fun kniBridge396(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge397")
private fun kniBridge397(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValueMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge398")
private external fun kniBridge398(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge399")
private fun kniBridge399(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRFieldValue>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge400")
private external fun kniBridge400(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge401")
private fun kniBridge401(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPointMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge402")
private external fun kniBridge402(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge403")
private fun kniBridge403(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPointMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge404")
private external fun kniBridge404(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge405")
private fun kniBridge405(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPointMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge406")
private external fun kniBridge406(p0: NativePtr, p1: NativePtr, p2: Double, p3: Double): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge407")
private fun kniBridge407(p0: NativePtr, p1: Double, p2: Double): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPoint>().initWithLatitude(latitude = p1, longitude = p2).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge408")
private external fun kniBridge408(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge409")
private fun kniBridge409(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPoint>().latitude()
}
@SymbolName("com_firebase_firestore_kniBridge410")
private external fun kniBridge410(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge411")
private fun kniBridge411(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPoint>().longitude()
}
@SymbolName("com_firebase_firestore_kniBridge412")
private external fun kniBridge412(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge413")
private fun kniBridge413(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPoint>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge414")
private external fun kniBridge414(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge415")
private fun kniBridge415(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRGeoPoint>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge416")
private external fun kniBridge416(p0: NativePtr, p1: NativePtr, p2: Long, p3: Int): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge417")
private fun kniBridge417(p0: NativePtr, p1: Long, p2: Int): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestampMeta>().timestampWithSeconds(seconds = p1, nanoseconds = p2).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge418")
private external fun kniBridge418(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge419")
private fun kniBridge419(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestampMeta>().timestampWithDate(date = interpretObjCPointerOrNull<NSDate>(p1)!!).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge420")
private external fun kniBridge420(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge421")
private fun kniBridge421(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestampMeta>().timestamp().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge422")
private external fun kniBridge422(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge423")
private fun kniBridge423(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestampMeta>().new().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge424")
private external fun kniBridge424(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge425")
private fun kniBridge425(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestampMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge426")
private external fun kniBridge426(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge427")
private fun kniBridge427(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestampMeta>().alloc().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge428")
private external fun kniBridge428(p0: NativePtr, p1: NativePtr, p2: Long, p3: Int): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge429")
private fun kniBridge429(p0: NativePtr, p1: Long, p2: Int): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestamp>().initWithSeconds(seconds = p1, nanoseconds = p2).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge430")
private external fun kniBridge430(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge431")
private fun kniBridge431(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestamp>().dateValue().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge432")
private external fun kniBridge432(p0: NativePtr, p1: NativePtr, p2: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge433")
private fun kniBridge433(p0: NativePtr, p1: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestamp>().compare(other = interpretObjCPointerOrNull<FIRTimestamp>(p1)!!)
}
@SymbolName("com_firebase_firestore_kniBridge434")
private external fun kniBridge434(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge435")
private fun kniBridge435(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestamp>().seconds()
}
@SymbolName("com_firebase_firestore_kniBridge436")
private external fun kniBridge436(p0: NativePtr, p1: NativePtr): Int
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge437")
private fun kniBridge437(p0: NativePtr): Int {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestamp>().nanoseconds()
}
@SymbolName("com_firebase_firestore_kniBridge438")
private external fun kniBridge438(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge439")
private fun kniBridge439(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestamp>().init().objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge440")
private external fun kniBridge440(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_firebase_firestore_kniBridge441")
private fun kniBridge441(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<FIRTimestamp>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_firebase_firestore_kniBridge442")
private external fun kniBridge442(): NativePtr
