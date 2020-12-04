#time:364ms;memory:14.3MB
class Solution(object):
    def isPossible(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        import heapq
        from collections import defaultdict
        result = defaultdict(list)
        queue = []
        #循环遍历nums
        for i in nums:
            #找到比i小1的数字，在其尾部追加
            q = result[i - 1]
            #如果有比i小的,则进行追加
            if (len(q) > 0):
                #获得最短的串的长度
                t = heapq.heappop(q)
                #长度+1
                heappush(result[i], t + 1)
            #如果没有比i小的把，则新生成串，长度为1
            else:
                heapq.heappush(result[i], 1)
        for v in result.values():
            for i in v:
                if (i < 3):
                    return False
        return True

