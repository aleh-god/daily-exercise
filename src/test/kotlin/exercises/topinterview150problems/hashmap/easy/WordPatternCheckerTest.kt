package exercises.topinterview150problems.hashmap.easy

import org.junit.jupiter.api.Test

class WordPatternCheckerTest {

    private val useCase = WordPatternChecker.BaseSolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(true, useCase.wordPattern(pattern = "abba", s = "dog cat cat dog"))
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(false, useCase.wordPattern(pattern = "abba", s = "dog cat cat fish"))
    }

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(false, useCase.wordPattern(pattern = "aaaa", s = "dog cat cat dog"))
    }

    @Test
    fun `test example 4`() {

        kotlin.test.assertEquals(false, useCase.wordPattern(pattern = "abba", s = "dog dog dog dog"))
    }

    @Test
    fun `test example 5`() {

        kotlin.test.assertEquals(false, useCase.wordPattern(pattern = "aaa", s = "aa aa aa aa"))
    }

    @Test
    fun `test example 6`() {

        kotlin.test.assertEquals(false, useCase.wordPattern(pattern = "jquery", s = "jquery"))
    }
}
