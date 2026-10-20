# LeetCode 283: Move Zeroes

- **Platform:** LeetCode
- **Problem Number:** 283
- **Difficulty:** Easy
- **Core Pattern:** Two Pointers

---

## 📖 Problem Description
Given an integer array `nums`, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

---

## 💡 Algorithmic Intuition & Approach
Use pointer `insertPos`. Iterate through array. Whenever a non-zero element is encountered, place it at `nums[insertPos++]`. After the loop, fill remaining indices with 0.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
