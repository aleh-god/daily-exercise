package tasks.delegatelogging

import kotlin.reflect.KProperty

class LogDelegate(private val currentLogger: String) {
    operator fun getValue(worker: ParentWorker, property: KProperty<*>): String {
        return currentLogger + worker.context
    }
}
