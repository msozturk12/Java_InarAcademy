package chapters.chapter09.exercises09.Exercises09_13;

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        double[][] arr = getRowColFromUser();
        fillTheArrRandomValues(arr);
        displayArray(arr);

        Location location = locateLargest(arr);
        location.display();

    }

    public static double[][] getRowColFromUser() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] arr = new double[row][col];
        return arr;
    }

    public static void fillTheArrRandomValues(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (Math.random() * 50);

            }
        }
    }

    public static void displayArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" [%5.2f] ", arr[i][j]);

            }
            System.out.println();
        }

    }

    public static Location locateLargest(double[][] arr) {
        int row = -1;
        int col = -1;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxValue < arr[i][j]) {
                    maxValue = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        Location loc = new Location(row, col, maxValue);
        return loc;
    }


}
