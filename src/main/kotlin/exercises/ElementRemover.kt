package exercises

/*
https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.

Return k.
 */

interface ElementRemover {

    /*
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
    It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    val nums: IntArray

    fun remove(key: Int): Int

    class MainSolution(private val input: IntArray) : ElementRemover {

        override val nums: IntArray
            get() = input

        override fun remove(key: Int): Int {
            var head = 0
            var count = 0
            var buffer: Int
            for (i in 0..input.lastIndex) {
                if (input[i] != key) {
                    buffer = input[head]
                    input[head++] = input[i]
                    input[i] = buffer
                    count++
                }
            }
            return count
        }
    }

    class OptimalSolution(private val input: IntArray) : ElementRemover {
        override val nums: IntArray
            get() = input

        override fun remove(key: Int): Int {
            var head = 0
            nums.forEach { if (it != key) nums[head++] = it }
            return head
        }
    }

    class KotlinLibSolution(private var input: IntArray) : ElementRemover {
        override val nums: IntArray
            get() = input

        override fun remove(key: Int): Int {
            input = input.sortedBy { it == key }.toIntArray()
            return nums.count { it != key }
        }
    }
}