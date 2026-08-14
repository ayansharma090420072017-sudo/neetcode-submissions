class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int r = 0;
        int ans = 0;
        for (int i = 0; i<s.length();i++){
            if (hm.containsKey(s.charAt(i))){
                r = Math.max(hm.get(s.charAt(i)) + 1, r);
            }
            hm.put(s.charAt(i),i);
            ans = Math.max(ans, i - r + 1);
        }
        return ans;
    }
}
