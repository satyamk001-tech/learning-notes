# High-Yield Technical Revision Notes

## 1. Top Java Gotchas
- **`==` vs `.equals()`:** `==` compares memory addresses (object references); `.equals()` checks logical equivalence of data contents.
- **String Immutability:** String literals live in the String Constant Pool. Reassigning a string creates a new instance. Always use `StringBuilder` inside loops.
- **Integer Caching:** Java caches `Integer` objects between `-128` and `127`. `Integer a = 127; Integer b = 127; (a == b) -> true`, but for `128`, `(a == b) -> false`.
- **Pass-By-Value:** Java is strictly pass-by-value. Passing an object passes the *value of the reference*, enabling modification of object contents but not reassigning the caller's reference.

---

## 2. Must-Remember Edge Cases
- **Array Index Bounds:** Off-by-one errors in `<` vs `<=`.
- **Empty & Single-Element Inputs:** Always verify behavior for `length == 0` and `length == 1`.
- **Integer Overflow in Binary Search:** Never write `(low + high) / 2`. Write `low + (high - low) / 2`.
- **Negative Numbers in Kadane's:** If all numbers are negative, ensure you return the single greatest negative element instead of `0`.
- **Duplicate Elements:** In Two Pointers (like 3Sum) and Backtracking (Subsets II), skip duplicate adjacent elements (`if (i > start && nums[i] == nums[i-1]) continue;`).
