package exercises.topinterview150problems.hashmap.easy

import kotlin.math.abs

/**
 * https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

interface ContainsDuplicateTwo {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean

    class BaseSolution : ContainsDuplicateTwo {

        override fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
            val cache: MutableMap<Int, Int> = mutableMapOf()

            nums.forEachIndexed { index, num ->
                val cacheIndex: Int? = cache[num]
                if (cacheIndex != null) {
                    val diff = cacheIndex.minus(index)
                    val result = abs(diff)
                    if (result <= k) return true
                }
                cache[num] = index
            }
            return false
        }
    }
}
