#time:20 ms;memory:13.1 MB

class Solution(object):
    def matrixScore(self, A):
        """
        :type A: List[List[int]]
        :rtype: int
        """
        l = len(A)
        for r in A:
            if(r[0]==0):
                for i in range(len(r)):
                    if r[i] == 0:
                        r[i]=1
                    else:
                        r[i]=0
        for i in range(len(A[0])):
            s = 0
            for j in range(len(A)):
                s += A[j][i]
            if(s<len(A)/2.0):
                for j in range(len(A)):
                    if A[j][i] ==0 :
                        A[j][i] =1
                    else:
                        A[j][i]=0
        count = 0
        for r in A:
            for i in range(len(r)):
                count += r[i]*2**(len(r)-i-1)            
        return count
