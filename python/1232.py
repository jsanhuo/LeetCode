# time:88ms;memory:15.3MB
class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        if (len(coordinates)<=2):
            return True
        x1,y1 = coordinates[0][0],coordinates[0][1]
        x2,y2 = coordinates[1][0],coordinates[1][1]
        X = (x2-x1)
        Y = (y2-y1)
        if(X==0):
            xx = x1
            for li in coordinates:
                if xx!=li[0]:
                    return False
            return True
        a = Y/X
        b = y1 - a*x1
        for li in coordinates:
            if li[1]!=li[0]*a+b:
                return False
        return True