# LeetCode 37: Sudoku Solver

- **Platform:** LeetCode
- **Problem Number:** 37
- **Difficulty:** Hard
- **Core Pattern:** Backtracking / Grid Search

---

## 📖 Problem Description
Write a program to solve a Sudoku puzzle by filling the empty cells with digits 1-9.

---

## 💡 Algorithmic Intuition & Approach
Scan the grid for empty cells (`0`). For each empty cell, try placing digits `1` to `9`. Check validity across the row, column, and 3x3 box. Recurse. If recursion returns true, puzzle is solved; otherwise backtrack.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(9^(empty cells))$
- **Space Complexity:** $O(1) auxiliary (recursion stack depth <= 81)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
