# LeetCode 1572: Matrix Diagonal Sum

- **Platform:** LeetCode
- **Problem Number:** 1572
- **Difficulty:** Easy
- **Core Pattern:** Matrix Traversal

---

## 📖 Problem Description
Given a square matrix `mat`, return the sum of the matrix diagonals.

---

## 💡 Algorithmic Intuition & Approach
Single loop `i` from 0 to `n-1`. Add primary diagonal `mat[i][i]`. If secondary diagonal index `n - 1 - i != i`, add secondary diagonal `mat[i][n - 1 - i]` to avoid double counting the center element.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
