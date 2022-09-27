package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to sum the digits ");
        long number = input.nextLong();

        long sum = sumDigit(number);

        System.out.println("Your number is " + number + " and sum of digits --> " + sum);
    }


    public static long sumDigit(long n) {

        long sum = 0;

        while (n > 0) {

            sum += n % 10;
            n = n / 10;

        }
        return sum;
    }
}
