# Minimum Operations to Sort a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` consisting of lowercase English letters.

In one operation, you can select any **substring** of `s` that is **not** the entire string and **sort** it in **non-descending alphabetical** order.

Return the **minimum** number of operations required to make `s` sorted in **non-descending** order. If it is not possible, return -1.

 

**Example 1:**

**Input:** s = "dog"

**Output:** 1

**Explanation:**​​​​​​​

- Sort substring "og" to "go".
- Now, s = "dgo", which is sorted in ascending order. Thus, the answer is 1.

**Example 2:**

**Input:** s = "card"

**Output:** 2

**Explanation:**

- Sort substring "car" to "acr", so s = "acrd".
- Sort substring "rd" to "dr", making s = "acdr", which is sorted in ascending order. Thus, the answer is 2.

**Example 3:**

**Input:** s = "gf"

**Output:** -1

**Explanation:**

- It is impossible to sort s under the given constraints. Thus, the answer is -1.

 

**Constraints:**

- 1 <= s.length <= 105
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 19 ms (beats 84.85%)  
**Memory:** 46.6 MB (beats 100.00%)  
**Submitted:** 2026-10-22T04:05:58.243Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-operations-to-sort-a-string/)