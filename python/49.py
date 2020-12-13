#time:76ms;memory:19.5MB
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        from collections import defaultdict
        result = defaultdict(list)
        for s in strs:
            #填充数组计数
            t = [0]*26
            for c in s:
                t[ord(c)-ord('a')]+=1
            #此处需要讲list转为元组才可以哈希
            result[tuple(t)].append(s)
        return list(result.values())
            
        