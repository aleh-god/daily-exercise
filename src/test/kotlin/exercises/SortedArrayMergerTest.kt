package exercises

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SortedArrayMergerTest {

    private val mainMerger = SortedArrayMerger.MainSolution()
    private val foolishMerger = SortedArrayMerger.KotlinLibSolution()

    @Test
    fun `main test example 1`() {
        val nums1 = intArrayOf(1,2,3,0,0,0)
        val m = 3
        val nums2 = intArrayOf(2,5,6)
        val n = 3
        val output = intArrayOf(1,2,2,3,5,6)
        assertArrayEquals(output, mainMerger.merge(nums1, m, nums2, n))
    }

    @Test
    fun `test example 2`() {
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0
        val output = intArrayOf(1)
        assertArrayEquals(output, mainMerger.merge(nums1, m, nums2, n))
    }

    @Test
    fun `test example 3`() {
        val nums1 = IntArray(1)
        val m = 0
        val nums2 = intArrayOf(1)
        val n = 1
        val output = intArrayOf(1)
        assertArrayEquals(output, mainMerger.merge(nums1, m, nums2, n))
    }

    @Test
    fun `foolish test example 1`() {
        val nums1 = intArrayOf(1,2,3,0,0,0,)
        val m = 3
        val nums2 = intArrayOf(2,5,6)
        val n = 3
        val output = intArrayOf(1,2,2,3,5,6)
        assertArrayEquals(output, foolishMerger.merge(nums1, m, nums2, n))
    }
}