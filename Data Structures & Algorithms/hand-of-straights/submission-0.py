class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        if len(hand) % groupSize:
            return False
        hand.sort()
        hm = {a:0 for a in hand}
        for a in hand:
            hm[a] += 1
        minH = list(hm.keys())
        heapq.heapify(minH)
        while minH:
            first = minH[0]
            for i in range(first, first + groupSize):
                if i not in hm:
                    return False
                hm[i] -= 1
                if hm[i] == 0:
                    if i != minH[0]:
                        return False
                    heapq.heappop(minH)
        return True

                





    