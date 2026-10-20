# LeetCode 54: Spiral Matrix

- **Platform:** LeetCode
- **Problem Number:** 54
- **Difficulty:** Medium
- **Core Pattern:** Matrix Simulation / Boundary Traversal

---

## 📖 Problem Description
Given an `m x n` matrix, return all elements of the matrix in spiral order.

---

## 💡 Algorithmic Intuition & Approach
Maintain 4 boundary pointers: `topRow`, `bottomRow`, `startCol`, `endCol`. Traverse right along topRow, down along endCol, left along bottomRow, and up along startCol. Shrink boundaries until they cross.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(M * N)$
- **Space Complexity:** $O(1) auxiliary$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
