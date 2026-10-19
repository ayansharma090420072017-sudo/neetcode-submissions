class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        count = set()
        l = 0
        r = 0
        res = 0
        while r < len(s):
            while s[r] in count:
                count.remove(s[l])
                l+=1
            count.add(s[r])
            r+=1
            res = max(res,len(count))
        return res
 
        