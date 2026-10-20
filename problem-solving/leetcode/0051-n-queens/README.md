# LeetCode 51: N-Queens

- **Platform:** LeetCode
- **Problem Number:** 51
- **Difficulty:** Hard
- **Core Pattern:** Backtracking

---

## 📖 Problem Description
The n-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

---

## 💡 Algorithmic Intuition & Approach
Place queens row by row. At row `r`, try placing a queen in column `c` if safe (no queen vertically above, diagonally left-up, or diagonally right-up). Recurse to `r+1`. Backtrack by removing queen.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N!)$
- **Space Complexity:** $O(N^2) board$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
