# Fibonacci Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The **Fibonacci numbers**, commonly denoted `F(n)` form a sequence, called the **Fibonacci sequence**, such that each number is the sum of the two preceding ones, starting from `0` and `1`. That is,

```
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

```

Given `n`, calculate `F(n)`.

 

Original
Java
**Example 1:**

```
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

```

**Example 2:**

```
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

```

**Example 3:**

```
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

```

 

**Constraints:**

- 0 <= n <= 30

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.7 MB (beats 53.67%)  
**Submitted:** 2026-11-22T03:19:51.589Z  

```java
class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n; 
        }
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/fibonacci-number/)