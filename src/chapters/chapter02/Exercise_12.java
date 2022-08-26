package chapters.chapter02;

import java.util.Scanner;

public class Exercise_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter speed and acceleration: ");
		double Speed = input.nextDouble();
		double acceleration = input.nextDouble();
		

		double length = (Speed * Speed) / (2 * acceleration);

		System.out.println(" The minimum runway length for this airplane is " + length);
	}

}
