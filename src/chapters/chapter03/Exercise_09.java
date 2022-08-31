package chapters.chapter03;

import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		int ısbn = input.nextInt();

		int digit1 = ısbn / 100_000_000;
		int remainingDigit = ısbn % 100_000_000;

		int digit2 = remainingDigit / 10_000_000;
		remainingDigit %= 10000000;

		int digit3 = remainingDigit / 1_000_000;
		remainingDigit %= 1_000_000;

		int digit4 = remainingDigit / 100_000;
		remainingDigit %= 100_000;

		int digit5 = remainingDigit / 10_000;
		remainingDigit %= 10_000;

		int digit6 = remainingDigit / 1_000;
		remainingDigit %= 1_000;

		int digit7 = remainingDigit / 100;
		remainingDigit %= 100;

		int digit8 = remainingDigit / 10;
		remainingDigit %= 10;

		int digit9 = remainingDigit;

		int checksum = ((digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7
				+ digit8 * 8 + digit9 * 9) % 11);

		if (checksum == 10) {
			System.out.println("The ISBN number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit7 + "" + digit8 + "" + digit9 + "" + "X");
		}
		else {
			System.out.println("The ISBN-10 number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit7 + "" + digit8 + "" + digit9 + "" + checksum);
		}

	}
}
