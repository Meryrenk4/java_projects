/*
    This project prints transpose of a matrix.
 */

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4},
                          {5, 6, 4}};

        // Define a variable for transpose of the matrix
        int[][] transpose = new int[matrix[0].length][matrix.length];

        // Print the matrix
        System.out.println("The matrix");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Get the transpose of the matrix
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                transpose[col][row] = matrix[row][col];
            }
        }

        // Print the transpose of the matrix
        System.out.println("The transpose of the matrix");
        for (int[] row : transpose) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
