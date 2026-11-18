class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = prices[0];

        int result = 0;
        for (int i = 1; i < n; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            result = Math.max(result, prices[i] - buyPrice);
        }
        return result;
    }
}