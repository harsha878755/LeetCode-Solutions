
# **121. Best Time to Buy and Sell Stock**

## **Problem**

**You are given an array `prices` where `prices[i]` represents the price of a stock on the i-th day.**

**You want to maximize your profit by choosing one day to buy one stock and choosing a different day in the future to sell it. Return the maximum profit you can achieve.**

**If you cannot achieve any profit, return 0.**

## **Approach**

**Greedy Approach – Track Minimum Buying Price**

1. Initialize `buy_prices` with the first day's stock price.
2. Initialize `profit` to 0.
3. Traverse the prices array.
4. If the current price is smaller than `buy_prices`, update the minimum buying price.
5. Otherwise, calculate the current profit by subtracting the buying price from the current price.
6. Update the maximum profit using `Math.max()`.
7. Return the maximum profit.

## **Example 1**

**Input:**

prices = [7,1,5,3,6,4]

**Output:**

5

**Explanation:**

Buy the stock on day 2 at price 1 and sell it on day 5 at price 6.

Profit = 6 - 1 = 5.

## **Example 2**

**Input:**

prices = [7,6,4,3,1]

**Output:**

0

**Explanation:**

The stock price continuously decreases, so no profitable transaction is possible.

## **Complexity**

**Time Complexity:** O(n), where n is the number of elements in the array. We traverse the array once.

**Space Complexity:** O(1), as only a constant number of variables are used.

## **Topics**

- Array
- Dynamic Programming
- Greedy

## **Problem Number**

121

## **Difficulty**

Easy

**Problem Link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
