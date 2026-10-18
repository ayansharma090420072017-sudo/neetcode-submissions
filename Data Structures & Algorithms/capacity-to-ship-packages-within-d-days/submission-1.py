class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        l , r = max(weights), sum(weights)
        res = r
        def canShip(mid):
            ships = 1
            currCap = mid
            for w in weights:
                if currCap - w < 0:
                    ships+=1
                    currCap = mid
                currCap-=w
            return ships <= days

        while l < r:
            mid = (l + r) // 2
            if canShip(mid):
                res = mid
                r = mid
            else:
                l = mid + 1
        
        return res
        