package exercises.topinterview150problems.math.easy

interface PalindromeNumber {

    fun isPalindrome(x: Int): Boolean


    class BaseSolution() : PalindromeNumber {

        // 1 = 123
        // 12 = 123
        // 123 = 12
        // 1234 = 1

        override fun isPalindrome(x: Int): Boolean {
            if (x < 0) return false
            var reverse = 0
            var temp = x
            while (temp != 0) {
                reverse = (reverse * 10) + (temp % 10)
                temp /= 10
            }
            return reverse == x
        }
    }

    class KotlinSolution() : PalindromeNumber {

        override fun isPalindrome(x: Int): Boolean {
            return x.toString().let {
                it == it.reversed()
            }
        }
    }
}