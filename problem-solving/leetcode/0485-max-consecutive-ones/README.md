# LeetCode 485: Max Consecutive Ones

- **Platform:** LeetCode
- **Problem Number:** 485
- **Difficulty:** Easy
- **Core Pattern:** Array Traversal

---

## 📖 Problem Description
Given a binary array `nums`, return the maximum number of consecutive 1's in the array.

---

## 💡 Algorithmic Intuition & Approach
Iterate through array. If element is 1, increment `count` and update `maxCount`. If element is 0, reset `count = 0`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
