package chapters.chapter02;

import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double POUND = 0.45359237;
		final double INCH = 0.0254;
		
		
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		
		
		System.out.println("Enter height in inches:");
		double height = input.nextDouble();
		
		
		
		double bmi = (weight * POUND) / (Math.pow(height *INCH , 2)) ;
		
		System.out.println("BMI is " + (int)(bmi * 10000)/10000.0);
	}

}
