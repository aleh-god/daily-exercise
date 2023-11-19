package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LastWordMeasurerTest {

    private val useCase = LastWordMeasurer.BaseImpl()
    private val useCaseSecond = LastWordMeasurer.KotlinLibraryImp()

    @Test
    fun `check library impl`() {

        assertEquals(4, useCaseSecond.lengthOfLastWord("   fly me   to   the moon  "))
    }
    @Test
    fun `test example 1`() {

        assertEquals(5, useCase.lengthOfLastWord("Hello World"))
    }

    @Test
    fun `test example 2`() {

        assertEquals(4, useCase.lengthOfLastWord("   fly me   to   the moon  "))
    }

    @Test
    fun `test example 3`() {

       assertEquals(6, useCase.lengthOfLastWord("luffy is still joyboy"))
    }
}
