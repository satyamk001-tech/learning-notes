# 06 - Backtracking

Backtracking is a systematic method for exploring all possible configuration states of a solution space. It builds candidates incrementally and abandons a candidate ("backtracks") as soon as it determines the candidate cannot lead to a valid solution.

---

## 📂 Implementations

- `backtrackingarrays.java`: Demonstrates the core backtracking mechanism: populate array during downward calls, modify/undo values upon call stack return.
- `backtrackingsubset.java`: Generate all $2^N$ subsets (Power Set) of a string:
  - Branch 1: Include current character.
  - Branch 2: Exclude current character.
  - Time Complexity: $\mathcal{O}(2^N)$, Space: $\mathcal{O}(N)$.
- `backtrackingpermutation.java`: Generate all $N!$ permutations of a string:
  - Time Complexity: $\mathcal{O}(N 	imes N!)$.
- `backtrackingnqueenbasic.java`: **The $N$-Queens Problem:**
  - Place $N$ queens on an $N 	imes N$ chessboard such that no two queens attack each other.
  - Safe checks: vertical column above, upper-left diagonal, upper-right diagonal.
  - Backtracking step: unplace queen (`board[row][col] = 'x'`).
  - Time Complexity: $\mathcal{O}(N!)$.
- `backtrackinggridways.java`: Count unique paths from top-left $(0, 0)$ to bottom-right $(N-1, M-1)$ moving only right and down:
  - Recursive: $\mathcal{O}(2^{N+M})$.
  - Mathematical formula: $rac{(N-1 + M-1)!}{(N-1)! 	imes (M-1)!}$ in $\mathcal{O}(N + M)$.
- `backtrackingsudoku.java`: **$9 	imes 9$ Sudoku Solver:**
  - Validates row, column, and $3 	imes 3$ sub-grid constraints.
  - Tries digits $1 \dots 9$ and recurses; resets to $0$ upon failure.
