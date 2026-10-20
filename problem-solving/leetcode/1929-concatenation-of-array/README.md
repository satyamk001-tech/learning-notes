# LeetCode 1929: Concatenation of Array

- **Platform:** LeetCode
- **Problem Number:** 1929
- **Difficulty:** Easy
- **Core Pattern:** Array Construction

---

## 📖 Problem Description
Given an integer array `nums` of length `n`, return an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]`.

---

## 💡 Algorithmic Intuition & Approach
Allocate array `ans` of size `2n`. In a single loop from 0 to `n-1`, set `ans[i] = nums[i]` and `ans[i + n] = nums[i]`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(N)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
