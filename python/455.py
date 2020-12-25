#time:52ms;memory:15.8MB
class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        n, m = len(g), len(s)
        i = j = count = 0
        while i < n and j < m:
            if s[j]>=g[i]:
                count+=1
                i+=1
            j+=1
        return count
