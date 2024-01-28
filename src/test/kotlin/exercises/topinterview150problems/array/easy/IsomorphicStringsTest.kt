package exercises.topinterview150problems.array.easy

import kotlin.test.*

class IsomorphicStringsTest {

    private val useCase = IsomorphicStrings.BaseSolution()

    @Test
    fun `test example 1`() {

        assertEquals(true, useCase.isIsomorphic(s = "egg", t = "add"))
    }

    @Test
    fun `test example 2`() {

        assertEquals(false, useCase.isIsomorphic(s = "foo", t = "bar"))
    }

    @Test
    fun `test example 3`() {

        assertEquals(true, useCase.isIsomorphic(s = "paper", t = "title"))
    }

    @Test
    fun `test example 4`() {

        assertEquals(false, useCase.isIsomorphic(s = "badc", t = "baba"))
    }
}
