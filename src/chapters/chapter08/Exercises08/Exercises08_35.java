package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_35 {
    public static void main(String[] args) {

        int[][] matrix = getMatrixFromUsers();
        int[] largestBlock = findLargestBlock(matrix);

        System.out.printf("The maximum square submatrix is at (%d,%d) with size %d", largestBlock[0], largestBlock[1], largestBlock[2]);

    }

    public static int[][] getMatrixFromUsers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix:");
        int numberOfMatrix = input.nextInt();

        int[][] matrix = new int[numberOfMatrix][numberOfMatrix];

        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[] findLargestBlock(int[][] matrix) {
        int[] largestBlock = new int[3];
        //int row = largestBlock[0];
        //int col = largestBlock[1];
        //int size = largestBlock[2];
        int maxSize = 2;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                while (isSquareMatrix(matrix, maxSize, row, col)) {
                    largestBlock[0] = row;
                    largestBlock[1] = col;
                    largestBlock[2] = maxSize;
                    maxSize++;
                }

            }

        }
        return largestBlock;
    }

    private static boolean isSquareMatrix(int[][] matrix, int max, int row, int col) {

        if (row + max > matrix.length) {
            return false;

        }
        if (col + max > matrix[row].length) {
            return false;
        }
        for (int i = row; i < row + max; i++) {
            for (int j = col; j < col + max; j++) {
                if (matrix[i][j] != 1) {
                    return false;
                }
            }

        }
        return true;
    }
}