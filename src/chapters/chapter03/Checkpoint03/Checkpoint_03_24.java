package chapters.chapter03.Checkpoint03;

import java.util.Scanner;

public class Checkpoint_03_24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y) is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
		
		
	/*	(x < y && y < z) is true
		(x < y || y < z) is true
		!(x < y) is false
		(x + y < z) is true
		(x + y > z) is false
		
		*/
	}

}
