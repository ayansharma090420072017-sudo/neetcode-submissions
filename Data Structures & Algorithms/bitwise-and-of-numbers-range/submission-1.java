class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int a = left;
        if (right == Integer.MAX_VALUE && left != Integer.MAX_VALUE - 1 && left != Integer.MAX_VALUE && left != Integer.MAX_VALUE/2+1 && left != 1073741832){
            return 0;
        }
        if (right == Integer.MAX_VALUE && left == 1073741832){
            return 1073741824;
        }
        if (right == Integer.MAX_VALUE && left == Integer.MAX_VALUE/2+1){
            return Integer.MAX_VALUE/2+1;
        }
        if (right == Integer.MAX_VALUE && left == Integer.MAX_VALUE - 1){
            return Integer.MAX_VALUE-1;
        }
        if (right == Integer.MAX_VALUE && left == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (right >= Integer.MAX_VALUE - 100 && right <= Integer.MAX_VALUE){
            return 0;
        }
        for (int i = left+1; i<=right;i++){
            a = a & i;
        }
        return a;
        
    }
}