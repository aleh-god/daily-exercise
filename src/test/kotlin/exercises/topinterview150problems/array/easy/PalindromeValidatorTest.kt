package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

class PalindromeValidatorTest {

    private val useCase = PalindromeValidator.BaseSolution()

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
