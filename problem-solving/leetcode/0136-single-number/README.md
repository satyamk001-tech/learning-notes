# LeetCode 136: Single Number

- **Platform:** LeetCode
- **Problem Number:** 136
- **Difficulty:** Easy
- **Core Pattern:** Bit Manipulation / XOR

---

## 📖 Problem Description
Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

---

## 💡 Algorithmic Intuition & Approach
Leverage XOR properties: $a \oplus a = 0$ and $a \oplus 0 = a$. XORing all elements together cancels out all duplicate pairs, leaving the unique element.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
