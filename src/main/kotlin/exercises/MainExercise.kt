package exercises

interface MainExercise {

    fun check(): Boolean

    class BaseSolution : MainExercise {
        override fun check() = true
    }
}
