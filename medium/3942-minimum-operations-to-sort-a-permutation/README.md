# Minimum Operations to Sort a Permutation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n`, where `nums` is a permutation of the integers from 0 to `n - 1`.

You may perform **only** the following operations:

- Reverse the entire array.
- Rotate Left by One: Move the first element to the end of the array, and rest elements to left by one position.

Return an integer denoting the **minimum** number of operations required to sort the array in **increasing** order. If it is **not possible** to sort the array using only the given operations, return -1.

 

**Example 1:**

**Input:** nums = [0,2,1]

**Output:** 2

**Explanation:**

- Rotate Left by one: [2, 1, 0]
- Reverse the array: [0, 1, 2]

The array becomes sorted in 2 operations, which is minimal

**Example 2:**

**Input:** nums = [1,0,2]

**Output:** 2

**Explanation:**

- Reverse the array: [2, 0, 1]
- Rotate Left by one: [0, 1, 2]

The array becomes sorted in 2 operations, which is minimal.

**Example 3:**

**Input:** nums = [2,0,1,3]

**Output:** -1

**Explanation:**

It is impossible to reach `[2, 0, 1, 3]`. Thus, the answer is -1.

 

**Constraints:**

- 1 <= n == nums.length <= 105
- 0 <= nums[i] <= n - 1
- nums is a permutation of integers from 0 to n - 1.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 74.58%)  
**Memory:** 94.8 MB (beats 83.05%)  
**Submitted:** 2026-10-23T03:47:31.359Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-operations-to-sort-a-permutation/)