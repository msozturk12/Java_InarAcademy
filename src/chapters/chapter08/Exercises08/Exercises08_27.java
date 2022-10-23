package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

public class Exercises08_27 {
    public static void main(String[] args) {

        final int ROW = 3;
        final int COL = 3;
        double [][] arr = Exercises08_26.getMatrixFromUser(ROW,COL);

        System.out.println("Original Array is:");
        TwoDimensionalArrays.printArray(arr);

        System.out.println("\nThe Column-sorted array is:");
        sortColumn(arr);
        TwoDimensionalArrays.printArray(arr);

    }

    public static void sortColumn(double[][] arr) {
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length-1; row++) {
                for (int k = row+1; k < arr[col].length; k++) {

                    if(arr[row][col]>arr[k][col]){

                        double temp = arr[row][col];
                        arr[row][col]=arr[k][col];
                        arr[k][col] = temp;


                    }

                }

            }

        }

    }
}
