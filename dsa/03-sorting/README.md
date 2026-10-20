# 03 - Sorting Algorithms

Sorting arranges elements in a specified order (ascending or descending). This module covers elementary comparison sorts, non-comparison counting sort, and efficient divide-and-conquer algorithms.

---

## 📂 Implementations

- `sortbubble.java`: Standard Bubble Sort repeatedly swapping adjacent out-of-order elements ($\mathcal{O}(N^2)$).
- `sortbubbleoptimized.java`: Optimized Bubble Sort using a `swapped` boolean flag to achieve $\mathcal{O}(N)$ best-case for pre-sorted arrays.
- `sortselection.java`: Selection Sort repeatedly finding the minimum element from the unsorted segment and placing it at the front ($\mathcal{O}(N^2)$ comparisons, $\mathcal{O}(N)$ swaps).
- `sortinsertion.java`: Insertion Sort building the sorted array one element at a time by shifting larger elements right ($\mathcal{O}(N^2)$ worst, $\mathcal{O}(N)$ best).
- `sortinginbuilt.java`: Java's `Arrays.sort()` (Dual-Pivot Quicksort for primitives, TimSort for objects) and reverse sorting with `Collections.reverseOrder()`.
- `sortcounting.java`: Non-comparison Counting Sort in $\mathcal{O}(N + K)$ time for bounded integer ranges $[0, K]$.
- `sortmerge.java`: **Merge Sort** using Divide and Conquer with stable $\mathcal{O}(N \log N)$ runtime.
- `sortquick.java`: **Quick Sort** using pivot partitioning (Lomuto partition scheme) in $\mathcal{O}(N \log N)$ average time.

---

## ⚡ Sorting Algorithms Comparison Matrix

| Algorithm | Best Time | Average Time | Worst Time | Space Complexity | Stable? | In-Place? |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: |
| **Bubble Sort** | $\mathcal{O}(N)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(1)$ | Yes | Yes |
| **Selection Sort** | $\mathcal{O}(N^2)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(1)$ | No | Yes |
| **Insertion Sort** | $\mathcal{O}(N)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(1)$ | Yes | Yes |
| **Counting Sort** | $\mathcal{O}(N + K)$ | $\mathcal{O}(N + K)$ | $\mathcal{O}(N + K)$ | $\mathcal{O}(K)$ | Yes | No |
| **Merge Sort** | $\mathcal{O}(N \log N)$ | $\mathcal{O}(N \log N)$ | $\mathcal{O}(N \log N)$ | $\mathcal{O}(N)$ | Yes | No |
| **Quick Sort** | $\mathcal{O}(N \log N)$ | $\mathcal{O}(N \log N)$ | $\mathcal{O}(N^2)$ | $\mathcal{O}(\log N)$ | No | Yes |
