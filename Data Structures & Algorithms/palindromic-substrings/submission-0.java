class Solution {
    public int countSubstrings(String s) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i<s.length();i++){
            for (int j = i+1; j<=s.length();j++){
                al.add(s.substring(i,j));
            }
        }
        int k = 0;
        for (int i = 0; i<al.size();i++){
            if (isPalindrome(al.get(i))){
                k++;
            }
        }
        return k;
        
    }
    public boolean isPalindrome(String s){
        
            for (int i = 0; i<s.length()/2;i++){
                if (s.charAt(i) != s.charAt(s.length()-i-1)){
                    return false;
                }
            }
            return true;
        

        
        
    }   

}
