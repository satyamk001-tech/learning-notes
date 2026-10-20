# 02 - Strings and Text Processing

In Java, `String` objects are **immutable** and stored in the **String Constant Pool (SCP)** inside the heap. Modifying a `String` creates a new object in memory, necessitating `StringBuilder` for high-frequency modifications.

---

## 📂 Implementations

- `stringname.java`: String declaration, concatenation, character indexing with `charAt()`, string length.
- `substring.java`: Custom manual substring extraction vs built-in `str.substring(si, ei)`.
- `stringispalindrome.java`: Two-pointer palindrome validation in $\mathcal{O}(N)$ time.
- `shortestdistance.java`: Computing displacement on a 2D Cartesian grid from directional route strings ('N', 'S', 'E', 'W') via Euclidean distance $\sqrt{x^2 + y^2}$.
- `stringfunctioncompare.java`: Value equality (`equals()`) vs reference equality (`==`) and `compareTo()` lexicographical comparison.
- `stringlargest.java`: Finding lexicographically largest string among an array using `compareTo()`.
- `stringbuilder.java`: Efficient $\mathcal{O}(N)$ string construction using mutable `StringBuilder`.
- `stringuppercase.java`: Title-casing every word in a sentence using `Character.toUpperCase()`.
- `stringcompression.java`: Compressing repeating characters (e.g., `"aaabbccc"` $\to$ `"a3b2c3"`).
- `stringcompressionoptimized.java`: Memory-optimized string compression using `StringBuilder`.
- `validanagram.java`: Anagram verification using character frequency array in $\mathcal{O}(N)$ time.
- `tolowercase.java`: In-place lowercase conversion using ASCII offsets (`char + 32`).
- `uppertolower.java`: Bitwise character casing via bitwise OR with space character (`ch | ' '`).

---

## 📝 Notes & Guides
- [string-compression.md](notes/string-compression.md): Compression algorithm walkthrough and complexity.
- [stringbuilder-vs-string.md](notes/stringbuilder-vs-string.md): Memory internals: String Pool vs Heap vs StringBuilder buffer.
