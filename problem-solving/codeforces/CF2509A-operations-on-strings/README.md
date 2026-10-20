# Codeforces 2509A: Operations on Strings

- **Platform:** Codeforces
- **Problem ID:** 2509A
- **Difficulty / Division:** Div 2 / Div 3
- **Tags:** Strings / Palindromes

---

## 📖 Problem Summary
Determine the minimum operations to make symmetric character pairs match a target character or each other.

---

## 💡 Intuition & Approach
Compare symmetric pairs `s[i]` and `s[n - 1 - i]`. If they match, cost is 0. If either matches target character `c`, cost is 1. If neither matches, cost is 2.

---

## 💻 Java Solution
See `2509A.java` in this directory.
