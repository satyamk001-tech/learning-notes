# Trapping Rain Water

## 1. Problem Statement
Given $n$ non-negative integers representing an elevation map where the width of each bar is $1$, compute how much water it can trap after raining.

---

## 2. Intuition
For any bar at index $i$, the amount of water trapped directly above it is determined by the minimum of the highest bar to its left and the highest bar to its right, minus its own height:
$$\text{Water}[i] = \max\left(0, \min(\text{leftMax}[i], \text{rightMax}[i]) - \text{height}[i]\right)$$

---

## 3. Approach: Precomputed Auxiliary Arrays
1. Compute `leftMax` array where `leftMax[i]` stores $\max(\text{height}[0 \dots i])$.
2. Compute `rightMax` array where `rightMax[i]` stores $\max(\text{height}[i \dots n-1])$.
3. Iterate $i$ from $0$ to $n-1$, compute trapped water per bar, and accumulate into `totalWater`.

---

## 4. Java Implementation
```java
public static int trappedRainwater(int[] height) {
    int n = height.length;
    if (n <= 2) return 0;

    int[] leftMax = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    int[] rightMax = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    int totalWater = 0;
    for (int i = 0; i < n; i++) {
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        totalWater += waterLevel - height[i];
    }
    return totalWater;
}
```

---

## 5. Complexity
- **Time Complexity:** $\mathcal{O}(N)$ — three linear passes.
- **Space Complexity:** $\mathcal{O}(N)$ — for `leftMax` and `rightMax` arrays. (Can be optimized to $\mathcal{O}(1)$ space using Two Pointers).
