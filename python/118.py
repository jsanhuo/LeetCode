#time:16ms;memory:13MB
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        yh = []
        for i in range(numRows):
            tlist = []
            for j in range(i+1):
                if j==0 or j==i:
                    tlist.append(1)
                else:
                    tlist.append(yh[i-1][j-1]+yh[i-1][j])
            yh.append(tlist)
        return yh