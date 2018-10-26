package rubylich.ktmp.functions.lib

import firebaseAdmin
import kotlin.js.*

fun defaultNotificationOptions() = json(
    "priority" to "high",
    "timeToLive" to 60 * 60 * 24
)

fun sendDataNotificationToTopic(
    topic: String,
    payload: Any,
    options: Json = defaultNotificationOptions()
): Promise<Unit> {

    val payloadJson = json("data" to payload)
    console.log(
        "sendDataNotificationToTopic, topic: $topic, payload: ${JSON.stringify(
            payload
        )}, options: ${JSON.stringify(options)}"
    )

    return firebaseAdmin
        .messaging().sendToTopic(topic, payloadJson, options)
        .then { value ->
            console.log("MessagingTopicResponse messageId: ${JSON.stringify(value)}");
        }
}

fun sendDataNotificationToDevice(
    registrationToken: String,
    payload: Any,
    options: Json = defaultNotificationOptions()
): Promise<Unit> {
    console.log(
        "sendDataNotificationToDevice, registrationToken: $registrationToken, payload: ${JSON.stringify(
            payload
        )}, options: ${JSON.stringify(options)}"
    )
    return firebaseAdmin
        .messaging()
        .sendToDevice(registrationToken, json("data" to payload), options)
        .then { value ->
            console.log("MessagingDevicesResponse messageId: ${JSON.stringify(value)}");
        }
}