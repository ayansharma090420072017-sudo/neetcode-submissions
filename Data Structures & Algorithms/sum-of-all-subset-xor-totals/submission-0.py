class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        res = []
        subset = []
        def dfs(i):
            if i >= len(nums):
                res.append(subset.copy())
                return
            
            subset.append(nums[i])
            dfs(i+1)

            subset.pop()
            dfs(i+1)
        
        dfs(0)
        ans = res
        print(ans)
        def xor(arr):
            res = 0
            for a in arr:
                res = res^a
            return res
        answer = 0
        for a in ans:
            answer+=xor(a)
        
        return answer