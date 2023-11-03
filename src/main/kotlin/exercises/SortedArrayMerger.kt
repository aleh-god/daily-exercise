package exercises

/*
https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

interface SortedArrayMerger {
    
    // Input:
    // nums1 = [1,2,3,0,0,0], m = 3
    // nums2 = [2,5,6], n = 3
    // Output: [1,2,2,3,5,6]
    
    fun merge(numsA: IntArray, sizeA: Int, numsB: IntArray, sizeB: Int): IntArray

    // Solution: merge from the tail
    class MainSolution() : SortedArrayMerger {
        override fun merge(numsA: IntArray, sizeA: Int, numsB: IntArray, sizeB: Int): IntArray {
            var tailA = sizeA - 1
            var tailB  = sizeB - 1
            var tailResult = sizeA + sizeB - 1
            while (tailB >= 0) {
                val x = if (tailA >= 0 && numsB[tailB] <= numsA[tailA]) numsA[tailA--]
                else numsB[tailB--]
                numsA[tailResult--] = x
            }
            return numsA
        }
    }

    class KotlinLibSolution() : SortedArrayMerger {
        override fun merge(numsA: IntArray, sizeA: Int, numsB: IntArray, sizeB: Int): IntArray {
            val sum = numsA.take(sizeA) + numsB.toList()
            val result = sum.sorted()
            return result.toIntArray()
        }
    }
}
