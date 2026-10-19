class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hm = {a:[] for a in nums}
        for i,a in enumerate(nums):
            hm[a].append(i)
        print(hm)
        def canDo(arr, k):
            for i in range(len(arr) - 1):
                if abs(arr[i+1] - arr[i]) <= k:
                    print(abs(arr[i+1] - arr[i]))
                    return True
            return False
        res = False
        for a in hm.keys():
            print(canDo(hm[a], k))
            res = res + canDo(hm[a], k)
            print(res)


        return True if res >= 1 else False        

                
        