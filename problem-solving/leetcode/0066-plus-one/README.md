# LeetCode 66: Plus One

- **Platform:** LeetCode
- **Problem Number:** 66
- **Difficulty:** Easy
- **Core Pattern:** Array / Math

---

## 📖 Problem Description
Increment the large integer represented as an integer array `digits` by one.

---

## 💡 Algorithmic Intuition & Approach
Iterate backwards from last digit. If digit < 9, increment and return. If digit == 9, set to 0 and carry over. If all digits are 9, prepend 1 in a newly allocated array of size `n + 1`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1) auxiliary (O(N) if all 9s)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
