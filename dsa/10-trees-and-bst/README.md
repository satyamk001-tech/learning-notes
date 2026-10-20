# 10 - Trees and Binary Search Trees (Reference)

> **Note:** This section documents theoretical foundations, structural invariants, and traversal patterns studied during my DSA curriculum, paving the way for upcoming complete implementations.

---

## 1. Binary Tree Fundamentals
A tree is a hierarchical non-linear data structure:
- **Root:** Topmost node without a parent.
- **Leaf:** Node with no children.
- **Height of Tree:** Maximum number of edges on the path from root to a leaf.
- **Depth of Node:** Distance from the root node.

---

## 2. Binary Search Tree (BST) Invariant
For every node $X$ in a BST:
1. Every node in the left subtree has a value **strictly less than** $X$.
2. Every node in the right subtree has a value **strictly greater than** $X$.
3. **Inorder Traversal** (Left $	o$ Root $	o$ Right) of a BST always yields elements in **strictly sorted ascending order**.

---

## 3. Tree Traversals

### Depth-First Search (DFS)
- **Preorder (Root $	o$ Left $	o$ Right):** Useful for cloning trees and prefix serialization.
- **Inorder (Left $	o$ Root $	o$ Right):** Produces sorted output in BSTs.
- **Postorder (Left $	o$ Right $	o$ Root):** Bottom-up evaluation (e.g., deleting a tree, computing subtree height/size).

### Breadth-First Search (BFS / Level Order)
- Uses a `Queue<TreeNode>` to visit nodes level by level.
- Time Complexity: $\mathcal{O}(N)$, Space Complexity: $\mathcal{O}(W)$ where $W$ is the maximum width of the tree.
