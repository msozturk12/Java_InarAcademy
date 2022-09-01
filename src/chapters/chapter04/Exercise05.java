package chapters.chapter04;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of sides: ");
		double numberOfSide = input.nextDouble();

		System.out.println("Enter the side:");
		double side = input.nextDouble();

		double areaOfThePolygon = (numberOfSide * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSide));

		System.out.println("The area of the polygon is " + areaOfThePolygon);

	}

}
