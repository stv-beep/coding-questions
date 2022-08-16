/* Leetcode 121. Best Time to Buy and Sell Stock */
/* You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var buy = prices[0]
    var max_profit = 0
   
    for (var i = 0; i < prices.length; i++) {
      if (buy > prices[i]) {
        buy = prices[i]
      } else if ((prices[i] - buy) > max_profit) {
        max_profit = prices[i] - buy
      }
    }
      return max_profit
};
   
maxProfit([7,1,5,3,6,4]) 	//5
maxProfit([7,6,4,3,1])		//0