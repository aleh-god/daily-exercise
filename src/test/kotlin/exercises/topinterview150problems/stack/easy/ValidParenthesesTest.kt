package exercises.topinterview150problems.stack.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class ValidParenthesesTest {

    private val useCase = ValidParentheses.BaseSolution()

    @Test
    fun `test example 1`() {

        assertEquals(true, useCase.isValid("()"))
    }

    @Test
    fun `test example 2`() {

        assertEquals(true, useCase.isValid("()[]{}"))
    }

    @Test
    fun `test example 3`() {

        assertEquals(false, useCase.isValid("(]"))
    }
}
