class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int max = 0;
        for (int x : prices) {
            if (x < price) {
                price = x;
            }
            max = Math.max(max, x - price);
        }
        return max;
    }
}