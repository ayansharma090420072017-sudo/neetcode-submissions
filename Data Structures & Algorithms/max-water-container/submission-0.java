class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length-1;
        while (right > left){
            max = Math.max((right-left)*Math.min(heights[right],heights[left]), max);
            if (heights[right] > heights[left]){
                left++;
            }
            else {
                right--;
            }
            

        }
        return max;
    }
}
