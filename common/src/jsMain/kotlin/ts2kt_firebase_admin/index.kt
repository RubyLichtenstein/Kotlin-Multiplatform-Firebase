@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

external interface `T$5` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface BaseMessage {
    var data: `T$5`? get() = definedExternally; set(value) = definedExternally
    var notification: admin.messaging.Notification? get() = definedExternally; set(value) = definedExternally
    var android: admin.messaging.AndroidConfig? get() = definedExternally; set(value) = definedExternally
    var webpush: admin.messaging.WebpushConfig? get() = definedExternally; set(value) = definedExternally
    var apns: admin.messaging.ApnsConfig? get() = definedExternally; set(value) = definedExternally
}
external interface TokenMessage : BaseMessage {
    var token: String
}
external interface TopicMessage : BaseMessage {
    var topic: String
}
external interface ConditionMessage : BaseMessage {
    var condition: String
}
