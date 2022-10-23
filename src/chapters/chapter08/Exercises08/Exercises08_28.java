package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_28 {


    public static void main(String[] args) {
        final int ROW = 3;
        final int COL = 3;

        int[][] list1 = getArray(ROW, COL,1);
        int[][] list2 = getArray(ROW, COL,2);

        System.out.println("The two arrays are " + (equals(list1, list2) ? " strictly identical" : "are not strictly identical"));

    }

    public static boolean equals(int[][] list1, int[][] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                if (list1[i][j] != list2[i][j]) {
                    return false;
                }

            }

        }
        return true;
    }

    public static int[][] getArray(int ROW, int COL,int listNumber) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[ROW][COL];
        System.out.println("Enter your list" + listNumber);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();

            }
        }
        return arr;
    }
}