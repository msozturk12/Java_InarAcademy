package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_44 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer : ");
		short number = input.nextShort();

		String bitValue = " ";

		for (int i = 0; i < 16; i++) {

			bitValue = (number & 1) + bitValue;
			number >>= 1;

		}
		System.out.println("The bits are : " + bitValue);

	}

}
