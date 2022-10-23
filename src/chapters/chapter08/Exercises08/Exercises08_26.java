package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

import java.util.Scanner;

public class Exercises08_26 {
    public static void main(String[] args) {
        /*
                (Row sorting) Implement the following method to sort the rows in a twodimensional
        array. A new array is returned and the original array is intact.
        public static double[][] sortRows(double[][] m)
        Write a test program that prompts the user to enter a 3 * 3 matrix of double
        values and displays a new row-sorted matrix. Here is a sample run:
        ex.     0,15 0,875 0,375
                0,55 0,005 0,225
                0,30 0,12 0,4
         */

        final int ROW = 3;
        final int COL = 3;
        double[][] arr = getMatrixFromUser(ROW, COL);

        System.out.println("Original array is:");
        TwoDimensionalArrays.printArray(arr);

        System.out.println("The row-sorted array is ");
        sortRows(arr);
        TwoDimensionalArrays.printArray(arr);

    }



    public static void sortRows(double[][] matrix) {
        //Selection Sort
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {

                    if (matrix[i][j] > matrix[i][k]) {
                        double temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }

            }
        }

    }


    public static double[][] getMatrixFromUser(int ROW, int COL) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a " + ROW + "-by-" + COL + " matrix row by row");
        double[][] matrix = new double[ROW][COL];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();

            }
        }
        return matrix;
    }
}
