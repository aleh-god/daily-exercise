package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

class SubsequenceCheckerTest {

    private val useCase = SubsequenceChecker.BaseSolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(true, useCase.isSubsequence("abc", "ahbgdc"))
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(false, useCase.isSubsequence("axc", "ahbgdc"))
    }

    private val useCaseKotlin = SubsequenceChecker.KotlinLibrarySolution()

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(true, useCaseKotlin.isSubsequence("abc", "ahbgdc"))
    }

    @Test
    fun `test example 4`() {

        kotlin.test.assertEquals(false, useCaseKotlin.isSubsequence("axc", "ahbgdc"))
    }
}
