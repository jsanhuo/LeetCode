#time:32ms;memory:13.3MB
class Solution(object):
    def maxDepthAfterSplit(self, seq):
        """
        :type seq: str
        :rtype: List[int]
        """
        result = []
        i = 0
        for a in seq:
            if (a == '('):
                i += 1
            result.append(i % 2)
            if (a == ')'):
                i -= 1

        return result
