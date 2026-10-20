# LeetCode 443: String Compression

- **Platform:** LeetCode
- **Problem Number:** 443
- **Difficulty:** Medium
- **Core Pattern:** Two Pointers / String Manipulation

---

## 📖 Problem Description
Given an array of characters `chars`, compress it using the character followed by the count if count > 1.

---

## 💡 Algorithmic Intuition & Approach
Count consecutive identical characters. Append the character, and if count > 1, append the count digits. Advance pointer.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1) auxiliary$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
