package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_19 {
    public static void main(String[] args) {
        /*
        eger girilen list sorted in increasing order --isSorted
        --the first number in the input -->indicate length(bu numara list in bir parçası olmayacak)
        ex. 5 2 3 4 5 6 true
        ex. 6 30 2 5 62 2 369 false
         */

        int[] list = getListFromUsers();

        displayListWhetherSortedOrNot(list);


    }

    public static void displayListWhetherSortedOrNot(int[] list) {
        System.out.print("The list is : ");
        if (!isTheArraySorted(list)) {
            System.out.println("The list is not sorted");

        } else {
            System.out.println("The list is already sorted");
        }
    }

    private static boolean isTheArraySorted(int[] list) {   //ex. 6 30 2 5 62 2 369 false
        for (int i = 0; i < list.length-1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] getListFromUsers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list");
        int size = input.nextInt();

        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();

        }
        return list;
    }
}
