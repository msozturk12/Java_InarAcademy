package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

import java.util.Scanner;

public class Exercises08_01 {

    public static void main(String[] args) {

        final int ROW = 3;
        final int COL = 4;
        System.out.println("Enter a " + ROW +"-by-"+ COL + " matrix row by row:");
        double[][] arr = new double[ROW][COL];
        fillTheArray(arr);
        TwoDimensionalArrays.printArray(arr);
        printSumOfCol(arr);
    }

    public static void printSumOfCol(double[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(arr, col));

        }
    }

    public static double sumColumn(double[][] arr, int col) {
        double sumCol = 0;
        for (int row = 0; row < arr.length; row++) {
            sumCol += arr[row][col];

        }
        return sumCol;
    }

    public static void fillTheArray(double[][] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextDouble();


            }

        }
    }
}
