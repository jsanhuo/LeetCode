#time528ms;memory:25MB
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        #代表第一次买入，第一次交易结束，第二次买入，第二次交易结束，四个状态对应的最优
        buy1,end1,buy2,end2 = 0,0,0,0
        for i in range(len(prices)):
            buy1 = max(buy1,-prices[i])
            end1 = max(end1,buy1+prices[i])
            buy2 = max(buy2,end1-prices[i])
            end2 = max(end2,buy2+prices[i])
        return end2