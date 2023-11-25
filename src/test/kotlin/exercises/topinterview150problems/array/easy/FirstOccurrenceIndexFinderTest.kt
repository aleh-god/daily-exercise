package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

class FirstOccurrenceIndexFinderTest {

    private val useCase = FirstOccurrenceIndexFinder.BaseSolution()

    @Test
    fun `test example 1`() {
        val haystack = "sadbutsad"
        val needle = "sad"
        kotlin.test.assertEquals(0, useCase.strStr(haystack, needle))
    }

    @Test
    fun `test example 2`() {
        val haystack = "leetcode"
        val needle = "leeto"
        kotlin.test.assertEquals(-1, useCase.strStr(haystack, needle))
    }

    @Test
    fun `test example 3`() {
        val haystack = "a"
        val needle = "a"
        kotlin.test.assertEquals(0, useCase.strStr(haystack, needle))
    }

    @Test
    fun `test example 4`() {
        val haystack = "abc"
        val needle = "c"
        kotlin.test.assertEquals(2, useCase.strStr(haystack, needle))
    }

    @Test
    fun `test example 5`() {
        val haystack = "aaa"
        val needle = "aaaa"
        kotlin.test.assertEquals(-1, useCase.strStr(haystack, needle))
    }

    @Test
    fun `test example 6`() {
        val haystack = "mississippi"
        val needle = "issip"
        kotlin.test.assertEquals(4, useCase.strStr(haystack, needle))
    }
}
