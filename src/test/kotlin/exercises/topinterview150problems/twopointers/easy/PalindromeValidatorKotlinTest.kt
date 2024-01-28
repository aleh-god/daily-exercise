package exercises.topinterview150problems.twopointers.easy

import kotlin.test.Test

class PalindromeValidatorKotlinTest {

    private val useCase = PalindromeValidator.KotlinLibrarySolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(true, useCase.isPalindrome("A man, a plan, a canal: Panama"))
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(false, useCase.isPalindrome("race a car"))
    }

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(true, useCase.isPalindrome(" "))
    }
}
