class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }
        int minSum = Integer.MAX_VALUE;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = l; i <= n; i++) {
            int addIndex = i - l;
            map.put(prefix[addIndex], map.getOrDefault(prefix[addIndex], 0) + 1);
            if (i > r) {
                int removeIndex = i - r - 1;
                int count = map.get(prefix[removeIndex]);
                if (count == 1) {
                    map.remove(prefix[removeIndex]);
                } else {
                    map.put(prefix[removeIndex], count - 1);
                }
            }
            Integer lowerKey = map.lowerKey(prefix[i]);
            if (lowerKey != null) {
                minSum = Math.min(minSum, prefix[i] - lowerKey);
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;

       
    }
}