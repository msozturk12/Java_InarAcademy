package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int max = 0;
		int count = 0;
		int number ;

		System.out.println("Enter numbers ");
		do {
			number = input.nextInt();

			if (number > max) {
				max = number;
				count = 0;
			}
			if (number == max) {
				count++;
			}

		} while (number != 0);
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}

}
