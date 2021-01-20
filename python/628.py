# time:104ms;memory:15.8MB
class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        import heapq
        heap =[] 
        for i in nums:
            heapq.heappush(heap,i)
        max1,max2,max3 = nlargest(3,heap)
        min1,min2,min3 = nsmallest(3,heap)
        if(max1<0 and max2<0 and max3<0):
            return max1*max2*max3
        if(min1<0 and min2<0 and min1*min2>max2*max3):
            return min1*min2*max1
        else:
            return max1*max2*max3