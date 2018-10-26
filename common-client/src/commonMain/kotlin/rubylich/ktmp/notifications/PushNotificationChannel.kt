package rubylich.ktmp.notifications


sealed class PushNotificationChannel(val channelId: String, val titleResource: String) {
    class Default : PushNotificationChannel("default_channel", "default_channel")

//    class Approved : PushNotificationChannel("approved", R.string.approved_channel_name)
//
//    class Unapproved : PushNotificationChannel("unapproved", R.string.unapproved_channel_name)
}
