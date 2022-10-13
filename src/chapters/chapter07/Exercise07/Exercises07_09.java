package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_09 {
    public static void main(String[] args) {
        /*
        find the smallest element
        -get 10 number from user and find the min

         */
        Scanner input = new Scanner(System.in);
        final int LENGTH_OF_NUMBERS = 10;

        double[] numbers = new double[LENGTH_OF_NUMBERS];

        System.out.println("Enter 10 numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double min = min(numbers);
        System.out.println("The minimum number is --> " + min);


    }

    private static double min(double[] numbers) {
        double min = numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

}
