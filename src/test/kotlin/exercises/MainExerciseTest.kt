package exercises

import kotlin.test.*

class MainExerciseTest {

    private val useCase = MainExercise.BaseSolution()

    @Test
    fun `test example 1`() {

        assertEquals(true, useCase.check())
    }

    @Test
    fun `test example 2`() {

        assertEquals(true, useCase.check())
    }

    @Test
    fun `test example 3`() {

        assertEquals(true, useCase.check())
    }
}