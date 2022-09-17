package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_47 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
		String isbn = input.nextLine();

		if (isbn.length() != 12) {
			System.out.println(isbn + " is an invalid input");

		}

		else {

			int checksum = 0;

			for (int i = 0; i < isbn.length(); i++) {
				if (i % 2 == 0) {
					checksum += 3 * ((Integer.parseInt(isbn.charAt(i) + "")));

				} else {
					checksum += (Integer.parseInt(isbn.charAt(i) + ""));

				}
			}

			checksum = 10 - checksum % 10;

			if (checksum == 10) {
				System.out.println(isbn + 0);
			} else {
				System.out.println(isbn + checksum);
			}

		}

	}

}
