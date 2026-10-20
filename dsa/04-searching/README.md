# 04 - Searching Algorithms

Searching locates the position of a target element within a data structure.

---

## 📂 Implementations

- `linearsearch.java`: Sequentially scans every element from index $0$ to $N-1$.
  - Best Case: $\mathcal{O}(1)$ (element at index 0).
  - Worst Case: $\mathcal{O}(N)$ (element at the end or absent).
  - Space: $\mathcal{O}(1)$.
- `binarysearch.java`: Iteratively halves the search space on a **sorted** array.
  - Recurrence: $T(N) = T(N/2) + \mathcal{O}(1)$.
  - Time Complexity: $\mathcal{O}(\log N)$.
  - Space Complexity: $\mathcal{O}(1)$ iterative.
  - Overflow-safe midpoint: `int mid = si + (ei - si) / 2`.
- `searchinsortedmatrix.java`: Staircase search on a 2D matrix where rows and columns are sorted.
  - Starts at top-right corner $(0, m-1)$.
  - If target is smaller, move left (`col--`).
  - If target is larger, move down (`row++`).
  - Time Complexity: $\mathcal{O}(N + M)$.
