package exercises

import kotlin.test.*

class MainExerciseTest {

    private val useCase = MainExercise.BaseSolution()

    @Test
    fun checkMain() {

        assertEquals("Hello World!", useCase.checkMain())
    }

    @Test
    fun `test example 1`() {

        assertEquals("Hello World!", useCase.checkMain())
    }

    @Test
    fun `test example 2`() {

        assertEquals("Hello World!", useCase.checkMain())
    }

    @Test
    fun `test example 3`() {

        assertEquals("Hello World!", useCase.checkMain())
    }
}