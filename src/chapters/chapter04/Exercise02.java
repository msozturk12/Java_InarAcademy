package chapters.chapter04;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		double pointx1 = Math.toRadians(input.nextDouble());
		double pointy1 = Math.toRadians(input.nextDouble());

		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		double pointx2 = Math.toRadians(input.nextDouble());
		double pointy2 = Math.toRadians(input.nextDouble());

		double radius = 6371.01;

		double distanceBetweenToPoints = radius * Math.acos((Math.sin(pointx1) * Math.sin(pointx2))
				+ (Math.cos(pointx1) * Math.cos(pointx2) * Math.cos(pointy1 - pointy2)));

		System.out.println("The distance between the two points is " + distanceBetweenToPoints + " km");

	}

}
