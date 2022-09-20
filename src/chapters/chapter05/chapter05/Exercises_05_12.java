package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_12 {

    public static void main(String[] args) {

        /**
         * Find the smallest n such that n^2 > 12,000)
         * n^2 > 24
         * n^2<24 ---> en büyük n=4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        int n = 0;
        while (Math.pow(n, 2) < number) {

            n++;
        }
        System.out.println("The smallest integer n such that n^2 is greater than " + number + " is:" + " n= " + n);
    }

}
