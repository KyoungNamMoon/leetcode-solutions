class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int first = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                first = 0;
            } else {
                first++;
            }
            if (max < first) {
                max = first;
            }
        }
       
        return max;
    }
}