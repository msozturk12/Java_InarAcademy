package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

public class Exercises08_10 {
    public static void main(String[] args) {

        int[][] matrix = fillTheMatrixWith0And1();
        printMatrix(matrix);
        int largestRowIndex = getLargestRowIndex(matrix);
        int largestColIndex = getLargestColIndex(matrix);
        System.out.println("The largest row index : " + largestRowIndex);
        System.out.println("The largest column index : " + largestColIndex);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }
    }

    public static int[][] fillTheMatrixWith0And1() {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);

            }
        }
        return arr;
    }

    public static int getLargestRowIndex(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < matrix.length; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumOfRow += matrix[i][j];

            }
            if (sumOfRow > max) {
                max = sumOfRow;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int getLargestColIndex(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int col = 0; col < matrix[0].length; col++) {
            int sumCol = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumCol += matrix[row][col];

            }
            if (sumCol > max) {
                max = sumCol;
                maxIndex = col;
            }
        }
        return maxIndex;
    }


}
