# Day11: You are given an integer array prices where prices[i] is the price of a stock on the i-th day.
1. You may complete as many transactions as you like (i.e., buy one and sell one share multiple times).
2. However, you must sell the stock before you buy again.
3. Your task: Return the maximum profit you can achieve.

**Testcases**
1. Input: [7,1,5,3,6,4]   Output: 7
2. Input: [1,2,3,4,5]     Output: 4

**Intuition**

1. We want to capture all upward slopes in the stock price graph.
2. Think of the stock chart as a mountain range:
3. Any time the price goes up, you can buy at the bottom and sell at the top.
4. Adding all such increases gives the maximum possible profit.
5. So, instead of finding specific valleys and peaks, just sum up every positive difference between consecutive days.

**Algorithm Flow** 
1. Initialize profit = 0.
2. Loop through prices from i = 1 to n-1:
3. If prices[i] > prices[i-1]:
4. Add (prices[i] - prices[i-1]) to profit.
5. After the loop, return profit.

**Complexity Analysis**
Time Complexity: O(n).
Space Complexity: O(1).
