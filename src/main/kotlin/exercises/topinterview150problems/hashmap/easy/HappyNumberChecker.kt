package exercises.topinterview150problems.hashmap.easy

/**
 * https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
interface HappyNumberChecker {

    fun isHappy(n: Int): Boolean

    class BaseSolution : HappyNumberChecker {

        override fun isHappy(n: Int): Boolean {

            var sum = 0
            var buffer = n
            val results: MutableSet<Int> = mutableSetOf()

            do {
                results.add(sum)
                sum = 0

                while (buffer > 0) {
                    val digit = buffer % 10
                    sum += digit * digit
                    buffer /= 10
                }

                if (results.contains(sum)) return false
                buffer = sum
            } while (sum != 1)

            return true
        }
    }
}
