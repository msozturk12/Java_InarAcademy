package chapters.chapter03;

import java.util.Scanner;

public class Exercise_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();

		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();

		double distanceToCenter = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

		if ((radius1 - radius2) < 0) {
			double temp = radius1;
			radius1 = radius2;
			radius2 = temp;
		}

		if (distanceToCenter <= radius1 - radius2 )          //Math.abs(radius1 - radius2)
			System.out.println("circle2 is inside circle1");

		else if (distanceToCenter <= radius1 + radius2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");

	}
}
