package chapters.chapter03;

import java.util.Scanner;

public class Exercise_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package");

		double weight = input.nextDouble();

		if (weight > 50)
			System.out.println("The package cannot be shipped");

		else {
			if (0< weight && weight <= 1)
				System.out.println("Shipping cost is 3.5 dollars");

			else if (1 < weight && weight <= 3)
				System.out.println("Shipping cost is 5.5 dollars");

			else if (3 < weight && weight <= 10)
				System.out.println("Shipping cost is 8.5 dollars");

			else if (10 < weight && weight <= 20)
				System.out.println("Shipping cost is 10.5 dollars");
			else
				System.out.println("no info for weight>20");
		}
	}
}
