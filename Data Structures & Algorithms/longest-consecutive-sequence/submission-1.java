class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        int a = 0;
        for (int i = 0; i<nums.length;i++){
            if (!al1.contains(nums[i])){
                al1.add(nums[i]);
            }
        }
        for (int i = 0; i<al1.size()-1;i++){
            if (al1.get(i+1) - al1.get(i) == 1){
                a++;
                al.add(a);
            }
            else {
                a = 0;
                al.add(0);
            }
        }
        int max = 0;
        for (int i = 0; i<al.size();i++){
            if (al.get(i) > max){
                max = al.get(i);
            }
        }
        System.out.println(al);
        return max+1;
        
    }
}
