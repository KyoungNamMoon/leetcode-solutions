# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

Original
Java
**Example 1:**

**Input:** s = "()"

**Output:** true

**Example 2:**

**Input:** s = "()[]{}"

**Output:** true

**Example 3:**

**Input:** s = "(]"

**Output:** false

**Example 4:**

**Input:** s = "([])"

**Output:** true

**Example 5:**

**Input:** s = "([)]"

**Output:** false

 

**Constraints:**

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 5.49%)  
**Memory:** 42.8 MB (beats 79.93%)  
**Submitted:** 2026-11-21T03:21:58.437Z  

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i)  == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && isPair(stack.peek(),s.charAt(i))) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
    private boolean isPair(char last, char cur) {
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur == ']');
    } 
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)