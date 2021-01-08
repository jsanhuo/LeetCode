#time:36ms;memory:15.1MB
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #n为数组长度，k为需要移动的位置
        #（k对len(nums)取余的原因在于当移动的是总长度的倍数的时候相当于没移动）
        n, k = len(nums), k % len(nums)
        #总共需要遍历的次数是k和n的最大公约数
        g = gcd(k, n)
        #总共需要遍历g次
        for i in range(g):
            #s为起始点，x为第一个数
            s, x = i, nums[i]
            #需要移动n//g个数
            for j in range(n // g):
                nums[(s + k) % n], x = x, nums[(s + k) % n]
                #起始点移动
                s = (s + k) % n