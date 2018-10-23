@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("admin.auth")
package admin.auth

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

external interface UserMetadata {
    var lastSignInTime: String
    var creationTime: String
    fun toJSON(): Any
}
external interface UserInfo {
    var uid: String
    var displayName: String
    var email: String
    var phoneNumber: String
    var photoURL: String
    var providerId: String
    fun toJSON(): Any
}
external interface UserRecord {
    var uid: String
    var email: String
    var emailVerified: Boolean
    var displayName: String
    var phoneNumber: String
    var photoURL: String
    var disabled: Boolean
    var metadata: UserMetadata
    var providerData: Array<UserInfo>
    var passwordHash: String? get() = definedExternally; set(value) = definedExternally
    var passwordSalt: String? get() = definedExternally; set(value) = definedExternally
    var customClaims: Any? get() = definedExternally; set(value) = definedExternally
    var tokensValidAfterTime: String? get() = definedExternally; set(value) = definedExternally
    fun toJSON(): Any
}
external interface UpdateRequest {
    var displayName: String? get() = definedExternally; set(value) = definedExternally
    var email: String? get() = definedExternally; set(value) = definedExternally
    var emailVerified: Boolean? get() = definedExternally; set(value) = definedExternally
    var phoneNumber: String? get() = definedExternally; set(value) = definedExternally
    var photoURL: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var password: String? get() = definedExternally; set(value) = definedExternally
}
external interface CreateRequest : UpdateRequest {
    var uid: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var identities: Json
    var sign_in_provider: String
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface DecodedIdToken {
    var aud: String
    var auth_time: Number
    var exp: Number
    var firebase: `T$0`
    var iat: Number
    var iss: String
    var sub: String
    var uid: String
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface ListUsersResult {
    var users: Array<UserRecord>
    var pageToken: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$1` {
    var algorithm: dynamic /* String /* "SCRYPT" */ | String /* "STANDARD_SCRYPT" */ | String /* "HMAC_SHA512" */ | String /* "HMAC_SHA256" */ | String /* "HMAC_SHA1" */ | String /* "HMAC_MD5" */ | String /* "MD5" */ | String /* "PBKDF_SHA1" */ | String /* "BCRYPT" */ | String /* "PBKDF2_SHA256" */ | String /* "SHA512" */ | String /* "SHA256" */ | String /* "SHA1" */ */
//    var key: Buffer? get() = definedExternally; set(value) = definedExternally
    var saltSeparator: String? get() = definedExternally; set(value) = definedExternally
    var rounds: Number? get() = definedExternally; set(value) = definedExternally
    var memoryCost: Number? get() = definedExternally; set(value) = definedExternally
    var parallelization: Number? get() = definedExternally; set(value) = definedExternally
    var blockSize: Number? get() = definedExternally; set(value) = definedExternally
    var derivedKeyLength: Number? get() = definedExternally; set(value) = definedExternally
}
external interface UserImportOptions {
    var hash: `T$1`
}
external interface UserImportResult {
    var failureCount: Number
    var successCount: Number
//    var errors: Array<admin.FirebaseArrayIndexError>
}
external interface `T$2` {
    var lastSignInTime: String? get() = definedExternally; set(value) = definedExternally
    var creationTime: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$3` {
    var uid: String
    var displayName: String? get() = definedExternally; set(value) = definedExternally
    var email: String? get() = definedExternally; set(value) = definedExternally
    var photoURL: String? get() = definedExternally; set(value) = definedExternally
    var providerId: String
}
external interface UserImportRecord {
    var uid: String
    var email: String? get() = definedExternally; set(value) = definedExternally
    var emailVerified: Boolean? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
    var phoneNumber: String? get() = definedExternally; set(value) = definedExternally
    var photoURL: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var metadata: `T$2`? get() = definedExternally; set(value) = definedExternally
    var providerData: Array<`T$3`>? get() = definedExternally; set(value) = definedExternally
    var customClaims: Any? get() = definedExternally; set(value) = definedExternally
//    var passwordHash: Buffer? get() = definedExternally; set(value) = definedExternally
//    var passwordSalt: Buffer? get() = definedExternally; set(value) = definedExternally
}
external interface SessionCookieOptions {
    var expiresIn: Number
}
external interface Auth {
    var app: admin.app.App
    fun createCustomToken(uid: String, developerClaims: Any? = definedExternally /* null */): Promise<String>
    fun createUser(properties: CreateRequest): Promise<UserRecord>
    fun deleteUser(uid: String): Promise<Unit>
    fun getUser(uid: String): Promise<UserRecord>
    fun getUserByEmail(email: String): Promise<UserRecord>
    fun getUserByPhoneNumber(phoneNumber: String): Promise<UserRecord>
    fun listUsers(maxResults: Number? = definedExternally /* null */, pageToken: String? = definedExternally /* null */): Promise<ListUsersResult>
    fun updateUser(uid: String, properties: UpdateRequest): Promise<UserRecord>
    fun verifyIdToken(idToken: String, checkRevoked: Boolean? = definedExternally /* null */): Promise<DecodedIdToken>
    fun setCustomUserClaims(uid: String, customUserClaims: Any): Promise<Unit>
    fun revokeRefreshTokens(uid: String): Promise<Unit>
    fun importUsers(users: Array<UserImportRecord>, options: UserImportOptions? = definedExternally /* null */): Promise<UserImportResult>
    fun createSessionCookie(idToken: String, sessionCookieOptions: SessionCookieOptions): Promise<String>
    fun verifySessionCookie(sessionCookie: String, checkForRevocation: Boolean? = definedExternally /* null */): Promise<DecodedIdToken>
}
