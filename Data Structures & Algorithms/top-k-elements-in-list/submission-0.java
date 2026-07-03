class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[k];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i<nums.length;i++){
            if (hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            else {
            hm.put(nums[i],1);}
            
        }
        for (int i = 0; i<nums.length;i++){
            if (!al.contains(nums[i])){
                al.add(nums[i]);
            }
        }
        int[] answer = new int[al.size()];
        for (int i = 0; i<al.size();i++){
            
            answer[i] = hm.get(al.get(i));
        }
        System.out.println(hm);
     

        return maxFreq(hm, k, al);

        
    }
    public int[] maxFreq(Map<Integer,Integer> hm, int k, ArrayList<Integer> al){
        int max = 0;
        int[] ans = new int[k];
        for (int j = 0; j < k; j++) {
        int maxFreq = -1;
        int maxKey = -1;

        for (int key : al) {
            if (hm.get(key) > maxFreq) {
                maxFreq = hm.get(key);
                maxKey = key;
            }
        }

        ans[j] = maxKey;
        hm.remove(maxKey);
        al.remove(Integer.valueOf(maxKey));   
        
            
        }
        return ans;
}
}