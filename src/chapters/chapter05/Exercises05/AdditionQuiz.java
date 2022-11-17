package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class TekrarliToplamaQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);
		System.out.println(number1 + " + " + number2 + " = ?");
		int answer = input.nextInt();

		int count = 0;
		while (number1 + number2 != answer && count < 3) {
			System.out.println("Wrong answer try again please");
			System.out.println(number1 + "+" + number2 + "+" + "= ?");
			answer = input.nextInt();
			count++;

		}
		if (number1 + number2 == answer) {
			System.out.println("well done");
		} else {
			System.out.println("that is enough you couldnt do it");
		}

	}

}
