package exercises.topinterview150problems.hashmap.easy

/**
 * https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */

interface ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean

    class BaseSolution : ValidAnagram {

        override fun isAnagram(s: String, t: String): Boolean {
            val cache: MutableMap<Char, Int> = mutableMapOf()

            if (s.length != t.length) return false

            s.forEach {
                val cachedCount = cache[it]
                if (cachedCount != null) cache[it] = cachedCount + 1
                else cache[it] = 1
             }

            t.forEach {
                val cachedCount = cache[it]
                if (cachedCount != null && cachedCount > 0) cache[it] = cachedCount - 1
                else return false
            }

            return true
        }
    }

    class KotlinSolution : ValidAnagram {

        override fun isAnagram(s: String, t: String): Boolean {

            if (s.length != t.length) return false

            val sList = s.toCharArray().sortedArray()
            val tList = t.toCharArray().sortedArray()

            return sList.contentEquals(tList)
        }
    }
}
