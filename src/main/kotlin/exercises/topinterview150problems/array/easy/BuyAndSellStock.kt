package exercises.topinterview150problems.array.easy

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
 *
 * You are given an array prices where prices\[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

interface BuyAndSellStock {

    fun maxProfit(prices: IntArray): Int

    class BaseImpl : BuyAndSellStock {
        override fun maxProfit(prices: IntArray): Int {
            var min = prices[0]
            var profit = 0
            for (it in prices) {
                if (it < min) min = it
                profit = maxOf(profit, it - min)
            }
            return profit
        }
    }

    class KotlinLibraryImpl : BuyAndSellStock {
        override fun maxProfit(prices: IntArray): Int {

            var buffer = 0

            (0..prices.lastIndex).forEach { buyDay ->
                (buyDay + 1..prices.lastIndex).forEach { sellDay ->
                    val profit = prices[sellDay] - prices[buyDay]
                    if (profit > buffer) buffer = profit
                }
            }
            return buffer
        }
    }
}
