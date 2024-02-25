package exercises.topinterview150problems.hashmap.easy

import kotlin.test.Test

class ValidAnagramTest {

    private val useCase = ValidAnagram.BaseSolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(
            true,
            useCase.isAnagram(
                s = "anagram",
                t = "nagaram"
            )
        )
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(
            false,
            useCase.isAnagram(
                s = "rat",
                t = "car"
            )
        )
    }

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(
            false,
            useCase.isAnagram(
                s = "ab",
                t = "a"
            )
        )
    }
}
