# String vs StringBuilder Internals in Java

## 1. String Immutability
In Java, strings are immutable for:
1. **Security:** Network connections, database URLs, and file paths are passed as strings.
2. **Synchronization:** Thread safety is guaranteed without synchronization locks.
3. **String Pool Caching:** Reusing identical string literals saves heap memory.

```java
String s = "Hello";
s = s + " World"; // Creates a new String object in heap; "Hello" is orphaned.
```
In a loop of size $N$, `s += ch` takes $\mathcal{O}(N^2)$ time due to copying $1 + 2 + \dots + N$ characters!

---

## 2. StringBuilder: Mutable Alternative
`StringBuilder` manages an internal resizable `char[]` buffer:
- Default initial capacity: 16 characters.
- Growth strategy: `(oldCapacity * 2) + 2`.
- Appending $N$ characters takes **$\mathcal{O}(N)$ amortized time**.

```java
StringBuilder sb = new StringBuilder();
for (char ch = 'a'; ch <= 'z'; ch++) {
    sb.append(ch); // O(1) amortized append
}
System.out.println(sb.toString());
```
