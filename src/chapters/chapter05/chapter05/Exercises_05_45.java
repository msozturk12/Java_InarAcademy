package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_45 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");

		double sum = 0;
		double deviation = 0;
		double number = 0;

		for (int i = 1; i <= 10; i++) {

			number = input.nextDouble();
			sum+=number;
			deviation += Math.pow(number, 2);
			
		}

		deviation = Math.sqrt((deviation - (Math.pow(sum, 2) / 10)) / (10 - 1));
		double mean = sum / 10;
		
		System.out.println(" The mean is " + mean);
		System.out.printf("The standart deviation is %.5f " , deviation);

	}

}
