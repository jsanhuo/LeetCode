#time:48ms;memory:13.3MB
class Solution(object):
    def splitIntoFibonacci(self, S):
        """
        :type S: str
        :rtype: List[int]
        """
        if S[0] == 0:
            return []
        print(self.fun(S,3))
            


    def fun(self,S,n):
        a = []
        t = 0
        for i in range(len(S)):
            if (i+1)%n==0:
                t *=10
                t += int(S[i])
                a.append(t)
                t = 0
                if(i+1<len(S) and S[i+1] == 0):
                    a.append(0)
                    i+=1
            elif i+1 == len(S):
                t+=int(S[i])
                a.append(t)
            else:
                t *=10
                t += int(S[i])
            
        return a