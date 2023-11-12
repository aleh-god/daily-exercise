package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class BuyAndSellStockTest {

    private var buyAndSellStock: BuyAndSellStock = BuyAndSellStock.BaseImpl()

    @Test
    fun `test example 1`() {

        val actual = buyAndSellStock.maxProfit(
            intArrayOf(7,1,5,3,6,4)
        )

        assertEquals(5, actual)
    }

    @Test
    fun `test example 2`() {

        val actual = buyAndSellStock.maxProfit(
            intArrayOf(7,6,4,3,1)
        )

        assertEquals(0, actual)
    }

    @Test
    fun `test example 3`() {

        val actual = buyAndSellStock.maxProfit(
            intArrayOf(2,4,1)
        )

        assertEquals(2, actual)
    }

    @Test
    fun `test example Kotlin Library 1`() {

        buyAndSellStock = BuyAndSellStock.KotlinLibraryImpl()

        val actual = buyAndSellStock.maxProfit(
            intArrayOf(7,1,5,3,6,4)
        )

        assertEquals(5, actual)
    }

    @Test
    fun `test example Kotlin Library 2`() {

        buyAndSellStock = BuyAndSellStock.KotlinLibraryImpl()

        val actual = buyAndSellStock.maxProfit(
            intArrayOf(7,6,4,3,1)
        )

        assertEquals(0, actual)
    }

    @Test
    fun `test example Kotlin Library 3`() {

        buyAndSellStock = BuyAndSellStock.KotlinLibraryImpl()

        val actual = buyAndSellStock.maxProfit(
            intArrayOf(2,4,1)
        )

        assertEquals(2, actual)
    }
}
