class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        boolean isSorted = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            return 0;
        }
        
        boolean isInc = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] != (nums[i] + 1) % n) {
                isInc = false;
                break;
            }
        }
        
        if (isInc) {
            int k = nums[0];
            return Math.min(n - k, k + 2);
        }
        boolean isDec = true;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == n - 1) {
                maxIndex = i;
            }
            if (i < n - 1) {
                if (nums[i + 1] != (nums[i] - 1 + n) % n) {
                    isDec = false;
                }
            }
        }
        
        if (isDec) {
            return Math.min(maxIndex + 1, n - maxIndex + 1);
        }
        return -1;
    }
    //실패함 다시해
}