# LeetCode 75: Sort Colors

- **Platform:** LeetCode
- **Problem Number:** 75
- **Difficulty:** Medium
- **Core Pattern:** Two Pointers / Dutch National Flag / Counting

---

## 📖 Problem Description
Given an array `nums` with `n` objects colored red, white, or blue (0, 1, 2), sort them in-place so that objects of the same color are adjacent.

---

## 💡 Algorithmic Intuition & Approach
Count occurrences of 0, 1, and 2 in a first pass. In a second pass, overwrite the original array with 0s, then 1s, then 2s.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
