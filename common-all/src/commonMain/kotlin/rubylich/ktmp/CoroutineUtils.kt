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
