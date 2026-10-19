class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxS = float('-inf')
        minS = float('inf')
        res = 0
        for a in prices:
            minS = min(minS, a)
            res = max(res, a - minS)
        
        return res
        
        