class Solution {
    public int[] productExceptSelf(int[] nums) {
      ArrayList<Integer> al = new ArrayList<>();
      int k = 0;
      int a = 1;
      int b = 0;
      for (int i = 0; i<nums.length;i++){
        if (nums[i] == 0){
            k++;
            b = i;
        }
      }
      for (int i = 0; i<nums.length;i++){
        if (k==0){
           a*=nums[i];
        }
        if (k==1 && i != b){
            a*=nums[i];
           
        }
        

        }
      
      
      if (k == 0){
        for (int i = 0; i<nums.length;i++){
            nums[i] = a/nums[i];
        }
      }
      if (k==1){
            for (int i = 0; i<nums.length;i++){
                if (nums[i] == 0){
                    nums[i] = a;
                }
                if (i != b){
                nums[i] = 0;}
                    
            }
      }
      if (k > 1){
      for (int i = 0; i<nums.length;i++){
        nums[i] = 0;
      }
      }
      return nums;
    
    }
}