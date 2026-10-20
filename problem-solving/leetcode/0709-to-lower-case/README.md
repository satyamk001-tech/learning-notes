# LeetCode 709: To Lower Case

- **Platform:** LeetCode
- **Problem Number:** 709
- **Difficulty:** Easy
- **Core Pattern:** String / ASCII

---

## 📖 Problem Description
Given a string `s`, return the string after replacing every uppercase letter with the same lowercase letter.

---

## 💡 Algorithmic Intuition & Approach
Iterate through characters. If character is in range `['A', 'Z']`, convert to lowercase by adding 32 (`(char)(ch + 32)`). Append to result.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(N) for result string$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
