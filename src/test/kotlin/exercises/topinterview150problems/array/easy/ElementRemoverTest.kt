package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ElementRemoverTest {

    @Test
    fun `test example 1`() {
            val elementRemover = ElementRemover.MainSolution(
                input = intArrayOf(3, 2, 2, 3)
            )

            val result = elementRemover.remove(3)

            assertEquals(2, result)

            val output = elementRemover.nums.take(result)
            val equal = output.containsAll(intArrayOf(2,2).toList())

            assert(equal)
    }

    @Test
    fun `test example 2`() {
        val elementRemover = ElementRemover.MainSolution(
            input = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        )

        val result = elementRemover.remove(2)

        assertEquals(5, result)

        val output = elementRemover.nums.take(result)
        val equal = output.containsAll(intArrayOf(0,1,4,0,3).toList())

        assert(equal)
    }

    @Test
    fun `Kotlin Lib test example 3`() {
        val elementRemover = ElementRemover.KotlinLibSolution(
            input = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        )

        val result = elementRemover.remove(2)

        assertEquals(5, result)

        val output = elementRemover.nums.take(result)
        val equal = output.containsAll(intArrayOf(0,1,4,0,3).toList())

        assert(equal)
    }
}
