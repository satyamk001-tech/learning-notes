# LeetCode 2535: Difference Between Element Sum and Digit Sum of an Array

- **Platform:** LeetCode
- **Problem Number:** 2535
- **Difficulty:** Easy
- **Core Pattern:** Math / Array

---

## 📖 Problem Description
Return the absolute difference between the element sum and the digit sum of `nums`.

---

## 💡 Algorithmic Intuition & Approach
Sum all elements for `elementSum`. For each element, extract digits via modulo 10 and division by 10 to calculate `digitSum`. Return `Math.abs(elementSum - digitSum)`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N * digits)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
