# Java Language Foundations

This directory documents the core language fundamentals, Object-Oriented Programming (OOP) concepts, Collections Framework, and Algorithmic Complexity Analysis in Java.

---

## 🗂️ Subdirectories & Topics

### 1. [Fundamentals](fundamentals/)
Covers standard Java language syntax and control flow:
- **[Basics](fundamentals/basics/):** Variables, primitive data types, typecasting, scanner input, basic arithmetic operations (`HelloWorld.java`, `datatypes.java`, `typecasting.java`, `scanner.java`, `arithmetic.java`, `product.java`, `areaofcircle.java`, `rectangle.java`).
- **[Conditionals](fundamentals/conditionals/):** `if-else`, `else-if` ladders, ternary operators, `switch` statements, calculator implementation (`ifelse.java`, `elseif.java`, `largernum.java`, `oddeven.java`, `switchyy.java`, `clculator.java`).
- **[Loops](fundamentals/loops/):** `for`, `while`, and `do-while` loops, number reversal, natural number sum, loop termination (`forloop.java`, `wl.java`, `dowhile.java`, `reverseofnumber.java`, `nnaturanumber.java`).
- **[Pattern Printing](fundamentals/patterns/):** 15 classic patterns establishing nested loop logic: Star pyramids, inverted stars, Floyd's triangle, 0-1 triangle, Butterfly pattern, Solid and Hollow Rhombus, Diamond patterns (`printstar.java`, `floydstriangle.java`, `zeroonetriangle.java`, `butterflypattern.java`, `diamond.java`, etc.).
- **[Functions & Methods](fundamentals/functions-methods/):** Call-by-value semantics, parameter passing, method overloading, factorial calculation, binomial coefficient, prime tests and sieve ranges, binary-to-decimal and decimal-to-binary conversions (`parameter.java`, `swap.java`, `factorial.java`, `binomialcoefficient.java`, `primeornot.java`, `primesinrange.java`, `binarytodecimal.java`, `decimaltobinary.java`).

### 2. [Object-Oriented Programming (OOP)](oop/)
Covers the core pillars of Java OOP:
- **Classes & Objects:** Instance variables, methods, `this` keyword (`OOPS.java`).
- **Constructors:** Default, parameterized, and copy constructors with shallow vs deep copying principles (`OOPSconstructor.java`, `OOPStypesofcons.java`, `OOPScopycons.java`).
- **Inheritance & Polymorphism:** Method overloading by parameter count and datatype (`overloadingdatatypes.java`).
- **Abstraction:** Abstract classes, abstract methods, and interface contracts (`OOPSabstract.java`).
- **Static Keyword:** Static variables, static methods, class vs instance memory allocation (`questionstatic.java`).

### 3. [Collections Framework (ArrayList)](collections-framework/)
Dynamic sizing and linear list operations in Java:
- `arraylist.java`: Sizing, underlying dynamic array growth factor, `add()`, `get()`, `set()`, `remove()`, and `contains()`.
- `arraylistsize.java`: Iterating through dynamic lists using size.
- `arraylistmax.java`: Finding maximum element in $\mathcal{O}(N)$ time.
- `arraylistswap.java`: Swapping elements by index.
- `arraylistsort.java`: Ascending and descending sorting via `Collections.sort()` and `Collections.reverseOrder()`.
- `arraylistmultidimen.java`: 2D `ArrayList<ArrayList<Integer>>` for dynamic jagged arrays and tables.

### 4. [Complexity Analysis](complexity-analysis/)
Theoretical foundations for measuring computational efficiency:
- Asymptotic notation: Big-O ($\mathcal{O}$), Big-Omega ($\Omega$), Big-Theta ($\Theta$).
- Space vs Time complexity trade-offs.
- The Master Theorem for divide-and-conquer recurrences: $T(n) = aT(n/b) + f(n)$.
- Amortized time complexity (e.g., dynamic array doubling).
