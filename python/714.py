#time:884ms;memory:21.4MB
class Solution:
    def maxProfit(self, prices: List[int], fee: int) -> int:
        n = len(prices)
        sell, buy = 0, -prices[0]
        for i in range(1, n):
            sell, buy = max(sell, buy + prices[i] - fee), max(buy, sell - prices[i])
        return sell