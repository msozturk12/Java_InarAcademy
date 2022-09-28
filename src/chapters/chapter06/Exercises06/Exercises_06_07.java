package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount invested ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate");
        double annualInterestRate = input.nextDouble();

        System.out.println("Years       Future Value");


        for (int year = 1; year <= 30; year++) {

            System.out.printf("%-2d             %8.2f\n",year,futureInvestmentValue( investmentAmount,  annualInterestRate, year));

        }
    }

    public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int year) {

        double futureValue = investmentAmount * Math.pow(1 + annualInterestRate / 1200, year * 12);

        return futureValue;
    }

}
