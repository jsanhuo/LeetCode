#time:44ms;memory:14.9MB
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        from collections import defaultdict
        m = defaultdict(str)
        n = defaultdict(str)
        l = len(s)
        for i in range(l):
            if(m[s[i]]=='' and n[t[i]]==''):
                m[s[i]] = t[i]
                n[t[i]] = s[i]
            elif(m[s[i]]!=t[i]):
                return False
        return True