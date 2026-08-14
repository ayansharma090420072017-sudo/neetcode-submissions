class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int r = s1.length()-1;
        if (s1.length() > s2.length()){
            return false;
        }
        while(r < s2.length()-1){
            if (!isPerm(s1,s2,l,r)){
                l++;
                r++;
            }
            if (isPerm(s1,s2,l,r)){
                return true;
            }
        }
        System.out.println(l);
        System.out.println(r);
        
        return isPerm(s1,s2,l,r);
        
    }
    public boolean isPerm(String s1, String s2, int l, int r){
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for (int i = 0; i<s1.length();i++){
            if (!hm1.containsKey(s1.charAt(i))){
                hm1.put(s1.charAt(i),0);
            }
            hm1.put(s1.charAt(i),hm1.get(s1.charAt(i)) + 1);
        }
        for (int i = l; i<=r;i++){
            if (!hm2.containsKey(s2.charAt(i))){
                hm2.put(s2.charAt(i),0);
            }
            hm2.put(s2.charAt(i),hm2.get(s2.charAt(i)) + 1);
        }
        for (char c : hm1.keySet()){
            if (!hm2.containsKey(c)){
                return false;
            }
            if (hm1.get(c) != hm2.get(c)){
                return false;
            }
        }
        return true;
    } 
}
