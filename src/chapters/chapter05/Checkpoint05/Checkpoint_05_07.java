package chapters.chapter05.Checkpoint05;

import java.util.Scanner;

public class Checkpoint_05_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sum = 0;
		System.out.println("Enter an integer " + "(the input ends if it is 0)");
		int number = input.nextInt();

		do {
			sum += number;
			System.out.println("Enter an integer " + "(the input ends if it is 0)");
			number = input.nextInt();

		} while (number != 0);
		System.out.println("Sum is " + sum);
	}

}
