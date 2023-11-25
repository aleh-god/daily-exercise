package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class LongestCommonPrefixFinderTest {

    private val useCase = LongestCommonPrefixFinder.BaseSolution()

    @Test
    fun `test example 1`() {
        val strs = arrayOf("flower","flow","flight")

        assertEquals("fl", useCase.find(strs))
    }

    @Test
    fun `test There is no common prefix among the input string`() {
        val strs = arrayOf("dog","racecar","car")
        assertEquals("", useCase.find(strs))
    }
}
