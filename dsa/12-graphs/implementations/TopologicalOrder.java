import java.util.*;

public class TopologicalOrder {
    public static void main(String[] args) {
        int nodes = 8;
        int[][] graphMatrix = {
            {0,0,0,1,0,0,0,0},
            {0,0,0,1,0,0,0,0},
            {0,0,0,1,0,0,0,0},
            {0,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0}
        };

        System.out.print("   ");
        for (int i = 0; i < nodes; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < nodes; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < nodes; j++) {
                System.out.print(graphMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
