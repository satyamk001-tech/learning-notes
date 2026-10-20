# LeetCode 1: Two Sum

- **Platform:** LeetCode
- **Problem Number:** 1
- **Difficulty:** Easy
- **Core Pattern:** Array / Two Pointers / Hash Table

---

## 📖 Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

---

## 💡 Algorithmic Intuition & Approach
Iterate through all pairs `(i, j)` where `i < j`. Check if `nums[i] + nums[j] == target`. Return `{i, j}` upon match.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N^2) (Brute Force) / O(N) (Hash Map)$
- **Space Complexity:** $O(1) / O(N)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
