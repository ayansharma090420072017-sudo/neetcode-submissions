class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        hm = {a:0 for a in nums}
        for a in nums:
            hm[a] += 1
        for a in hm.keys():
            if hm[a] > 1:
                return a

        
        return -1