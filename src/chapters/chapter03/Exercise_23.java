package chapters.chapter03;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates:");

		double x = input.nextDouble();
		double y = input.nextDouble();

		if (x < 10 / 2.0 || y < 5 / 2.0)
			System.out.println("Coordinate " + x + "," + y + " is in the rectangle");

		else
			System.out.println("Coordinate " + x + "," + y + " is not in the rectangle");
	}

}
