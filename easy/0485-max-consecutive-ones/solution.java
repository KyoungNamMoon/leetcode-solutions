class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int first = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                first++;
            } else {
                if (first > max) {
                    max = first;
                }
                first = 0;
            }
        }
        if (first > max) max = first;
        return max;
    }
}