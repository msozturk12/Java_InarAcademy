package chapters.chapter12.Listing12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listing_12_05InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an integer");
                int number = input.nextInt();
                System.out.println("Number is " + number);
                continueInput = false;

            } catch (InputMismatchException ie) {
                System.out.println("TRY AGAIN...InValid input: an integer required");
                input.nextLine(); //discard input

            }


        } while (continueInput);
    }
}
