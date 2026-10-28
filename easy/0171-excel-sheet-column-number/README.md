# Excel Sheet Column Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `columnTitle` that represents the column title as appears in an Excel sheet, return *its corresponding column number*.

For example:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

```

 

**Example 1:**

```
Input: columnTitle = "A"
Output: 1

```

**Example 2:**

```
Input: columnTitle = "AB"
Output: 28

```

**Example 3:**

```
Input: columnTitle = "ZY"
Output: 701

```

 

**Constraints:**

- 1 <= columnTitle.length <= 7
- columnTitle consists only of uppercase English letters.
- columnTitle is in the range ["A", "FXSHRXW"].

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 7.35%)  
**Memory:** 42.9 MB (beats 94.82%)  
**Submitted:** 2026-10-28T02:49:30.389Z  

```java
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + charValue;
        }
        return result;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/)