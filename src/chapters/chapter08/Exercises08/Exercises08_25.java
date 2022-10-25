package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_25 {
    public static void main(String[] args) {
        /*
                    (Markov matrix) An n * n matrix is called a positive Markov matrix if each
            element is positive and the sum of the elements in each column is 1. Write the
            following method to check whether a matrix is a Markov matrix.

            public static boolean isMarkovMatrix(double[][] m)
            Write a test program that prompts the user to enter a 3 * 3 matrix of double
            values and tests whether it is a Markov matrix. Here are sample runs:
         */
        double[][] matrix = getMatrix();
        System.out.println("It is" + (isMarkovMatrix(matrix) ? " a markov matrix" : " not a markov matrix"));

    }

    private static boolean isMarkovMatrix(double[][] matrix) {
        return isEachElementPositive(matrix) && isSumCol1(matrix);
    }

    private static boolean isSumCol1(double[][] matrix) {

        for (int col = 0; col < matrix[0].length; col++) {
            double sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEachElementPositive(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();

            }

        }
        return matrix;
    }
}
