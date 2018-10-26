package rubylich.ktmp.functions.lib

import firebaseAdmin
import functions
import kotlin.js.json

fun adminInitializeApp() {
    try {
        val firebaseApp: dynamic = firebaseAdmin.initializeApp(functions.config().firebase)
        val api = firebaseApp.firestore()
        api.settings(json("timestampsInSnapshots" to true))
    } catch (e: Exception) {

    }
}