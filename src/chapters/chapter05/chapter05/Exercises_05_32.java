package chapters.chapter05.chapter05;

import java.util.Scanner;

public class Exercises_05_32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int lotteryDigit1;
		int lotteryDigit2;

		lotteryDigit1 = (int) (Math.random() * 10);

		System.out.println(lotteryDigit1);
		
		do {

			lotteryDigit2 = (int) (Math.random() * 10);
			System.out.println(lotteryDigit2);

		} while (lotteryDigit1 == lotteryDigit2);

		
		System.out.println("Enter your guess (please two distinct digits) ");
		int guess = input.nextInt();

		System.out.println("The lottery number is : " + lotteryDigit1 + lotteryDigit2);
		
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
			System.out.println("Exact match:You win $10_000");

		} else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
			System.out.println("match all digit: you win $3_000");
		}

		else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1
				|| lotteryDigit2 == guessDigit2) {
			System.out.println("Match one digit : you win $1_000");
		} else {
			System.out.println("Sorry no match");
		}

	}

}
