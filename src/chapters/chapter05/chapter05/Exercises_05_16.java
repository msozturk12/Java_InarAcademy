package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_16 {

    public static void main(String[] args) {
        /**
         * find the factors of ınteger
         * 120-->2,2,2,3,5
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ınteger ");
        int number = input.nextInt();

        String output = "";
        int divisor = 2;
        while (number != 1) {

            if (number % divisor == 0) {
                output += divisor + ",";
                number = number / divisor;
            } else {
                divisor++;
            }

        }
        System.out.println("The factor is --> " + output);
    }
}