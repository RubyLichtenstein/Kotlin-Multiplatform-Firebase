package rubylich.ktmp.base

import kotlinx.coroutines.channels.consumeEach
import rubylich.ktmp.features.posts.Post
import rubylich.ktmp.launchAndCatch
import kotlin.random.Random

interface IBasePresenter {
    fun onCreate()

    fun onDestroy()
}