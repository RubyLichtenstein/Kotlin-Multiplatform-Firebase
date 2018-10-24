package lib

import admin.messaging.*
import firebaseAdmin
import kotlinx.coroutines.await
import kotlin.js.*

fun defaultNotificationOptions(): MessagingOptions =
    MessagingOptions().apply {
        priority = "high"
        timeToLive = 60 * 60 * 24
    }

suspend fun sendDataNotificationToTopic(
    topic: String,
    payload: Any,
    options: MessagingOptions = defaultNotificationOptions()
): MessagingTopicResponse {

    val payloadJson = json("data" to payload)
    val notificationMessagePayload = NotificationMessagePayload()

    val messagePayload = MessagingPayload()
    val dataMessagePayload = DataMessagePayload()

    messagePayload.data = dataMessagePayload

    return Messaging().sendToTopic(topic, messagePayload, options).await()
}

fun sendDataNotificationToDevice(
    registrationToken: String,
    payload: Any,
    options: MessagingOptions = defaultNotificationOptions()
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