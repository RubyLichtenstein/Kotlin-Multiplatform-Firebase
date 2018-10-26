@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("admin")
package rubylich.ktmp.functions.ts2kt_firebase_admin

external interface FirebaseError {
    var code: String
    var message: String
    var stack: String
    fun toJSON(): Any
}
external interface FirebaseArrayIndexError {
    var index: Number
    var error: FirebaseError
}
external interface ServiceAccount {
    var projectId: String? get() = definedExternally; set(value) = definedExternally
    var clientEmail: String? get() = definedExternally; set(value) = definedExternally
    var privateKey: String? get() = definedExternally; set(value) = definedExternally
}
external interface GoogleOAuthAccessToken {
    var access_token: String
    var expires_in: Number
}
external interface AppOptions {
//    var credential: admin.credential.Credential? get() = definedExternally; set(value) = definedExternally
    var databaseAuthVariableOverride: Any? get() = definedExternally; set(value) = definedExternally
    var databaseURL: String? get() = definedExternally; set(value) = definedExternally
    var storageBucket: String? get() = definedExternally; set(value) = definedExternally
    var projectId: String? get() = definedExternally; set(value) = definedExternally
}
external var SDK_VERSION: String = definedExternally
external var apps: Array<admin.app.App> = definedExternally
external fun app(name: String? = definedExternally /* null */): admin.app.App = definedExternally
external fun auth(app: admin.app.App? = definedExternally /* null */): admin.auth.Auth = definedExternally
external fun database(app: admin.app.App? = definedExternally /* null */): admin.database.Database = definedExternally
external fun messaging(app: admin.app.App? = definedExternally /* null */): admin.messaging.Messaging = definedExternally
external fun storage(app: admin.app.App? = definedExternally /* null */): admin.storage.Storage = definedExternally
//external fun firestore(app: admin.app.App? = definedExternally /* null */): Firestore = definedExternally
external fun instanceId(app: admin.app.App? = definedExternally /* null */): admin.instanceId.InstanceId = definedExternally
external fun initializeApp(options: AppOptions? = definedExternally /* null */, name: String? = definedExternally /* null */): admin.app.App = definedExternally
