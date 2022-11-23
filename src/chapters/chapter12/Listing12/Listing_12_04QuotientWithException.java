package chapters.chapter12.Listing12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listing_12_04QuotientWithException {

    public static void main(String[] args) {


        try {
            quotient();

        } catch (ArithmeticException ae) {
            System.out.println("Divisor cannot be zero");
            System.out.println("Message from ArithmeticException-->" + ae.getMessage());

        } catch (InputMismatchException ie) {
            System.out.println("InputMissMatch Exception is handled");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(".\n.\n.\nExecution continues....");
    }


    private static void quotient() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
    }
}
