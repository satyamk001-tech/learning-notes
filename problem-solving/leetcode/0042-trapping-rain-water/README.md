# LeetCode 42: Trapping Rain Water

- **Platform:** LeetCode
- **Problem Number:** 42
- **Difficulty:** Hard
- **Core Pattern:** Dynamic Programming / Two Pointers

---

## 📖 Problem Description
Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

---

## 💡 Algorithmic Intuition & Approach
Precompute `leftMax` and `rightMax` arrays for each index. For each bar `i`, water trapped is `min(leftMax[i], rightMax[i]) - height[i]`. Sum over all indices.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(N) (Auxiliary Arrays) / O(1) (Two Pointers)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
