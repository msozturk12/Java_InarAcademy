package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_14 {
    public static void main(String[] args) {
        /*
                    (Computing gcd) Write a method that returns the gcd of an unspecified number
            of integers. The method header is specified as follows:
            public static int gcd(int... numbers)
            Write a test program that prompts the user to enter five numbers, invokes the
            method to find the gcd of these numbers, and displays the gcd.
            -5 sayı girilecek hepsinin obebi buluncak ortak.
            -obeb bulurken sayıların en küçügüne kadar bölüncek

         */

        final int NUMBER = 5;
        int[] numbers = new int[NUMBER];
        System.out.println("Enter " + NUMBER + " number");
        for (int i = 0; i < numbers.length; i++) {
            Scanner input = new Scanner(System.in);
            numbers[i] = input.nextInt();
        }
        int gcd = gcd(numbers);
        System.out.println("The gcd is " + gcd);

    }

    public static int gcd(int[] numbers) {
        int gcd = 1;
        int min = getMin(numbers);
        int divisor = 2;

        while (divisor <= min) {
            boolean gcdDivide = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % divisor != 0) {
                    gcdDivide = false;
                    break;
                }

            }
            if (gcdDivide) {
                gcd = divisor;
            }
            divisor++;
        }
        return gcd;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}