# 14 - Dynamic Programming (Reference)

> **Note:** This section documents core theoretical concepts, algorithmic paradigms, and canonical problems studied in class (0/1 Knapsack, Matrix Chain Multiplication, Travelling Salesman Problem).

---

## 1. What is Dynamic Programming?
Dynamic Programming (DP) is an algorithmic optimization technique that solves complex problems by breaking them down into simpler subproblems. It applies when a problem exhibits:
1. **Optimal Substructure:** An optimal solution to the overall problem contains optimal solutions to its subproblems.
2. **Overlapping Subproblems:** The same subproblems are solved repeatedly rather than generating new ones (unlike Divide and Conquer).

---

## 2. Approaches: Memoization vs Tabulation

| Dimension | Top-Down with Memoization | Bottom-Up Tabulation |
| :--- | :--- | :--- |
| **Direction** | Starts from original problem $N$ down to base cases | Starts from base cases $0, 1$ up to $N$ |
| **Mechanism** | Recursion + Caching (Array / HashMap) | Iterative table filling |
| **Call Stack** | Overhead of recursive call frames | No recursion; zero stack overhead |
| **Subproblem Evaluation** | Only computes subproblems that are actually needed | Computes all subproblems in the table |

---

## 3. Canonical Classical Problems Studied

### A. 0/1 Knapsack Problem
- **Problem:** Given $N$ items with weights $wt[i]$ and values $val[i]$, maximize total value in a knapsack of capacity $W$. Each item can either be taken once ($1$) or left ($0$).
- **Recurrence:**
  $$\text{dp}[i][w] = \max\left(\text{dp}[i-1][w], \ val[i-1] + \text{dp}[i-1][w - wt[i-1]]\right)$$
- **Complexity:** Time $\mathcal{O}(N 	imes W)$, Space $\mathcal{O}(N 	imes W)$ (optimizable to $\mathcal{O}(W)$ 1D array).

### B. Matrix Chain Multiplication (MCM)
- **Problem:** Given a sequence of matrices, find the most efficient way to multiply them (minimizing scalar multiplications). Matrix multiplication is associative, so parenthesization matters.
- **Recurrence:**
  $$\text{cost}(i, j) = \min_{i \le k < j} \left[ \text{cost}(i, k) + \text{cost}(k+1, j) + d_{i-1} d_k d_j \right]$$
- **Complexity:** Time $\mathcal{O}(N^3)$, Space $\mathcal{O}(N^2)$.

### C. Travelling Salesman Problem (TSP)
- **Problem:** Given $N$ cities and distances between every pair, find the shortest possible route that visits every city exactly once and returns to the origin.
- **Brute Force:** $\mathcal{O}(N!)$ permutations.
- **Held-Karp DP with Bitmasking:**
  - Subproblem state: $\text{cost}(\text{mask}, u)$ where `mask` represents the subset of visited cities and $u$ is the current city.
  - Complexity: Time $\mathcal{O}(N^2 \cdot 2^N)$, Space $\mathcal{O}(N \cdot 2^N)$.
