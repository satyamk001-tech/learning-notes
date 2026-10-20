# 12 - Graphs

A graph $G = (V, E)$ consists of a set of vertices (nodes) and edges connecting pairs of vertices. Graphs model complex networks such as social connections, route navigation, and dependencies.

---

## 📂 Implementations

- `AdjacentMatrix.java`: Java implementation of graph representation via Adjacency List (`List<List<Integer>>`) for $V = 6$ nodes.
- `adjacentmatrix.cpp`: Original C++ implementation constructing both undirected Adjacency List and matrix display.
- `TopologicalOrder.java`: Java implementation representing a Directed Acyclic Graph (DAG) with 8 nodes as an adjacency matrix.
- `topologicalorder.cpp`: Original C++ graph matrix definition for topological ordering analysis.

---

## 📊 Graph Representations Comparison

| Feature | Adjacency Matrix (`matrix[V][V]`) | Adjacency List (`List<List<Integer>>`) |
| :--- | :---: | :---: |
| **Space Complexity** | $\mathcal{O}(V^2)$ | $\mathcal{O}(V + E)$ |
| **Add Edge** | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ |
| **Check if Edge $(u, v)$ Exists** | $\mathcal{O}(1)$ | $\mathcal{O}(\text{degree}(u))$ |
| **Find All Neighbors of Node $u$** | $\mathcal{O}(V)$ | $\mathcal{O}(\text{degree}(u))$ |
| **Suitability** | Dense graphs ($E \approx V^2$) | Sparse graphs ($E \ll V^2$, most practical graphs) |
