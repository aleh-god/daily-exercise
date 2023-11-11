package exercises

/**
 * https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Input: nums = [1,2,1,2,1,2,1]
 * Output: 1
 */

interface MajorityElementFinder {

    fun find(nums: IntArray): Int


    class BaseImpl : MajorityElementFinder {
        override fun find(nums: IntArray): Int {
            var count = 1
            var head: Int = nums[0]
            for (i in 1..nums.lastIndex) {
                if (head == nums[i]) count++
                else if (count < 1) {
                    head = nums[i]
                    count = 0 - count
                } else count--
            }
            return head
        }
    }

    class KotlinLibraryImpl : MajorityElementFinder {
        override fun find(nums: IntArray): Int {
            val counts = mutableMapOf<Int, Int>()

            nums.forEach {
                counts[it] = counts[it]?.plus(it) ?: it
            }
            val result = counts.toList().maxBy { it.second }
            return  result.first
        }
    }
}
