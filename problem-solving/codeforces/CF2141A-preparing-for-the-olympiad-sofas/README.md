# Codeforces 2141A: Preparing for the Olympiad / Sofas

- **Platform:** Codeforces
- **Problem ID:** 2141A
- **Difficulty / Division:** Div 2 / Div 3
- **Tags:** Greedy / Array Scan

---

## 📖 Problem Summary
Analyze sofa prices to determine which sofa choices can never be the first affordable option.

---

## 💡 Intuition & Approach
Track the running minimum price seen so far (`minPrice`). If an incoming sofa has a price greater than `minPrice`, it can never be the first affordable sofa. Collect 1-based indices.

---

## 💻 Java Solution
See `2141A.java` in this directory.
