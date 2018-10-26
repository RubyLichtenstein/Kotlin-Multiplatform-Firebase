@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("admin.messaging")
package admin.messaging

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

external interface `T$6` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface AndroidConfig {
    var collapseKey: String? get() = definedExternally; set(value) = definedExternally
    var priority: dynamic /* String /* "high" */ | String /* "normal" */ */ get() = definedExternally; set(value) = definedExternally
    var ttl: Number? get() = definedExternally; set(value) = definedExternally
    var restrictedPackageName: String? get() = definedExternally; set(value) = definedExternally
    var data: `T$6`? get() = definedExternally; set(value) = definedExternally
    var notification: admin.messaging.AndroidNotification? get() = definedExternally; set(value) = definedExternally
}
external interface AndroidNotification {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var sound: String? get() = definedExternally; set(value) = definedExternally
    var tag: String? get() = definedExternally; set(value) = definedExternally
    var clickAction: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocKey: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var titleLocKey: String? get() = definedExternally; set(value) = definedExternally
    var titleLocArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface ApnsConfig {
    var headers: `T$6`? get() = definedExternally; set(value) = definedExternally
    var payload: admin.messaging.ApnsPayload? get() = definedExternally; set(value) = definedExternally
}
external interface ApnsPayload {
    var aps: admin.messaging.Aps
    @nativeGetter
    operator fun get(customData: String): Any?
    @nativeSetter
    operator fun set(customData: String, value: Any)
}
external interface Aps {
    var alert: dynamic /* String | admin.messaging.ApsAlert */ get() = definedExternally; set(value) = definedExternally
    var badge: Number? get() = definedExternally; set(value) = definedExternally
    var sound: String? get() = definedExternally; set(value) = definedExternally
    var contentAvailable: Boolean? get() = definedExternally; set(value) = definedExternally
    var mutableContent: Boolean? get() = definedExternally; set(value) = definedExternally
    var category: String? get() = definedExternally; set(value) = definedExternally
    var threadId: String? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(customData: String): Any?
    @nativeSetter
    operator fun set(customData: String, value: Any)
}
external interface ApsAlert {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var locKey: String? get() = definedExternally; set(value) = definedExternally
    var locArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var titleLocKey: String? get() = definedExternally; set(value) = definedExternally
    var titleLocArgs: Array<String>? get() = definedExternally; set(value) = definedExternally
    var actionLocKey: String? get() = definedExternally; set(value) = definedExternally
    var launchImage: String? get() = definedExternally; set(value) = definedExternally
}
external interface Notification {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
}
external interface WebpushConfig {
    var headers: `T$6`? get() = definedExternally; set(value) = definedExternally
    var data: `T$6`? get() = definedExternally; set(value) = definedExternally
    var notification: admin.messaging.WebpushNotification? get() = definedExternally; set(value) = definedExternally
}
external interface WebpushNotification {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
}
external class DataMessagePayload {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external class NotificationMessagePayload {
    var tag: String? get() = definedExternally; set(value) = definedExternally
    var body: String? get() = definedExternally; set(value) = definedExternally
    var icon: String? get() = definedExternally; set(value) = definedExternally
    var badge: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var sound: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocKey: String? get() = definedExternally; set(value) = definedExternally
    var bodyLocArgs: String? get() = definedExternally; set(value) = definedExternally
    var clickAction: String? get() = definedExternally; set(value) = definedExternally
    var titleLocKey: String? get() = definedExternally; set(value) = definedExternally
    var titleLocArgs: String? get() = definedExternally; set(value) = definedExternally
}
external object MessagingPayload {
    var data: admin.messaging.DataMessagePayload? get() = definedExternally; set(value) = definedExternally
    var notification: admin.messaging.NotificationMessagePayload? get() = definedExternally; set(value) = definedExternally
}

external class MessagingOptions {
    var dryRun: Boolean? get() = definedExternally; set(value) = definedExternally
    var priority: String? get() = definedExternally; set(value) = definedExternally
    var timeToLive: Number? get() = definedExternally; set(value) = definedExternally
    var collapseKey: String? get() = definedExternally; set(value) = definedExternally
    var mutableContent: Boolean? get() = definedExternally; set(value) = definedExternally
    var contentAvailable: Boolean? get() = definedExternally; set(value) = definedExternally
    var restrictedPackageName: String? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any?)
}
external interface MessagingDeviceResult {
//    var error: admin.FirebaseError? get() = definedExternally; set(value) = definedExternally
    var messageId: String? get() = definedExternally; set(value) = definedExternally
    var canonicalRegistrationToken: String? get() = definedExternally; set(value) = definedExternally
}
external interface MessagingDevicesResponse {
    var canonicalRegistrationTokenCount: Number
    var failureCount: Number
    var multicastId: Number
    var results: Array<admin.messaging.MessagingDeviceResult>
    var successCount: Number
}
external interface MessagingDeviceGroupResponse {
    var successCount: Number
    var failureCount: Number
    var failedRegistrationTokens: Array<String>
}
external interface MessagingTopicResponse {
    var messageId: Number
}
external interface MessagingConditionResponse {
    var messageId: Number
}
external interface MessagingTopicManagementResponse {
    var failureCount: Number
    var successCount: Number
//    var errors: Array<admin.FirebaseArrayIndexError>
}
external object Messaging {
    var app: admin.app.App
//    fun send(message: TokenMessage, dryRun: Boolean? = definedExternally /* null */): Promise<String>
//    fun send(message: TopicMessage, dryRun: Boolean? = definedExternally /* null */): Promise<String>
//    fun send(message: ConditionMessage, dryRun: Boolean? = definedExternally /* null */): Promise<String>
    fun sendToDevice(registrationToken: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingDevicesResponse>
    fun sendToDevice(registrationToken: Array<String>, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingDevicesResponse>
    fun sendToDeviceGroup(notificationKey: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingDeviceGroupResponse>
    fun sendToTopic(topic: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingTopicResponse>
    fun sendToCondition(condition: String, payload: admin.messaging.MessagingPayload, options: admin.messaging.MessagingOptions? = definedExternally /* null */): Promise<admin.messaging.MessagingConditionResponse>
    fun subscribeToTopic(registrationToken: String, topic: String): Promise<admin.messaging.MessagingTopicManagementResponse>
    fun subscribeToTopic(registrationTokens: Array<String>, topic: String): Promise<admin.messaging.MessagingTopicManagementResponse>
    fun unsubscribeFromTopic(registrationToken: String, topic: String): Promise<admin.messaging.MessagingTopicManagementResponse>
    fun unsubscribeFromTopic(registrationTokens: Array<String>, topic: String): Promise<admin.messaging.MessagingTopicManagementResponse>
}
