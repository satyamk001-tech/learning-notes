# High-Frequency Coding Patterns

## 1. Two Pointers Pattern
- **When to use:** Sorted arrays, searching for pairs, in-place array transformations, palindromes.
- **Template:**
```java
int left = 0;
int right = arr.length - 1;
while (left < right) {
    int currentSum = arr[left] + arr[right];
    if (currentSum == target) {
        // match found
        left++;
        right--;
    } else if (currentSum < target) {
        left++;
    } else {
        right--;
    }
}
```

---

## 2. Sliding Window Pattern
- **When to use:** Continuous subsegment problems (longest substring, minimum subarray length, maximum sum of size $K$).
- **Template:**
```java
int left = 0;
for (int right = 0; right < n; right++) {
    // 1. Expand window: add arr[right] to window state
    
    // 2. Shrink window: while condition violated
    while (windowConditionViolated()) {
        // remove arr[left] from window state
        left++;
    }
    
    // 3. Update optimal answer
    maxLen = Math.max(maxLen, right - left + 1);
}
```

---

## 3. Backtracking Template
- **When to use:** Permutations, combinations, subsets, constraint-satisfaction (Sudoku, N-Queens).
- **Template:**
```java
public void backtrack(State state, List<Result> results) {
    if (isGoal(state)) {
        results.add(new Result(state));
        return;
    }
    for (Choice choice : getChoices(state)) {
        if (isValid(choice, state)) {
            applyChoice(choice, state);      // Take step
            backtrack(state, results);       // Recurse
            undoChoice(choice, state);       // Backtrack step
        }
    }
}
```
