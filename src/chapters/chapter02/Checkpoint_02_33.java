package chapters.chapter02;

import java.util.Scanner;

public class Checkpoint_02_33 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount in double, for example 21.12:");
		double amount = input.nextDouble();

		// recieve the amount
		int remainingAmount = (int) (amount * 100);

		// find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount / 5;

		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

		
		/*Enter an amount in double, for example 21.12:
1,99
Your amount 1.99 consists of
 1 dollars
 3 quarters 
 2 dimes
 0 nickels
 0 pennies */
	}

}
