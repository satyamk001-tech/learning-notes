import java.util.*;

public class AdjacentMatrix {
    public static void main(String[] args) {
        int nodes = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adj.add(new ArrayList<>());
        }

        // Example undirected graph edges
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 5}
        };

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        System.out.println("Graph Adjacency List:");
        for (int i = 0; i < nodes; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
