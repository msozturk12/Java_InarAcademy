package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("---Decimal To Octal---");

		System.out.println("\nEnter a decimal value ");
		int dec = input.nextInt();
		String octal = "";

		for (int i = dec; i > 0; i /= 8) {

			octal = (i % 8) + octal;
		}

		System.out.println("For " + dec + " decimal value equals " + octal + " octal value");

	}

}
