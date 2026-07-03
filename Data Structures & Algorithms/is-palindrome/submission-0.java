class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i<s.length();i++){
            if ((s.charAt(i) <= 57 && s.charAt(i) >= 48) || (s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) <= 122 && s.charAt(i) >= 97)){
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90){
                   str = str + (char)(s.charAt(i)+32);
                }
                else{
                   str = str + s.charAt(i);
                }
            }
        }
        Stack<Character> st = new Stack<>();
        if (str.length() % 2 == 0){
            for (int i = 0; i<str.length()/2;i++){
                st.push(str.charAt(i));
            }
            for (int i = str.length()/2;i<str.length();i++){
                if (st.pop() != str.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        for (int i = 0; i<str.length()/2;i++){
                st.push(str.charAt(i));
            }
            for (int i = str.length()/2+1;i<str.length();i++){
                if (st.pop() != str.charAt(i)){
                    return false;
                }
            }
            return true;
        
    }
}
