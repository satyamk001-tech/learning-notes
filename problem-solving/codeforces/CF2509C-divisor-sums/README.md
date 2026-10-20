# Codeforces 2509C: Divisor Sums

- **Platform:** Codeforces
- **Problem ID:** 2509C
- **Difficulty / Division:** Div 2 / Div 3
- **Tags:** Number Theory / Divisors / Frequency Array

---

## 📖 Problem Summary
Given an array `a` and integer `x`, compute maximum weighted sum over all divisors of `x`.

---

## 💡 Intuition & Approach
Factor `x` by testing divisors $i$ up to $\sqrt{x}$. For each divisor $d$, compute weighted sum using either direct array scan or frequency stride jumping.

---

## 💻 Java Solution
See `2509C.java` in this directory.
