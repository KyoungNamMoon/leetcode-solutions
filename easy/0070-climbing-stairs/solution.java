class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] way = new int[n + 1];
        way[0] = 0;
        way[1] = 1;
        way[2] = 2;
        for (int i = 3; i <= n; i++) {
            way[i] = way[i - 1] + way[i - 2];
        }
        return way[n];
    }
}