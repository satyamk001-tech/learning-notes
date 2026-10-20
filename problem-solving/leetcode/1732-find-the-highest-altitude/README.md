# LeetCode 1732: Find the Highest Altitude

- **Platform:** LeetCode
- **Problem Number:** 1732
- **Difficulty:** Easy
- **Core Pattern:** Prefix Sum

---

## 📖 Problem Description
There is a biker who goes on a road trip starting at altitude 0. Given an array `gain`, return the highest altitude of a point.

---

## 💡 Algorithmic Intuition & Approach
Maintain `currentAltitude = 0` and `maxAltitude = 0`. For each net gain, add to `currentAltitude` and update `maxAltitude = Math.max(maxAltitude, currentAltitude)`.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
