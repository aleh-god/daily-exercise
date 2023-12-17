package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 */
interface TwoNumbersFinder {
    fun twoSum(nums: IntArray, target: Int): IntArray

    class WithDoubleForSolution : TwoNumbersFinder {

        override fun twoSum(nums: IntArray, target: Int): IntArray {

            nums.forEachIndexed { indexAlfa, alfa ->
                nums.forEachIndexed { indexBeta, beta ->
                    if ((alfa + beta) == target && indexAlfa != indexBeta) {
                        return intArrayOf(indexAlfa, indexBeta)
                    }
                }
            }
            return intArrayOf()
        }
    }

    class WithMapSolution : TwoNumbersFinder {
        override fun twoSum(nums: IntArray, target: Int): IntArray {

            val cash = mutableMapOf<Int, Int>()

            for (indexAlfa in 0..nums.lastIndex) {
                val alfa = nums[indexAlfa]
                cash[alfa]?.let { return intArrayOf(it, indexAlfa) }
                cash[target - alfa] = indexAlfa
            }
            return intArrayOf()
        }
    }
}
