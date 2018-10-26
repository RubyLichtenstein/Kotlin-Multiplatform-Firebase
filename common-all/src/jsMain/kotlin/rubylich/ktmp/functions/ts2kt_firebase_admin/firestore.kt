@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("firebase-functions/lib/providers/firestore")

package rubylich.ktmp.functions.ts2kt_firebase_admin

import kotlin.js.Promise

external fun document(path: String): DocumentBuilder = definedExternally
external open class DatabaseBuilder {
    open var database: Any = definedExternally
    open var opts: Any = definedExternally
    open fun namespace(namespace: String): NamespaceBuilder = definedExternally
    open fun document(path: String): DocumentBuilder = definedExternally
}
external open class NamespaceBuilder {
    open var database: Any = definedExternally
    open var opts: Any = definedExternally
    open var namespace: Any = definedExternally
    open fun document(path: String): DocumentBuilder = definedExternally
}
external open class DocumentBuilder {
    open var triggerResource: Any = definedExternally
    open var opts: Any = definedExternally
    open fun onWrite(handler: (change: Change<DocumentSnapshot>, context: EventContext) -> dynamic /* PromiseLike<Any> | Any */): dynamic = definedExternally
    open fun onUpdate(handler: (change: Change<DocumentSnapshot>, context: EventContext) -> dynamic /* PromiseLike<Any> | Any */): dynamic = definedExternally
    open fun onCreate(handler: (snapshot: DocumentSnapshot, context: EventContext) -> Promise<Any> /*| Any */): Promise<Any> = definedExternally
    open fun onDelete(handler: (snapshot: DocumentSnapshot, context: EventContext) -> dynamic /* PromiseLike<Any> | Any */): dynamic = definedExternally
    open fun <T> onOperation(handler: Any, eventType: Any, dataConstructor: Any): Unit = definedExternally
}
