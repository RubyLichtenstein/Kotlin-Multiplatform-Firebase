@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("admin.app")
package admin.app

import rubylich.ktmp.functions.ts2kt_firebase_admin.Firestore
import kotlin.js.*

external interface App {
    var name: String
//    var options: admin.AppOptions
    fun auth(): admin.auth.Auth
    fun database(url: String? = definedExternally /* null */): admin.database.Database
    fun firestore(): Firestore
    fun instanceId(): admin.instanceId.InstanceId
    fun messaging(): admin.messaging.Messaging
    fun storage(): admin.storage.Storage
    fun delete(): Promise<Unit>
}
