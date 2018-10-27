@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("admin.database")
package admin.database

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface Database {
    var app: admin.app.App
    fun goOffline()
    fun goOnline()
    fun ref(path: String? = definedExternally /* null */): Reference
    fun ref(path: Reference? = definedExternally /* null */): Reference
    fun refFromURL(url: String): Reference
    fun ref(): Reference
}
external interface DataSnapshot {
    var key: String?
    var ref: Reference
    fun child(path: String): DataSnapshot
    fun exists(): Boolean
    fun exportVal(): Any
    fun forEach(action: (a: DataSnapshot) -> Boolean): Boolean
    fun getPriority(): dynamic /* String | Number | Nothing? */
    fun hasChild(path: String): Boolean
    fun hasChildren(): Boolean
    fun numChildren(): Number
    fun toJSON(): Any?
    fun `val`(): Any
}
external interface OnDisconnect {
    fun cancel(onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun remove(onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun set(value: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(value: Any, priority: String, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(value: Any, priority: Number, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(value: Any, priority: Nothing?, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun update(values: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
}
external interface Query {
    var ref: Reference
    fun endAt(value: String, key: String? = definedExternally /* null */): Query
    fun endAt(value: Number, key: String? = definedExternally /* null */): Query
    fun endAt(value: Boolean, key: String? = definedExternally /* null */): Query
    fun endAt(value: Nothing?, key: String? = definedExternally /* null */): Query
    fun equalTo(value: String, key: String? = definedExternally /* null */): Query
    fun equalTo(value: Number, key: String? = definedExternally /* null */): Query
    fun equalTo(value: Boolean, key: String? = definedExternally /* null */): Query
    fun equalTo(value: Nothing?, key: String? = definedExternally /* null */): Query
    fun isEqual(other: Query?): Boolean
    fun limitToFirst(limit: Number): Query
    fun limitToLast(limit: Number): Query
    fun off(eventType: String? /* "value" */ = definedExternally /* null */, callback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, context: Any? = definedExternally /* null */)
    fun off(eventType: String? /* "child_added" */ = definedExternally /* null */, callback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, context: Any? = definedExternally /* null */)
    fun off(eventType: String? /* "child_changed" */ = definedExternally /* null */, callback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, context: Any? = definedExternally /* null */)
    fun off(eventType: String? /* "child_moved" */ = definedExternally /* null */, callback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, context: Any? = definedExternally /* null */)
    fun off(eventType: String? /* "child_removed" */ = definedExternally /* null */, callback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, context: Any? = definedExternally /* null */)
    fun on(eventType: String /* "value" */, callback: (a: DataSnapshot?, b: String? /*= null*/) -> Any, cancelCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): (a: DataSnapshot?, b: String? /*= null*/) -> Any
    fun on(eventType: String /* "child_added" */, callback: (a: DataSnapshot?, b: String? /*= null*/) -> Any, cancelCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): (a: DataSnapshot?, b: String? /*= null*/) -> Any
    fun on(eventType: String /* "child_changed" */, callback: (a: DataSnapshot?, b: String? /*= null*/) -> Any, cancelCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): (a: DataSnapshot?, b: String? /*= null*/) -> Any
    fun on(eventType: String /* "child_moved" */, callback: (a: DataSnapshot?, b: String? /*= null*/) -> Any, cancelCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): (a: DataSnapshot?, b: String? /*= null*/) -> Any
    fun on(eventType: String /* "child_removed" */, callback: (a: DataSnapshot?, b: String? /*= null*/) -> Any, cancelCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): (a: DataSnapshot?, b: String? /*= null*/) -> Any
    fun onceValue(eventType: String /* "value" */, successCallback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, failureCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): Promise<Any>
    fun once(eventType: String /* "child_added" */, successCallback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, failureCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): Promise<Any>
    fun once(eventType: String /* "child_changed" */, successCallback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, failureCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): Promise<Any>
    fun once(eventType: String /* "child_moved" */, successCallback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, failureCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): Promise<Any>
    fun once(eventType: String /* "child_removed" */, successCallback: ((a: DataSnapshot, b: String? /*= null*/) -> Any)? = definedExternally /* null */, failureCallbackOrContext: Any? = definedExternally /* null */, context: Any? = definedExternally /* null */): Promise<Any>
    fun orderByChild(path: String): Query
    fun orderByKey(): Query
    fun orderByPriority(): Query
    fun orderByValue(): Query
    fun startAt(value: String, key: String? = definedExternally /* null */): Query
    fun startAt(value: Number, key: String? = definedExternally /* null */): Query
    fun startAt(value: Boolean, key: String? = definedExternally /* null */): Query
    fun startAt(value: Nothing?, key: String? = definedExternally /* null */): Query
    fun toJSON(): Any
    override fun toString(): String
    fun off()
}
external interface `T$4` {
    var committed: Boolean
    var snapshot: DataSnapshot?
}
external interface Reference : Query {
    var key: String?
    var parent: Reference?
    var root: Reference
    var path: String
    fun child(path: String): Reference
    fun onDisconnect(): OnDisconnect
    fun push(value: Any? = definedExternally /* null */, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): ThenableReference
    fun remove(onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun set(value: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setPriority(priority: String, onComplete: (a: Error?) -> Any): Promise<Unit>
    fun setPriority(priority: Number, onComplete: (a: Error?) -> Any): Promise<Unit>
    fun setPriority(priority: Nothing?, onComplete: (a: Error?) -> Any): Promise<Unit>
    fun setWithPriority(newVal: Any, newPriority: String, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(newVal: Any, newPriority: Number, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun setWithPriority(newVal: Any, newPriority: Nothing?, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
    fun transaction(transactionUpdate: (a: Any) -> Any, onComplete: ((a: Error?, b: Boolean, c: DataSnapshot?) -> Any)? = definedExternally /* null */, applyLocally: Boolean? = definedExternally /* null */): Promise<`T$4`>
    fun update(values: Any, onComplete: ((a: Error?) -> Any)? = definedExternally /* null */): Promise<Unit>
}
external interface ThenableReference : Reference, Promise<Any>
external fun enableLogging(logger: Boolean? = definedExternally /* null */, persistent: Boolean? = definedExternally /* null */): Any = definedExternally
external fun enableLogging(logger: ((message: String) -> Any)? = definedExternally /* null */, persistent: Boolean? = definedExternally /* null */): Any = definedExternally
external fun enableLogging(): Any = definedExternally
