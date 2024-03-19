package exercises.topinterview150problems.math.easy

import kotlin.test.Test

class PalindromeNumberTest {

    private val useCase = PalindromeNumber.BaseSolution()

        @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(true, useCase.isPalindrome(121))
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(false, useCase.isPalindrome(-121))
    }

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(false, useCase.isPalindrome(10))
    }
}