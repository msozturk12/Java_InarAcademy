package chapters.chapter02;

import java.util.Scanner;

public class Exercise_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of water in kilograms:");
		double amountOfWaterInKilograms = input.nextDouble();

		System.out.println("Enter the initial temperature:");
		double initialTemperature = input.nextDouble();

		System.out.println("Enter the final temperature:");
		double finalTemperature = input.nextDouble();

		double EnergyQ = amountOfWaterInKilograms * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is: " + EnergyQ);

		/*
		 * Enter the amount of water in kilograms: 55,5 
		 * Enter the initial temperature:
		 * 3,5 Enter the final temperature: 10,5 
		 * The energy needed is: 1625484.0
		 */
	}

}
