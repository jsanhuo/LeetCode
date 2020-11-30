class Solution(object):
    def largestPerimeter(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        length = len(A)
        c = 0
        l = sorted(A,reverse=True)
        for i in range(length-2):
            if(l[i]+l[i+1]>l[i+2] and l[i]-l[i+1]<l[i+2]):
                c = l[i]+l[i+1]+l[i+2]
                break;
        return c
