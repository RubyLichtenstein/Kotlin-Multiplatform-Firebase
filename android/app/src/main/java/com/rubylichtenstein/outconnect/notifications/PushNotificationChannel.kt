package com.rubylichtenstein.outconnect.notifications

import android.support.annotation.StringRes
import com.rubylichtenstein.outconnect.R

sealed class PushNotificationChannel(@StringRes val channelId: Int, @StringRes val titleResource: Int) {

    class Default : PushNotificationChannel(R.string.default_channel, R.string.default_channel)

//    class Approved : PushNotificationChannel("approved", R.string.approved_channel_name)
//
//    class Unapproved : PushNotificationChannel("unapproved", R.string.unapproved_channel_name)
}
