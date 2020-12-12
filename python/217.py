#time:36ms;memory:21.5MB
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        from  collections import Counter
        c = Counter(nums)
        for _,v in c.items():
            if v>1:
                return True
        return False