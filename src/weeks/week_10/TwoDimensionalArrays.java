package weeks.week_10;

import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {


        int[][] array = getRowAndColonLengthFromUsers();
        fill2DArrayWithRandomValue(array, 0, 101);
        printArray(array);
        // int[][] arr = new int[2][5];
        //   printArray(arr);
      /*
        System.out.println("-----------------");
        System.out.println("arr.length --> " + arr.length);
        System.out.println("arr[0].length --> " + arr[0].length);
        System.out.println("arr[1].length --> " + arr[1].length);
       */
    }

    public static int[][] getRowAndColonLengthFromUsers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row number");
        int row = input.nextInt();
        System.out.println("Enter colon number");
        int colon = input.nextInt();
        int[][] arr = new int[row][colon];
        return arr;
    }

    public static void fill2DArrayWithRandomValue(int[][] array, int start, int limit) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int random = (int) (start + Math.random() * (limit - start));
                array[i][j] = random;
            }

        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("[% 3d] ", array[i][j]);

            }
            System.out.println();
        }
    }
}
