class Solution:
    def leastBricks(self, wall: List[List[int]]) -> int:
        gap = {0:0}
        for r in wall:
            total = 0
            for c in r[:-1]:
                total+=c
                gap[total] = 1 + gap.get(total, 0)
        return len(wall) - max(gap.values())

        