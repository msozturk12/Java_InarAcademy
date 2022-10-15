package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_19 {
    public static void main(String[] args) {
        /*
        eger girilen list sorted in increasing order --isSorted
        --the first number in the input -->indicate length(bu numara list in bir parçası olmayacak)
        ex. 5 2 3 4 5 6 true
        ex. 6 30 2 5 62 2 369 false
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list");
        int numberOfElements = input.nextInt();
        int[] numbers = new int[numberOfElements];
        getNumbersFromUser(numbers, input);
        System.out.println(Arrays.toString(numbers));

        displayWhetherSortedOrNot(numbers);
    }

    public static void displayWhetherSortedOrNot(int[] numbers) {
        if (isSorted(numbers)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] numbers) { // 7 1 5 16 61 9 11 1
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static void getNumbersFromUser(int[] numbers, Scanner input) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }
    }


}
