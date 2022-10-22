package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

import java.util.Scanner;

public class Exercises08_13 {
    public static void main(String[] args) {
        double[][] arr = getRowAndColNumber();
        TwoDimensionalArrays.fillArray(arr);
        int [] maxElement = locateMaxElement(arr);
        System.out.printf("The location of the largest element is at (%d, %d)",maxElement[0],maxElement[1]);


    }

    public static double[][] getRowAndColNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array:");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] arr = new double[row][col];
        return arr;
    }

    public static int[] locateMaxElement(double[][] arr) {

        int[] maxElement = new int[2];
        double max = Integer.MIN_VALUE;
        maxElement[0] = -1;
        maxElement[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxElement[0] = i;
                    maxElement[1] = j;

                }
            }
        }
        return maxElement;
    }

}
