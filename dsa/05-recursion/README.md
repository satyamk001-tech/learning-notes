# 05 - Recursion

Recursion is a programming technique where a method calls itself to solve smaller instances of the same problem until a base condition is reached.

---

## 📂 Implementations

- `recurprintdec.java`: Print numbers from $N$ down to $1$ (post-recursive work).
- `recurprintinc.java`: Print numbers from $1$ up to $N$ (pre-recursive work on return).
- `recurfactorial.java`: Compute $N! = N 	imes (N-1)!$ with base case $0! = 1$.
- `recurnaturalsum.java`: Compute $\sum_{i=1}^N i = N + 	ext{sum}(N-1)$.
- `recurfibonacci.java`: Compute $N$th Fibonacci number $F(n) = F(n-1) + F(n-2)$ ($\mathcal{O}(2^N)$ call tree).
- `recursort.java`: Check if an array is strictly sorted in ascending order ($\mathcal{O}(N)$).
- `recurfirstoccur.java`: Find the first index of an element in an array ($\mathcal{O}(N)$ forward scan).
- `recurlastoccur.java`: Find the last index of an element in an array ($\mathcal{O}(N)$ backward check).
- `recurxtopowern.java`: Compute $x^n$ iteratively/linearly in $\mathcal{O}(N)$ time.
- `recurxtopowernoptimized.java`: **Optimized Fast Power** using Divide and Conquer:
  $$x^n = egin{cases} (x^{n/2})^2 & 	ext{if } n 	ext{ is even} \ x \cdot (x^{n/2})^2 & 	ext{if } n 	ext{ is odd} \end{cases}$$
  Reduces time from $\mathcal{O}(N)$ to **$\mathcal{O}(\log N)$**.
- `recurtiling.java`: **$2 	imes N$ Tiling Problem:** Number of ways to tile a $2 	imes N$ board using $2 	imes 1$ dominoes:
  $$	ext{ways}(n) = 	ext{ways}(n-1) + 	ext{ways}(n-2)$$
- `recurremoveduplicates.java`: Remove consecutive/duplicate characters from a string using boolean lookup map.
- `recurfriendspairing.java`: **Friends Pairing Problem:** Number of ways $n$ friends can remain single or pair up:
  $$f(n) = f(n-1) + (n-1) 	imes f(n-2)$$
- `recurbinarystring.java`: Generate all binary strings of length $N$ without consecutive $1$s.
- `recruques1.java`: Find and print all indices of a given key in an array recursively.
- `recurques2.java`: Exercise stub for number-to-words recursive translation.
