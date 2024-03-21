package exercises.topinterview150problems.binarysearch.easy

/**
 * https://leetcode.com/problems/search-insert-position/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */

interface SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int

    class BaseSolution : SearchInsertPosition {

        override fun searchInsert(nums: IntArray, target: Int): Int {
            var head = 0
            var tail = nums.lastIndex
            while (head <= tail) {
                val mid = (head + tail) / 2

                if (target < nums[mid]) tail = mid - 1
                else if (target > nums[mid]) head = mid + 1
                else if (target == nums[mid]) return mid
            }
            return head
        }
    }

    class RecursiveSolution : SearchInsertPosition {

        override fun searchInsert(nums: IntArray, target: Int): Int {

            fun recursiveSearch(from: Int, to: Int): Int {
                if (to < from) return from
                val mid = (to - from) / 2 + from  // note: avoid integer overflow
                return when {
                    nums[mid] < target -> recursiveSearch(from = mid + 1, to = to)
                    nums[mid] > target -> recursiveSearch(from = from, to = mid - 1)
                    else -> mid
                }
            }

            return recursiveSearch(from = 0, to = nums.size - 1)
        }
    }
}
