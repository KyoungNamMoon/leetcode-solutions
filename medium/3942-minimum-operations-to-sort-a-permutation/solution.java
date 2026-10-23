class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        
        // 1. 이미 정렬되어 있는지 확인
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
        
        // 2. 증가하는 순환 시프트인지 확인
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
        
        // 3. 감소하는 순환 시프트인지 확인 및 최대값(n-1) 위치 찾기
        boolean isDec = true;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == n - 1) {
                maxIndex = i;
            }
            if (i < n - 1) {
                // Java 모듈러 특성을 고려하여 음수가 되지 않도록 n을 더함
                if (nums[i + 1] != (nums[i] - 1 + n) % n) {
                    isDec = false;
                }
            }
        }
        
        if (isDec) {
            return Math.min(maxIndex + 1, n - maxIndex + 1);
        }
        
        // 4. 어떤 패턴에도 속하지 않는다면 정렬 불가
        return -1;
    }
}