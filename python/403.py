# time:2648ms;memory:18.2MB
class Solution:
    def canCross(self, stones: List[int]) -> bool:
        if(stones[0]+1 == stones[1]):
            maps = {}
            return self.canjump(stones,1,1,maps)
        else:
            return False
    def canjump(self,stone,x,k,maps):
        if(x == len(stone)-1):
            return True
        if maps.get(x*1000+k) == None:
            xx1 = False
            if k!=0:
                if stone.count(stone[x]+k)!=0:
                    maps[x*1000+k] = True
                    x1 = stone.index(stone[x]+k)
                    xx1 = self.canjump(stone,x1,k,maps)
            if xx1 == True:
                return True           
            xx2 = False
            if k-1!=0:
                if stone.count(stone[x]+k-1)!=0:
                    maps[x*1000+k] = True
                    x2 = stone.index(stone[x]+k-1)
                    xx2 = self.canjump(stone,x2,k-1,maps)
            if xx2 == True:
                return True
            xx3 = False
            if k+1!=0:
                if stone.count(stone[x]+k+1)!=0:
                    maps[x*1000+k] = True
                    x3 = stone.index(stone[x]+k+1)
                    xx3 = self.canjump(stone,x3,k+1,maps)         
            if xx3 == True:
                return True
            return False