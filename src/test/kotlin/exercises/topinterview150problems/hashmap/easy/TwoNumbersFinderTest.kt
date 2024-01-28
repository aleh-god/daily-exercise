package exercises.topinterview150problems.hashmap.easy

import kotlin.test.*

class TwoNumbersFinderTest {

    private val useCase = TwoNumbersFinder.WithMapSolution()

    @Test
    fun `test example 1`() {

        assertContentEquals(intArrayOf(0, 1), useCase.twoSum(intArrayOf(2,7,11,15), 9))
    }

    @Test
    fun `test example 2`() {

        assertContentEquals(intArrayOf(1, 2), useCase.twoSum(intArrayOf(3,2,4), 6))
    }

    @Test
    fun `test example 3`() {

        assertContentEquals(intArrayOf(0, 1), useCase.twoSum(intArrayOf(3,3), 6))
    }
}
