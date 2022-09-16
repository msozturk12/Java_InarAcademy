package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_36 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		String ısbn = input.nextLine();

		int d10 = 0;

		for (int i = 0; i < 9; i++) {

			System.out.print((ısbn.charAt(i)));

		}
		for (int n = 0; n < 9; n++) {

			d10 += Integer.parseInt(ısbn.charAt(n)+ "" ) * (n + 1); // calculating checksum
		}
		d10 = d10 % 11; // calculating checksum

		System.out.print(d10 == 10 ? "X" : d10);

	}

}
