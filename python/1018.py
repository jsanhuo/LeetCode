#time:384ms;memory:15.8MB
class Solution:
    def prefixesDivBy5(self, A: List[int]) -> List[bool]:
        result = []
        p = 0
        for i in A:
            p = (p<<1) + i
            result.append(p%5==0)
        return result