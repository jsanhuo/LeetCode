#time:28ms;memory:14.9MB
class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        l = len(nums)
        if l == 0:
            return []
        if l==1:
            return [str(nums[0])]
        s = 0
        e = 0
        result = []
        for i in range(1,l):
            if(nums[i]-1 == nums[i-1]):
                e+=1
            else:
                if(s == e):
                    result.append(str(nums[s]))
                elif(s<e):
                    result.append(str(nums[s])+"->"+str(nums[e]))
                s = e+1
                e = s
        if(s == e):
            result.append(str(nums[s]))
        elif(s<e):
            result.append(str(nums[s])+"->"+str(nums[e]))
        return result
            
            
            

            
            