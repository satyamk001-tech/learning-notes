# LeetCode 657: Robot Return to Origin

- **Platform:** LeetCode
- **Problem Number:** 657
- **Difficulty:** Easy
- **Core Pattern:** Simulation / Coordinate System

---

## 📖 Problem Description
There is a robot starting at position `(0, 0)`. Given a string `moves`, determine if the robot returns to `(0, 0)` after completing all moves.

---

## 💡 Algorithmic Intuition & Approach
Maintain coordinates `(x, y)`. Update coordinates based on moves: 'U' (`y++`), 'D' (`y--`), 'R' (`x++`), 'L' (`x--`). Return `x == 0 && y == 0`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
