#time:44ms;memory:14.8MB
class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        from collections import Counter
        a = Counter(s)
        b = Counter(t)
        for k,v in b.items():
            if(a[k]!=v):
                return k
        return ''