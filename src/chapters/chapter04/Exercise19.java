package chapters.chapter04;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		String ısbn = input.nextLine();

		int digit1 = Integer.parseInt(ısbn.substring(0, 1));

		int digit2 = Integer.parseInt(ısbn.substring(1, 2));

		int digit3 = Integer.parseInt(ısbn.substring(2, 3));

		int digit4 = Integer.parseInt(ısbn.substring(3, 4));

		int digit5 = Integer.parseInt(ısbn.substring(4, 5));

		int digit6 = Integer.parseInt(ısbn.substring(5, 6));

		int digit7 = Integer.parseInt(ısbn.substring(6, 7));

		int digit8 = Integer.parseInt(ısbn.substring(7, 8));

		int digit9 = Integer.parseInt(ısbn.substring(8, 9));

		int checksum = ((digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7
				+ digit8 * 8 + digit9 * 9) % 11);

		if (checksum == 10) {
			System.out.println("The ISBN number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit7 + "" + digit8 + "" + digit9 + "" + "X");
		} else {
			System.out.println("The ISBN-10 number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit7 + "" + digit8 + "" + digit9 + "" + checksum);
		}

	}

}
