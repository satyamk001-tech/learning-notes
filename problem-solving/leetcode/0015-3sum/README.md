# LeetCode 15: 3Sum

- **Platform:** LeetCode
- **Problem Number:** 15
- **Difficulty:** Medium
- **Core Pattern:** Two Pointers / Sorting

---

## 📖 Problem Description
Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

---

## 💡 Algorithmic Intuition & Approach
Iterate through all distinct triplet index combinations `(i, j, k)`. Sum the values and collect triplets summing to zero.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N^3) (Brute Force) / O(N^2) (Sorted Two Pointers)$
- **Space Complexity:** $O(1) / O(N)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
