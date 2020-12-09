#time:32ms;memory:13.6MB
class Solution:
    def uniquePaths(self, m, n):
        #横着和竖着只有一种方式可以走到Finish，所以初始化直接对表进行填充
        f = [[1] * n] + [[1] + [0] * (n - 1) for _ in range(m - 1)]
        #因为f(i,j)只能通过向下移动或者向右移动则f(i,j)就等于他的左边可以走的可能数f(i-1,j)加上面可以走的数目f(i,j-1)
        #f(i,j) = f(i-1,j)+f(i,j-1)
        for i in range(1, m):
            for j in range(1, n):
                f[i][j] = f[i - 1][j] + f[i][j - 1]
        #最终位置也就是m-1，n-1
        return f[m - 1][n - 1]