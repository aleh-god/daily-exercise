package exercises.topinterview150problems.binarysearch.easy

import kotlin.test.Test

class SearchInsertPositionTest {

    private val useCase = SearchInsertPosition.RecursiveSolution()

    @Test
    fun `test example 1`() {

        kotlin.test.assertEquals(2, useCase.searchInsert(intArrayOf(1,3,5,6), 5))
    }

    @Test
    fun `test example 2`() {

        kotlin.test.assertEquals(1, useCase.searchInsert(intArrayOf(1,3,5,6), 2))
    }

    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(4, useCase.searchInsert(intArrayOf(1,3,5,6), 7))
    }

}