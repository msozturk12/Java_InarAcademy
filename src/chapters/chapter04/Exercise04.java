package chapters.chapter04;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side:");
		double side = input.nextDouble();

		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

		System.out.println("The area of the hexagon is " + (int)(area *100) / 100.0 );
	}
}