package chapters.chapter08.Exercises08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises08_23 {
    public static void main(String[] args) {
        /*
        -create 6*6 matrix with 0 1
        -flipCell
        -display flipped cell
         */

        int[][] matrix = getMatrix();
        displayMatrix(matrix);
        System.out.println("---Flipped Matrix");
        flipCell(matrix);
        int[] flippedCell = findFlippedCell(matrix);
        System.out.println("The flipped cell is at " + Arrays.toString(flippedCell));
    }
    public static int[][] getMatrix() {
        int[][] matrix = {{0, 0, 1, 1, 0, 0},
                          {1, 1, 1, 1, 0, 0},
                          {1, 0, 1, 1, 1, 0},
                          {1, 1, 1, 1, 0, 0},
                          {0, 1, 0, 0, 0, 1},
                          {1, 1, 0, 0, 1, 1}};
        return matrix;
    }

    public static void flipCell(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your row and col index to change");
        int row = input.nextInt();
        int col = input.nextInt();
        matrix[row][col] = matrix[row][col] == 0 ? 1 : 0;
        displayMatrix(matrix);

    }

    public static int[] findFlippedCell(int[][] matrix) {
        int[] flippedCellIndex = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            int counter = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                flippedCellIndex[0] = row;
            }
        }

        for (int col = 0; col < matrix[0].length; col++) {
            int counter = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                flippedCellIndex[1] = col;
            }
        }

        return flippedCellIndex;
    }


    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));

        }
    }



}
