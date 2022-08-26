package chapters.chapter02;

import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter v0, v1, and t: ");
		double startingVelocity = input.nextDouble();
		double endingVelocity = input.nextDouble();
		double time = input.nextDouble();

		double average = (endingVelocity - startingVelocity) / time;

		System.out.println("The average acceleration is " + average);

		/*
		 * Enter v0, v1, and t: 5,5 50,9 4,5 The average acceleration is
		 * 10.088888888888889
		 */

	}
}