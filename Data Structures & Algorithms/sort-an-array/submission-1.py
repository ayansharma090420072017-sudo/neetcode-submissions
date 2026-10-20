class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        ans = [0] * len(nums)
        nums.sort()

        for i in range(len(ans)):
            ans[i] = nums[i]
        return nums