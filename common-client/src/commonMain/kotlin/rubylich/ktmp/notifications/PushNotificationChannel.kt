package rubylich.ktmp.notifications


sealed class PushNotificationChannel(val channelId: String, val titleResource: String) {
    class Default : PushNotificationChannel("default_channel", "default_channel")
}
