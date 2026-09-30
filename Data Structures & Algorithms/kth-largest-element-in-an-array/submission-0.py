class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        heap = []
        b = 0
        counter = 0
        for a in nums:
            heapq.heappush(heap, -a)
        while counter < k:
            b = heapq.heappop(heap)
            counter+=1
        return -b
        


        