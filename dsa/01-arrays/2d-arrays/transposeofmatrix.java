public class transposeofmatrix {

    public static int[][] transposeOfmatrix(int matrix[][]) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // transpose matrix will have reversed dimensions
        int transpose[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {

        int matrix[][] = { {11,12,13}, {21,22,23} };

        int result[][] = transposeOfmatrix(matrix);

        // printing transpose matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
