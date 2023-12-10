package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 */

interface LetterCheckerByString {

    fun canConstruct(ransomNote: String, magazine: String): Boolean

    class BaseSolution : LetterCheckerByString {
        override fun canConstruct(ransomNote: String, magazine: String): Boolean {
            if (ransomNote.length > magazine.length) return false

            val indexSet = mutableSetOf<Int>()

            for (it in ransomNote) {
                for (index in 0..magazine.lastIndex) {
                    if (it == magazine[index] && !indexSet.contains(index)) {
                        indexSet.add(index)
                        if (indexSet.size == ransomNote.length) return true
                        break
                    }
                }
            }
            return indexSet.size == ransomNote.length
        }
    }

    class KotlinLibrarySolution : LetterCheckerByString {
        override fun canConstruct(ransomNote: String, magazine: String): Boolean {
            val map = magazine.asSequence().groupingBy { it }.eachCount().toMutableMap()
            for (c in ransomNote) {
                val v = map[c] ?: 0
                if (v == 0) return false
                map[c] = v - 1
            }
            return true
        }
    }
}
