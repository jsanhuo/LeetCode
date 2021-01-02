#time:552ms;memory:38.6MB
class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        # 构造最小堆
        q = [(-nums[i], i) for i in range(k)]
        heapq.heapify(q)
        #q[0][0] 第一个0代表第一个数据也就是最大的数据，第二个0代表是值而不是下标
        result = [-q[0][0]]
        for i in range(k, n):
            #push入数据
            heapq.heappush(q, (-nums[i], i))
            #如果最大的数的下标越界了，那么一直pop直到不越界
            while q[0][1] <= i - k:
                heapq.heappop(q)
            #加入结果
            result.append(-q[0][0])
        
        return result
