package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

public class Exercises08_18 {
    public static void main(String[] args) {
        /*
        shuffle the matrix
         */

        int[][] arr = TwoDimensionalArrays.getRowAndColonLengthFromUsers();
        TwoDimensionalArrays.fillArray(arr);
        Exercises08_16.printArr(arr);
        System.out.println("\nAfter row shuffle");
        shuffle(arr);
        Exercises08_16.printArr(arr);
    }

    private static void shuffle(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {

            int r = (int) (Math.random() * arr.length);

            int temp = arr[row][0];
            arr[row][0] = arr[r][0];
            arr[r][0] = temp;

        }
    }
}

