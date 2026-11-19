class Solution {
    public boolean isPalindrome(int x) {
        char[] array = String.valueOf(x).toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}