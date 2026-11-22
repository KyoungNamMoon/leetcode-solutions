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
**Runtime:** 13 ms (beats 57.49%)  
**Memory:** 45.3 MB (beats 84.34%)  
**Submitted:** 2026-11-22T03:21:24.685Z  

```java
class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        while (x > 0) {
            int digit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + (digit);
        }
        return reverse == original;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)