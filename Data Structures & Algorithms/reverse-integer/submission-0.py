class Solution:
    def reverse(self, x: int) -> int:
        if x > (pow(2,31) - 1) or x < - pow(2, 31):
            return 0
        if x > 0:
            ls = []
            s = str(x)
            for c in s:
                ls.append(int(c))
            
            res = 0
            for i,a in enumerate(ls):
                res= res + pow(10,i)*(a)
            if res > (pow(2,31) - 1) or res < - pow(2, 31):
               return 0
            return res 
        else:
            x = -x
            ls = []
            s = str(x)
            for c in s:
                ls.append(int(c))
            
            res = 0
            for i,a in enumerate(ls):
                res= res + pow(10,i)*(a)
            if res > (pow(2,31) - 1) or res < - pow(2, 31):
               return 0
            return -res 
        