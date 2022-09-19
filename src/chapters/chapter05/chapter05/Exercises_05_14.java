package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /**
         * Compute the greatest common divisor
         * n1 and n2 first find min each other
         * display gcd
         * ex.--> 12 20 gcd -->12
         */
        System.out.println("Enter your first number");
        int n1 = input.nextInt();

        System.out.println("Enter your second number");
        int n2 = input.nextInt();

        int d = 0; //minumum value

        if (n1 > n2) {
            d = n2;
        } else {
            d = n1;
        }
        int gcd = 0;

        while (d != 0) {
            if (n1 % d == 0 && n2 % d == 0) {
                gcd = d;
                break;
            }
            d--;

        }

        System.out.printf("GCD number of %d and %d is %d ", n1, n2, gcd);


    }
}
