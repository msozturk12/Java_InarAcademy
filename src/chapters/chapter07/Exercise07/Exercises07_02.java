package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_02 {
    public static void main(String[] args) {
        /*
        1-get 10 integer from user
        2-reverse it
        ex.10 20 30 40 50 60 70 80 90 100
        -> 100 90 80 70 60 50 40 30 20 10
         */

        int[] number = new int[10];
        System.out.println("Enter ten integer");
        takeNumbers(number);
        reverseTheNumber(number);

    }

    public static void takeNumbers(int[] number) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();

        }
    }

    public static void reverseTheNumber(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
