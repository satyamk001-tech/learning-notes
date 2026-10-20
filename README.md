# Java DSA Learning Notes

> A comprehensive, structured repository documenting five months of intensive Data Structures and Algorithms (DSA) study, problem-solving practice, and algorithm design using Java.

---

## 📌 Repository Purpose & Objectives

This repository serves as a personal knowledge base, technical revision hub, and interview preparation tracker. It chronicles my daily journey from learning core Java language syntax to implementing classic algorithms, solving complex LeetCode problems, and participating in competitive programming contests.

### Primary Objectives:
- **Foundational Mastery:** Develop a deep intuition for Java syntax, memory management, and Object-Oriented Programming (OOP).
- **Algorithmic Thinking:** Master core data structures (Arrays, Strings, Linked Lists, Trees, Graphs) and algorithmic paradigms (Recursion, Backtracking, Two Pointers, Greedy, Dynamic Programming).
- **Complexity Analysis:** Rigorously evaluate time and space trade-offs using asymptotic notation ($\mathcal{O}, \Omega, \Theta$) and the Master Theorem.
- **Interview Readiness:** Build a curated catalog of patterns (Sliding Window, Two Pointers, Prefix Sums, Matrix Manipulations, Recursion Call-Stacks) commonly tested by top tech companies.
- **Competitive Programming:** Tackle timed contest problems on platforms like Codeforces and LeetCode.

---

## 🗂️ Repository Architecture

The repository is organized into distinct, modular directories:

```text
learning-notes/
├── README.md                      # Repository root overview and navigation
├── .gitignore                     # Clean Java, VS Code, and OS ignores
│
├── java/                          # Java programming language foundations
│   ├── README.md                  # Java roadmap & topic index
│   ├── fundamentals/              # Basics, operators, conditionals, loops, patterns, functions
│   ├── oop/                       # Classes, constructors, inheritance, abstraction, polymorphism
│   ├── collections-framework/     # Dynamic ArrayLists, sorting, multi-dimensional collections
│   └── complexity-analysis/       # Big-O notation, asymptotic analysis, Master Theorem guide
│
├── dsa/                           # Core Data Structures & Algorithms modules
│   ├── README.md                  # Complete DSA curriculum & topic matrix
│   ├── 01-arrays/                 # Traversal, prefix sums, Kadane's, two-pointers, 2D matrices
│   ├── 02-strings/                # Palindromes, anagrams, compression, StringBuilder
│   ├── 03-sorting/                # Bubble, Selection, Insertion, Counting, Inbuilt, Merge, Quick Sort
│   ├── 04-searching/              # Linear search, Binary search, 2D matrix binary search
│   ├── 05-recursion/              # Call stacks, divide-and-conquer powers, classical problems
│   ├── 06-backtracking/           # Subsets, permutations, N-Queens, Grid Ways, Sudoku solver
│   ├── 07-linked-lists/           # Singly linked list nodes, head/tail linking, traversals
│   ├── 10-trees-and-bst/          # Trees, Binary Search Trees, traversal theory (Reference)
│   ├── 12-graphs/                 # Graph representations (Adjacency Matrix/List), Topological sort
│   ├── 14-dynamic-programming/    # 0/1 Knapsack, MCM, TSP, memoization vs tabulation (Reference)
│   └── 15-bit-manipulation/       # Bitwise ops, masks, ith bit updates, power of 2, fast exponentiation
│
├── problem-solving/               # Platform problem solutions with metadata & approaches
│   ├── README.md                  # Overview of solved problem catalog
│   ├── leetcode/                  # 27 curated LeetCode solutions with standalone explanations
│   ├── codeforces/                # Competitive programming contest solutions (CF 282A, 2141A, 2509A-C)
│   └── other-platforms/           # Homework assignments, daily practice sets, and exercises
│
├── interview-preparation/         # High-yield revision assets for technical interviews
│   ├── README.md                  # Interview prep strategy
│   ├── common-patterns/           # Two Pointers, Sliding Window, Prefix Sum, Backtracking templates
│   ├── complexity-cheatsheet.md   # Fast complexity lookups for all data structures & algorithms
│   └── revision-notes.md          # Key interview gotchas, edge cases, and high-frequency concepts
│
├── progress/                      # Progress logs and milestone tracking
│   ├── README.md                  # Progress tracking overview
│   └── learning-roadmap.md        # 5-month journey review, topics covered, active focus, future roadmap
│
└── resources/                     # Curated books, courses, documentation, and practice platforms
    └── README.md                  # External reference guide
```

---

## 📚 Topics Covered

