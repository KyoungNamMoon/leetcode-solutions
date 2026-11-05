class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int val : arr1) {
            if (valid(val, arr2, d)) {
                count++;
            }
        }
        return count;
    }
    private boolean valid(int val, int[] arr, int d) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.abs(val - arr[mid]) <= d) {
                return false;
            }
            if (arr[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return true;
    }
}

//이문제는 map 보다는 정열인이유가 특정 값 range을 찾기위해이기 때문에