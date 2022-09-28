package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number to sort them");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();


        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max = 0;
        double middle = 0;
        double min = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 > num3) {
                min = num3;
                middle = num2;
            } else {
                min = num2;
                middle = num3;
            }
            System.out.println(min + " < " + middle + " < " + max);
        }
        if (num2 > num1 && num2 > num3) {
            max = num2;
            if (num1 > num3) {
                min = num3;
                middle = num1;
            } else {
                min = num1;
                middle = num3;
            }
            System.out.println(min + " < " + middle + " < " + max);
        }
        if (num3 > num1 && num3 > num2) {
            max = num3;
            if (num1 > num2) {
                min = num2;
                middle = num1;
            } else {
                min = num1;
                middle = num2;
            }
            System.out.println(min + " < " + middle + " < " + max);
        }


    }
}
