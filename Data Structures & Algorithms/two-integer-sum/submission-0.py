class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = []
        for i,a in enumerate(nums):
            for j,b in enumerate(nums):
                if a + b == target and i < j:
                    return [i,j]
                   
        return res