| Category | Module | Status | Code Files | Key Concepts / Implementations |
| :--- | :--- | :---: | :---: | :--- |
| **Java** | [Fundamentals](java/fundamentals/) | ✅ Completed | 50 | Datatypes, typecasting, arithmetic, loops, conditionals, patterns, math |
| **Java** | [OOP](java/oop/) | ✅ Completed | 8 | Classes, objects, constructors, copy constructors, abstraction, method overloading |
| **Java** | [Collections](java/collections-framework/) | ✅ Completed | 6 | `ArrayList`, dynamic sizing, multi-dimensional lists, custom sorting, swaps |
| **Java** | [Complexity Analysis](java/complexity-analysis/) | ✅ Completed | Docs | Big-O, Big-$\Omega$, Big-$\Theta$, Master Theorem, recursion tree analysis |
| **DSA** | [01 - Arrays](dsa/01-arrays/) | ✅ Completed | 18 | Kadane's algorithm, Trapping Rain Water, Prefix sums, Spiral matrix, 2D search |
| **DSA** | [02 - Strings](dsa/02-strings/) | ✅ Completed | 13 | Palindrome checks, String compression, StringBuilder, Anagrams, Case conversion |
| **DSA** | [03 - Sorting](dsa/03-sorting/) | ✅ Completed | 8 | Bubble, Selection, Insertion, Counting, Inbuilt, Merge Sort, Quick Sort |
| **DSA** | [04 - Searching](dsa/04-searching/) | ✅ Completed | 3 | Linear search, Binary search, Staircase search in 2D sorted matrices |
| **DSA** | [05 - Recursion](dsa/05-recursion/) | ✅ Completed | 16 | Factorial, Fibonacci, First/Last occurrence, $x^n$ (optimized), Tiling, Pairing |
| **DSA** | [06 - Backtracking](dsa/06-backtracking/) | ✅ Completed | 6 | Array backtracking, Subsets, Permutations, N-Queens ($N 	imes N$), Sudoku Solver |
| **DSA** | [07 - Linked Lists](dsa/07-linked-lists/) | 🔄 Core Built | 2 | Node definition, head/tail pointers, linking, iterative traversal |
| **DSA** | [10 - Trees & BST](dsa/10-trees-and-bst/) | 📖 Theory/Notes | Docs | Binary Tree properties, BST search/insert theory, tree traversals |
| **DSA** | [12 - Graphs](dsa/12-graphs/) | 🔄 Core Built | 4 | Adjacency Matrix, Adjacency List, Topological ordering matrix (Java & C++) |
| **DSA** | [14 - Dynamic Programming](dsa/14-dynamic-programming/) | 📖 Theory/Notes | Docs | 0/1 Knapsack, Matrix Chain Multiplication (MCM), TSP, Memoization |
| **DSA** | [15 - Bit Manipulation](dsa/15-bit-manipulation/) | ✅ Completed | 17 | Bitwise operators, ith bit manipulation, count set bits, fast exponentiation |

*Legend: ✅ Completed & Implemented | 🔄 Core Implemented / In Active Progress | 📖 Theoretical Foundations Documented*

---

## 🎯 Problem-Solving Catalog

