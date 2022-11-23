package chapters.chapter12.Exercises12.Exercises12_04;

import java.util.Scanner;

public class Loan12Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {

            System.out.println("Enter annual interest rate");
            double annualInterestRate = input.nextDouble();

            System.out.println("Enter number of year");
            int numberOfYear = input.nextInt();

            System.out.println("Enter loan amount");
            double loanAmount = input.nextDouble();

            Loan12 loan = new Loan12(annualInterestRate, numberOfYear, loanAmount);

            System.out.println("\n0Total payment --> "+loan.getTotalPayment());
            System.out.println("\n"+ loan.toString());

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
