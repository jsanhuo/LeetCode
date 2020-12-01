#time 25ms;memory:14MB
class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        mid=0
        low = 0
        high = len(nums)-1
        t=0
        a,b=-1,-1
        if(len(nums)==0 or nums[low]>target or nums[high]<target):
            return [-1,-1]
        while(low<=high):
            mid = (low+high)//2
            if(nums[mid]<target):
                low = mid+1
            if(nums[mid]>target):
                high = mid-1
            if(nums[mid]==target):
                t = mid
                break;
        if(nums[t]==target):
            a,b = t,t
            for i in range(t-1,-1,-1):
                if(nums[i]==target):
                    a-=1
                else:
                    break
            for i in range(t+1,len(nums)):
                if(nums[i]==target):
                    b+=1
                else:
                    break
        return [a,b]

