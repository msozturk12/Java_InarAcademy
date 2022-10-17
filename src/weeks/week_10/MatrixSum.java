package weeks.week_10;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the row number");
        int row = input.nextInt();
        System.out.println("Please enter the colon number");
        int colon = input.nextInt();
        int[][] arr1 = new int[row][colon];
        int[][] arr2 = new int[row][colon];

        TwoDimensionalArrays.fill2DArrayWithRandomValue(arr1, 0, 10);
        TwoDimensionalArrays.fill2DArrayWithRandomValue(arr2, 0, 10);

        int[][] result = new int[row][colon];
        sumTwoArray(arr1,arr2,result);
        TwoDimensionalArrays.printArray(arr1);
        System.out.println("+++++++++++++++++++++++++++++++++");
        TwoDimensionalArrays.printArray(arr2);
        System.out.println("------------------------------------");
        TwoDimensionalArrays.printArray(result);

    }

    public static void sumTwoArray(int[][] arr1, int[][] arr2, int[][] result) {

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];

            }

        }

    }
}
