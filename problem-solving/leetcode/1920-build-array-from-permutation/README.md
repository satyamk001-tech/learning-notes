# LeetCode 1920: Build Array from Permutation

- **Platform:** LeetCode
- **Problem Number:** 1920
- **Difficulty:** Easy
- **Core Pattern:** Array Simulation

---

## 📖 Problem Description
Given a zero-based permutation `nums`, build an array `ans` of the same length where `ans[i] = nums[nums[i]]`.

---

## 💡 Algorithmic Intuition & Approach
Allocate array `ans` of size `nums.length`. Loop `i` from 0 to `nums.length - 1` and set `ans[i] = nums[nums[i]]`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(N)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
