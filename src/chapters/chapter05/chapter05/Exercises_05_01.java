package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer,the input ends if it is 0 :");
		int number = input.nextInt();

		int count = 1;
		int pozitifCount = 0;
		int negatifCount = 0;
		double sum = 0;
		double avarage = 0;
		int num = 0;

		while (number != 0) {

			System.out.println("Enter an integer,the input ends if it is 0 :");
			number = input.nextInt();

			if (number < 0) {
				negatifCount++;

			} else {
				pozitifCount++;

				sum += number;
				avarage = sum / (pozitifCount + negatifCount);
			}
			count++;
		}
		count++;

		System.out.println("The number of positives is  " + pozitifCount);
		System.out.println("The number of negative is  " + negatifCount);
		System.out.println("The total is " + sum);
		System.out.println("The avarage is " + avarage);

	}

}
