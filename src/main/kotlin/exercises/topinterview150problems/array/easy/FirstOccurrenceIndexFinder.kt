package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Constraints:
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */

interface FirstOccurrenceIndexFinder {

    fun strStr(haystack: String, needle: String): Int

    class BaseSolution : FirstOccurrenceIndexFinder {
        override fun strStr(haystack: String, needle: String): Int {
            val length = haystack.length - needle.length
            if (length < 0) return -1

            for (i in 0..length) {
                var j = 0
                while (j < needle.length && haystack[i + j] == needle[j]) j++
                if (j == needle.length) return i
            }
            return -1
        }
    }

    class KotlinLibrarySolution : FirstOccurrenceIndexFinder {
        override fun strStr(haystack: String, needle: String): Int {
            // return haystack.indexOf(needle)
            return try {
                val windows = haystack.windowed(needle.length, 1)
                return windows.indexOf(needle)
            } catch (e: Exception) {
                -1
            }
        }
    }
}
