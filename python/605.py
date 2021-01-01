#time:40ms;memory:14.9MB
class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        i = 0
        l = len(flowerbed)
        while(i<l):
            #如果第i个位置为1那么根据规则接下来1个不能种花
            #跳过一个格子也就是i+2
            if (flowerbed[i] == 1):
                i += 2
            #如果第i个位置是0而且是最后一个位置
            #种下花
            #如果第i个位置是0而且第i+1个位置也是0
            #跳过一个格子并且种下一枝花
            elif  i == l - 1 or  flowerbed[i + 1] == 0:
                n-=1
                i += 2
            #如果不符合以下情况那么情况为01也就是flowerbed[i]=0 and flowerbed[i+1]=1此时跳过3个位置
            #跳到01之后
            else:
                i+=3
        return n <= 0;
