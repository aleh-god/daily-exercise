package exercises.topinterview150problems.stack.easy

/**
 * https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
interface ValidParentheses {

    fun isValid(s: String): Boolean

    class BaseSolution : ValidParentheses {
        override fun isValid(s: String): Boolean {

            val stack = mutableListOf<Char>()
            val openingBrackets = listOf('(', '{', '[')

            s.forEach { char ->
                if (char in openingBrackets) stack.add(char)
                else {
                    val lastChar = stack.lastOrNull()
                    val check = when (char) {
                        ')' -> { lastChar == '(' }
                        '}' -> { lastChar == '{' }
                        ']' -> { lastChar == '[' }
                        else -> false
                    }
                    if (check) stack.removeLast() else return false
                }
            }
            return stack.isEmpty()
        }

        // by Aleisder
        class RecursiveSolution : ValidParentheses {
            override fun isValid(s: String): Boolean {
                if (s == "") { return true }
                val simplified = s.replace("()", "").replace("{}", "").replace("[]", "")
                if (simplified == s) { return false }
                return isValid(simplified)
            }
        }
    }
}
