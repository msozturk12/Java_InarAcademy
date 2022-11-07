package chapters.chapter10.Listing10;

import chapters.chapter10.Listing10.Loan;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of year as an ınteger");
        int numberOfYear = input.nextInt();

        System.out.println("Enter loan amount");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYear, loanAmount);
        loan.displayLoan();

    }
}
