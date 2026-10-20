# 2D Matrices: Memory Layout, Spiral Traversal, and Search

## 1. 2D Array Memory Representation
In Java, a 2D array `int[][] matrix = new int[M][N];` is an **array of array references**.
- `matrix.length` returns the number of rows $M$.
- `matrix[i].length` returns the number of columns $N$ in row $i$.
- While row elements are contiguous in their individual 1D arrays, different rows may not be contiguous with each other in heap memory.

---

## 2. Spiral Matrix Traversal
To traverse an $M \times N$ matrix in clockwise spiral order:
1. Define four boundaries:
   - `topRow = 0`
   - `bottomRow = matrix.length - 1`
   - `startCol = 0`
   - `endCol = matrix[0].length - 1`
2. While `topRow <= bottomRow` and `startCol <= endCol`:
   - Traverse right along `topRow` from `startCol` to `endCol`.
   - Traverse down along `endCol` from `topRow + 1` to `bottomRow`.
   - If `topRow < bottomRow`: Traverse left along `bottomRow` from `endCol - 1` down to `startCol`.
   - If `startCol < endCol`: Traverse up along `startCol` from `bottomRow - 1` down to `topRow + 1`.
   - Shrink boundaries: `topRow++`, `bottomRow--`, `startCol++`, `endCol--`.
3. **Time Complexity:** $\mathcal{O}(M \times N)$ — each element visited exactly once.
4. **Space Complexity:** $\mathcal{O}(1)$ auxiliary space.

---

## 3. Staircase Search in Sorted Matrix
Given an $M \times N$ matrix where rows and columns are strictly sorted:
- Start at the **top-right corner** $(0, N - 1)$.
- If `matrix[row][col] == key`: Target found.
- If `matrix[row][col] > key`: Move left (`col--`), eliminating the entire current column.
- If `matrix[row][col] < key`: Move down (`row++`), eliminating the entire current row.
- **Time Complexity:** $\mathcal{O}(M + N)$ — at most $M$ downward steps and $N$ leftward steps.
