package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_03 {

    public static void main(String[] args) {
        System.out.println("------------Palindrom integer----------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check isPalindrom");
        int number = input.nextInt();

        if (isPalindrom(number)) {
            System.out.println("Your number is a palindrom");
        } else {
            System.out.println("Your number is not a palindrom ");
        }

    }

    public static boolean isPalindrom(int number) {

        return (number == reverse(number));
    }

    public static int reverse(int num) {
        int reversedNum = 0;

        while (num > 0) {

            reversedNum = (reversedNum * 10) + num % 10;
            num = num / 10;

        }

        return reversedNum;
    }


}
