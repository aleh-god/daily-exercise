package exercises

interface MainExercise {

    fun checkMain(): String

    class BaseSolution : MainExercise {
        override fun checkMain(): String = "Hello World!"
    }
}
