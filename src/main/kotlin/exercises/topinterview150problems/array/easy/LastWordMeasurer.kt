package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */

interface LastWordMeasurer {

    fun lengthOfLastWord(s: String): Int

    class BaseImpl : LastWordMeasurer {
        override fun lengthOfLastWord(s: String): Int {
            var buffer = ' '
            var count = 0

            for (i in s.indices) {
                if (s[i] != ' ') {
                    if (buffer == ' ') count = 1
                    else count++
                }
                buffer = s[i]
            }
            return count
        }
    }

    class KotlinLibraryImp : LastWordMeasurer {
        override fun lengthOfLastWord(s: String): Int {
            return s
                .split(' ')
                .findLast { it.isNotEmpty() }
                ?.length
                ?: throw IllegalArgumentException()
        }
    }
}
