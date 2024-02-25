package exercises.topinterview150problems.hashmap.easy

import kotlin.test.Test

class ContainsDuplicateTwoTest {

    private val useCase = ContainsDuplicateTwo.BaseSolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(
            true,
            useCase.containsNearbyDuplicate(
                nums = intArrayOf(1, 2, 3, 1),
                k = 3
            )
        )
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(
            true,
            useCase.containsNearbyDuplicate(
                nums = intArrayOf(1,0,1,1),
                k = 1
            )
        )
    }

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(
            false,
            useCase.containsNearbyDuplicate(
                nums = intArrayOf(1,2,3,1,2,3),
                k = 2
            )
        )
    }
}