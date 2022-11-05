package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_12 {

    /*
    (Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
using arrays. For each filing status, there are six tax rates. Each rate is applied
to a certain amount of taxable income.
     */
    public static void main(String[] args) {
        double[] statusAndTaxableIncome = new double[2];
        fillArr(statusAndTaxableIncome);
        double tax = getTax(statusAndTaxableIncome);
        displayTax(tax);
    }

    private static void displayTax(double tax) {
        System.out.printf("The tax is %.2f" ,tax);
    }

    private static double getTax(double[] statusAndTaxableIncome) {
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double tax = 0;
        int indexOfIncome = -1;
        for (int i = 0; i < brackets[0].length; i++) {
            if (statusAndTaxableIncome[1] > brackets[(int) (statusAndTaxableIncome[0])][i]) {
                indexOfIncome = i;
            } else {
                break;
            }

        }
        if (indexOfIncome != -1) {
            tax += (statusAndTaxableIncome[1] - brackets[(int) (statusAndTaxableIncome[0])][indexOfIncome]) * rates[indexOfIncome + 1];

        } else {
            return statusAndTaxableIncome[1] * rates[0];
        }

        for (int i = indexOfIncome; i > 0; i--) {
            tax += (brackets[(int) (statusAndTaxableIncome[0])][i] - brackets[(int) (statusAndTaxableIncome[0])][i - 1]) * rates[i];

        }
        tax += (brackets[(int) (statusAndTaxableIncome[0])][0] * rates[0]);
        return tax;
    }

    private static void fillArr(double[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your status (0 - Single filer, 1-Married jointly or qualifying widow(er), 2-Married separately, 3-Head of household)");
        arr[0] = input.nextDouble();
        System.out.println("Enter your income :");
        arr[1] = input.nextDouble();

    }

}
