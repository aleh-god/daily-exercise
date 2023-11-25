package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Constraints:
 * strs consists of only lowercase English letters.
 */

interface LongestCommonPrefixFinder {

    fun find(strs: Array<String>): String

    class BaseSolution : LongestCommonPrefixFinder {
        override fun find(strs: Array<String>): String {
            strs.first().forEachIndexed { i, c ->
                if (strs.any { it.length == i || it[i] != c } ) return strs.first().take(i)
            }
            return strs.first()
        }
    }
}
