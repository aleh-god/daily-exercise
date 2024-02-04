package exercises.topinterview150problems.intervals.easy

/**
 * https://leetcode.com/problems/summary-ranges/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * A range [a,b] is the set of all integers from a to b (inclusive).
 *
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 *
 * Each range [a,b] in the list should be output as:
 *
 * "a->b" if a != b
 * "a" if a == b
 */

interface SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String>

    class BaseSolution : SummaryRanges {

        override fun summaryRanges(nums: IntArray): List<String> {

            if (nums.isEmpty()) return emptyList()

            val result = mutableListOf<String>()
            var head = nums[0]
            var tail = nums[0]

            nums.forEach {
                val missValues = it - head
                if (missValues !in 0..1) {
                    if (head == tail) result.add(head.toString())
                    else result.add("${tail}->${head}")
                    tail = it
                }
                head = it
            }
            if (nums.last() == tail) result.add(head.toString())
            else result.add("${tail}->${head}")
            return result
        }
    }

    // by Samoylenko Dmitry
    class KotlinSolution : SummaryRanges {

        override fun summaryRanges(nums: IntArray): List<String> = nums
            .fold(mutableListOf<IntArray>()) { r, t ->
                if (r.isEmpty() || r.last()[1] + 1 < t) r += intArrayOf(t, t)
                else r.last()[1] = t
                r
            }
            .map { (f, t) -> if (f == t) "$f" else "$f->$t" }
    }
}
