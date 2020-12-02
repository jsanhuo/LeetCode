class Solution(object):
    def getMaxList(self,nums,k):
        stack = []
        if(k==0):
            return stack
        delect = len(nums)-k    
        for i in range(len(nums)):
            while(len(stack)!=0 and stack[-1]<nums[i] and delect>0):
                stack.pop()
                delect-=1
            stack.append(nums[i])
        return stack[:k]
        
    def merge(self, nums1,nums2):
        x, y = len(nums1), len(nums2)
        if x == 0:
            return nums2
        if y == 0:
            return nums1
        
        sumlen = x + y
        result = []
        i,j = 0,0
        while(i<x and j<y):
            if self.compare(nums1, i, nums2, j) > 0:
                result.append(nums1[i])
                i+=1
            else:
                result.append(nums2[j])
                j+=1
        if(i!=x):
            result.extend(nums1[i:])
        if(j!=y):
            result.extend(nums2[j:])
        return result

    def compare(self, nums1, i, nums2, j):
        x, y = len(nums1), len(nums2)
        while i < x and j < y:
            difference = nums1[i] - nums2[j]
            if(nums1[i]>nums2[j]):
                return 1
            elif(nums1[i]<nums2[j]):
                return -1
            else:
                i += 1
                j += 1
        return (x-i)-(y-j)
    def maxNumber(self, nums1, nums2, k):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :type k: int
        :rtype: List[int]
        """
        m, n = len(nums1), len(nums2)
        maxList = [0] * k
        #开始条件：以nums1为基准，当nums2长度大于k的时候应该nums1从0开始，也就是nums2可以全选，不需要nums1也可组成长度为k的串
        #否则nums1从k-len(nums2)开始，也就是nums2全选的情况下，还需要多少个nums1的元素
        #结束条件：以nums1为基准，当nums1的长度小于k的时候则nums1最多只能选择len(nums1)个元素
        #否则nums1应当最长可以选择k个元素
        start, end = max(0, k - n), min(k, m)
        for i in range(start, end + 1):
            l1 = self.getMaxList(nums1, i)
            l2 = self.getMaxList(nums2, k - i)
            cur = self.merge(l1, l2)
            if self.compare(cur,0,maxList,0)>0:
                maxList = cur   
        return maxList