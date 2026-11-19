# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

 

Original
Java
**Example 1:**

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

**Example 2:**

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

**Example 3:**

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

**Constraints:**

- -231 <= x <= 231 - 1

 

**Follow up:** Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 6.43%)  
**Memory:** 45.6 MB (beats 66.33%)  
**Submitted:** 2026-11-19T02:29:52.868Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)