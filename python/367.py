#time:40ms;memory:14.6MB
class Solution:
    def wiggleMaxLength(self, nums: List[int]) -> int:
        n = len(nums)
        if n < 2:
            return n
        #摆动序列也就是数字应该是一小一大的序列
        #因此通过他们之间的规律可以得出，要找出最长的一小一大的子串
        #up为最后一个数为大的子串的最大长度
        #down为最后一个数为小的子串长度
        #默认第一个为最长或者最短
        up = [1] + [0] * (n - 1)
        down = [1] + [0] * (n - 1)
        for i in range(1, n):
            #当当前的值比以前的大的时候
            if nums[i] > nums[i - 1]:
                #当前的最后一个数为大的长度应该为：
                #1.之前以大结尾的的长度up[i-1]
                #2.之前以小结尾的长度+1 down[i-1]+1
                #因为要求最大值 所以需要求最大
                up[i] = max(up[i - 1], down[i - 1] + 1)
                #down不用进行转移
                down[i] = down[i - 1]
            #当当前的值比以前小的时候
            elif nums[i] < nums[i - 1]:
                #当前最后一个数为大的长度不发生变化
                up[i] = up[i - 1]
                #当前最后一个数为小的长度为
                #1.之前以大结尾的长度+1 up[i-1]+1
                #2.之前以小结尾的长度down[i-1]
                #因为要求最大值 所以需要求最大
                down[i] = max(up[i - 1] + 1, down[i - 1])
            #如果两数相等 则不计算
            else:
                up[i] = up[i - 1]
                down[i] = down[i - 1]
            #最终的结果为 最后一个数为大的长度和最后一个数为小的长度 两个值中的最大值
        return max(up[n - 1], down[n - 1])