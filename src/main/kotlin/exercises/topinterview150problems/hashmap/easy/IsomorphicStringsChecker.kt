package exercises.topinterview150problems.hashmap.easy

/**
 * https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 */

interface IsomorphicStringsChecker {

    fun isIsomorphic(s: String, t: String): Boolean

    class BaseSolution : IsomorphicStringsChecker {

        override fun isIsomorphic(s: String, t: String): Boolean {

            val dictionary: MutableMap<Char, Char> = mutableMapOf()

            s.forEachIndexed { index, char ->
                val target = t[index]
                val isomorph = dictionary[char]
                when {
                    isomorph == null && !dictionary.containsValue(target) -> dictionary[char] = target
                    isomorph != target -> return false
                }
            }
            return true
        }
    }
}
