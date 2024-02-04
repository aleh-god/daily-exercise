package exercises.topinterview150problems.intervals.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SummaryRangesTest {

    private val useCase = SummaryRanges.BaseSolution()

    @Test
    fun `test example 1`() {

        assertContentEquals(listOf("0->2","4->5","7"), useCase.summaryRanges(intArrayOf(0,1,2,4,5,7)))
    }

    @Test
    fun `test example 2`() {

        assertContentEquals(listOf("0","2->4","6","8->9"), useCase.summaryRanges(intArrayOf(0,2,3,4,6,8,9)))
    }

    @Test
    fun `test example 3`() {

        assertContentEquals(listOf("-2147483648->-2147483647","2147483647"), useCase.summaryRanges(intArrayOf(-2147483648,-2147483647,2147483647)))
    }
}
