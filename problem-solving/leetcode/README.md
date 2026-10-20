# LeetCode Problem Solutions

This directory contains 27 curated LeetCode solutions implemented in Java, organized by problem number and name. Each problem directory contains a standalone `Solution.java` and a comprehensive `README.md` explaining the problem, approach, and complexity.

---

## 📊 Problem Catalog

| # | Problem | Difficulty | Category / Pattern | Time Complexity | Space Complexity |
| :---: | :--- | :---: | :--- | :---: | :---: |
| 1 | [Two Sum](0001-two-sum/) | Easy | Array / Two Pointers / Hash Table | `$O(N^2) (Brute Force) / O(N) (Hash Map)$` | `$O(1) / O(N)$` |
| 11 | [Container With Most Water](0011-container-with-most-water/) | Medium | Two Pointers / Greedy | `$O(N^2) (Brute Force) / O(N) (Two Pointers)$` | `$O(1)$` |
| 15 | [3Sum](0015-3sum/) | Medium | Two Pointers / Sorting | `$O(N^3) (Brute Force) / O(N^2) (Sorted Two Pointers)$` | `$O(1) / O(N)$` |
| 37 | [Sudoku Solver](0037-sudoku-solver/) | Hard | Backtracking / Grid Search | `$O(9^(empty cells))$` | `$O(1) auxiliary (recursion stack depth <= 81)$` |
| 42 | [Trapping Rain Water](0042-trapping-rain-water/) | Hard | Dynamic Programming / Two Pointers | `$O(N)$` | `$O(N) (Auxiliary Arrays) / O(1) (Two Pointers)$` |
| 51 | [N-Queens](0051-n-queens/) | Hard | Backtracking | `$O(N!)$` | `$O(N^2) board$` |
| 53 | [Maximum Subarray](0053-maximum-subarray/) | Medium | Kadane's Algorithm / Dynamic Programming | `$O(N)$` | `$O(1)$` |
| 54 | [Spiral Matrix](0054-spiral-matrix/) | Medium | Matrix Simulation / Boundary Traversal | `$O(M * N)$` | `$O(1) auxiliary$` |
| 66 | [Plus One](0066-plus-one/) | Easy | Array / Math | `$O(N)$` | `$O(1) auxiliary (O(N) if all 9s)$` |
| 75 | [Sort Colors](0075-sort-colors/) | Medium | Two Pointers / Dutch National Flag / Counting | `$O(N)$` | `$O(1)$` |
| 121 | [Best Time to Buy and Sell Stock](0121-best-time-to-buy-and-sell-stock/) | Easy | Dynamic Programming / Greedy | `$O(N)$` | `$O(1)$` |
| 136 | [Single Number](0136-single-number/) | Easy | Bit Manipulation / XOR | `$O(N)$` | `$O(1)$` |
| 240 | [Search a 2D Matrix II](0240-search-a-2d-matrix-ii/) | Medium | Staircase Search / Matrix | `$O(M + N)$` | `$O(1)$` |
| 242 | [Valid Anagram](0242-valid-anagram/) | Easy | Hash Table / Frequency Array | `$O(N)$` | `$O(1) (26 English lowercase letters)$` |
| 283 | [Move Zeroes](0283-move-zeroes/) | Easy | Two Pointers | `$O(N)$` | `$O(1)$` |
| 443 | [String Compression](0443-string-compression/) | Medium | Two Pointers / String Manipulation | `$O(N)$` | `$O(1) auxiliary$` |
| 485 | [Max Consecutive Ones](0485-max-consecutive-ones/) | Easy | Array Traversal | `$O(N)$` | `$O(1)$` |
| 657 | [Robot Return to Origin](0657-robot-return-to-origin/) | Easy | Simulation / Coordinate System | `$O(N)$` | `$O(1)$` |
| 709 | [To Lower Case](0709-to-lower-case/) | Easy | String / ASCII | `$O(N)$` | `$O(N) for result string$` |
| 867 | [Transpose Matrix](0867-transpose-matrix/) | Easy | Matrix / 2D Array | `$O(M * N)$` | `$O(M * N) for transposed matrix$` |
| 1200 | [Minimum Absolute Difference](1200-minimum-absolute-difference/) | Easy | Array / Sorting | `$O(N log N)$` | `$O(1) auxiliary$` |
| 1299 | [Replace Elements with Greatest Element on Right Side](1299-replace-elements-with-greatest-element-on-right-side/) | Easy | Array / Reverse Traversal | `$O(N)$` | `$O(1) auxiliary$` |
| 1572 | [Matrix Diagonal Sum](1572-matrix-diagonal-sum/) | Easy | Matrix Traversal | `$O(N)$` | `$O(1)$` |
| 1732 | [Find the Highest Altitude](1732-find-the-highest-altitude/) | Easy | Prefix Sum | `$O(N)$` | `$O(1)$` |
| 1920 | [Build Array from Permutation](1920-build-array-from-permutation/) | Easy | Array Simulation | `$O(N)$` | `$O(N)$` |
| 1929 | [Concatenation of Array](1929-concatenation-of-array/) | Easy | Array Construction | `$O(N)$` | `$O(N)$` |
| 2535 | [Difference Between Element Sum and Digit Sum of an Array](2535-difference-between-element-sum-and-digit-sum-of-an-array/) | Easy | Math / Array | `$O(N * digits)$` | `$O(1)$` |
