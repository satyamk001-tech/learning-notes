# 01 - Arrays and Multi-Dimensional Matrices

Arrays are contiguous memory blocks storing elements of homogeneous type. They provide $\mathcal{O}(1)$ random access by index, making them foundational to data structures and system memory layout.

---

## 📂 Directory Structure

- **[basics/](basics/):**
  - `arraycreation.java`: Static array instantiation, length property, scanner input.
  - `arrayupdate.java`: Pass-by-reference array modification.
  - `largestinarray.java`: Single-pass $\mathcal{O}(N)$ scan for min/max.
  - `reverseanarray.java`: In-place two-pointer reversal in $\mathcal{O}(N)$ time and $\mathcal{O}(1)$ auxiliary space.
  - `pairsinarray.java`: Generating all unique pairs in $\mathcal{O}(N^2)$ time ($n(n-1)/2$ total pairs).
- **[subarrays/](subarrays/):**
  - `subarray.java`: Brute-force generation of all continuous subarrays ($n(n+1)/2$ subarrays).
  - `subarraymax.java`: Maximum subarray sum via brute-force $\mathcal{O}(N^3)$.
  - `subarraymaxprefix.java`: Maximum subarray sum via prefix sum array in $\mathcal{O}(N^2)$ time and $\mathcal{O}(N)$ space.
  - `subarraymaxkadane.java`: **Kadane's Algorithm** achieving optimal $\mathcal{O}(N)$ time and $\mathcal{O}(1)$ space.
  - `maximumsubarray.java`: Kadane's algorithm handling negative arrays.
  - `subarrayhw.java`: Homework exploration of subarray min/max sums.
- **[two-pointers/](two-pointers/):**
  - `trappingrainwater.java`: Classical Trapping Rain Water problem via left-max and right-max auxiliary arrays in $\mathcal{O}(N)$ time.
  - `buyandsellstocks.java`: Maximum single-transaction stock profit in $\mathcal{O}(N)$ single pass.
  - `containermostwaterbrute.java`: Finding maximal water container.
  - `ThreeSumBasic.java`: 3Sum triplets finding.
  - `comparearray.java`: Element-by-element array equality validation.
- **[2d-arrays/](2d-arrays/):**
  - `matrix.java`: 2D array representation, row-major traversal, search.
  - `spiralmatrix.java`: Clockwise boundary peeling traversal of $M \times N$ matrix.
  - `matrixdiagonalsum.java`: Primary and secondary diagonal summation in $\mathcal{O}(N)$ single-loop.
  - `searchinsortedmatrix.java`: Staircase search starting from top-right $(0, m-1)$ in $\mathcal{O}(N + M)$ time.
  - `transposeofmatrix.java`: Transposing an $M \times N$ matrix into $N \times M$.
  - `sumofsecondarray.java`: Row-specific summation.
  - `searchseven.java`: Occurrence counting in 2D grids.
- **[notes/](notes/):**
  - [kadane-algorithm.md](notes/kadane-algorithm.md): Detailed proof and edge cases of Kadane's Algorithm.
  - [trapping-rain-water.md](notes/trapping-rain-water.md): Step-by-step intuition and complexity derivation.
  - [2d-matrices.md](notes/2d-matrices.md): Memory layout, spiral algorithm, and staircase search.

---

## ⚡ Complexity Summary

| Algorithm / Problem | Best Time | Worst Time | Space Complexity | Paradigm |
| :--- | :---: | :---: | :---: | :--- |
| Array Index Access | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ | Direct Address |
| Array Reversal | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | Two Pointers |
| Max Subarray (Brute Force) | $\mathcal{O}(N^3)$ | $\mathcal{O}(N^3)$ | $\mathcal{O}(1)$ | Exhaustive Search |
| Max Subarray (Prefix Sum) | $\mathcal{O}(N^2)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(N)$ | Precomputation |
| Max Subarray (Kadane's) | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | Dynamic Programming |
| Trapping Rain Water | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | Auxiliary Arrays |
| Best Time to Buy/Sell Stock | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | Greedy / DP |
| Spiral Matrix Traversal | $\mathcal{O}(N 	imes M)$ | $\mathcal{O}(N 	imes M)$ | $\mathcal{O}(1)$ | Simulation |
| Matrix Diagonal Sum | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | Linear Indexing |
| Staircase Search in 2D Matrix | $\mathcal{O}(1)$ | $\mathcal{O}(N + M)$ | $\mathcal{O}(1)$ | Step-wise Elimination |
