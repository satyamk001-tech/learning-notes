# LeetCode 1299: Replace Elements with Greatest Element on Right Side

- **Platform:** LeetCode
- **Problem Number:** 1299
- **Difficulty:** Easy
- **Core Pattern:** Array / Reverse Traversal

---

## 📖 Problem Description
Given an array `arr`, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

---

## 💡 Algorithmic Intuition & Approach
Traverse array backwards from index `n-1` to `0`. Maintain `maxRight`. For each element, store its current value, replace with `maxRight`, and update `maxRight = Math.max(maxRight, currentVal)`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1) auxiliary$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