### LeetCode (27 Problems Documented & Tested)
- **LC 1:** [Two Sum](problem-solving/leetcode/0001-two-sum/) (Easy) — Array / Hash Table
- **LC 11:** [Container With Most Water](problem-solving/leetcode/0011-container-with-most-water/) (Medium) — Two Pointers
- **LC 15:** [3Sum](problem-solving/leetcode/0015-3sum/) (Medium) — Two Pointers / Sorting
- **LC 37:** [Sudoku Solver](problem-solving/leetcode/0037-sudoku-solver/) (Hard) — Backtracking
- **LC 42:** [Trapping Rain Water](problem-solving/leetcode/0042-trapping-rain-water/) (Hard) — Dynamic Programming / Two Pointers
- **LC 51:** [N-Queens](problem-solving/leetcode/0051-n-queens/) (Hard) — Backtracking
- **LC 53:** [Maximum Subarray](problem-solving/leetcode/0053-maximum-subarray/) (Medium) — Kadane's Algorithm
- **LC 54:** [Spiral Matrix](problem-solving/leetcode/0054-spiral-matrix/) (Medium) — Matrix Simulation
- **LC 66:** [Plus One](problem-solving/leetcode/0066-plus-one/) (Easy) — Array / Math
- **LC 75:** [Sort Colors](problem-solving/leetcode/0075-sort-colors/) (Medium) — Dutch National Flag / Counting
- **LC 121:** [Best Time to Buy and Sell Stock](problem-solving/leetcode/0121-best-time-to-buy-and-sell-stock/) (Easy) — Dynamic Programming / Greedy
- **LC 136:** [Single Number](problem-solving/leetcode/0136-single-number/) (Easy) — Bitwise XOR
- **LC 240:** [Search a 2D Matrix II](problem-solving/leetcode/0240-search-a-2d-matrix-ii/) (Medium) — Staircase Search
- **LC 242:** [Valid Anagram](problem-solving/leetcode/0242-valid-anagram/) (Easy) — Frequency Array
- **LC 283:** [Move Zeroes](problem-solving/leetcode/0283-move-zeroes/) (Easy) — Two Pointers
- **LC 443:** [String Compression](problem-solving/leetcode/0443-string-compression/) (Medium) — Two Pointers
- **LC 485:** [Max Consecutive Ones](problem-solving/leetcode/0485-max-consecutive-ones/) (Easy) — Array Traversal
- **LC 657:** [Robot Return to Origin](problem-solving/leetcode/0657-robot-return-to-origin/) (Easy) — Coordinate Simulation
- **LC 709:** [To Lower Case](problem-solving/leetcode/0709-to-lower-case/) (Easy) — ASCII / String Manipulation
- **LC 867:** [Transpose Matrix](problem-solving/leetcode/0867-transpose-matrix/) (Easy) — 2D Matrix
- **LC 1200:** [Minimum Absolute Difference](problem-solving/leetcode/1200-minimum-absolute-difference/) (Easy) — Sorting / Linear Scan
- **LC 1299:** [Replace Elements with Greatest on Right](problem-solving/leetcode/1299-replace-elements-with-greatest-element-on-right-side/) (Easy) — Reverse Traversal
- **LC 1572:** [Matrix Diagonal Sum](problem-solving/leetcode/1572-matrix-diagonal-sum/) (Easy) — Matrix Traversal
- **LC 1732:** [Find the Highest Altitude](problem-solving/leetcode/1732-find-the-highest-altitude/) (Easy) — Prefix Sum
- **LC 1920:** [Build Array from Permutation](problem-solving/leetcode/1920-build-array-from-permutation/) (Easy) — Array Simulation
- **LC 1929:** [Concatenation of Array](problem-solving/leetcode/1929-concatenation-of-array/) (Easy) — Array Construction
- **LC 2535:** [Difference Between Element Sum and Digit Sum](problem-solving/leetcode/2535-difference-between-element-sum-and-digit-sum-of-an-array/) (Easy) — Math / Array

### Codeforces Competitive Programming
- **CF 282A:** [Bit++](problem-solving/codeforces/CF282A-bit-plus-plus/) (800) — String & Simulation
- **CF 2141A:** [Preparing for the Olympiad / Sofas](problem-solving/codeforces/CF2141A-preparing-for-the-olympiad-sofas/) — Greedy / Array Scan
- **CF 2509A:** [Operations on Strings](problem-solving/codeforces/CF2509A-operations-on-strings/) — String Palindrome Matching
- **CF 2509B:** [Frequency Reorder](problem-solving/codeforces/CF2509B-frequency-reorder/) — Frequency Array & Bucket Scan
- **CF 2509C:** [Divisor Sums](problem-solving/codeforces/CF2509C-divisor-sums/) — Number Theory & Divisor Scan

---

## 🛠️ Language & Development Tools

- **Language:** Java (JDK 21 / 25)
- **Version Control:** Git & GitHub
- **IDE / Editors:** Visual Studio Code, IntelliJ IDEA
- **Build & Execution:** OpenJDK Compiler (`javac`), Java Virtual Machine (`java`)

---

## 🚀 How to Use & Run Implementations

### Prerequisites
Ensure Java is installed and available in your system path:
```bash
javac -version
java -version
```

### Compiling and Running Any Implementation
Each Java file in this repository is designed to be self-contained and independently executable:

```bash
# Example 1: Run Kadane's Algorithm for Maximum Subarray
cd dsa/01-arrays/subarrays
javac subarraymaxkadane.java
java subarraymaxkadane

# Example 2: Run Sudoku Solver
cd dsa/06-backtracking/implementations
javac backtrackingsudoku.java
java backtrackingsudoku

# Example 3: Run a LeetCode Solution
cd problem-solving/leetcode/0042-trapping-rain-water
javac Solution.java
java Solution
```

---

## ⚠️ Personal Learning Disclaimer

This repository documents my authentic learning journey over the past five months. As a student continually refining my software engineering craft, some early solutions highlight brute-force approaches before progressing to optimal $O(N)$ or $O(N \log N)$ implementations. Notes and code will continue to evolve as I deepen my knowledge of advanced algorithms and system design.
