package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

class RomanToIntegerConverterTest {

    private val useCase = RomanToIntegerConverter.BaseImpl()

    @Test
    fun `test example III`() {

        kotlin.test.assertEquals(3, useCase.convert("III"))
    }

    @Test
    fun `test example LVIII`() {

        kotlin.test.assertEquals(58, useCase.convert("LVIII"))
    }

    @Test
    fun `test example IV`() {

        kotlin.test.assertEquals(4, useCase.convert("IV"))
    }

    @Test
    fun `test example XL`() {

        kotlin.test.assertEquals(40, useCase.convert("XL"))
    }

    @Test
    fun `test example CD`() {

        kotlin.test.assertEquals(400, useCase.convert("CD"))
    }

    @Test
    fun `test example XLXC`() {

        kotlin.test.assertEquals(130, useCase.convert("XLXC"))
    }

    @Test
    fun `test example CDCM`() {

        kotlin.test.assertEquals(1300, useCase.convert("CDCM"))
    }

    @Test
    fun `test example MCMXCIV`() {

        kotlin.test.assertEquals(1994, useCase.convert("MCMXCIV"))
    }
}
