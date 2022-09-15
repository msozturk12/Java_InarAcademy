package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the initial deposit amount: ");
		double amount = input.nextDouble();

		System.out.println("Enter annual percentage yield: ");
		double annualPercentageYield = input.nextDouble();

		System.out.println("Enter maturity period (number of months): ");
		int month = input.nextInt();

		System.out.println("Month	CD Value");

		for (int i = 1; i <= month; i++) {

			amount = amount + (amount * annualPercentageYield / 1200);
			System.out.printf("%-2d	%.2f\n", i, amount);

		}

	}

}
