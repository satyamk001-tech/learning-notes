# LeetCode 11: Container With Most Water

- **Platform:** LeetCode
- **Problem Number:** 11
- **Difficulty:** Medium
- **Core Pattern:** Two Pointers / Greedy

---

## 📖 Problem Description
You are given an integer array `height` of length `n`. Find two lines that together with the x-axis form a container, such that the container contains the most water.

---

## 💡 Algorithmic Intuition & Approach
Evaluate every pair `(i, j)` to calculate volume `min(height[i], height[j]) * (j - i)`. Track the global maximum.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N^2) (Brute Force) / O(N) (Two Pointers)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
