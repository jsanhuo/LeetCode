#time:108ms;memory:14.8MB
class Solution:
    def firstUniqChar(self, s: str) -> int:
        c = Counter(s)
        for i in range(len(s)):
            if(c[s[i]]==1):
                return i
        return -1 