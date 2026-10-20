# LeetCode 53: Maximum Subarray

- **Platform:** LeetCode
- **Problem Number:** 53
- **Difficulty:** Medium
- **Core Pattern:** Kadane's Algorithm / Dynamic Programming

---

## 📖 Problem Description
Given an integer array `nums`, find the subarray with the largest sum, and return its sum.

---

## 💡 Algorithmic Intuition & Approach
Maintain running `currentSum`. Add each element. Update `maxSum`. If `currentSum` drops below 0, reset `currentSum = 0`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
