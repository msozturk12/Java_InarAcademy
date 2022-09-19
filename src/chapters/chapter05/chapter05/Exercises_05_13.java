package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_13 {

    public static void main(String[] args) {
/**
 * Find the largest n such that n3 < 12,000
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        int n = 0;
        while (Math.pow(n+1, 3) < number) {
            n++;
        }
        System.out.println("The largest integer n such that n^3 is greater than " + number + " is:" + " n= " + n);
    }

}
