#time:892ms;memory:70.8MB 埃氏筛（sieve of Eratosthenes）
class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n==0 or n==1:
            return 0
        isPrime = [1] * n
        isPrime[0] = 0
        isPrime[1] = 0
        for i in range(2,n):
            if(isPrime[i]==1):
                j = 2
                while j*i < n:
                    isPrime[j*i]=0
                    j+=1
        return sum(isPrime)


#time:716ms;memory:71.4MB 线性筛（欧氏，sieve of Euler）
class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        prime = []
        if n==0 or n==1:
            return 0
        isPrime = [1] * n
        isPrime[0] = 0
        isPrime[1] = 0
        for i in range(2,n):
            if(isPrime[i]==1):
                prime.append(i)
            for j in prime:
                if(i*j>=n):
                    break
                isPrime[j*i]=0
                if(i%j==0):
                    break
        return sum(isPrime)

#有问题
class Solution(object):

    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        prime = []
        if n==0 or n==1:
            return 0
        isPrime = [1] * n
        isPrime[0] = 0
        isPrime[1] = 0
        for i in range(2,n):
            if(isPrime[i]==1):
                prime.append(i)
            #此处for循环存在问题！！！，直接for prime即可
            for j in range(len(prime)):
                if(i*prime[j]>=n):
                    break
                isPrime[prime[j]*i]=0
                if(i%prime[j]==0):
                    break
        return sum(isPrime)


