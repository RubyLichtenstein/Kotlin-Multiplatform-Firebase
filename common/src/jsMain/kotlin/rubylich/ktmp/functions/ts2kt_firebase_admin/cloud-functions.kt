@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package rubylich.ktmp.functions.ts2kt_firebase_admin

import kotlin.js.Json

external interface `T$0` {
    var uid: String
    var token: Any
}
external interface EventContext {
    var eventId: String
    var timestamp: String
    var eventType: String
    var resource: Resource
    var params: Json
    var authType: dynamic /* String /* "ADMIN" */ | String /* "USER" */ | String /* "UNAUTHENTICATED" */ */ get() = definedExternally; set(value) = definedExternally
    var auth: `T$0`? get() = definedExternally; set(value) = definedExternally
}
external open class Change<T>(before: T? = definedExternally /* null */, after: T? = definedExternally /* null */) {
    open var before: T = definedExternally
    open var after: T = definedExternally
    companion object {
        fun <T> fromObjects(before: T, after: T): Change<T> = definedExternally
        fun <T> fromJSON(json: ChangeJson, customizer: ((x: Any) -> T)? = definedExternally /* null */): Change<T> = definedExternally
    }
}
external interface ChangeJson {
    var before: Any? get() = definedExternally; set(value) = definedExternally
    var after: Any? get() = definedExternally; set(value) = definedExternally
    var fieldMask: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$1` {
    @nativeGetter
    operator fun get(tag: String): String?
    @nativeSetter
    operator fun set(tag: String, value: String)
}
external interface Resource {
    var service: String
    var name: String
    var type: String? get() = definedExternally; set(value) = definedExternally
    var labels: `T$1`? get() = definedExternally; set(value) = definedExternally
}
external interface `T$2` {
    var eventType: String
    var resource: String
    var service: String
}
external interface `T$3` {
    var httpsTrigger: Any? get() = definedExternally; set(value) = definedExternally
    var eventTrigger: `T$2`? get() = definedExternally; set(value) = definedExternally
    var labels: `T$1`? get() = definedExternally; set(value) = definedExternally
    var regions: Array<String>? get() = definedExternally; set(value) = definedExternally
    var timeout: String? get() = definedExternally; set(value) = definedExternally
    var availableMemoryMb: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TriggerAnnotated {
    var __trigger: `T$3`
}
external interface Runnable<T> {
    var run: (data: T, context: Any) -> dynamic /* PromiseLike<Any> | Any */
}
//external fun optsToTrigger(opts: DeploymentOptions): Any = definedExternally
