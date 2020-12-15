#time:36ms;memory:14.7MB
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        from collections import Counter,defaultdict
        s = s.split()
        if(len(s)!=len(pattern)):
            return False
        m = defaultdict(str)
        n = defaultdict(str)
        for i in range(len(pattern)):
            if(m[pattern[i]]=='' and n[s[i]]==''):
                m[pattern[i]] = s[i]
                n[s[i]] = pattern[i]
            elif(m[pattern[i]]!=s[i] or n[s[i]]!=pattern[i]):
                return False
        return True
