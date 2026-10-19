class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        done = set()
        people.sort()
        l = 0
        r = len(people) - 1
        b = 0
        while l <= r:
           rem = limit - people[r]
           r-=1
           b+=1
           if l <= r and people[l] <= rem:
            l+=1
        return b

            
            
        