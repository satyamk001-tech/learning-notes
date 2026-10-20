# LeetCode 1200: Minimum Absolute Difference

- **Platform:** LeetCode
- **Problem Number:** 1200
- **Difficulty:** Easy
- **Core Pattern:** Array / Sorting

---

## 📖 Problem Description
Given an array of distinct integers `arr`, find all pairs of elements with the minimum absolute difference of any two elements.

---

## 💡 Algorithmic Intuition & Approach
Sort the array. Find minimum adjacent difference in a first pass. In a second pass, collect all adjacent pairs matching the minimum difference.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N log N)$
- **Space Complexity:** $O(1) auxiliary$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
