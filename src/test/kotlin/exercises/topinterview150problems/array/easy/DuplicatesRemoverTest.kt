package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DuplicatesRemoverTest {

    @Test
    fun `test example 1`() {

        val duplicatesRemover = DuplicatesRemover.BaseImpl(
            intArrayOf(1,1,2)
        )

        val length = duplicatesRemover.removeDuplicates()

        assertEquals(2, length)
        assertArrayEquals(intArrayOf(1,2), duplicatesRemover.nums.take(length).toIntArray())
    }

    @Test
    fun `test example 2`() {

        val duplicatesRemover = DuplicatesRemover.BaseImpl(
            intArrayOf(0,0,1,1,1,2,2,3,3,4)
        )

        val length = duplicatesRemover.removeDuplicates()

        assertEquals(5, length)
        assertArrayEquals(intArrayOf(0,1,2,3,4), duplicatesRemover.nums.take(length).toIntArray())
    }

    @Test
    fun `test example 3`() {

        val duplicatesRemover = DuplicatesRemover.BaseImpl(
            intArrayOf(0,0)
        )

        val length = duplicatesRemover.removeDuplicates()

        assertEquals(1, length)
        assertArrayEquals(intArrayOf(0), duplicatesRemover.nums.take(length).toIntArray())
    }

    @Test
    fun `test example kotlin lib 1`() {

        val duplicatesRemover = DuplicatesRemover.KotlinLibraryImpl(
            intArrayOf(1,1,2)
        )

        val length = duplicatesRemover.removeDuplicates()

        assertEquals(2, length)
        assertArrayEquals(intArrayOf(1,2), duplicatesRemover.nums.take(length).toIntArray())
    }

    @Test
    fun `test example kotlin lib 2`() {

        val duplicatesRemover = DuplicatesRemover.KotlinLibraryImpl(
            intArrayOf(0,0,1,1,1,2,2,3,3,4)
        )

        val length = duplicatesRemover.removeDuplicates()

        assertEquals(5, length)
        assertArrayEquals(intArrayOf(0,1,2,3,4), duplicatesRemover.nums.take(length).toIntArray())
    }
}
