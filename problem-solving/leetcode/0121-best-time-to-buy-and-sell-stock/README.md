# LeetCode 121: Best Time to Buy and Sell Stock

- **Platform:** LeetCode
- **Problem Number:** 121
- **Difficulty:** Easy
- **Core Pattern:** Dynamic Programming / Greedy

---

## 📖 Problem Description
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

---

## 💡 Algorithmic Intuition & Approach
Track the lowest buying price seen so far (`buyPrice`). For each day, calculate current profit `price - buyPrice`. Update `maxProfit` if higher. Update `buyPrice` if a lower price is found.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
