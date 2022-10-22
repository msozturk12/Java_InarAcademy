package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_14 {
    public static void main(String[] args) {
        /*

         */
        int[][] matrix = getSquareMatrix();
        Exercises08_10.printMatrix(matrix);

        printSameRow(matrix);
        printSameCol(matrix);
        printSameMajorDiagonal(matrix);//left to r
        printSubDiagonal(matrix);  // right to l


    }

    public static int[][] getSquareMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);

            }
        }
        return matrix;
    }

    public static void printSameRow(int[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            boolean isSameRow = true;
            int number = matrix[row][0];
            for (int col = 0; col < matrix[0].length; col++) {
                if (number != matrix[row][col]) {
                    isSameRow = false;
                }

            }
            if (isSameRow) {
                System.out.println("All " + number + "'s on row " + row);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No same numbers on row");
        }
    }

    public static void printSameCol(int[][] matrix) {
        int count = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            boolean isSameCol = true;
            int number = matrix[0][col];
            for (int row = 0; row < matrix.length; row++) {
                if (number != matrix[row][col]) {
                    isSameCol = false;
                }

            }
            if (isSameCol) {
                System.out.println("All " + number + "'s on a column " + col);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on column");
        }

    }

    public static void printSameMajorDiagonal(int[][] matrix) {
        boolean isSameMajDio = true;
        int number = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            if (number != matrix[i][i]) {
                isSameMajDio = false;

            }
        }
        if (isSameMajDio) {
            System.out.println("All " + number + "'s on major diagonal");

        } else {
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void printSubDiagonal(int[][] matrix) {
        int number = matrix[0][matrix[0].length - 1];
        boolean isSameSubDia = true;
        for (int i = 1, j = matrix[i].length - (i + 1); i < matrix.length; i++, j--) {
            if (number != matrix[i][j]) {
                isSameSubDia = false;
            }
        }
        if (isSameSubDia) {
            System.out.println("All " + number + "'s on sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }

}
