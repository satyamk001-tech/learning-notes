# LeetCode 240: Search a 2D Matrix II

- **Platform:** LeetCode
- **Problem Number:** 240
- **Difficulty:** Medium
- **Core Pattern:** Staircase Search / Matrix

---

## 📖 Problem Description
Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix where rows and columns are sorted in ascending order.

---

## 💡 Algorithmic Intuition & Approach
Start search at the top-right corner `(0, n - 1)`. If `matrix[row][col] == target`, return true. If `matrix[row][col] > target`, move left (`col--`). If `matrix[row][col] < target`, move down (`row++`).

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(M + N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
