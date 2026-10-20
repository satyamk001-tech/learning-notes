# 07 - Linked Lists

A Linked List is a linear data structure where elements (nodes) are stored non-contiguously in memory, linked together via pointers or references.

---

## 📂 Implementations

- `Node.java`: Standard singly linked list node definition with `int data` and `Node next`.
- `LinkedList.java`:
  - Static `Node head` and `Node tail` references.
  - Node instantiation and reference linking.
  - Iterative traversal through the list until `current == null` in $\mathcal{O}(N)$ time.

---

## ⚡ Complexity Comparison: Arrays vs Linked Lists

| Operation | Array / ArrayList | Singly Linked List |
| :--- | :---: | :---: |
| Index Access (`get(i)`) | $\mathcal{O}(1)$ | $\mathcal{O}(N)$ |
| Insert at Head (`addFirst`) | $\mathcal{O}(N)$ (shift elements) | $\mathcal{O}(1)$ |
| Insert at Tail (`addLast` with tail pointer) | $\mathcal{O}(1)$ amortized | $\mathcal{O}(1)$ |
| Delete at Head (`removeFirst`) | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ |
| Delete at Tail (`removeLast`) | $\mathcal{O}(1)$ | $\mathcal{O}(N)$ (find second-to-last node) |
| Search by Value | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ |
