#time 16ms;memory:13.1MB
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        tempmap = {}
        for i in range(len(nums)):
            t = nums[i]
            ti = tempmap.get(t)
            if (ti != None):
                return [i, ti]
            tempmap[target - t] = i
