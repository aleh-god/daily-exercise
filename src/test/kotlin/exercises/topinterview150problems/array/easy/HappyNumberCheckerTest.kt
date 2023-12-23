package exercises.topinterview150problems.array.easy

import kotlin.test.Test

class HappyNumberCheckerTest {

    private val useCase = HappyNumberChecker.BaseSolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(true, useCase.isHappy(19))
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(false, useCase.isHappy(2))
    }
}
