class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        # for i in range(len(nums)):
        #     if target <= nums[i]:
        #         return i
        
        # return len(nums)
        l = 0
        r = len(nums) - 1
        res = len(nums)
        while l <= r:
            mid = (l + r) // 2
            if nums[mid] >= target:
                res = mid
                r = mid - 1
            if nums[mid] < target:
                l = mid + 1

        return res
