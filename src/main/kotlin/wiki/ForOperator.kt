package wiki

class ForOperator {

    fun forExample() {

        for (i in 0..8) { println(i) }

        for (i in 1 until 10) { println(i) } // 10 будет исключён

        val range = 1..5
        for(i in range){ println(i) }

        for (x in 1..10 step 2) { print(x) }

        for (i in 6 downTo 0 step 2) { println(i) }

        for ( letter in listOf("C", "A", "T") ) { print(letter) }

        // Если при проходе по массиву или списку необходим порядковый номер элемента, используйте следующий подход:
        val array = arrayOf(1,2,3,4)
        for (i in array.indices) { println(array[i]) }

        // Также вы можете использовать библиотечную функцию withIndex.
        for ((index, value) in array.withIndex()) { println("the element at $index is $value") }

        val capitals = mapOf(
            "USA" to "Washington DC",
            "England" to "London",
            "France" to "Paris"
        )

        for ((country, capital) in capitals) {
            println("The capital of $country is $capital")
        }

        val fruits = listOf("яблоко", "банан", "киви")
        for (index in fruits.indices) {
            println("${index} фрукт - это ${fruits[index]}")
        }

        var index = 0
        while (index < fruits.size) {
            println("${index} фрукт - это ${fruits[index]}")
            index++
        }
    }
}