class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        def fac(n):
            res = 1
            for i in range(1,n+1):
                res *= i
            return res

        ans = fac(m+n-2) // (fac(m-1) * fac(n-1))
        return ans
