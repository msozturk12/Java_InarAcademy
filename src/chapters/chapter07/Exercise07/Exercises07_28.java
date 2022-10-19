package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_28 {
    public static void main(String[] args) {
        /*
                (Math: combinations) Write a program that prompts the user to enter 10 integers
        and displays all combinations of picking two numbers from the 10.
         */

        int[] numbers = getNumbersFromUsers();
        pickTwoNumbers(numbers);

    }

    public static void pickTwoNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);

            }
        }
    }

    public static int[] getNumbersFromUsers() {
        Scanner input = new Scanner(System.in);
        final int LENGTH = 10;
        System.out.println("Enter " + LENGTH + " numbers");
        int[] arr = new int[LENGTH];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        return arr;
    }
}
