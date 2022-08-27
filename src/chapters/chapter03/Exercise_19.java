package chapters.chapter03;

import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the edges of a triangle");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();

		if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
			System.out.println("The perimeter is : " + (edge1 + edge2 + edge3));

		else
			System.out.println("Sorry,this is not a valid triangle");

	}
}
