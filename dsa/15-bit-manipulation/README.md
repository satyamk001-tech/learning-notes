# 15 - Bit Manipulation

Bit manipulation performs operations directly on binary bits of integer data types. Because bitwise operations are executed directly by CPU ALUs in single instruction cycles, they offer unmatched execution speed and compact state representation.

---

## 📂 Implementations

- `binaryand.java`: Bitwise AND (`&`) — result bit is $1$ only if both bits are $1$.
- `binaryor.java`: Bitwise OR (`|`) — result bit is $1$ if either bit is $1$.
- `binaryxor.java`: Bitwise XOR (`^`) — result bit is $1$ if bits are distinct ($0 \oplus 0 = 0, 1 \oplus 1 = 0, 0 \oplus 1 = 1$). Key identity: $a \oplus a = 0$ and $a \oplus 0 = a$.
- `binaryonescomplement.java`: Bitwise NOT (`~`) — flips all bits ($\sim x = -(x + 1)$ in 2's complement).
- `binaryleftshift.java`: Left Shift (`a << b`) — shifts bits left by $b$, equivalent to $a 	imes 2^b$.
- `binaryrightshift.java`: Right Shift (`a >> b`) — shifts bits right by $b$, equivalent to $\lfloor a / 2^b floor$.
- `bitwiseoddoreven.java`: Fast parity check using `(n & 1) == 0` for even and `(n & 1) != 0` for odd.
- `bitithget.java`: Get $i$-th bit: `(n & (1 << i)) == 0 ? 0 : 1`.
- `bitithset.java`: Set $i$-th bit to 1: `n | (1 << i)`.
- `bitithclear.java`: Clear $i$-th bit to 0: `n & ~(1 << i)`.
- `bitithupdate.java`: Update $i$-th bit to 0 or 1.
- `bitithclearlast.java`: Clear last $i$ bits: `n & (~0 << i)`.
- `bitithclearrange.java`: Clear bits in range $[i, j]$ using bitmask `(a | b)`.
- `bitpoweroftwo.java`: Check if $n$ is power of 2 using `(n & (n - 1)) == 0`.
- `bitcountset.java`: Count number of set bits (Hamming weight) using `(n & 1)` shift and Brian Kernighan's trick.
- `bitfastexpo.java`: **Modular Fast Exponentiation:** Compute $a^n$ in $\mathcal{O}(\log n)$ time by inspecting bits of exponent $n$.
- `singlenumber.java`: Find the non-repeating element where every other element appears twice using XOR reduction in $\mathcal{O}(N)$ time and $\mathcal{O}(1)$ space.
