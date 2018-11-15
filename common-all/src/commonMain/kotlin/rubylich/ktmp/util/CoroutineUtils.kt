package rubylich.ktmp

import kotlinx.coroutines.*
import kotlin.coroutines.*

fun launchAndCatch(
        context: CoroutineContext,
        onError: (Throwable) -> Unit,
        function: suspend () -> Unit
): Finalizable {
    val ret = Finalizable()
    GlobalScope.launch(context) {
        try {
            function()
        } catch (e: Throwable) {
            onError(e)
        } finally {
            ret.onFinally?.invoke()
        }
    }
    return ret
}

class Finalizable {
    var onFinally: (() -> Unit)? = null

    infix fun finally(f: () -> Unit) {
        onFinally = f
    }
}


interface Callback<T> {
    fun onComplete(result: T)
    fun onError(e: Exception)
}

suspend fun <T> awaitCallback(block: (Callback<T>) -> Unit): T =
        suspendCancellableCoroutine { cont ->
            block(object : Callback<T> {
                override fun onComplete(result: T) = cont.resume(result)
                override fun onError(e: Exception) = cont.resumeWithException(e)
            })
        }

fun <A, T> toSuspendFunction(fn: (A, Callback<T>) -> Unit): suspend (A) -> T = { a: A ->
    awaitCallback { fn(a, it) }
}

fun <A, B, T> toSuspendFunction(fn: (A, B, Callback<T>) -> Unit): suspend (A, B) -> T = { a: A, b: B ->
    awaitCallback { fn(a, b, it) }
}