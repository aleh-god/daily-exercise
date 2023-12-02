package exercises.topinterview150problems.array.easy

/**
 *
 * https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 */
interface SubsequenceChecker {

    fun isSubsequence(s: String, t: String): Boolean

    class BaseSolution : SubsequenceChecker {

        override fun isSubsequence(s: String, t: String): Boolean {
            var sIndex = 0
            var tIndex = 0
            while (sIndex < s.length && tIndex < t.length) {
                if (s[sIndex] == t[tIndex]) sIndex++
                tIndex++
            }
            return sIndex == s.length
        }
    }

    class KotlinLibrarySolution : SubsequenceChecker {
        override fun isSubsequence(s: String, t: String): Boolean {
            // t.fold(s, {str, c -> if (str.firstOrNull() == c) str.drop(1) else str }).isBlank()
            return s.toCharArray().joinToString(".*").toRegex().containsMatchIn(t)
        }
    }
}