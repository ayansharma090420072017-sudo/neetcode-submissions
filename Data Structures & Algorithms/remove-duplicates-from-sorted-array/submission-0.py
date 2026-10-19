class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = {a:0 for a in nums}
        for a in nums:
            count[a]+=1
        for i,a in enumerate(count.keys()):
            nums[i] = a
        
        return len(count)
        