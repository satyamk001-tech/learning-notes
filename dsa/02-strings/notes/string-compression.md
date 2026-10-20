# String Compression Algorithm

## 1. Problem Overview
Given a string of characters (e.g., `"aaabbcccdd"`), compress it such that each run of consecutively repeating characters is replaced by the character followed by the frequency count (e.g., `"a3b2c3d2"`). If a character appears only once, the count is omitted.

---

## 2. Intuition & Approach
1. Iterate through the string from left to right using index `i`.
2. For each new character, count how many times it repeats consecutively:
   - Initialize `count = 1`.
   - While `i + 1 < length` and `str.charAt(i) == str.charAt(i + 1)`, increment `count` and advance `i`.
3. Append `str.charAt(i)` to the result.
4. If `count > 1`, append `count` to the result.
5. Use `StringBuilder` to achieve $\mathcal{O}(N)$ runtime rather than repeated String concatenations.

---

## 3. Java Implementation
```java
public static String compress(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if (count > 1) {
            sb.append(count);
        }
    }
    return sb.toString();
}
```

---

## 4. Complexity
- **Time Complexity:** $\mathcal{O}(N)$ — even with nested loops, the outer index `i` only moves forward, visiting each character once.
- **Space Complexity:** $\mathcal{O}(N)$ to store the compressed output string in the worst case (e.g., `"abcd"` $\to$ `"abcd"`).
