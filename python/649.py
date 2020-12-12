#time:6148ms;memory:13.4MB
class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        from collections import Counter
        m = Counter(senate)
        i = 0
        lenth = len(senate)
        isL = [1]*lenth
        while(m['R']!=0 and m['D']!=0):
            index = i%lenth
            i+=1
            if(isL[index]==0):
                continue
            t = senate[index]
            if(t == 'R'):
                j = (index+1)%lenth
                while(True):
                    if(senate[j] == 'D' and isL[j]!=0):
                        isL[j] = 0
                        m['D'] -= 1
                        break
                    j = (j+1)%lenth
            if(t == 'D'):
                j = (index+1)%lenth
                while(True):
                    if(senate[j] == 'R'and isL[j]!=0):
                        isL[j] = 0
                        m['R'] -= 1
                        break
                    j = (j+1)%lenth     
        if(m['R']==0):
            return 'Dire'
        else:
            return 'Radiant'
