class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for (int i = 0; i<strs.size();i++){
            str += (strs.get(i) + '中');
        }
        return str; 

    }

    public List<String> decode(String str) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i) == '中'){
                count.add(i);
            }
        }
        if (count.size() > 0){
           al.add(str.substring(0,count.get(0)));
        }
        for (int i = 0; i<count.size()-1;i++){
            al.add(str.substring(count.get(i)+1,count.get(i+1)));
        }
        System.out.println(al);
        return al;
    }
}
