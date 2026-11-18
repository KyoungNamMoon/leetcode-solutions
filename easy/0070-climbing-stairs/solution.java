class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int result = 0;
        int prev1 = 1;
        int prev2 = 2;
        for (int i = 3; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }
}