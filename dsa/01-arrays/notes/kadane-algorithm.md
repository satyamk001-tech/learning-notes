# Kadane's Algorithm (Maximum Subarray Sum)

## 1. Problem Statement
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

---

## 2. Intuition
At every index `i`, we decide between two choices:
1. Extend the existing subarray by including `nums[i]` (`currentSum + nums[i]`).
2. Start a fresh subarray starting at `nums[i]` (discarding negative accumulated sums).

If `currentSum` drops below $0$, continuing to carry it forward will only diminish any future subarray sum. Thus, we reset `currentSum = 0` whenever it becomes negative.

---

## 3. Algorithm Step-by-Step
1. Initialize `maxSum = Integer.MIN_VALUE` and `currentSum = 0`.
2. Iterate through each element `x` in the array:
   - Add `x` to `currentSum`: `currentSum += x`.
   - Update `maxSum = Math.max(maxSum, currentSum)`.
   - If `currentSum < 0`, reset `currentSum = 0`.
3. Return `maxSum`.

---

## 4. Java Implementation
```java
public static int maxSubarraySumKadane(int[] nums) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for (int x : nums) {
        currentSum += x;
        maxSum = Math.max(maxSum, currentSum);
        if (currentSum < 0) {
            currentSum = 0;
        }
    }
    return maxSum;
}
```

---

## 5. Complexity
- **Time Complexity:** $\mathcal{O}(N)$ — single pass through the array.
- **Auxiliary Space:** $\mathcal{O}(1)$ — constant variables.

## 6. Edge Cases
- **All Negative Numbers:** If an array is `[-3, -2, -1]`, resetting `currentSum = 0` before checking `maxSum` could incorrectly return `0`. To handle all-negative arrays, update `maxSum` *before* resetting or initialize `maxSum` with the maximum single element.
