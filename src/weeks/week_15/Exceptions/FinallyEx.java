package weeks.week_15.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyEx {
    public static void main(String[] args) {


        getDiv();
    }

    private static void getDiv() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");

        try {
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            System.out.printf("%d / %d is %d\n", number1, number2, number1 / number2);

        } catch (ArithmeticException ae) {
            System.out.println("Exception-Ae is handled with  try-catch");

        } finally {

            System.out.println("this line is from finally");

        }
        System.out.println("end of method");


    }
}
