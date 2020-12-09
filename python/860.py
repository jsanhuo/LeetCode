#time:168ms;memory:13.8MB
class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        money = {5:0,10:0,20:0}
        for i in bills:
            if(i==5):
                money[5] += 1
            if(i==10):
                if(money[5]==0):
                    return False
                else:
                    money[10] +=1
                    money[5] -=1
            if(i==20):
                if(money[5]==0):
                    return False
                elif(money[5]<3 and money[10]==0):
                    return False
                elif(money[5]>=3 and money[10]==0):
                    money[5]-=3
                    money[20]+=1
                else:
                    money[20]+=1
                    money[5]-=1
                    money[10]-=1
        return True