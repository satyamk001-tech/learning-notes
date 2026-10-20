# Algorithmic Complexity Analysis

Understanding the efficiency of algorithms is fundamental to computer science and technical interviews. Complexity analysis allows us to predict execution time and memory consumption as the input size $n$ scales towards infinity.

---

## 1. Asymptotic Notations

- **Big-O ($\mathcal{O}$): Upper Bound**
  Represents the worst-case time or space complexity. Formally:
  $$f(n) \le c \cdot g(n) \quad 	ext{for all } n \ge n_0$$
- **Big-Omega ($\Omega$): Lower Bound**
  Represents the best-case execution performance. Formally:
  $$f(n) \ge c \cdot g(n) \quad 	ext{for all } n \ge n_0$$
- **Big-Theta ($\Theta$): Tight Bound**
  Characterizes algorithms whose best and worst cases grow at the exact same rate. Formally:
  $$c_1 \cdot g(n) \le f(n) \le c_2 \cdot g(n) \quad 	ext{for all } n \ge n_0$$

---

## 2. Common Complexity Orders (From Fastest to Slowest)

| Notation | Name | Typical Example | Behavior for $n = 10^6$ |
| :--- | :--- | :--- | :--- |
| $\mathcal{O}(1)$ | Constant | Array index access, hash map lookup (average) | Instantaneous |
| $\mathcal{O}(\log n)$ | Logarithmic | Binary search, fast exponentiation | $pprox 20$ operations |
| $\mathcal{O}(n)$ | Linear | Single pass loop, linear search | $10^6$ operations ($pprox 10$ ms) |
| $\mathcal{O}(n \log n)$ | Linearithmic | Merge Sort, Quick Sort (average), Heap Sort | $pprox 2 	imes 10^7$ operations |
| $\mathcal{O}(n^2)$ | Quadratic | Nested loops, Bubble/Selection/Insertion Sort | $10^{12}$ operations (TLe / Seconds) |
| $\mathcal{O}(n^3)$ | Cubic | 3Sum brute-force, Matrix multiplication | Intractable for $n > 1000$ |
| $\mathcal{O}(2^n)$ | Exponential | Subsets / Power set, recursive Fibonacci | Feasible only for $n \le 20-25$ |
| $\mathcal{O}(n!)$ | Factorial | Traveling Salesman brute-force, Permutations | Feasible only for $n \le 12$ |

---

## 3. The Master Theorem

The Master Theorem provides a cookbook solution for recurrence relations of the form:
$$T(n) = aT\left(rac{n}{b}ight) + f(n)$$
Where:
- $a \ge 1$ is the number of subproblems.
- $b > 1$ is the factor by which subproblem size decreases.
- $f(n) = \Theta(n^k \log^p n)$ is the cost of dividing and combining.

Let $c = \log_b a$:

### Case 1: Work dominated by leaves ($c > k$)
$$T(n) = \Theta\left(n^{\log_b a}ight)$$
*Example:* Strassen's Matrix Multiplication ($a=7, b=2, k=2 \implies \log_2 7 pprox 2.81 > 2 \implies \Theta(n^{2.81})$).

### Case 2: Work evenly distributed ($c = k$)
- If $p > -1$: $T(n) = \Theta\left(n^c \log^{p+1} night)$
*Example:* Merge Sort ($a=2, b=2, f(n)=\Theta(n) \implies c = \log_2 2 = 1 = k, p=0 \implies \Theta(n \log n)$).
*Example:* Binary Search ($a=1, b=2, f(n)=\Theta(1) \implies c = \log_2 1 = 0 = k, p=0 \implies \Theta(\log n)$).

### Case 3: Work dominated by root ($c < k$)
If regularity condition $a \cdot f(n/b) \le d \cdot f(n)$ holds for some $d < 1$:
$$T(n) = \Theta(f(n))$$

---

## 4. Space Complexity: Auxiliary vs Total

- **Total Space:** Input memory + Auxiliary memory.
- **Auxiliary Space:** Extra temporary memory used during execution (excluding the original input).
- **Call-Stack Space:** In recursion, each function invocation pushes a stack frame taking $\mathcal{O}(	ext{max depth})$ auxiliary space.
