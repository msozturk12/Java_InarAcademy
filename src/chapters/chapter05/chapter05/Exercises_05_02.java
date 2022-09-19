package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int correctCount = 0;
		long start = System.currentTimeMillis();
		int counter = 0;

		while (counter < 10) {

			int number1 = (int) (Math.random() * 15);
			int number2 = (int) (Math.random() * 15);
			int result = number1 + number2;
			System.out.printf("What is the result of %d + %d =  ?", number1, number2);
			int answer = input.nextInt();
			if (answer == result) {
				correctCount++;
			}

			counter++;

		}
		long finish = System.currentTimeMillis();
		long totalTıme=finish-start;

		System.out.println("Your correct count is " + correctCount);
		System.out.println("The test time is " + (totalTıme / 1000) + "second");
	}
}