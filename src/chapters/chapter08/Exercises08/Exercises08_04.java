package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_04 {
    public static void main(String[] args) {


        int[][] workingHours = {{2, 4, 3, 4, 5, 8, 8},
                                {7, 3, 4, 3, 3, 4, 4},
                                {3, 3, 4, 3, 3, 2, 2},
                                {9, 3, 4, 7, 3, 4, 1},
                                {3, 5, 4, 3, 6, 3, 8},
                                {3, 4, 4, 6, 3, 4, 4},
                                {3, 7, 4, 8, 3, 8, 4},
                                {6, 3, 5, 9, 2, 7, 9}};


        int[] sumHoursOfEmployee = new int[workingHours.length];
        sumOfWeeklyHours(workingHours, sumHoursOfEmployee);

        System.out.println("Employees and their total hours(in decreasing order of the total hours): ");
        displayEmployeeIncreasingWorkingHour(sumHoursOfEmployee);

    }

    public static void displayEmployeeIncreasingWorkingHour(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            System.out.printf("Workers %d's work hour is %d\n",maxIndex,max);
            arr[maxIndex]=Integer.MIN_VALUE;
        }
    }
    public static void sumOfWeeklyHours(int[][] list, int[] sumHoursOfEmployee) {
        for (int i = 0; i < list.length; i++) {
            int sum = 0;
            for (int j = 0; j < list[i].length; j++) {
                sum += list[i][j];

            }
            sumHoursOfEmployee[i] = sum;
        }

    }


}
