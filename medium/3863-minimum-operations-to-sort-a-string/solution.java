class Solution {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (chars[i - 1] > chars[i]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) return 0;
        if (n == 2) return -1;
        char minChar = 'z';
        char maxChar = 'a';
        for (char c : chars) {
            if (c < minChar) minChar = c;
            if (c > maxChar) maxChar = c;
        }

        int minCount = 0;
        int maxCount = 0;
        for (char c : chars) {
            if (c == minChar) minCount++;
            if (c == maxChar) maxCount++;
        }

        if (chars[0] == minChar || chars[n - 1] == maxChar) {
            return 1;
        }
        if (chars[0] == maxChar && chars[n - 1] == minChar && minCount == 1 && maxCount == 1) {
            return 3;
        }
        return 2;

    }
   
}