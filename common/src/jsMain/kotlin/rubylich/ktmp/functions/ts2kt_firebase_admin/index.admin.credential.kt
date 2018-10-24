//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
//@file:JsQualifier("admin.credential")
//package admin.credential
//
//import kotlin.js.*
//import kotlin.js.Json
//import org.khronos.webgl.*
//import org.w3c.dom.*
//import org.w3c.dom.events.*
//import org.w3c.dom.parsing.*
//import org.w3c.dom.svg.*
//import org.w3c.dom.url.*
//import org.w3c.fetch.*
//import org.w3c.files.*
//import org.w3c.notifications.*
//import org.w3c.performance.*
//import org.w3c.workers.*
//import org.w3c.xhr.*
//
//external interface Credential {
//    fun getAccessToken(): Promise<admin.GoogleOAuthAccessToken>
//}
//external fun applicationDefault(): Credential = definedExternally
//external fun cert(serviceAccountPathOrObject: String): Credential = definedExternally
//external fun cert(serviceAccountPathOrObject: admin.ServiceAccount): Credential = definedExternally
//external fun refreshToken(refreshTokenPathOrObject: String): Credential = definedExternally
//external fun refreshToken(refreshTokenPathOrObject: Any): Credential = definedExternally
