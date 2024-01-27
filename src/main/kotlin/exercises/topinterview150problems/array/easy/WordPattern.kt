package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given a pattern and a string s, find if s follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
interface WordPattern {

    fun wordPattern(pattern: String, s: String): Boolean

    class BaseSolution : WordPattern {
        override fun wordPattern(pattern: String, s: String): Boolean {

            val dict: MutableMap<Char, String> = mutableMapOf()

            val words = s.split(" ")

            if (pattern.length != words.size) return false

            words.forEachIndexed { index, word ->
                val key = pattern[index]
                if (dict[key] == null && !dict.containsValue(word)) dict[key] = word
                else if (dict[key] != word) return false
            }
            return true
        }
    }

    class FastSolution : WordPattern {
        override fun wordPattern(pattern: String, s: String): Boolean {
            val lettersMap = HashMap<Char, String>()
            val wordsMap = HashMap<String, Char>()
            var i = 0
            var word: StringBuilder
            var j = 0
            while(i < pattern.length){
                word = StringBuilder()
                while(j < s.length && s[j] != ' '){
                    word.append(s[j])
                    j++
                }
                j++

                if(word.isEmpty())
                    return false

                if(lettersMap[pattern[i]] == null){
                    if(wordsMap[word.toString()] != null)
                        return false
                    lettersMap[pattern[i]] = word.toString()
                    wordsMap[word.toString()] = pattern[i]
                }
                else{
                    if(lettersMap[pattern[i]] != word.toString())
                        return false
                }
                i++
            }
            if(j > s.length)
                return true
            return false
        }
    }
}
