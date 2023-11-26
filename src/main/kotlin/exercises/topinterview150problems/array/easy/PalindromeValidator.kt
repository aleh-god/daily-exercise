package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 */
interface PalindromeValidator {

    fun isPalindrome(s: String): Boolean

    class BaseSolution : PalindromeValidator {
        override fun isPalindrome(s: String): Boolean {
            var head = 0
            var tail = s.lastIndex
            do {
                while (head < tail && !s[head].isLetterOrDigit()) head++
                while (head < tail && !s[tail].isLetterOrDigit()) tail--
                if (head < tail && s[head].lowercase() != s[tail].lowercase()) return false
                head++
                tail--
            } while (head < tail)
            return true
        }
    }

    class KotlinLibrarySolution : PalindromeValidator {

        // s.filter { it.isLetterOrDigit() }.run { equals(reversed(), true) }
        override fun isPalindrome(s: String): Boolean {
            val data = s.filter { it.isLetterOrDigit() }.lowercase()
            if (data.isEmpty()) return true
            else { val half = data.lastIndex / 2
                for (i in 0..half) {
                    val tail = (data.lastIndex - i)
                    if (data[i] != data[tail]) return false
                }
                return true
            }
        }
    }
}
