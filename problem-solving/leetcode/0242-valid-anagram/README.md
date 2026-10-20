# LeetCode 242: Valid Anagram

- **Platform:** LeetCode
- **Problem Number:** 242
- **Difficulty:** Easy
- **Core Pattern:** Hash Table / Frequency Array

---

## 📖 Problem Description
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

---

## 💡 Algorithmic Intuition & Approach
If lengths differ, return false. Count character frequencies of `s` in an integer array of size 26. Decrement frequencies using `t`. If all frequencies are 0, strings are anagrams.

---

## ⚡ Complexity Analysis
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1) (26 English lowercase letters)$

---

## 💻 Java Solution
See [`Solution.java`](Solution.java) in this directory for the full compilable implementation.
