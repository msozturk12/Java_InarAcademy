package chapters.chapter08.Exercises08;

import weeks.week_10.TwoDimensionalArrays;

import java.util.Scanner;

public class Exercises08_19 {
    public static void main(String[] args) {

        /*
        0 1 0 3 1 6 1
        0 1 6 8 6 0 1
        5 6 2 1 8 2 9
        6 5 6 1 1 9 1
        1 3 6 1 4 0 7
        3 3 3 3 4 0 7

        1 2 3 4
        2 5 4 5
        2 4 5 6
        1 2 3 4
         */

        int[][] values = TwoDimensionalArrays.getRowAndColonLengthFromUsers();
        fillTheArr(values);
        printMatrix(values);
        System.out.println("The array has " + (isConsecutiveFour(values) ? "" : "not ") + "consecutive four ");

    }

    public static void printMatrix(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void fillTheArr(int[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();

            }
        }
    }


    public static boolean isConsecutiveFour(int[][] values) {
        return isSameRow(values) || isSameCol(values) || isConsecutiveFourInDiagonals(values);
    }

    public static boolean isSameRow(int[][] values) {


        for (int i = 0; i < values.length; i++) {
            int counter = 1;
            for (int j = 0; j < values[i].length - 1; j++) {
                if (values[i][j] == values[i][j + 1]) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (counter == 4) {
                    System.out.println("ROW!!");
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isSameCol(int[][] values) {

        for (int col = 0; col < values[0].length; col++) {
            int counter = 1;
            for (int row = 0; row < values.length - 1; row++) {
                if (values[row][col] == values[row + 1][col]) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (counter == 4) {
                    System.out.println("COL!!");
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isConsecutiveFourInDiagonals(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (isRightDiagonal(values, i, j)) {
                    return true;
                }
                if (isLeftDiagonal(values, i, j)) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isRightDiagonal(int[][] values, int row, int col) {
        if (row >= values.length - 3) {
            return false;
        }
        if (col >= values[0].length - 3) {
            return false;
        }
        int number = values[row][col];
        int count = 1;
        for (int i = 1; i < 4; i++) {
            if (number == values[row + i][col + i]) {  // 0,0 1,1 2,2....ou 0,1 1,2 2,3 3,4...
                count++;
            }
        }

        if (count == 4) {
            System.out.println("RIGHT DIAGONAL!!");
            return true;
        } else {
            return false;
        }
    }


    public static boolean isLeftDiagonal(int[][] values, int row, int col) {
        if (row > values.length - 3) {
            return false;
        }
        if (col < 3) {
            return false;
        }
        int num = values[row][col];

        for (int i = 1; i < 4; i++) {
            if (num != values[row + i][col - i]) {
                return false;
            }
        }
        return true;
    }


}
