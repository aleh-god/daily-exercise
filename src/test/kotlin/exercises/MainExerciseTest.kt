package exercises

import kotlin.test.*

class MainExerciseTest {

    private val useCase = MainExercise.BaseSolution()

    @Test
    fun checkMain() {

        assertEquals("Hello World!", useCase.checkMain())
    }
}