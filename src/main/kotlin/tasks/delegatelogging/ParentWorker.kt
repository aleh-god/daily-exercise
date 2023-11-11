package tasks.delegatelogging

fun runWorkersSolution() {
    val currentWorker = CurrentWorker("CurrentWorker")
    currentWorker.doWork()

    val currentRxWorker = CurrentRxWorker("CurrentRxWorker")
    val work = currentRxWorker.getWork()
    println(work.result)

    val currentWorkerNew = CurrentWorkerNew("CurrentWorkerNew")
    currentWorkerNew.doWork()
}

abstract class ParentWorker() {

    val context: String = "Context"
}

abstract class Worker : ParentWorker() {
    abstract fun doWork()
}

abstract class RxWorker : ParentWorker() {
    abstract fun getWork(): Single
}

data class Single(val result: String)

abstract class BaseWorker(
    private val loggerDependency: String
) : Worker() {

    val workerLogger by lazy {
        loggerDependency + context
    }
}

class CurrentWorker(
    private val currentLogger: String
) : BaseWorker(loggerDependency = currentLogger) {
    override fun doWork() {
        println(workerLogger)
    }
}

class CurrentRxWorker(
    private val currentLogger: String
) : RxWorker() {

    private val rxWorkerLogger: String by LogDelegate(currentLogger)

    override fun getWork(): Single {
        return Single(rxWorkerLogger)
    }
}

class CurrentWorkerNew(
    private val currentLogger: String
) : Worker() {

    private val log: String by LogDelegate(currentLogger)

    override fun doWork() {
        println(log)
    }
}
