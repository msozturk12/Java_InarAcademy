package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_05 {
    public static void main(String[] args) {


        double[][] matrix1 = getMatrix(3, 3, 1);
        double[][] matrix2 = getMatrix(3, 3, 2);


        double[][] sumOfTwoMatrix = addMatrix(matrix1, matrix2);
        displaySumOfTwoMatrix(matrix1, matrix2, sumOfTwoMatrix);


    }

    public static double[][] getMatrix(int row, int col, int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix" + n + " :");
        double[][] m = new double[row][col];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();

            }

        }
        return m;
    }

    public static void displaySumOfTwoMatrix(double[][] matrix1, double[][] matrix2, double[][] sumOfTwoMatrix) {
        System.out.println("The matrices are added as follows ");
        for (int i = 0; i < matrix1.length; i++) {
            printRow(matrix1, i);
            if (i == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }

            printRow(matrix2, i);
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            printRow(sumOfTwoMatrix, i);
            System.out.println();
        }
    }



    public static void printRow(double[][] matrix, int row) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row][i] + " ");
        }
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sumTwoMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < sumTwoMatrix.length; i++) {
            for (int j = 0; j < sumTwoMatrix[i].length; j++) {
                sumTwoMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }

        }
        return sumTwoMatrix;
    }


}
