package chapters.chapter03;

import java.util.Scanner;

public class Exercise_25 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		if ((y1 - y2) * (x4 - x3) - (x2 - x1) * (y4 - y3) == 0 ) //ad - bc
			System.out.println("The two lines are parallel");
		
		else {
			
		}
		
	}

}
//ı cant do exactly