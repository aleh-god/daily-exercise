package exercises.topinterview150problems.hashmap.easy

import org.junit.jupiter.api.Test

class LetterCheckerByStringTest {

    private val useCase = LetterCheckerByString.BaseSolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(false, useCase.canConstruct("aa", "ab"))
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(true, useCase.canConstruct("aa", "aab"))
    }

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(true, useCase.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"))
    }

    @Test
    fun `test example 4`() {

        kotlin.test.assertEquals(false, useCase.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"))
    }
}
