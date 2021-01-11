#time:44ms;memory:14.8MB
class Solution:
    def reverse(self, x: int) -> int:
        l = list(str(x))
        result = 0
        if l[0] == '-':
            result =  int("-"+"".join(l[:0:-1]))
        else:
            result = int("".join(l[::-1]))
        if(-(2**31)<result<(2**31)-1):
            return result
        else:
            return 0