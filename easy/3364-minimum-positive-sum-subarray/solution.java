class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int minSum = Integer.MAX_VALUE;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
         int currentSum = 0;

         for (int j = i; j < n;j++) {
            currentSum += nums.get(j);
            int size = j - i + 1;
            if (size > r) {
                break;
            }
            if (size >= l && currentSum > 0) {
                minSum = Math.min(minSum, currentSum);
            }
        }
       }
       if (minSum == Integer.MAX_VALUE) {
        return -1;
       }
       return minSum;
    }
}