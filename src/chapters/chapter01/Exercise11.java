package chapters.chapter01;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int yearInSecond = 365 * 24 * 60 * 60;
		int death = yearInSecond / 13;
		int birth = yearInSecond / 7;
		int newImmigrant = yearInSecond / 45;
		int population = 312032486;

		System.out.println("Enter the number of years: ");

		int year = input.nextInt();

		population = (population + (year * (birth + newImmigrant - death)));

		System.out.println("The population in " + year + "years is " + population);

	}

}
