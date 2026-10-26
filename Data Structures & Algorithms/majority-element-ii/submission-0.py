class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        count = len(nums) / 3
        res = []
        hm = {a:0 for a in nums}
        for a in nums:
            hm[a]+=1
        for c in hm.keys():
            if hm[c] > count:
                res.append(c)
        return res
                 
        