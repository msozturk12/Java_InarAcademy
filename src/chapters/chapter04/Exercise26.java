package chapters.chapter04;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount in double, for example 11.56:");
		String amount = input.nextLine();


		// find the number of one dollars
		
		String numberOfOneDollars=amount.substring(0, 2);
	
		int cent =Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
		
		

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = cent / 25;
		cent = cent % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = cent / 10;
		cent = cent % 10;

		int numberOfNickels = cent / 5;
		cent %= 5;

		int numberOfPennies = cent;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

		
		
	}

}
